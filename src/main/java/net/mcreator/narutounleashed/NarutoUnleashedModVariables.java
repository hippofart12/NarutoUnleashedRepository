package net.mcreator.narutounleashed;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class NarutoUnleashedModVariables {
	public NarutoUnleashedModVariables(NarutoUnleashedModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				NarutoUnleashedMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				NarutoUnleashedMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				NarutoUnleashedMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "naruto_unleashed_worldvars";
		public double AkatsukiTimer = 0;

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			AkatsukiTimer = nbt.getDouble("AkatsukiTimer");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putDouble("AkatsukiTimer", AkatsukiTimer);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				NarutoUnleashedMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "naruto_unleashed_mapvars";
		public double PlayerLevelUpPoints = 0;

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			PlayerLevelUpPoints = nbt.getDouble("PlayerLevelUpPoints");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putDouble("PlayerLevelUpPoints", PlayerLevelUpPoints);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				NarutoUnleashedMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;

		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("naruto_unleashed", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putBoolean("WaterShurikenJutsuBuy", instance.WaterShurikenJutsuBuy);
			nbt.putBoolean("WaterWalkingBuy", instance.WaterWalkingBuy);
			nbt.putBoolean("WaterWalking", instance.WaterWalking);
			nbt.putBoolean("WaterBladeTechniqueBuy", instance.WaterBladeTechniqueBuy);
			nbt.putBoolean("ChakraReleaseWater", instance.ChakraReleaseWater);
			nbt.putBoolean("MuddyWaterBallBuy", instance.MuddyWaterBallBuy);
			nbt.putBoolean("WaterEncampmentWallBuy", instance.WaterEncampmentWallBuy);
			nbt.putBoolean("WaterPrisonBuy", instance.WaterPrisonBuy);
			nbt.putBoolean("WaterDragonBuy", instance.WaterDragonBuy);
			nbt.putBoolean("WhipOfWaterBuy", instance.WhipOfWaterBuy);
			nbt.putBoolean("TornadoOfWaterBuy", instance.TornadoOfWaterBuy);
			nbt.putBoolean("BurstinWaterCollisonWavesBuy", instance.BurstinWaterCollisonWavesBuy);
			nbt.putBoolean("GrandWaterFallTechniqueBuy", instance.GrandWaterFallTechniqueBuy);
			nbt.putBoolean("WaterMissileBuy", instance.WaterMissileBuy);
			nbt.putBoolean("MassWaterMissilesBuy", instance.MassWaterMissilesBuy);
			nbt.putBoolean("DisguiseJutsuBuy", instance.DisguiseJutsuBuy);
			nbt.putBoolean("RasenganBuy", instance.RasenganBuy);
			nbt.putDouble("ChakraAmount", instance.ChakraAmount);
			nbt.putDouble("ChakraMax", instance.ChakraMax);
			nbt.putBoolean("ChidoriBuy", instance.ChidoriBuy);
			nbt.putBoolean("NarutoRun", instance.NarutoRun);
			nbt.putDouble("JutsuPoints", instance.JutsuPoints);
			nbt.putDouble("Shurikenjutsu", instance.Shurikenjutsu);
			nbt.putBoolean("InfuseChakraBuy", instance.InfuseChakraBuy);
			nbt.putDouble("Bukijutsu", instance.Bukijutsu);
			nbt.putBoolean("FireballJutsuBuy", instance.FireballJutsuBuy);
			nbt.putDouble("Kenjutsu", instance.Kenjutsu);
			nbt.putDouble("JutsuCombo", instance.JutsuCombo);
			nbt.putDouble("Genjutsu", instance.Genjutsu);
			nbt.putDouble("medical", instance.medical);
			nbt.putDouble("Nintaijutsu", instance.Nintaijutsu);
			nbt.putDouble("hiden", instance.hiden);
			nbt.putDouble("Kinjutsu", instance.Kinjutsu);
			nbt.putDouble("Senjutsu", instance.Senjutsu);
			nbt.putDouble("Taijutsu", instance.Taijutsu);
			nbt.putDouble("Ninjutsu", instance.Ninjutsu);
			nbt.putBoolean("RockShelterBuy", instance.RockShelterBuy);
			nbt.putBoolean("thunderBuy", instance.thunderBuy);
			nbt.putBoolean("LightningBallBuy", instance.LightningBallBuy);
			nbt.putBoolean("TunnelTechniqueBuy", instance.TunnelTechniqueBuy);
			nbt.putBoolean("TunnelTechniquePlayer", instance.TunnelTechniquePlayer);
			nbt.putBoolean("GalePalmBuy", instance.GalePalmBuy);
			nbt.putDouble("AirBulletBuy", instance.AirBulletBuy);
			nbt.putBoolean("flameBulletBuy", instance.flameBulletBuy);
			nbt.putBoolean("HailBuy", instance.HailBuy);
			nbt.putBoolean("StoneTrapBuy", instance.StoneTrapBuy);
			nbt.putBoolean("StoneTrap", instance.StoneTrap);
			nbt.putBoolean("NoClan", instance.NoClan);
			nbt.putBoolean("UchihaClanJoin", instance.UchihaClanJoin);
			nbt.putBoolean("OneTomoeSharinganBuy", instance.OneTomoeSharinganBuy);
			nbt.putBoolean("TwoTomoeSharinganBuy", instance.TwoTomoeSharinganBuy);
			nbt.putBoolean("ThreeTomoeSharinganBuy", instance.ThreeTomoeSharinganBuy);
			nbt.putBoolean("Dojutsu", instance.Dojutsu);
			nbt.putBoolean("SasukeMangekyoSharinganBuy", instance.SasukeMangekyoSharinganBuy);
			nbt.putBoolean("ChakraReleaseFire", instance.ChakraReleaseFire);
			nbt.putBoolean("ChakraReleaseWind", instance.ChakraReleaseWind);
			nbt.putBoolean("ChakraReleaseEarth", instance.ChakraReleaseEarth);
			nbt.putBoolean("CharkaReleaseLightning", instance.CharkaReleaseLightning);
			nbt.putDouble("PlayerLevel", instance.PlayerLevel);
			nbt.putDouble("PlayerXP", instance.PlayerXP);
			nbt.putDouble("PlayerXPLevelUp", instance.PlayerXPLevelUp);
			nbt.putDouble("PlayerSpeedUp", instance.PlayerSpeedUp);
			nbt.putDouble("PlayerStrengthUp", instance.PlayerStrengthUp);
			nbt.putDouble("PlayerResistanceUp", instance.PlayerResistanceUp);
			nbt.putBoolean("FireCircleBuy", instance.FireCircleBuy);
			nbt.putBoolean("HazyGenjutsuBuy", instance.HazyGenjutsuBuy);
			nbt.putBoolean("ChakraReleaseYin", instance.ChakraReleaseYin);
			nbt.putBoolean("blocklifegiverbuy", instance.blocklifegiverbuy);
			nbt.putBoolean("blocklifegiving", instance.blocklifegiving);
			nbt.putBoolean("ChakraReleaseYang", instance.ChakraReleaseYang);
			nbt.putBoolean("COATTBuy", instance.COATTBuy);
			nbt.putBoolean("COATT", instance.COATT);
			nbt.putBoolean("CharkaReleaseYinYang", instance.CharkaReleaseYinYang);
			nbt.putBoolean("AntidoteBuy", instance.AntidoteBuy);
			nbt.putBoolean("ChakraStrengthBuy", instance.ChakraStrengthBuy);
			nbt.putDouble("PlayerHealth", instance.PlayerHealth);
			nbt.putBoolean("AcademyStudent", instance.AcademyStudent);
			nbt.putBoolean("Genin", instance.Genin);
			nbt.putBoolean("Chuunin", instance.Chuunin);
			nbt.putBoolean("Jounin", instance.Jounin);
			nbt.putBoolean("Kage", instance.Kage);
			nbt.putBoolean("NoAffilation", instance.NoAffilation);
			nbt.putBoolean("BodyHealerBuy", instance.BodyHealerBuy);
			nbt.putBoolean("FirstGateOpened", instance.FirstGateOpened);
			nbt.putBoolean("SecondGateOpened", instance.SecondGateOpened);
			nbt.putBoolean("ThirdGateOpened", instance.ThirdGateOpened);
			nbt.putBoolean("FourthGateOpened", instance.FourthGateOpened);
			nbt.putBoolean("FifthGateOpened", instance.FifthGateOpened);
			nbt.putBoolean("SixthGateOpened", instance.SixthGateOpened);
			nbt.putBoolean("SeventhGateOpened", instance.SeventhGateOpened);
			nbt.putBoolean("EighthGateOpened", instance.EighthGateOpened);
			nbt.putBoolean("FirstGateBuy", instance.FirstGateBuy);
			nbt.putBoolean("SecondgateBuy", instance.SecondgateBuy);
			nbt.putBoolean("ThirdGateBuy", instance.ThirdGateBuy);
			nbt.putBoolean("FourthGateBuy", instance.FourthGateBuy);
			nbt.putBoolean("FifthGateBuy", instance.FifthGateBuy);
			nbt.putBoolean("SixthGateBuy", instance.SixthGateBuy);
			nbt.putBoolean("SeventhGateBuy", instance.SeventhGateBuy);
			nbt.putBoolean("EighthGateBuy", instance.EighthGateBuy);
			nbt.putBoolean("NightGateParticlesOn", instance.NightGateParticlesOn);
			nbt.putBoolean("NightGuy", instance.NightGuy);
			nbt.putBoolean("UzumakiClanJoin", instance.UzumakiClanJoin);
			nbt.putBoolean("UzumakiChainsBuy", instance.UzumakiChainsBuy);
			nbt.putBoolean("UzumakiChakraBiteBuy", instance.UzumakiChakraBiteBuy);
			nbt.putBoolean("UzumakiChakraBite", instance.UzumakiChakraBite);
			nbt.putBoolean("ItachiMangekyoSharinganBuy", instance.ItachiMangekyoSharinganBuy);
			nbt.putBoolean("ObitoMangekyoSharinganBuy", instance.ObitoMangekyoSharinganBuy);
			nbt.putBoolean("KamuiMoveThroughMatter", instance.KamuiMoveThroughMatter);
			nbt.putDouble("KamuiGoXPos", instance.KamuiGoXPos);
			nbt.putDouble("KamuiGoYPos", instance.KamuiGoYPos);
			nbt.putDouble("KamuiGoZPos", instance.KamuiGoZPos);
			nbt.putDouble("KamuiReturnXPos", instance.KamuiReturnXPos);
			nbt.putDouble("KamuiReturnYPos", instance.KamuiReturnYPos);
			nbt.putDouble("KamuiRetunZPos", instance.KamuiRetunZPos);
			nbt.putBoolean("MadaraMangekyoSharinganBuy", instance.MadaraMangekyoSharinganBuy);
			nbt.putBoolean("IzunaMSBuy", instance.IzunaMSBuy);
			nbt.putBoolean("ShisuiMSBuy", instance.ShisuiMSBuy);
			nbt.putBoolean("IndraMSBuy", instance.IndraMSBuy);
			nbt.putBoolean("ShinMSBuy", instance.ShinMSBuy);
			nbt.putBoolean("FugakuMSBuy", instance.FugakuMSBuy);
			nbt.putBoolean("ShinTelekinesisSelfMarked", instance.ShinTelekinesisSelfMarked);
			nbt.putBoolean("SasukeSusanooCageBuy", instance.SasukeSusanooCageBuy);
			nbt.putBoolean("SasukeSusanooSkeletalBuy", instance.SasukeSusanooSkeletalBuy);
			nbt.putBoolean("SasukeSusanooArmoredBuy", instance.SasukeSusanooArmoredBuy);
			nbt.putBoolean("ItachiSusanooCageBuy", instance.ItachiSusanooCageBuy);
			nbt.putBoolean("ItachiSusanooSkeletalBuy", instance.ItachiSusanooSkeletalBuy);
			nbt.putBoolean("ItachiSusanooArmoredBuy", instance.ItachiSusanooArmoredBuy);
			nbt.putBoolean("ObitoSusanooCageBuy", instance.ObitoSusanooCageBuy);
			nbt.putBoolean("ObitoSusanooSkeletalBuy", instance.ObitoSusanooSkeletalBuy);
			nbt.putBoolean("ObitoSusanooArmoredBuy", instance.ObitoSusanooArmoredBuy);
			nbt.putBoolean("MadaraSusanooCageBuy", instance.MadaraSusanooCageBuy);
			nbt.putBoolean("MadaraSusanooSkeletalBuy", instance.MadaraSusanooSkeletalBuy);
			nbt.putBoolean("MadaraSusanooArmoredBuy", instance.MadaraSusanooArmoredBuy);
			nbt.putBoolean("IzunaSusanooCageBuy", instance.IzunaSusanooCageBuy);
			nbt.putBoolean("IzunaSusanooSkeletalBuy", instance.IzunaSusanooSkeletalBuy);
			nbt.putBoolean("IzunaSusanooArmoredBuy", instance.IzunaSusanooArmoredBuy);
			nbt.putBoolean("IndraSusanooCageBuy", instance.IndraSusanooCageBuy);
			nbt.putBoolean("IndraSusanooSkeletalBuy", instance.IndraSusanooSkeletalBuy);
			nbt.putBoolean("IndraSusanooArmoredBuy", instance.IndraSusanooArmoredBuy);
			nbt.putBoolean("ShinSusanooCageBuy", instance.ShinSusanooCageBuy);
			nbt.putBoolean("ShinSusanooSkeletalBuy", instance.ShinSusanooSkeletalBuy);
			nbt.putBoolean("ShinSusanooArmoredBuy", instance.ShinSusanooArmoredBuy);
			nbt.putBoolean("ShisuiSusanooCageBuy", instance.ShisuiSusanooCageBuy);
			nbt.putBoolean("ShisuiSusanooSkeletalBuy", instance.ShisuiSusanooSkeletalBuy);
			nbt.putBoolean("ShisuiSusanooArmoredBuy", instance.ShisuiSusanooArmoredBuy);
			nbt.putDouble("Summoning", instance.Summoning);
			nbt.putDouble("MangekyoSharinganJutsus", instance.MangekyoSharinganJutsus);
			nbt.putBoolean("ChakraReleaseWood", instance.ChakraReleaseWood);
			nbt.putBoolean("WoodCloneBuy", instance.WoodCloneBuy);
			nbt.putBoolean("WoodBeamBuy", instance.WoodBeamBuy);
			nbt.putBoolean("ChakraReleaseScorch", instance.ChakraReleaseScorch);
			nbt.putBoolean("ExtremeSteamingMurderBuy", instance.ExtremeSteamingMurderBuy);
			nbt.putBoolean("GreatExplosiveSteamingMurderBuy", instance.GreatExplosiveSteamingMurderBuy);
			nbt.putDouble("TimeScorched", instance.TimeScorched);
			nbt.putBoolean("ChakraReleaseLava", instance.ChakraReleaseLava);
			nbt.putBoolean("LavaChakraModeBuy", instance.LavaChakraModeBuy);
			nbt.putBoolean("FieryRockBulletBuy", instance.FieryRockBulletBuy);
			nbt.putBoolean("LavaChakraModeOn", instance.LavaChakraModeOn);
			nbt.putDouble("PlayerSpeed", instance.PlayerSpeed);
			nbt.putBoolean("SenjuClanJoin", instance.SenjuClanJoin);
			nbt.putBoolean("IceBreakingFistBuy", instance.IceBreakingFistBuy);
			nbt.putBoolean("ChakraReleaseIce", instance.ChakraReleaseIce);
			nbt.putBoolean("TenThousandIcePetalsBuy", instance.TenThousandIcePetalsBuy);
			nbt.putBoolean("ChakraReleaseBoil", instance.ChakraReleaseBoil);
			nbt.putBoolean("SkilledMistTechniqueBuy", instance.SkilledMistTechniqueBuy);
			nbt.putBoolean("EruptingPropulsionFistBuy", instance.EruptingPropulsionFistBuy);
			nbt.putBoolean("CrystalNeedlesBuy", instance.CrystalNeedlesBuy);
			nbt.putBoolean("ShurikenWildDanceBuy", instance.ShurikenWildDanceBuy);
			nbt.putBoolean("ChakraReleaseCrystal", instance.ChakraReleaseCrystal);
			nbt.putBoolean("ChakraReleaseExplosive", instance.ChakraReleaseExplosive);
			nbt.putBoolean("ExplosivePalmBuy", instance.ExplosivePalmBuy);
			nbt.putBoolean("ExplosiveLandminesBuy", instance.ExplosiveLandminesBuy);
			nbt.putBoolean("ChakraReleaseDark", instance.ChakraReleaseDark);
			nbt.putBoolean("InhalingMawBuy", instance.InhalingMawBuy);
			nbt.putBoolean("JudgementBuy", instance.JudgementBuy);
			nbt.putBoolean("CHakraReleaseMagnet", instance.CHakraReleaseMagnet);
			nbt.putBoolean("GoldSandDrizzleBuy", instance.GoldSandDrizzleBuy);
			nbt.putBoolean("IronSandDrizzleBuy", instance.IronSandDrizzleBuy);
			nbt.putBoolean("ChakraReleaseDust", instance.ChakraReleaseDust);
			nbt.putBoolean("DOTPWbuy", instance.DOTPWbuy);
			nbt.putBoolean("ChakraReleaseMud", instance.ChakraReleaseMud);
			nbt.putBoolean("ChakraReleaseSteel", instance.ChakraReleaseSteel);
			nbt.putBoolean("ChakraReleaseStorm", instance.ChakraReleaseStorm);
			nbt.putBoolean("ChakraReleaseSwift", instance.ChakraReleaseSwift);
			nbt.putBoolean("ChakraReleaseTyphoon", instance.ChakraReleaseTyphoon);
			nbt.putBoolean("BottomlessMudHoleBuy", instance.BottomlessMudHoleBuy);
			nbt.putBoolean("ImperviousArmorBuy", instance.ImperviousArmorBuy);
			nbt.putBoolean("SteelProjectileBuy", instance.SteelProjectileBuy);
			nbt.putBoolean("LazerCircusBuy", instance.LazerCircusBuy);
			nbt.putBoolean("ThunderCloudInnerWaveBuy", instance.ThunderCloudInnerWaveBuy);
			nbt.putBoolean("ShadowlessFlightBuy", instance.ShadowlessFlightBuy);
			nbt.putBoolean("ConsecutiveBurstingStrongWaindBuy", instance.ConsecutiveBurstingStrongWaindBuy);
			nbt.putBoolean("GreatConsecutiveBurstingExtremeWindsBuy", instance.GreatConsecutiveBurstingExtremeWindsBuy);
			nbt.putDouble("PlayerXPLevelUpPoints", instance.PlayerXPLevelUpPoints);
			nbt.putBoolean("HazyGenjutsuOn", instance.HazyGenjutsuOn);
			nbt.putBoolean("ExplosiveSacrificeTechniqueBuy", instance.ExplosiveSacrificeTechniqueBuy);
			nbt.putBoolean("FireChakraBombBuy", instance.FireChakraBombBuy);
			nbt.putBoolean("FireShurikenBuy", instance.FireShurikenBuy);
			nbt.putBoolean("BlazingShieldBuy", instance.BlazingShieldBuy);
			nbt.putBoolean("StickyFireBuy", instance.StickyFireBuy);
			nbt.putBoolean("FieryRainBuy", instance.FieryRainBuy);
			nbt.putBoolean("FlameSwordBuy", instance.FlameSwordBuy);
			nbt.putBoolean("HellFireSpikesBuy", instance.HellFireSpikesBuy);
			nbt.putBoolean("HellFireTechniqueBuy", instance.HellFireTechniqueBuy);
			nbt.putBoolean("BlazingRedCannonBuy", instance.BlazingRedCannonBuy);
			nbt.putBoolean("FieryExplosiveBlastBuy", instance.FieryExplosiveBlastBuy);
			nbt.putBoolean("RedWindBuy", instance.RedWindBuy);
			nbt.putBoolean("FireDragonBuy", instance.FireDragonBuy);
			nbt.putBoolean("FireHammerTechniqueBuy", instance.FireHammerTechniqueBuy);
			nbt.putBoolean("CremationBuy", instance.CremationBuy);
			nbt.putBoolean("EternalFlames", instance.EternalFlames);
			nbt.putBoolean("FireBladeMissilesBuy", instance.FireBladeMissilesBuy);
			nbt.putBoolean("IgnateBuy", instance.IgnateBuy);
			nbt.putBoolean("PheonixFireBuy", instance.PheonixFireBuy);
			nbt.putBoolean("GentleTouchOfFireBuy", instance.GentleTouchOfFireBuy);
			nbt.putBoolean("GrandFireballBuy", instance.GrandFireballBuy);
			nbt.putBoolean("IntellegentHardWorkBuy", instance.IntellegentHardWorkBuy);
			nbt.putBoolean("MistCoveringBuy", instance.MistCoveringBuy);
			nbt.putBoolean("RoaringFlameSphereBuy", instance.RoaringFlameSphereBuy);
			nbt.putBoolean("SharkProjectileBuy", instance.SharkProjectileBuy);
			nbt.putBoolean("DenseRainBuy", instance.DenseRainBuy);
			nbt.putBoolean("SlipperySurfaceBuy", instance.SlipperySurfaceBuy);
			nbt.putBoolean("CannonBallBuy", instance.CannonBallBuy);
			nbt.putBoolean("RainCoatBuy", instance.RainCoatBuy);
			nbt.putBoolean("PoisonNeedleBuy", instance.PoisonNeedleBuy);
			nbt.putBoolean("BlackCloudsTechniqueBuy", instance.BlackCloudsTechniqueBuy);
			nbt.putBoolean("GreatExplodingCurrentBuy", instance.GreatExplodingCurrentBuy);
			nbt.putBoolean("HiddenMistBuy", instance.HiddenMistBuy);
			nbt.putBoolean("ChidoriNagashiBuy", instance.ChidoriNagashiBuy);
			nbt.putBoolean("ChidoriSenbonBuy", instance.ChidoriSenbonBuy);
			nbt.putBoolean("KirinBuy", instance.KirinBuy);
			nbt.putBoolean("ElectricJoltBuy", instance.ElectricJoltBuy);
			nbt.putBoolean("ThunderCrashBuy", instance.ThunderCrashBuy);
			nbt.putBoolean("ChitenraisouBuy", instance.ChitenraisouBuy);
			nbt.putBoolean("StungunTechniqueBuy", instance.StungunTechniqueBuy);
			nbt.putBoolean("ElectricalDischargeBuy", instance.ElectricalDischargeBuy);
			nbt.putBoolean("MinorElectricalCurrentBuy", instance.MinorElectricalCurrentBuy);
			nbt.putBoolean("CrampTechniqueBuy", instance.CrampTechniqueBuy);
			nbt.putBoolean("HighVoltageTouchBuy", instance.HighVoltageTouchBuy);
			nbt.putBoolean("HeavenlyEletricalCutterBuy", instance.HeavenlyEletricalCutterBuy);
			nbt.putBoolean("LightningEdgeBuy", instance.LightningEdgeBuy);
			nbt.putBoolean("LightningDevourerTechniqueBuy", instance.LightningDevourerTechniqueBuy);
			nbt.putBoolean("LightningTigerMissileBuy", instance.LightningTigerMissileBuy);
			nbt.putBoolean("LightningDragonBlastBuy", instance.LightningDragonBlastBuy);
			nbt.putBoolean("ViolentLightningDragonTechniqueBuy", instance.ViolentLightningDragonTechniqueBuy);
			nbt.putBoolean("WrathOfHeavenBuy", instance.WrathOfHeavenBuy);
			nbt.putBoolean("BurningAshCloudBuy", instance.BurningAshCloudBuy);
			nbt.putBoolean("airbulletbuy", instance.airbulletbuy);
			nbt.putBoolean("AttackingPlantsBuy", instance.AttackingPlantsBuy);
			nbt.putBoolean("RockRainBoulderBuy", instance.RockRainBoulderBuy);
			nbt.putBoolean("SmallWindBlastBuy", instance.SmallWindBlastBuy);
			nbt.putBoolean("WaterJutsuBuy", instance.WaterJutsuBuy);
			nbt.putBoolean("FLyingTechniqueBuy", instance.FLyingTechniqueBuy);
			nbt.putBoolean("WhirlwindPrisonBuy", instance.WhirlwindPrisonBuy);
			nbt.putBoolean("WirlwindPrisonBuy", instance.WirlwindPrisonBuy);
			nbt.putBoolean("WaterBulletBuy", instance.WaterBulletBuy);
			nbt.putBoolean("TrueSightMSBuy", instance.TrueSightMSBuy);
			nbt.putBoolean("EternalTrueSightMSBuy", instance.EternalTrueSightMSBuy);
			nbt.putBoolean("ViolentWaterWaveBuy", instance.ViolentWaterWaveBuy);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.WaterShurikenJutsuBuy = nbt.getBoolean("WaterShurikenJutsuBuy");
			instance.WaterWalkingBuy = nbt.getBoolean("WaterWalkingBuy");
			instance.WaterWalking = nbt.getBoolean("WaterWalking");
			instance.WaterBladeTechniqueBuy = nbt.getBoolean("WaterBladeTechniqueBuy");
			instance.ChakraReleaseWater = nbt.getBoolean("ChakraReleaseWater");
			instance.MuddyWaterBallBuy = nbt.getBoolean("MuddyWaterBallBuy");
			instance.WaterEncampmentWallBuy = nbt.getBoolean("WaterEncampmentWallBuy");
			instance.WaterPrisonBuy = nbt.getBoolean("WaterPrisonBuy");
			instance.WaterDragonBuy = nbt.getBoolean("WaterDragonBuy");
			instance.WhipOfWaterBuy = nbt.getBoolean("WhipOfWaterBuy");
			instance.TornadoOfWaterBuy = nbt.getBoolean("TornadoOfWaterBuy");
			instance.BurstinWaterCollisonWavesBuy = nbt.getBoolean("BurstinWaterCollisonWavesBuy");
			instance.GrandWaterFallTechniqueBuy = nbt.getBoolean("GrandWaterFallTechniqueBuy");
			instance.WaterMissileBuy = nbt.getBoolean("WaterMissileBuy");
			instance.MassWaterMissilesBuy = nbt.getBoolean("MassWaterMissilesBuy");
			instance.DisguiseJutsuBuy = nbt.getBoolean("DisguiseJutsuBuy");
			instance.RasenganBuy = nbt.getBoolean("RasenganBuy");
			instance.ChakraAmount = nbt.getDouble("ChakraAmount");
			instance.ChakraMax = nbt.getDouble("ChakraMax");
			instance.ChidoriBuy = nbt.getBoolean("ChidoriBuy");
			instance.NarutoRun = nbt.getBoolean("NarutoRun");
			instance.JutsuPoints = nbt.getDouble("JutsuPoints");
			instance.Shurikenjutsu = nbt.getDouble("Shurikenjutsu");
			instance.InfuseChakraBuy = nbt.getBoolean("InfuseChakraBuy");
			instance.Bukijutsu = nbt.getDouble("Bukijutsu");
			instance.FireballJutsuBuy = nbt.getBoolean("FireballJutsuBuy");
			instance.Kenjutsu = nbt.getDouble("Kenjutsu");
			instance.JutsuCombo = nbt.getDouble("JutsuCombo");
			instance.Genjutsu = nbt.getDouble("Genjutsu");
			instance.medical = nbt.getDouble("medical");
			instance.Nintaijutsu = nbt.getDouble("Nintaijutsu");
			instance.hiden = nbt.getDouble("hiden");
			instance.Kinjutsu = nbt.getDouble("Kinjutsu");
			instance.Senjutsu = nbt.getDouble("Senjutsu");
			instance.Taijutsu = nbt.getDouble("Taijutsu");
			instance.Ninjutsu = nbt.getDouble("Ninjutsu");
			instance.RockShelterBuy = nbt.getBoolean("RockShelterBuy");
			instance.thunderBuy = nbt.getBoolean("thunderBuy");
			instance.LightningBallBuy = nbt.getBoolean("LightningBallBuy");
			instance.TunnelTechniqueBuy = nbt.getBoolean("TunnelTechniqueBuy");
			instance.TunnelTechniquePlayer = nbt.getBoolean("TunnelTechniquePlayer");
			instance.GalePalmBuy = nbt.getBoolean("GalePalmBuy");
			instance.AirBulletBuy = nbt.getDouble("AirBulletBuy");
			instance.flameBulletBuy = nbt.getBoolean("flameBulletBuy");
			instance.HailBuy = nbt.getBoolean("HailBuy");
			instance.StoneTrapBuy = nbt.getBoolean("StoneTrapBuy");
			instance.StoneTrap = nbt.getBoolean("StoneTrap");
			instance.NoClan = nbt.getBoolean("NoClan");
			instance.UchihaClanJoin = nbt.getBoolean("UchihaClanJoin");
			instance.OneTomoeSharinganBuy = nbt.getBoolean("OneTomoeSharinganBuy");
			instance.TwoTomoeSharinganBuy = nbt.getBoolean("TwoTomoeSharinganBuy");
			instance.ThreeTomoeSharinganBuy = nbt.getBoolean("ThreeTomoeSharinganBuy");
			instance.Dojutsu = nbt.getBoolean("Dojutsu");
			instance.SasukeMangekyoSharinganBuy = nbt.getBoolean("SasukeMangekyoSharinganBuy");
			instance.ChakraReleaseFire = nbt.getBoolean("ChakraReleaseFire");
			instance.ChakraReleaseWind = nbt.getBoolean("ChakraReleaseWind");
			instance.ChakraReleaseEarth = nbt.getBoolean("ChakraReleaseEarth");
			instance.CharkaReleaseLightning = nbt.getBoolean("CharkaReleaseLightning");
			instance.PlayerLevel = nbt.getDouble("PlayerLevel");
			instance.PlayerXP = nbt.getDouble("PlayerXP");
			instance.PlayerXPLevelUp = nbt.getDouble("PlayerXPLevelUp");
			instance.PlayerSpeedUp = nbt.getDouble("PlayerSpeedUp");
			instance.PlayerStrengthUp = nbt.getDouble("PlayerStrengthUp");
			instance.PlayerResistanceUp = nbt.getDouble("PlayerResistanceUp");
			instance.FireCircleBuy = nbt.getBoolean("FireCircleBuy");
			instance.HazyGenjutsuBuy = nbt.getBoolean("HazyGenjutsuBuy");
			instance.ChakraReleaseYin = nbt.getBoolean("ChakraReleaseYin");
			instance.blocklifegiverbuy = nbt.getBoolean("blocklifegiverbuy");
			instance.blocklifegiving = nbt.getBoolean("blocklifegiving");
			instance.ChakraReleaseYang = nbt.getBoolean("ChakraReleaseYang");
			instance.COATTBuy = nbt.getBoolean("COATTBuy");
			instance.COATT = nbt.getBoolean("COATT");
			instance.CharkaReleaseYinYang = nbt.getBoolean("CharkaReleaseYinYang");
			instance.AntidoteBuy = nbt.getBoolean("AntidoteBuy");
			instance.ChakraStrengthBuy = nbt.getBoolean("ChakraStrengthBuy");
			instance.PlayerHealth = nbt.getDouble("PlayerHealth");
			instance.AcademyStudent = nbt.getBoolean("AcademyStudent");
			instance.Genin = nbt.getBoolean("Genin");
			instance.Chuunin = nbt.getBoolean("Chuunin");
			instance.Jounin = nbt.getBoolean("Jounin");
			instance.Kage = nbt.getBoolean("Kage");
			instance.NoAffilation = nbt.getBoolean("NoAffilation");
			instance.BodyHealerBuy = nbt.getBoolean("BodyHealerBuy");
			instance.FirstGateOpened = nbt.getBoolean("FirstGateOpened");
			instance.SecondGateOpened = nbt.getBoolean("SecondGateOpened");
			instance.ThirdGateOpened = nbt.getBoolean("ThirdGateOpened");
			instance.FourthGateOpened = nbt.getBoolean("FourthGateOpened");
			instance.FifthGateOpened = nbt.getBoolean("FifthGateOpened");
			instance.SixthGateOpened = nbt.getBoolean("SixthGateOpened");
			instance.SeventhGateOpened = nbt.getBoolean("SeventhGateOpened");
			instance.EighthGateOpened = nbt.getBoolean("EighthGateOpened");
			instance.FirstGateBuy = nbt.getBoolean("FirstGateBuy");
			instance.SecondgateBuy = nbt.getBoolean("SecondgateBuy");
			instance.ThirdGateBuy = nbt.getBoolean("ThirdGateBuy");
			instance.FourthGateBuy = nbt.getBoolean("FourthGateBuy");
			instance.FifthGateBuy = nbt.getBoolean("FifthGateBuy");
			instance.SixthGateBuy = nbt.getBoolean("SixthGateBuy");
			instance.SeventhGateBuy = nbt.getBoolean("SeventhGateBuy");
			instance.EighthGateBuy = nbt.getBoolean("EighthGateBuy");
			instance.NightGateParticlesOn = nbt.getBoolean("NightGateParticlesOn");
			instance.NightGuy = nbt.getBoolean("NightGuy");
			instance.UzumakiClanJoin = nbt.getBoolean("UzumakiClanJoin");
			instance.UzumakiChainsBuy = nbt.getBoolean("UzumakiChainsBuy");
			instance.UzumakiChakraBiteBuy = nbt.getBoolean("UzumakiChakraBiteBuy");
			instance.UzumakiChakraBite = nbt.getBoolean("UzumakiChakraBite");
			instance.ItachiMangekyoSharinganBuy = nbt.getBoolean("ItachiMangekyoSharinganBuy");
			instance.ObitoMangekyoSharinganBuy = nbt.getBoolean("ObitoMangekyoSharinganBuy");
			instance.KamuiMoveThroughMatter = nbt.getBoolean("KamuiMoveThroughMatter");
			instance.KamuiGoXPos = nbt.getDouble("KamuiGoXPos");
			instance.KamuiGoYPos = nbt.getDouble("KamuiGoYPos");
			instance.KamuiGoZPos = nbt.getDouble("KamuiGoZPos");
			instance.KamuiReturnXPos = nbt.getDouble("KamuiReturnXPos");
			instance.KamuiReturnYPos = nbt.getDouble("KamuiReturnYPos");
			instance.KamuiRetunZPos = nbt.getDouble("KamuiRetunZPos");
			instance.MadaraMangekyoSharinganBuy = nbt.getBoolean("MadaraMangekyoSharinganBuy");
			instance.IzunaMSBuy = nbt.getBoolean("IzunaMSBuy");
			instance.ShisuiMSBuy = nbt.getBoolean("ShisuiMSBuy");
			instance.IndraMSBuy = nbt.getBoolean("IndraMSBuy");
			instance.ShinMSBuy = nbt.getBoolean("ShinMSBuy");
			instance.FugakuMSBuy = nbt.getBoolean("FugakuMSBuy");
			instance.ShinTelekinesisSelfMarked = nbt.getBoolean("ShinTelekinesisSelfMarked");
			instance.SasukeSusanooCageBuy = nbt.getBoolean("SasukeSusanooCageBuy");
			instance.SasukeSusanooSkeletalBuy = nbt.getBoolean("SasukeSusanooSkeletalBuy");
			instance.SasukeSusanooArmoredBuy = nbt.getBoolean("SasukeSusanooArmoredBuy");
			instance.ItachiSusanooCageBuy = nbt.getBoolean("ItachiSusanooCageBuy");
			instance.ItachiSusanooSkeletalBuy = nbt.getBoolean("ItachiSusanooSkeletalBuy");
			instance.ItachiSusanooArmoredBuy = nbt.getBoolean("ItachiSusanooArmoredBuy");
			instance.ObitoSusanooCageBuy = nbt.getBoolean("ObitoSusanooCageBuy");
			instance.ObitoSusanooSkeletalBuy = nbt.getBoolean("ObitoSusanooSkeletalBuy");
			instance.ObitoSusanooArmoredBuy = nbt.getBoolean("ObitoSusanooArmoredBuy");
			instance.MadaraSusanooCageBuy = nbt.getBoolean("MadaraSusanooCageBuy");
			instance.MadaraSusanooSkeletalBuy = nbt.getBoolean("MadaraSusanooSkeletalBuy");
			instance.MadaraSusanooArmoredBuy = nbt.getBoolean("MadaraSusanooArmoredBuy");
			instance.IzunaSusanooCageBuy = nbt.getBoolean("IzunaSusanooCageBuy");
			instance.IzunaSusanooSkeletalBuy = nbt.getBoolean("IzunaSusanooSkeletalBuy");
			instance.IzunaSusanooArmoredBuy = nbt.getBoolean("IzunaSusanooArmoredBuy");
			instance.IndraSusanooCageBuy = nbt.getBoolean("IndraSusanooCageBuy");
			instance.IndraSusanooSkeletalBuy = nbt.getBoolean("IndraSusanooSkeletalBuy");
			instance.IndraSusanooArmoredBuy = nbt.getBoolean("IndraSusanooArmoredBuy");
			instance.ShinSusanooCageBuy = nbt.getBoolean("ShinSusanooCageBuy");
			instance.ShinSusanooSkeletalBuy = nbt.getBoolean("ShinSusanooSkeletalBuy");
			instance.ShinSusanooArmoredBuy = nbt.getBoolean("ShinSusanooArmoredBuy");
			instance.ShisuiSusanooCageBuy = nbt.getBoolean("ShisuiSusanooCageBuy");
			instance.ShisuiSusanooSkeletalBuy = nbt.getBoolean("ShisuiSusanooSkeletalBuy");
			instance.ShisuiSusanooArmoredBuy = nbt.getBoolean("ShisuiSusanooArmoredBuy");
			instance.Summoning = nbt.getDouble("Summoning");
			instance.MangekyoSharinganJutsus = nbt.getDouble("MangekyoSharinganJutsus");
			instance.ChakraReleaseWood = nbt.getBoolean("ChakraReleaseWood");
			instance.WoodCloneBuy = nbt.getBoolean("WoodCloneBuy");
			instance.WoodBeamBuy = nbt.getBoolean("WoodBeamBuy");
			instance.ChakraReleaseScorch = nbt.getBoolean("ChakraReleaseScorch");
			instance.ExtremeSteamingMurderBuy = nbt.getBoolean("ExtremeSteamingMurderBuy");
			instance.GreatExplosiveSteamingMurderBuy = nbt.getBoolean("GreatExplosiveSteamingMurderBuy");
			instance.TimeScorched = nbt.getDouble("TimeScorched");
			instance.ChakraReleaseLava = nbt.getBoolean("ChakraReleaseLava");
			instance.LavaChakraModeBuy = nbt.getBoolean("LavaChakraModeBuy");
			instance.FieryRockBulletBuy = nbt.getBoolean("FieryRockBulletBuy");
			instance.LavaChakraModeOn = nbt.getBoolean("LavaChakraModeOn");
			instance.PlayerSpeed = nbt.getDouble("PlayerSpeed");
			instance.SenjuClanJoin = nbt.getBoolean("SenjuClanJoin");
			instance.IceBreakingFistBuy = nbt.getBoolean("IceBreakingFistBuy");
			instance.ChakraReleaseIce = nbt.getBoolean("ChakraReleaseIce");
			instance.TenThousandIcePetalsBuy = nbt.getBoolean("TenThousandIcePetalsBuy");
			instance.ChakraReleaseBoil = nbt.getBoolean("ChakraReleaseBoil");
			instance.SkilledMistTechniqueBuy = nbt.getBoolean("SkilledMistTechniqueBuy");
			instance.EruptingPropulsionFistBuy = nbt.getBoolean("EruptingPropulsionFistBuy");
			instance.CrystalNeedlesBuy = nbt.getBoolean("CrystalNeedlesBuy");
			instance.ShurikenWildDanceBuy = nbt.getBoolean("ShurikenWildDanceBuy");
			instance.ChakraReleaseCrystal = nbt.getBoolean("ChakraReleaseCrystal");
			instance.ChakraReleaseExplosive = nbt.getBoolean("ChakraReleaseExplosive");
			instance.ExplosivePalmBuy = nbt.getBoolean("ExplosivePalmBuy");
			instance.ExplosiveLandminesBuy = nbt.getBoolean("ExplosiveLandminesBuy");
			instance.ChakraReleaseDark = nbt.getBoolean("ChakraReleaseDark");
			instance.InhalingMawBuy = nbt.getBoolean("InhalingMawBuy");
			instance.JudgementBuy = nbt.getBoolean("JudgementBuy");
			instance.CHakraReleaseMagnet = nbt.getBoolean("CHakraReleaseMagnet");
			instance.GoldSandDrizzleBuy = nbt.getBoolean("GoldSandDrizzleBuy");
			instance.IronSandDrizzleBuy = nbt.getBoolean("IronSandDrizzleBuy");
			instance.ChakraReleaseDust = nbt.getBoolean("ChakraReleaseDust");
			instance.DOTPWbuy = nbt.getBoolean("DOTPWbuy");
			instance.ChakraReleaseMud = nbt.getBoolean("ChakraReleaseMud");
			instance.ChakraReleaseSteel = nbt.getBoolean("ChakraReleaseSteel");
			instance.ChakraReleaseStorm = nbt.getBoolean("ChakraReleaseStorm");
			instance.ChakraReleaseSwift = nbt.getBoolean("ChakraReleaseSwift");
			instance.ChakraReleaseTyphoon = nbt.getBoolean("ChakraReleaseTyphoon");
			instance.BottomlessMudHoleBuy = nbt.getBoolean("BottomlessMudHoleBuy");
			instance.ImperviousArmorBuy = nbt.getBoolean("ImperviousArmorBuy");
			instance.SteelProjectileBuy = nbt.getBoolean("SteelProjectileBuy");
			instance.LazerCircusBuy = nbt.getBoolean("LazerCircusBuy");
			instance.ThunderCloudInnerWaveBuy = nbt.getBoolean("ThunderCloudInnerWaveBuy");
			instance.ShadowlessFlightBuy = nbt.getBoolean("ShadowlessFlightBuy");
			instance.ConsecutiveBurstingStrongWaindBuy = nbt.getBoolean("ConsecutiveBurstingStrongWaindBuy");
			instance.GreatConsecutiveBurstingExtremeWindsBuy = nbt.getBoolean("GreatConsecutiveBurstingExtremeWindsBuy");
			instance.PlayerXPLevelUpPoints = nbt.getDouble("PlayerXPLevelUpPoints");
			instance.HazyGenjutsuOn = nbt.getBoolean("HazyGenjutsuOn");
			instance.ExplosiveSacrificeTechniqueBuy = nbt.getBoolean("ExplosiveSacrificeTechniqueBuy");
			instance.FireChakraBombBuy = nbt.getBoolean("FireChakraBombBuy");
			instance.FireShurikenBuy = nbt.getBoolean("FireShurikenBuy");
			instance.BlazingShieldBuy = nbt.getBoolean("BlazingShieldBuy");
			instance.StickyFireBuy = nbt.getBoolean("StickyFireBuy");
			instance.FieryRainBuy = nbt.getBoolean("FieryRainBuy");
			instance.FlameSwordBuy = nbt.getBoolean("FlameSwordBuy");
			instance.HellFireSpikesBuy = nbt.getBoolean("HellFireSpikesBuy");
			instance.HellFireTechniqueBuy = nbt.getBoolean("HellFireTechniqueBuy");
			instance.BlazingRedCannonBuy = nbt.getBoolean("BlazingRedCannonBuy");
			instance.FieryExplosiveBlastBuy = nbt.getBoolean("FieryExplosiveBlastBuy");
			instance.RedWindBuy = nbt.getBoolean("RedWindBuy");
			instance.FireDragonBuy = nbt.getBoolean("FireDragonBuy");
			instance.FireHammerTechniqueBuy = nbt.getBoolean("FireHammerTechniqueBuy");
			instance.CremationBuy = nbt.getBoolean("CremationBuy");
			instance.EternalFlames = nbt.getBoolean("EternalFlames");
			instance.FireBladeMissilesBuy = nbt.getBoolean("FireBladeMissilesBuy");
			instance.IgnateBuy = nbt.getBoolean("IgnateBuy");
			instance.PheonixFireBuy = nbt.getBoolean("PheonixFireBuy");
			instance.GentleTouchOfFireBuy = nbt.getBoolean("GentleTouchOfFireBuy");
			instance.GrandFireballBuy = nbt.getBoolean("GrandFireballBuy");
			instance.IntellegentHardWorkBuy = nbt.getBoolean("IntellegentHardWorkBuy");
			instance.MistCoveringBuy = nbt.getBoolean("MistCoveringBuy");
			instance.RoaringFlameSphereBuy = nbt.getBoolean("RoaringFlameSphereBuy");
			instance.SharkProjectileBuy = nbt.getBoolean("SharkProjectileBuy");
			instance.DenseRainBuy = nbt.getBoolean("DenseRainBuy");
			instance.SlipperySurfaceBuy = nbt.getBoolean("SlipperySurfaceBuy");
			instance.CannonBallBuy = nbt.getBoolean("CannonBallBuy");
			instance.RainCoatBuy = nbt.getBoolean("RainCoatBuy");
			instance.PoisonNeedleBuy = nbt.getBoolean("PoisonNeedleBuy");
			instance.BlackCloudsTechniqueBuy = nbt.getBoolean("BlackCloudsTechniqueBuy");
			instance.GreatExplodingCurrentBuy = nbt.getBoolean("GreatExplodingCurrentBuy");
			instance.HiddenMistBuy = nbt.getBoolean("HiddenMistBuy");
			instance.ChidoriNagashiBuy = nbt.getBoolean("ChidoriNagashiBuy");
			instance.ChidoriSenbonBuy = nbt.getBoolean("ChidoriSenbonBuy");
			instance.KirinBuy = nbt.getBoolean("KirinBuy");
			instance.ElectricJoltBuy = nbt.getBoolean("ElectricJoltBuy");
			instance.ThunderCrashBuy = nbt.getBoolean("ThunderCrashBuy");
			instance.ChitenraisouBuy = nbt.getBoolean("ChitenraisouBuy");
			instance.StungunTechniqueBuy = nbt.getBoolean("StungunTechniqueBuy");
			instance.ElectricalDischargeBuy = nbt.getBoolean("ElectricalDischargeBuy");
			instance.MinorElectricalCurrentBuy = nbt.getBoolean("MinorElectricalCurrentBuy");
			instance.CrampTechniqueBuy = nbt.getBoolean("CrampTechniqueBuy");
			instance.HighVoltageTouchBuy = nbt.getBoolean("HighVoltageTouchBuy");
			instance.HeavenlyEletricalCutterBuy = nbt.getBoolean("HeavenlyEletricalCutterBuy");
			instance.LightningEdgeBuy = nbt.getBoolean("LightningEdgeBuy");
			instance.LightningDevourerTechniqueBuy = nbt.getBoolean("LightningDevourerTechniqueBuy");
			instance.LightningTigerMissileBuy = nbt.getBoolean("LightningTigerMissileBuy");
			instance.LightningDragonBlastBuy = nbt.getBoolean("LightningDragonBlastBuy");
			instance.ViolentLightningDragonTechniqueBuy = nbt.getBoolean("ViolentLightningDragonTechniqueBuy");
			instance.WrathOfHeavenBuy = nbt.getBoolean("WrathOfHeavenBuy");
			instance.BurningAshCloudBuy = nbt.getBoolean("BurningAshCloudBuy");
			instance.airbulletbuy = nbt.getBoolean("airbulletbuy");
			instance.AttackingPlantsBuy = nbt.getBoolean("AttackingPlantsBuy");
			instance.RockRainBoulderBuy = nbt.getBoolean("RockRainBoulderBuy");
			instance.SmallWindBlastBuy = nbt.getBoolean("SmallWindBlastBuy");
			instance.WaterJutsuBuy = nbt.getBoolean("WaterJutsuBuy");
			instance.FLyingTechniqueBuy = nbt.getBoolean("FLyingTechniqueBuy");
			instance.WhirlwindPrisonBuy = nbt.getBoolean("WhirlwindPrisonBuy");
			instance.WirlwindPrisonBuy = nbt.getBoolean("WirlwindPrisonBuy");
			instance.WaterBulletBuy = nbt.getBoolean("WaterBulletBuy");
			instance.TrueSightMSBuy = nbt.getBoolean("TrueSightMSBuy");
			instance.EternalTrueSightMSBuy = nbt.getBoolean("EternalTrueSightMSBuy");
			instance.ViolentWaterWaveBuy = nbt.getBoolean("ViolentWaterWaveBuy");
		}
	}

	public static class PlayerVariables {
		public boolean WaterShurikenJutsuBuy = false;
		public boolean WaterWalkingBuy = false;
		public boolean WaterWalking = false;
		public boolean WaterBladeTechniqueBuy = false;
		public boolean ChakraReleaseWater = false;
		public boolean MuddyWaterBallBuy = false;
		public boolean WaterEncampmentWallBuy = false;
		public boolean WaterPrisonBuy = false;
		public boolean WaterDragonBuy = false;
		public boolean WhipOfWaterBuy = false;
		public boolean TornadoOfWaterBuy = false;
		public boolean BurstinWaterCollisonWavesBuy = false;
		public boolean GrandWaterFallTechniqueBuy = false;
		public boolean WaterMissileBuy = false;
		public boolean MassWaterMissilesBuy = false;
		public boolean DisguiseJutsuBuy = false;
		public boolean RasenganBuy = false;
		public double ChakraAmount = 0;
		public double ChakraMax = 0;
		public boolean ChidoriBuy = false;
		public boolean NarutoRun = false;
		public double JutsuPoints = 0;
		public double Shurikenjutsu = 0;
		public boolean InfuseChakraBuy = false;
		public double Bukijutsu = 0;
		public boolean FireballJutsuBuy = false;
		public double Kenjutsu = 0;
		public double JutsuCombo = 0;
		public double Genjutsu = 0;
		public double medical = 0;
		public double Nintaijutsu = 0;
		public double hiden = 0;
		public double Kinjutsu = 0;
		public double Senjutsu = 0;
		public double Taijutsu = 0;
		public double Ninjutsu = 0;
		public boolean RockShelterBuy = false;
		public boolean thunderBuy = false;
		public boolean LightningBallBuy = false;
		public boolean TunnelTechniqueBuy = false;
		public boolean TunnelTechniquePlayer = false;
		public boolean GalePalmBuy = false;
		public double AirBulletBuy = 0;
		public boolean flameBulletBuy = false;
		public boolean HailBuy = false;
		public boolean StoneTrapBuy = false;
		public boolean StoneTrap = false;
		public boolean NoClan = false;
		public boolean UchihaClanJoin = false;
		public boolean OneTomoeSharinganBuy = false;
		public boolean TwoTomoeSharinganBuy = false;
		public boolean ThreeTomoeSharinganBuy = false;
		public boolean Dojutsu = false;
		public boolean SasukeMangekyoSharinganBuy = false;
		public boolean ChakraReleaseFire = false;
		public boolean ChakraReleaseWind = false;
		public boolean ChakraReleaseEarth = false;
		public boolean CharkaReleaseLightning = false;
		public double PlayerLevel = 1.0;
		public double PlayerXP = 0;
		public double PlayerXPLevelUp = 100.0;
		public double PlayerSpeedUp = -1.0;
		public double PlayerStrengthUp = -1.0;
		public double PlayerResistanceUp = -1.0;
		public boolean FireCircleBuy = false;
		public boolean HazyGenjutsuBuy = false;
		public boolean ChakraReleaseYin = false;
		public boolean blocklifegiverbuy = false;
		public boolean blocklifegiving = false;
		public boolean ChakraReleaseYang = false;
		public boolean COATTBuy = false;
		public boolean COATT = false;
		public boolean CharkaReleaseYinYang = false;
		public boolean AntidoteBuy = false;
		public boolean ChakraStrengthBuy = false;
		public double PlayerHealth = -1.0;
		public boolean AcademyStudent = false;
		public boolean Genin = false;
		public boolean Chuunin = false;
		public boolean Jounin = false;
		public boolean Kage = false;
		public boolean NoAffilation = false;
		public boolean BodyHealerBuy = false;
		public boolean FirstGateOpened = false;
		public boolean SecondGateOpened = false;
		public boolean ThirdGateOpened = false;
		public boolean FourthGateOpened = false;
		public boolean FifthGateOpened = false;
		public boolean SixthGateOpened = false;
		public boolean SeventhGateOpened = false;
		public boolean EighthGateOpened = false;
		public boolean FirstGateBuy = false;
		public boolean SecondgateBuy = false;
		public boolean ThirdGateBuy = false;
		public boolean FourthGateBuy = false;
		public boolean FifthGateBuy = false;
		public boolean SixthGateBuy = false;
		public boolean SeventhGateBuy = false;
		public boolean EighthGateBuy = false;
		public boolean NightGateParticlesOn = false;
		public boolean NightGuy = false;
		public boolean UzumakiClanJoin = false;
		public boolean UzumakiChainsBuy = false;
		public boolean UzumakiChakraBiteBuy = false;
		public boolean UzumakiChakraBite = false;
		public boolean ItachiMangekyoSharinganBuy = false;
		public boolean ObitoMangekyoSharinganBuy = false;
		public boolean KamuiMoveThroughMatter = false;
		public double KamuiGoXPos = 0;
		public double KamuiGoYPos = 0;
		public double KamuiGoZPos = 0;
		public double KamuiReturnXPos = 0;
		public double KamuiReturnYPos = 0;
		public double KamuiRetunZPos = 0;
		public boolean MadaraMangekyoSharinganBuy = false;
		public boolean IzunaMSBuy = false;
		public boolean ShisuiMSBuy = false;
		public boolean IndraMSBuy = false;
		public boolean ShinMSBuy = false;
		public boolean FugakuMSBuy = false;
		public boolean ShinTelekinesisSelfMarked = false;
		public boolean SasukeSusanooCageBuy = false;
		public boolean SasukeSusanooSkeletalBuy = false;
		public boolean SasukeSusanooArmoredBuy = false;
		public boolean ItachiSusanooCageBuy = false;
		public boolean ItachiSusanooSkeletalBuy = false;
		public boolean ItachiSusanooArmoredBuy = false;
		public boolean ObitoSusanooCageBuy = false;
		public boolean ObitoSusanooSkeletalBuy = false;
		public boolean ObitoSusanooArmoredBuy = false;
		public boolean MadaraSusanooCageBuy = false;
		public boolean MadaraSusanooSkeletalBuy = false;
		public boolean MadaraSusanooArmoredBuy = false;
		public boolean IzunaSusanooCageBuy = false;
		public boolean IzunaSusanooSkeletalBuy = false;
		public boolean IzunaSusanooArmoredBuy = false;
		public boolean IndraSusanooCageBuy = false;
		public boolean IndraSusanooSkeletalBuy = false;
		public boolean IndraSusanooArmoredBuy = false;
		public boolean ShinSusanooCageBuy = false;
		public boolean ShinSusanooSkeletalBuy = false;
		public boolean ShinSusanooArmoredBuy = false;
		public boolean ShisuiSusanooCageBuy = false;
		public boolean ShisuiSusanooSkeletalBuy = false;
		public boolean ShisuiSusanooArmoredBuy = false;
		public double Summoning = 0;
		public double MangekyoSharinganJutsus = 0;
		public boolean ChakraReleaseWood = false;
		public boolean WoodCloneBuy = false;
		public boolean WoodBeamBuy = false;
		public boolean ChakraReleaseScorch = false;
		public boolean ExtremeSteamingMurderBuy = false;
		public boolean GreatExplosiveSteamingMurderBuy = false;
		public double TimeScorched = 0;
		public boolean ChakraReleaseLava = false;
		public boolean LavaChakraModeBuy = false;
		public boolean FieryRockBulletBuy = false;
		public boolean LavaChakraModeOn = false;
		public double PlayerSpeed = 0;
		public boolean SenjuClanJoin = false;
		public boolean IceBreakingFistBuy = false;
		public boolean ChakraReleaseIce = false;
		public boolean TenThousandIcePetalsBuy = false;
		public boolean ChakraReleaseBoil = false;
		public boolean SkilledMistTechniqueBuy = false;
		public boolean EruptingPropulsionFistBuy = false;
		public boolean CrystalNeedlesBuy = false;
		public boolean ShurikenWildDanceBuy = false;
		public boolean ChakraReleaseCrystal = false;
		public boolean ChakraReleaseExplosive = false;
		public boolean ExplosivePalmBuy = false;
		public boolean ExplosiveLandminesBuy = false;
		public boolean ChakraReleaseDark = false;
		public boolean InhalingMawBuy = false;
		public boolean JudgementBuy = false;
		public boolean CHakraReleaseMagnet = false;
		public boolean GoldSandDrizzleBuy = false;
		public boolean IronSandDrizzleBuy = false;
		public boolean ChakraReleaseDust = false;
		public boolean DOTPWbuy = false;
		public boolean ChakraReleaseMud = false;
		public boolean ChakraReleaseSteel = false;
		public boolean ChakraReleaseStorm = false;
		public boolean ChakraReleaseSwift = false;
		public boolean ChakraReleaseTyphoon = false;
		public boolean BottomlessMudHoleBuy = false;
		public boolean ImperviousArmorBuy = false;
		public boolean SteelProjectileBuy = false;
		public boolean LazerCircusBuy = false;
		public boolean ThunderCloudInnerWaveBuy = false;
		public boolean ShadowlessFlightBuy = false;
		public boolean ConsecutiveBurstingStrongWaindBuy = false;
		public boolean GreatConsecutiveBurstingExtremeWindsBuy = false;
		public double PlayerXPLevelUpPoints = 0;
		public boolean HazyGenjutsuOn = false;
		public boolean ExplosiveSacrificeTechniqueBuy = false;
		public boolean FireChakraBombBuy = false;
		public boolean FireShurikenBuy = false;
		public boolean BlazingShieldBuy = false;
		public boolean StickyFireBuy = false;
		public boolean FieryRainBuy = false;
		public boolean FlameSwordBuy = false;
		public boolean HellFireSpikesBuy = false;
		public boolean HellFireTechniqueBuy = false;
		public boolean BlazingRedCannonBuy = false;
		public boolean FieryExplosiveBlastBuy = false;
		public boolean RedWindBuy = false;
		public boolean FireDragonBuy = false;
		public boolean FireHammerTechniqueBuy = false;
		public boolean CremationBuy = false;
		public boolean EternalFlames = false;
		public boolean FireBladeMissilesBuy = false;
		public boolean IgnateBuy = false;
		public boolean PheonixFireBuy = false;
		public boolean GentleTouchOfFireBuy = false;
		public boolean GrandFireballBuy = false;
		public boolean IntellegentHardWorkBuy = false;
		public boolean MistCoveringBuy = false;
		public boolean RoaringFlameSphereBuy = false;
		public boolean SharkProjectileBuy = false;
		public boolean DenseRainBuy = false;
		public boolean SlipperySurfaceBuy = false;
		public boolean CannonBallBuy = false;
		public boolean RainCoatBuy = false;
		public boolean PoisonNeedleBuy = false;
		public boolean BlackCloudsTechniqueBuy = false;
		public boolean GreatExplodingCurrentBuy = false;
		public boolean HiddenMistBuy = false;
		public boolean ChidoriNagashiBuy = false;
		public boolean ChidoriSenbonBuy = false;
		public boolean KirinBuy = false;
		public boolean ElectricJoltBuy = false;
		public boolean ThunderCrashBuy = false;
		public boolean ChitenraisouBuy = false;
		public boolean StungunTechniqueBuy = false;
		public boolean ElectricalDischargeBuy = false;
		public boolean MinorElectricalCurrentBuy = false;
		public boolean CrampTechniqueBuy = false;
		public boolean HighVoltageTouchBuy = false;
		public boolean HeavenlyEletricalCutterBuy = false;
		public boolean LightningEdgeBuy = false;
		public boolean LightningDevourerTechniqueBuy = false;
		public boolean LightningTigerMissileBuy = false;
		public boolean LightningDragonBlastBuy = false;
		public boolean ViolentLightningDragonTechniqueBuy = false;
		public boolean WrathOfHeavenBuy = false;
		public boolean BurningAshCloudBuy = false;
		public boolean airbulletbuy = false;
		public boolean AttackingPlantsBuy = false;
		public boolean RockRainBoulderBuy = false;
		public boolean SmallWindBlastBuy = false;
		public boolean WaterJutsuBuy = false;
		public boolean FLyingTechniqueBuy = false;
		public boolean WhirlwindPrisonBuy = false;
		public boolean WirlwindPrisonBuy = false;
		public boolean WaterBulletBuy = false;
		public boolean TrueSightMSBuy = false;
		public boolean EternalTrueSightMSBuy = false;
		public boolean ViolentWaterWaveBuy = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				NarutoUnleashedMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.WaterShurikenJutsuBuy = original.WaterShurikenJutsuBuy;
		clone.WaterWalkingBuy = original.WaterWalkingBuy;
		clone.WaterWalking = original.WaterWalking;
		clone.WaterBladeTechniqueBuy = original.WaterBladeTechniqueBuy;
		clone.ChakraReleaseWater = original.ChakraReleaseWater;
		clone.MuddyWaterBallBuy = original.MuddyWaterBallBuy;
		clone.WaterEncampmentWallBuy = original.WaterEncampmentWallBuy;
		clone.WaterPrisonBuy = original.WaterPrisonBuy;
		clone.WaterDragonBuy = original.WaterDragonBuy;
		clone.WhipOfWaterBuy = original.WhipOfWaterBuy;
		clone.TornadoOfWaterBuy = original.TornadoOfWaterBuy;
		clone.BurstinWaterCollisonWavesBuy = original.BurstinWaterCollisonWavesBuy;
		clone.GrandWaterFallTechniqueBuy = original.GrandWaterFallTechniqueBuy;
		clone.WaterMissileBuy = original.WaterMissileBuy;
		clone.MassWaterMissilesBuy = original.MassWaterMissilesBuy;
		clone.DisguiseJutsuBuy = original.DisguiseJutsuBuy;
		clone.RasenganBuy = original.RasenganBuy;
		clone.ChakraAmount = original.ChakraAmount;
		clone.ChakraMax = original.ChakraMax;
		clone.ChidoriBuy = original.ChidoriBuy;
		clone.NarutoRun = original.NarutoRun;
		clone.JutsuPoints = original.JutsuPoints;
		clone.Shurikenjutsu = original.Shurikenjutsu;
		clone.InfuseChakraBuy = original.InfuseChakraBuy;
		clone.Bukijutsu = original.Bukijutsu;
		clone.FireballJutsuBuy = original.FireballJutsuBuy;
		clone.Kenjutsu = original.Kenjutsu;
		clone.JutsuCombo = original.JutsuCombo;
		clone.Genjutsu = original.Genjutsu;
		clone.medical = original.medical;
		clone.Nintaijutsu = original.Nintaijutsu;
		clone.hiden = original.hiden;
		clone.Kinjutsu = original.Kinjutsu;
		clone.Senjutsu = original.Senjutsu;
		clone.Taijutsu = original.Taijutsu;
		clone.Ninjutsu = original.Ninjutsu;
		clone.RockShelterBuy = original.RockShelterBuy;
		clone.thunderBuy = original.thunderBuy;
		clone.LightningBallBuy = original.LightningBallBuy;
		clone.TunnelTechniqueBuy = original.TunnelTechniqueBuy;
		clone.TunnelTechniquePlayer = original.TunnelTechniquePlayer;
		clone.GalePalmBuy = original.GalePalmBuy;
		clone.AirBulletBuy = original.AirBulletBuy;
		clone.flameBulletBuy = original.flameBulletBuy;
		clone.HailBuy = original.HailBuy;
		clone.StoneTrapBuy = original.StoneTrapBuy;
		clone.StoneTrap = original.StoneTrap;
		clone.NoClan = original.NoClan;
		clone.UchihaClanJoin = original.UchihaClanJoin;
		clone.OneTomoeSharinganBuy = original.OneTomoeSharinganBuy;
		clone.TwoTomoeSharinganBuy = original.TwoTomoeSharinganBuy;
		clone.ThreeTomoeSharinganBuy = original.ThreeTomoeSharinganBuy;
		clone.Dojutsu = original.Dojutsu;
		clone.SasukeMangekyoSharinganBuy = original.SasukeMangekyoSharinganBuy;
		clone.ChakraReleaseFire = original.ChakraReleaseFire;
		clone.ChakraReleaseWind = original.ChakraReleaseWind;
		clone.ChakraReleaseEarth = original.ChakraReleaseEarth;
		clone.CharkaReleaseLightning = original.CharkaReleaseLightning;
		clone.PlayerLevel = original.PlayerLevel;
		clone.PlayerXP = original.PlayerXP;
		clone.PlayerXPLevelUp = original.PlayerXPLevelUp;
		clone.PlayerSpeedUp = original.PlayerSpeedUp;
		clone.PlayerStrengthUp = original.PlayerStrengthUp;
		clone.PlayerResistanceUp = original.PlayerResistanceUp;
		clone.FireCircleBuy = original.FireCircleBuy;
		clone.HazyGenjutsuBuy = original.HazyGenjutsuBuy;
		clone.ChakraReleaseYin = original.ChakraReleaseYin;
		clone.blocklifegiverbuy = original.blocklifegiverbuy;
		clone.blocklifegiving = original.blocklifegiving;
		clone.ChakraReleaseYang = original.ChakraReleaseYang;
		clone.COATTBuy = original.COATTBuy;
		clone.COATT = original.COATT;
		clone.CharkaReleaseYinYang = original.CharkaReleaseYinYang;
		clone.AntidoteBuy = original.AntidoteBuy;
		clone.ChakraStrengthBuy = original.ChakraStrengthBuy;
		clone.PlayerHealth = original.PlayerHealth;
		clone.AcademyStudent = original.AcademyStudent;
		clone.Genin = original.Genin;
		clone.Chuunin = original.Chuunin;
		clone.Jounin = original.Jounin;
		clone.Kage = original.Kage;
		clone.NoAffilation = original.NoAffilation;
		clone.BodyHealerBuy = original.BodyHealerBuy;
		clone.FirstGateOpened = original.FirstGateOpened;
		clone.SecondGateOpened = original.SecondGateOpened;
		clone.ThirdGateOpened = original.ThirdGateOpened;
		clone.FourthGateOpened = original.FourthGateOpened;
		clone.FifthGateOpened = original.FifthGateOpened;
		clone.SixthGateOpened = original.SixthGateOpened;
		clone.SeventhGateOpened = original.SeventhGateOpened;
		clone.EighthGateOpened = original.EighthGateOpened;
		clone.FirstGateBuy = original.FirstGateBuy;
		clone.SecondgateBuy = original.SecondgateBuy;
		clone.ThirdGateBuy = original.ThirdGateBuy;
		clone.FourthGateBuy = original.FourthGateBuy;
		clone.FifthGateBuy = original.FifthGateBuy;
		clone.SixthGateBuy = original.SixthGateBuy;
		clone.SeventhGateBuy = original.SeventhGateBuy;
		clone.EighthGateBuy = original.EighthGateBuy;
		clone.UzumakiClanJoin = original.UzumakiClanJoin;
		clone.UzumakiChainsBuy = original.UzumakiChainsBuy;
		clone.UzumakiChakraBiteBuy = original.UzumakiChakraBiteBuy;
		clone.UzumakiChakraBite = original.UzumakiChakraBite;
		clone.ItachiMangekyoSharinganBuy = original.ItachiMangekyoSharinganBuy;
		clone.ObitoMangekyoSharinganBuy = original.ObitoMangekyoSharinganBuy;
		clone.KamuiMoveThroughMatter = original.KamuiMoveThroughMatter;
		clone.KamuiGoXPos = original.KamuiGoXPos;
		clone.KamuiGoYPos = original.KamuiGoYPos;
		clone.KamuiGoZPos = original.KamuiGoZPos;
		clone.KamuiReturnXPos = original.KamuiReturnXPos;
		clone.KamuiReturnYPos = original.KamuiReturnYPos;
		clone.KamuiRetunZPos = original.KamuiRetunZPos;
		clone.MadaraMangekyoSharinganBuy = original.MadaraMangekyoSharinganBuy;
		clone.IzunaMSBuy = original.IzunaMSBuy;
		clone.ShisuiMSBuy = original.ShisuiMSBuy;
		clone.IndraMSBuy = original.IndraMSBuy;
		clone.ShinMSBuy = original.ShinMSBuy;
		clone.FugakuMSBuy = original.FugakuMSBuy;
		clone.ShinTelekinesisSelfMarked = original.ShinTelekinesisSelfMarked;
		clone.SasukeSusanooCageBuy = original.SasukeSusanooCageBuy;
		clone.SasukeSusanooSkeletalBuy = original.SasukeSusanooSkeletalBuy;
		clone.SasukeSusanooArmoredBuy = original.SasukeSusanooArmoredBuy;
		clone.ItachiSusanooCageBuy = original.ItachiSusanooCageBuy;
		clone.ItachiSusanooSkeletalBuy = original.ItachiSusanooSkeletalBuy;
		clone.ItachiSusanooArmoredBuy = original.ItachiSusanooArmoredBuy;
		clone.ObitoSusanooCageBuy = original.ObitoSusanooCageBuy;
		clone.ObitoSusanooSkeletalBuy = original.ObitoSusanooSkeletalBuy;
		clone.ObitoSusanooArmoredBuy = original.ObitoSusanooArmoredBuy;
		clone.MadaraSusanooCageBuy = original.MadaraSusanooCageBuy;
		clone.MadaraSusanooSkeletalBuy = original.MadaraSusanooSkeletalBuy;
		clone.MadaraSusanooArmoredBuy = original.MadaraSusanooArmoredBuy;
		clone.IzunaSusanooCageBuy = original.IzunaSusanooCageBuy;
		clone.IzunaSusanooSkeletalBuy = original.IzunaSusanooSkeletalBuy;
		clone.IzunaSusanooArmoredBuy = original.IzunaSusanooArmoredBuy;
		clone.IndraSusanooCageBuy = original.IndraSusanooCageBuy;
		clone.IndraSusanooSkeletalBuy = original.IndraSusanooSkeletalBuy;
		clone.IndraSusanooArmoredBuy = original.IndraSusanooArmoredBuy;
		clone.ShinSusanooCageBuy = original.ShinSusanooCageBuy;
		clone.ShinSusanooSkeletalBuy = original.ShinSusanooSkeletalBuy;
		clone.ShinSusanooArmoredBuy = original.ShinSusanooArmoredBuy;
		clone.ShisuiSusanooCageBuy = original.ShisuiSusanooCageBuy;
		clone.ShisuiSusanooSkeletalBuy = original.ShisuiSusanooSkeletalBuy;
		clone.ShisuiSusanooArmoredBuy = original.ShisuiSusanooArmoredBuy;
		clone.Summoning = original.Summoning;
		clone.MangekyoSharinganJutsus = original.MangekyoSharinganJutsus;
		clone.ChakraReleaseWood = original.ChakraReleaseWood;
		clone.WoodCloneBuy = original.WoodCloneBuy;
		clone.WoodBeamBuy = original.WoodBeamBuy;
		clone.ChakraReleaseScorch = original.ChakraReleaseScorch;
		clone.ExtremeSteamingMurderBuy = original.ExtremeSteamingMurderBuy;
		clone.GreatExplosiveSteamingMurderBuy = original.GreatExplosiveSteamingMurderBuy;
		clone.TimeScorched = original.TimeScorched;
		clone.ChakraReleaseLava = original.ChakraReleaseLava;
		clone.LavaChakraModeBuy = original.LavaChakraModeBuy;
		clone.FieryRockBulletBuy = original.FieryRockBulletBuy;
		clone.LavaChakraModeOn = original.LavaChakraModeOn;
		clone.PlayerSpeed = original.PlayerSpeed;
		clone.SenjuClanJoin = original.SenjuClanJoin;
		clone.IceBreakingFistBuy = original.IceBreakingFistBuy;
		clone.ChakraReleaseIce = original.ChakraReleaseIce;
		clone.TenThousandIcePetalsBuy = original.TenThousandIcePetalsBuy;
		clone.ChakraReleaseBoil = original.ChakraReleaseBoil;
		clone.SkilledMistTechniqueBuy = original.SkilledMistTechniqueBuy;
		clone.EruptingPropulsionFistBuy = original.EruptingPropulsionFistBuy;
		clone.CrystalNeedlesBuy = original.CrystalNeedlesBuy;
		clone.ShurikenWildDanceBuy = original.ShurikenWildDanceBuy;
		clone.ChakraReleaseCrystal = original.ChakraReleaseCrystal;
		clone.ChakraReleaseExplosive = original.ChakraReleaseExplosive;
		clone.ExplosivePalmBuy = original.ExplosivePalmBuy;
		clone.ExplosiveLandminesBuy = original.ExplosiveLandminesBuy;
		clone.ChakraReleaseDark = original.ChakraReleaseDark;
		clone.InhalingMawBuy = original.InhalingMawBuy;
		clone.JudgementBuy = original.JudgementBuy;
		clone.CHakraReleaseMagnet = original.CHakraReleaseMagnet;
		clone.GoldSandDrizzleBuy = original.GoldSandDrizzleBuy;
		clone.IronSandDrizzleBuy = original.IronSandDrizzleBuy;
		clone.ChakraReleaseDust = original.ChakraReleaseDust;
		clone.DOTPWbuy = original.DOTPWbuy;
		clone.ChakraReleaseMud = original.ChakraReleaseMud;
		clone.ChakraReleaseSteel = original.ChakraReleaseSteel;
		clone.ChakraReleaseStorm = original.ChakraReleaseStorm;
		clone.ChakraReleaseSwift = original.ChakraReleaseSwift;
		clone.ChakraReleaseTyphoon = original.ChakraReleaseTyphoon;
		clone.BottomlessMudHoleBuy = original.BottomlessMudHoleBuy;
		clone.ImperviousArmorBuy = original.ImperviousArmorBuy;
		clone.SteelProjectileBuy = original.SteelProjectileBuy;
		clone.LazerCircusBuy = original.LazerCircusBuy;
		clone.ThunderCloudInnerWaveBuy = original.ThunderCloudInnerWaveBuy;
		clone.ShadowlessFlightBuy = original.ShadowlessFlightBuy;
		clone.ConsecutiveBurstingStrongWaindBuy = original.ConsecutiveBurstingStrongWaindBuy;
		clone.GreatConsecutiveBurstingExtremeWindsBuy = original.GreatConsecutiveBurstingExtremeWindsBuy;
		clone.PlayerXPLevelUpPoints = original.PlayerXPLevelUpPoints;
		clone.HazyGenjutsuOn = original.HazyGenjutsuOn;
		clone.ExplosiveSacrificeTechniqueBuy = original.ExplosiveSacrificeTechniqueBuy;
		clone.FireChakraBombBuy = original.FireChakraBombBuy;
		clone.FireShurikenBuy = original.FireShurikenBuy;
		clone.BlazingShieldBuy = original.BlazingShieldBuy;
		clone.StickyFireBuy = original.StickyFireBuy;
		clone.FieryRainBuy = original.FieryRainBuy;
		clone.FlameSwordBuy = original.FlameSwordBuy;
		clone.HellFireSpikesBuy = original.HellFireSpikesBuy;
		clone.HellFireTechniqueBuy = original.HellFireTechniqueBuy;
		clone.BlazingRedCannonBuy = original.BlazingRedCannonBuy;
		clone.FieryExplosiveBlastBuy = original.FieryExplosiveBlastBuy;
		clone.RedWindBuy = original.RedWindBuy;
		clone.FireDragonBuy = original.FireDragonBuy;
		clone.FireHammerTechniqueBuy = original.FireHammerTechniqueBuy;
		clone.CremationBuy = original.CremationBuy;
		clone.EternalFlames = original.EternalFlames;
		clone.FireBladeMissilesBuy = original.FireBladeMissilesBuy;
		clone.IgnateBuy = original.IgnateBuy;
		clone.PheonixFireBuy = original.PheonixFireBuy;
		clone.GentleTouchOfFireBuy = original.GentleTouchOfFireBuy;
		clone.GrandFireballBuy = original.GrandFireballBuy;
		clone.IntellegentHardWorkBuy = original.IntellegentHardWorkBuy;
		clone.MistCoveringBuy = original.MistCoveringBuy;
		clone.RoaringFlameSphereBuy = original.RoaringFlameSphereBuy;
		clone.SharkProjectileBuy = original.SharkProjectileBuy;
		clone.DenseRainBuy = original.DenseRainBuy;
		clone.SlipperySurfaceBuy = original.SlipperySurfaceBuy;
		clone.CannonBallBuy = original.CannonBallBuy;
		clone.RainCoatBuy = original.RainCoatBuy;
		clone.PoisonNeedleBuy = original.PoisonNeedleBuy;
		clone.BlackCloudsTechniqueBuy = original.BlackCloudsTechniqueBuy;
		clone.GreatExplodingCurrentBuy = original.GreatExplodingCurrentBuy;
		clone.HiddenMistBuy = original.HiddenMistBuy;
		clone.ChidoriNagashiBuy = original.ChidoriNagashiBuy;
		clone.ChidoriSenbonBuy = original.ChidoriSenbonBuy;
		clone.KirinBuy = original.KirinBuy;
		clone.ThunderCrashBuy = original.ThunderCrashBuy;
		clone.ChitenraisouBuy = original.ChitenraisouBuy;
		clone.StungunTechniqueBuy = original.StungunTechniqueBuy;
		clone.ElectricalDischargeBuy = original.ElectricalDischargeBuy;
		clone.MinorElectricalCurrentBuy = original.MinorElectricalCurrentBuy;
		clone.CrampTechniqueBuy = original.CrampTechniqueBuy;
		clone.HighVoltageTouchBuy = original.HighVoltageTouchBuy;
		clone.HeavenlyEletricalCutterBuy = original.HeavenlyEletricalCutterBuy;
		clone.LightningEdgeBuy = original.LightningEdgeBuy;
		clone.LightningDevourerTechniqueBuy = original.LightningDevourerTechniqueBuy;
		clone.LightningTigerMissileBuy = original.LightningTigerMissileBuy;
		clone.LightningDragonBlastBuy = original.LightningDragonBlastBuy;
		clone.ViolentLightningDragonTechniqueBuy = original.ViolentLightningDragonTechniqueBuy;
		clone.WrathOfHeavenBuy = original.WrathOfHeavenBuy;
		clone.BurningAshCloudBuy = original.BurningAshCloudBuy;
		clone.airbulletbuy = original.airbulletbuy;
		clone.AttackingPlantsBuy = original.AttackingPlantsBuy;
		clone.RockRainBoulderBuy = original.RockRainBoulderBuy;
		clone.SmallWindBlastBuy = original.SmallWindBlastBuy;
		clone.WaterJutsuBuy = original.WaterJutsuBuy;
		clone.FLyingTechniqueBuy = original.FLyingTechniqueBuy;
		clone.WhirlwindPrisonBuy = original.WhirlwindPrisonBuy;
		clone.WirlwindPrisonBuy = original.WirlwindPrisonBuy;
		clone.WaterBulletBuy = original.WaterBulletBuy;
		clone.TrueSightMSBuy = original.TrueSightMSBuy;
		clone.EternalTrueSightMSBuy = original.EternalTrueSightMSBuy;
		clone.ViolentWaterWaveBuy = original.ViolentWaterWaveBuy;
		if (!event.isWasDeath()) {
			clone.NightGateParticlesOn = original.NightGateParticlesOn;
			clone.NightGuy = original.NightGuy;
			clone.ElectricJoltBuy = original.ElectricJoltBuy;
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.WaterShurikenJutsuBuy = message.data.WaterShurikenJutsuBuy;
					variables.WaterWalkingBuy = message.data.WaterWalkingBuy;
					variables.WaterWalking = message.data.WaterWalking;
					variables.WaterBladeTechniqueBuy = message.data.WaterBladeTechniqueBuy;
					variables.ChakraReleaseWater = message.data.ChakraReleaseWater;
					variables.MuddyWaterBallBuy = message.data.MuddyWaterBallBuy;
					variables.WaterEncampmentWallBuy = message.data.WaterEncampmentWallBuy;
					variables.WaterPrisonBuy = message.data.WaterPrisonBuy;
					variables.WaterDragonBuy = message.data.WaterDragonBuy;
					variables.WhipOfWaterBuy = message.data.WhipOfWaterBuy;
					variables.TornadoOfWaterBuy = message.data.TornadoOfWaterBuy;
					variables.BurstinWaterCollisonWavesBuy = message.data.BurstinWaterCollisonWavesBuy;
					variables.GrandWaterFallTechniqueBuy = message.data.GrandWaterFallTechniqueBuy;
					variables.WaterMissileBuy = message.data.WaterMissileBuy;
					variables.MassWaterMissilesBuy = message.data.MassWaterMissilesBuy;
					variables.DisguiseJutsuBuy = message.data.DisguiseJutsuBuy;
					variables.RasenganBuy = message.data.RasenganBuy;
					variables.ChakraAmount = message.data.ChakraAmount;
					variables.ChakraMax = message.data.ChakraMax;
					variables.ChidoriBuy = message.data.ChidoriBuy;
					variables.NarutoRun = message.data.NarutoRun;
					variables.JutsuPoints = message.data.JutsuPoints;
					variables.Shurikenjutsu = message.data.Shurikenjutsu;
					variables.InfuseChakraBuy = message.data.InfuseChakraBuy;
					variables.Bukijutsu = message.data.Bukijutsu;
					variables.FireballJutsuBuy = message.data.FireballJutsuBuy;
					variables.Kenjutsu = message.data.Kenjutsu;
					variables.JutsuCombo = message.data.JutsuCombo;
					variables.Genjutsu = message.data.Genjutsu;
					variables.medical = message.data.medical;
					variables.Nintaijutsu = message.data.Nintaijutsu;
					variables.hiden = message.data.hiden;
					variables.Kinjutsu = message.data.Kinjutsu;
					variables.Senjutsu = message.data.Senjutsu;
					variables.Taijutsu = message.data.Taijutsu;
					variables.Ninjutsu = message.data.Ninjutsu;
					variables.RockShelterBuy = message.data.RockShelterBuy;
					variables.thunderBuy = message.data.thunderBuy;
					variables.LightningBallBuy = message.data.LightningBallBuy;
					variables.TunnelTechniqueBuy = message.data.TunnelTechniqueBuy;
					variables.TunnelTechniquePlayer = message.data.TunnelTechniquePlayer;
					variables.GalePalmBuy = message.data.GalePalmBuy;
					variables.AirBulletBuy = message.data.AirBulletBuy;
					variables.flameBulletBuy = message.data.flameBulletBuy;
					variables.HailBuy = message.data.HailBuy;
					variables.StoneTrapBuy = message.data.StoneTrapBuy;
					variables.StoneTrap = message.data.StoneTrap;
					variables.NoClan = message.data.NoClan;
					variables.UchihaClanJoin = message.data.UchihaClanJoin;
					variables.OneTomoeSharinganBuy = message.data.OneTomoeSharinganBuy;
					variables.TwoTomoeSharinganBuy = message.data.TwoTomoeSharinganBuy;
					variables.ThreeTomoeSharinganBuy = message.data.ThreeTomoeSharinganBuy;
					variables.Dojutsu = message.data.Dojutsu;
					variables.SasukeMangekyoSharinganBuy = message.data.SasukeMangekyoSharinganBuy;
					variables.ChakraReleaseFire = message.data.ChakraReleaseFire;
					variables.ChakraReleaseWind = message.data.ChakraReleaseWind;
					variables.ChakraReleaseEarth = message.data.ChakraReleaseEarth;
					variables.CharkaReleaseLightning = message.data.CharkaReleaseLightning;
					variables.PlayerLevel = message.data.PlayerLevel;
					variables.PlayerXP = message.data.PlayerXP;
					variables.PlayerXPLevelUp = message.data.PlayerXPLevelUp;
					variables.PlayerSpeedUp = message.data.PlayerSpeedUp;
					variables.PlayerStrengthUp = message.data.PlayerStrengthUp;
					variables.PlayerResistanceUp = message.data.PlayerResistanceUp;
					variables.FireCircleBuy = message.data.FireCircleBuy;
					variables.HazyGenjutsuBuy = message.data.HazyGenjutsuBuy;
					variables.ChakraReleaseYin = message.data.ChakraReleaseYin;
					variables.blocklifegiverbuy = message.data.blocklifegiverbuy;
					variables.blocklifegiving = message.data.blocklifegiving;
					variables.ChakraReleaseYang = message.data.ChakraReleaseYang;
					variables.COATTBuy = message.data.COATTBuy;
					variables.COATT = message.data.COATT;
					variables.CharkaReleaseYinYang = message.data.CharkaReleaseYinYang;
					variables.AntidoteBuy = message.data.AntidoteBuy;
					variables.ChakraStrengthBuy = message.data.ChakraStrengthBuy;
					variables.PlayerHealth = message.data.PlayerHealth;
					variables.AcademyStudent = message.data.AcademyStudent;
					variables.Genin = message.data.Genin;
					variables.Chuunin = message.data.Chuunin;
					variables.Jounin = message.data.Jounin;
					variables.Kage = message.data.Kage;
					variables.NoAffilation = message.data.NoAffilation;
					variables.BodyHealerBuy = message.data.BodyHealerBuy;
					variables.FirstGateOpened = message.data.FirstGateOpened;
					variables.SecondGateOpened = message.data.SecondGateOpened;
					variables.ThirdGateOpened = message.data.ThirdGateOpened;
					variables.FourthGateOpened = message.data.FourthGateOpened;
					variables.FifthGateOpened = message.data.FifthGateOpened;
					variables.SixthGateOpened = message.data.SixthGateOpened;
					variables.SeventhGateOpened = message.data.SeventhGateOpened;
					variables.EighthGateOpened = message.data.EighthGateOpened;
					variables.FirstGateBuy = message.data.FirstGateBuy;
					variables.SecondgateBuy = message.data.SecondgateBuy;
					variables.ThirdGateBuy = message.data.ThirdGateBuy;
					variables.FourthGateBuy = message.data.FourthGateBuy;
					variables.FifthGateBuy = message.data.FifthGateBuy;
					variables.SixthGateBuy = message.data.SixthGateBuy;
					variables.SeventhGateBuy = message.data.SeventhGateBuy;
					variables.EighthGateBuy = message.data.EighthGateBuy;
					variables.NightGateParticlesOn = message.data.NightGateParticlesOn;
					variables.NightGuy = message.data.NightGuy;
					variables.UzumakiClanJoin = message.data.UzumakiClanJoin;
					variables.UzumakiChainsBuy = message.data.UzumakiChainsBuy;
					variables.UzumakiChakraBiteBuy = message.data.UzumakiChakraBiteBuy;
					variables.UzumakiChakraBite = message.data.UzumakiChakraBite;
					variables.ItachiMangekyoSharinganBuy = message.data.ItachiMangekyoSharinganBuy;
					variables.ObitoMangekyoSharinganBuy = message.data.ObitoMangekyoSharinganBuy;
					variables.KamuiMoveThroughMatter = message.data.KamuiMoveThroughMatter;
					variables.KamuiGoXPos = message.data.KamuiGoXPos;
					variables.KamuiGoYPos = message.data.KamuiGoYPos;
					variables.KamuiGoZPos = message.data.KamuiGoZPos;
					variables.KamuiReturnXPos = message.data.KamuiReturnXPos;
					variables.KamuiReturnYPos = message.data.KamuiReturnYPos;
					variables.KamuiRetunZPos = message.data.KamuiRetunZPos;
					variables.MadaraMangekyoSharinganBuy = message.data.MadaraMangekyoSharinganBuy;
					variables.IzunaMSBuy = message.data.IzunaMSBuy;
					variables.ShisuiMSBuy = message.data.ShisuiMSBuy;
					variables.IndraMSBuy = message.data.IndraMSBuy;
					variables.ShinMSBuy = message.data.ShinMSBuy;
					variables.FugakuMSBuy = message.data.FugakuMSBuy;
					variables.ShinTelekinesisSelfMarked = message.data.ShinTelekinesisSelfMarked;
					variables.SasukeSusanooCageBuy = message.data.SasukeSusanooCageBuy;
					variables.SasukeSusanooSkeletalBuy = message.data.SasukeSusanooSkeletalBuy;
					variables.SasukeSusanooArmoredBuy = message.data.SasukeSusanooArmoredBuy;
					variables.ItachiSusanooCageBuy = message.data.ItachiSusanooCageBuy;
					variables.ItachiSusanooSkeletalBuy = message.data.ItachiSusanooSkeletalBuy;
					variables.ItachiSusanooArmoredBuy = message.data.ItachiSusanooArmoredBuy;
					variables.ObitoSusanooCageBuy = message.data.ObitoSusanooCageBuy;
					variables.ObitoSusanooSkeletalBuy = message.data.ObitoSusanooSkeletalBuy;
					variables.ObitoSusanooArmoredBuy = message.data.ObitoSusanooArmoredBuy;
					variables.MadaraSusanooCageBuy = message.data.MadaraSusanooCageBuy;
					variables.MadaraSusanooSkeletalBuy = message.data.MadaraSusanooSkeletalBuy;
					variables.MadaraSusanooArmoredBuy = message.data.MadaraSusanooArmoredBuy;
					variables.IzunaSusanooCageBuy = message.data.IzunaSusanooCageBuy;
					variables.IzunaSusanooSkeletalBuy = message.data.IzunaSusanooSkeletalBuy;
					variables.IzunaSusanooArmoredBuy = message.data.IzunaSusanooArmoredBuy;
					variables.IndraSusanooCageBuy = message.data.IndraSusanooCageBuy;
					variables.IndraSusanooSkeletalBuy = message.data.IndraSusanooSkeletalBuy;
					variables.IndraSusanooArmoredBuy = message.data.IndraSusanooArmoredBuy;
					variables.ShinSusanooCageBuy = message.data.ShinSusanooCageBuy;
					variables.ShinSusanooSkeletalBuy = message.data.ShinSusanooSkeletalBuy;
					variables.ShinSusanooArmoredBuy = message.data.ShinSusanooArmoredBuy;
					variables.ShisuiSusanooCageBuy = message.data.ShisuiSusanooCageBuy;
					variables.ShisuiSusanooSkeletalBuy = message.data.ShisuiSusanooSkeletalBuy;
					variables.ShisuiSusanooArmoredBuy = message.data.ShisuiSusanooArmoredBuy;
					variables.Summoning = message.data.Summoning;
					variables.MangekyoSharinganJutsus = message.data.MangekyoSharinganJutsus;
					variables.ChakraReleaseWood = message.data.ChakraReleaseWood;
					variables.WoodCloneBuy = message.data.WoodCloneBuy;
					variables.WoodBeamBuy = message.data.WoodBeamBuy;
					variables.ChakraReleaseScorch = message.data.ChakraReleaseScorch;
					variables.ExtremeSteamingMurderBuy = message.data.ExtremeSteamingMurderBuy;
					variables.GreatExplosiveSteamingMurderBuy = message.data.GreatExplosiveSteamingMurderBuy;
					variables.TimeScorched = message.data.TimeScorched;
					variables.ChakraReleaseLava = message.data.ChakraReleaseLava;
					variables.LavaChakraModeBuy = message.data.LavaChakraModeBuy;
					variables.FieryRockBulletBuy = message.data.FieryRockBulletBuy;
					variables.LavaChakraModeOn = message.data.LavaChakraModeOn;
					variables.PlayerSpeed = message.data.PlayerSpeed;
					variables.SenjuClanJoin = message.data.SenjuClanJoin;
					variables.IceBreakingFistBuy = message.data.IceBreakingFistBuy;
					variables.ChakraReleaseIce = message.data.ChakraReleaseIce;
					variables.TenThousandIcePetalsBuy = message.data.TenThousandIcePetalsBuy;
					variables.ChakraReleaseBoil = message.data.ChakraReleaseBoil;
					variables.SkilledMistTechniqueBuy = message.data.SkilledMistTechniqueBuy;
					variables.EruptingPropulsionFistBuy = message.data.EruptingPropulsionFistBuy;
					variables.CrystalNeedlesBuy = message.data.CrystalNeedlesBuy;
					variables.ShurikenWildDanceBuy = message.data.ShurikenWildDanceBuy;
					variables.ChakraReleaseCrystal = message.data.ChakraReleaseCrystal;
					variables.ChakraReleaseExplosive = message.data.ChakraReleaseExplosive;
					variables.ExplosivePalmBuy = message.data.ExplosivePalmBuy;
					variables.ExplosiveLandminesBuy = message.data.ExplosiveLandminesBuy;
					variables.ChakraReleaseDark = message.data.ChakraReleaseDark;
					variables.InhalingMawBuy = message.data.InhalingMawBuy;
					variables.JudgementBuy = message.data.JudgementBuy;
					variables.CHakraReleaseMagnet = message.data.CHakraReleaseMagnet;
					variables.GoldSandDrizzleBuy = message.data.GoldSandDrizzleBuy;
					variables.IronSandDrizzleBuy = message.data.IronSandDrizzleBuy;
					variables.ChakraReleaseDust = message.data.ChakraReleaseDust;
					variables.DOTPWbuy = message.data.DOTPWbuy;
					variables.ChakraReleaseMud = message.data.ChakraReleaseMud;
					variables.ChakraReleaseSteel = message.data.ChakraReleaseSteel;
					variables.ChakraReleaseStorm = message.data.ChakraReleaseStorm;
					variables.ChakraReleaseSwift = message.data.ChakraReleaseSwift;
					variables.ChakraReleaseTyphoon = message.data.ChakraReleaseTyphoon;
					variables.BottomlessMudHoleBuy = message.data.BottomlessMudHoleBuy;
					variables.ImperviousArmorBuy = message.data.ImperviousArmorBuy;
					variables.SteelProjectileBuy = message.data.SteelProjectileBuy;
					variables.LazerCircusBuy = message.data.LazerCircusBuy;
					variables.ThunderCloudInnerWaveBuy = message.data.ThunderCloudInnerWaveBuy;
					variables.ShadowlessFlightBuy = message.data.ShadowlessFlightBuy;
					variables.ConsecutiveBurstingStrongWaindBuy = message.data.ConsecutiveBurstingStrongWaindBuy;
					variables.GreatConsecutiveBurstingExtremeWindsBuy = message.data.GreatConsecutiveBurstingExtremeWindsBuy;
					variables.PlayerXPLevelUpPoints = message.data.PlayerXPLevelUpPoints;
					variables.HazyGenjutsuOn = message.data.HazyGenjutsuOn;
					variables.ExplosiveSacrificeTechniqueBuy = message.data.ExplosiveSacrificeTechniqueBuy;
					variables.FireChakraBombBuy = message.data.FireChakraBombBuy;
					variables.FireShurikenBuy = message.data.FireShurikenBuy;
					variables.BlazingShieldBuy = message.data.BlazingShieldBuy;
					variables.StickyFireBuy = message.data.StickyFireBuy;
					variables.FieryRainBuy = message.data.FieryRainBuy;
					variables.FlameSwordBuy = message.data.FlameSwordBuy;
					variables.HellFireSpikesBuy = message.data.HellFireSpikesBuy;
					variables.HellFireTechniqueBuy = message.data.HellFireTechniqueBuy;
					variables.BlazingRedCannonBuy = message.data.BlazingRedCannonBuy;
					variables.FieryExplosiveBlastBuy = message.data.FieryExplosiveBlastBuy;
					variables.RedWindBuy = message.data.RedWindBuy;
					variables.FireDragonBuy = message.data.FireDragonBuy;
					variables.FireHammerTechniqueBuy = message.data.FireHammerTechniqueBuy;
					variables.CremationBuy = message.data.CremationBuy;
					variables.EternalFlames = message.data.EternalFlames;
					variables.FireBladeMissilesBuy = message.data.FireBladeMissilesBuy;
					variables.IgnateBuy = message.data.IgnateBuy;
					variables.PheonixFireBuy = message.data.PheonixFireBuy;
					variables.GentleTouchOfFireBuy = message.data.GentleTouchOfFireBuy;
					variables.GrandFireballBuy = message.data.GrandFireballBuy;
					variables.IntellegentHardWorkBuy = message.data.IntellegentHardWorkBuy;
					variables.MistCoveringBuy = message.data.MistCoveringBuy;
					variables.RoaringFlameSphereBuy = message.data.RoaringFlameSphereBuy;
					variables.SharkProjectileBuy = message.data.SharkProjectileBuy;
					variables.DenseRainBuy = message.data.DenseRainBuy;
					variables.SlipperySurfaceBuy = message.data.SlipperySurfaceBuy;
					variables.CannonBallBuy = message.data.CannonBallBuy;
					variables.RainCoatBuy = message.data.RainCoatBuy;
					variables.PoisonNeedleBuy = message.data.PoisonNeedleBuy;
					variables.BlackCloudsTechniqueBuy = message.data.BlackCloudsTechniqueBuy;
					variables.GreatExplodingCurrentBuy = message.data.GreatExplodingCurrentBuy;
					variables.HiddenMistBuy = message.data.HiddenMistBuy;
					variables.ChidoriNagashiBuy = message.data.ChidoriNagashiBuy;
					variables.ChidoriSenbonBuy = message.data.ChidoriSenbonBuy;
					variables.KirinBuy = message.data.KirinBuy;
					variables.ElectricJoltBuy = message.data.ElectricJoltBuy;
					variables.ThunderCrashBuy = message.data.ThunderCrashBuy;
					variables.ChitenraisouBuy = message.data.ChitenraisouBuy;
					variables.StungunTechniqueBuy = message.data.StungunTechniqueBuy;
					variables.ElectricalDischargeBuy = message.data.ElectricalDischargeBuy;
					variables.MinorElectricalCurrentBuy = message.data.MinorElectricalCurrentBuy;
					variables.CrampTechniqueBuy = message.data.CrampTechniqueBuy;
					variables.HighVoltageTouchBuy = message.data.HighVoltageTouchBuy;
					variables.HeavenlyEletricalCutterBuy = message.data.HeavenlyEletricalCutterBuy;
					variables.LightningEdgeBuy = message.data.LightningEdgeBuy;
					variables.LightningDevourerTechniqueBuy = message.data.LightningDevourerTechniqueBuy;
					variables.LightningTigerMissileBuy = message.data.LightningTigerMissileBuy;
					variables.LightningDragonBlastBuy = message.data.LightningDragonBlastBuy;
					variables.ViolentLightningDragonTechniqueBuy = message.data.ViolentLightningDragonTechniqueBuy;
					variables.WrathOfHeavenBuy = message.data.WrathOfHeavenBuy;
					variables.BurningAshCloudBuy = message.data.BurningAshCloudBuy;
					variables.airbulletbuy = message.data.airbulletbuy;
					variables.AttackingPlantsBuy = message.data.AttackingPlantsBuy;
					variables.RockRainBoulderBuy = message.data.RockRainBoulderBuy;
					variables.SmallWindBlastBuy = message.data.SmallWindBlastBuy;
					variables.WaterJutsuBuy = message.data.WaterJutsuBuy;
					variables.FLyingTechniqueBuy = message.data.FLyingTechniqueBuy;
					variables.WhirlwindPrisonBuy = message.data.WhirlwindPrisonBuy;
					variables.WirlwindPrisonBuy = message.data.WirlwindPrisonBuy;
					variables.WaterBulletBuy = message.data.WaterBulletBuy;
					variables.TrueSightMSBuy = message.data.TrueSightMSBuy;
					variables.EternalTrueSightMSBuy = message.data.EternalTrueSightMSBuy;
					variables.ViolentWaterWaveBuy = message.data.ViolentWaterWaveBuy;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
