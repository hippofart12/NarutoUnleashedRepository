package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.LittleLightningDragonItem;
import net.mcreator.narutounleashed.item.LightningTigerItem;
import net.mcreator.narutounleashed.item.LightningEdgeItem;
import net.mcreator.narutounleashed.item.LightningDragonItem;
import net.mcreator.narutounleashed.item.LightningBladeItem;
import net.mcreator.narutounleashed.item.LightningBallItem;
import net.mcreator.narutounleashed.entity.MinorElectricalCurrentEntityEntity;
import net.mcreator.narutounleashed.entity.LightningSpearEntity;
import net.mcreator.narutounleashed.entity.LightningDevourerTechniqueEntityEntity;
import net.mcreator.narutounleashed.entity.ElectricalDischargeEntityEntity;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Jutsus10Procedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure Jutsus10!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure Jutsus10!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure Jutsus10!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure Jutsus10!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Jutsus10!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double Hail = 0;
		if (entity.getPersistentData().getBoolean("Jutsus10") == true) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).KirinBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 850) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 110) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 306) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Kirin Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 850);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("KirinOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ElectricJoltBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 40) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 4) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 27) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Electric Jolt Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 40);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("ElectricJoltOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ThunderCrashBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 230) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 35) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 574) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Thunder Crash Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 230);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									LightningBallItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2.3, (float) 19, (int) 1);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChitenraisouBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 100) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 754) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Chitenraisou Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1000);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							for (int index0 = 0; index0 < (int) (20); index0++) {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new LightningSpearEntity.CustomEntity(LightningSpearEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles((x + Math.random() * 28), (y + 20), (z + Math.random() * 28), (float) 0,
											(float) 0);
									entityToSpawn.setRenderYawOffset((float) 0);
									entityToSpawn.setRotationYawHead((float) 0);
									entityToSpawn.setMotion(0, 0, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new LightningSpearEntity.CustomEntity(LightningSpearEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles((x - Math.random() * 28), (y + 20), (z + Math.random() * 28), (float) 0,
											(float) 0);
									entityToSpawn.setRenderYawOffset((float) 0);
									entityToSpawn.setRotationYawHead((float) 0);
									entityToSpawn.setMotion(0, 0, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new LightningSpearEntity.CustomEntity(LightningSpearEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles((x - Math.random() * 28), (y + 20), (z - Math.random() * 28), (float) 0,
											(float) 0);
									entityToSpawn.setRenderYawOffset((float) 0);
									entityToSpawn.setRotationYawHead((float) 0);
									entityToSpawn.setMotion(0, 0, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new LightningSpearEntity.CustomEntity(LightningSpearEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles((x + Math.random() * 28), (y + 20), (z - Math.random() * 28), (float) 0,
											(float) 0);
									entityToSpawn.setRenderYawOffset((float) 0);
									entityToSpawn.setRotationYawHead((float) 0);
									entityToSpawn.setMotion(0, 0, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).StungunTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 100) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 22) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 235) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Stungun Technique Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 100);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("StungunTechniqueOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ElectricalDischargeBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 200) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 20) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 657) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Electric Discharge Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 200);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new ElectricalDischargeEntityEntity.CustomEntity(ElectricalDischargeEntityEntity.entity,
										(World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							entity.getPersistentData().putBoolean("ElecricalDischargeOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MinorElectricalCurrentBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 120) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 20) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 715) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Minor Electrical Current Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 120);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new MinorElectricalCurrentEntityEntity.CustomEntity(MinorElectricalCurrentEntityEntity.entity,
										(World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							entity.getPersistentData().putBoolean("MinorElectricalCurrentOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CrampTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 250) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 15) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 524) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Cramp Technique Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 250);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("CramptechniqueOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).HighVoltageTouchBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 500) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 50) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 374) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77High Voltage Touch Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 500);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("HighVoltageTouchOn", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).HeavenlyEletricalCutterBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 700) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 45) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 75) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Heavenly Lightning Cutter Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 700);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								ItemStack _setstack = new ItemStack(LightningBladeItem.block);
								_setstack.setCount((int) 1);
								((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
								if (entity instanceof ServerPlayerEntity)
									((ServerPlayerEntity) entity).inventory.markDirty();
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).LightningEdgeBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 600) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 35) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 383) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Lightning Edge Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 600);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								ItemStack _setstack = new ItemStack(LightningEdgeItem.block);
								_setstack.setCount((int) 1);
								((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
								if (entity instanceof ServerPlayerEntity)
									((ServerPlayerEntity) entity).inventory.markDirty();
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).LightningDevourerTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 48) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 56) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Lightning Devourer Technique Jutsu"),
										(false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1000);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new LightningDevourerTechniqueEntityEntity.CustomEntity(
										LightningDevourerTechniqueEntityEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							entity.getPersistentData().putBoolean("LightningDevourerTech.On", (true));
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).LightningTigerMissileBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 700) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 68) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 378) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Lightning Tiger Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 700);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									LightningTigerItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 25, (int) 2);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).LightningDragonBlastBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1100) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 100) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 408) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Lightning Dragon Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1100);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									LightningDragonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 40, (int) 3);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ViolentLightningDragonTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 600) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 90) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 689) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Violent Lightning Dragon Technique Jutsu"),
										(false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 600);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									LittleLightningDragonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3.5, (float) 50,
											(int) 2);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WrathOfHeavenBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1500) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 170) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 95) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77Wrath Of Heaven Jutsu"), (false));
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1500);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							for (int index1 = 0; index1 < (int) (30); index1++) {
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x + Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z + Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z + Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x - Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
								if (world instanceof ServerWorld) {
									LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
									_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(
											(int) (x - Math.random() * 20), (int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (x + Math.random() * 20), (int) (z - Math.random() * 20))),
											(int) (z - Math.random() * 20))));
									_ent.setEffectOnly(false);
									((World) world).addEntity(_ent);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus10", (false));
						}
					}
				}
			}
			entity.getPersistentData().putBoolean("Jutsus10", (false));
		}
	}
}
