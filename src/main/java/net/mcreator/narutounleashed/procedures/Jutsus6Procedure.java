package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.narutounleashed.item.StickyFireShotItem;
import net.mcreator.narutounleashed.item.SteelProjectileItem;
import net.mcreator.narutounleashed.item.MuddyWaterBallItem;
import net.mcreator.narutounleashed.item.LazerCircusItem;
import net.mcreator.narutounleashed.entity.ThunderCloudInnerWaveEntity;
import net.mcreator.narutounleashed.entity.GCBEWEntityEntity;
import net.mcreator.narutounleashed.entity.CBSWEntityEntity;
import net.mcreator.narutounleashed.block.MudBlock;
import net.mcreator.narutounleashed.block.FireChakraBombBlock;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Jutsus6Procedure {
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
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure Jutsus6!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure Jutsus6!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure Jutsus6!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure Jutsus6!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Jutsus6!");
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
		double MudHoleNumber = 0;
		double BlazingShieldNumber = 0;
		if (entity.getPersistentData().getBoolean("Jutsus6") == true) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).BottomlessMudHoleBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 55) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 600) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 93) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A75 Bottomless Mud Hole Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 600);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							MudHoleNumber = 0;
							for (int index0 = 0; index0 < (int) (15); index0++) {
								world.setBlockState(
										new BlockPos((int) x,
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) z),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) (x + 1),
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) z),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) (x - 1),
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) z),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) x,
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) (z + 1)),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) x,
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) (z - 1)),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) (x - 1),
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) (z - 1)),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) (x + 1),
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) (z - 1)),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) (x + 1),
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) (z + 1)),
										MudBlock.block.getDefaultState(), 3);
								world.setBlockState(
										new BlockPos((int) (x - 1),
												(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																entity.getLook(1f).z * 15),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()
														- MudHoleNumber),
												(int) (z + 1)),
										MudBlock.block.getDefaultState(), 3);
								MudHoleNumber = (MudHoleNumber + 1);
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MuddyWaterBallBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 75) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 605) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A77 Muddy Water Ball Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1300);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							for (int index1 = 0; index1 < (int) (8); index1++) {
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (entity instanceof LivingEntity) {
											Entity _ent = entity;
											if (!_ent.world.isRemote()) {
												MuddyWaterBallItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.5, (float) 10,
														(int) 0.1);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 10);
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ImperviousArmorBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 100) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 600) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 832) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72 Impervious Armor Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 600);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 2000, (int) 3, (false), (false)));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SteelProjectileBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 85) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 800) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 833) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72 Steel Projectile Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 800);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							for (int index2 = 0; index2 < (int) (10); index2++) {
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (entity instanceof LivingEntity) {
											Entity _ent = entity;
											if (!_ent.world.isRemote()) {
												SteelProjectileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2.3, (float) 12,
														(int) 2);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 5);
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).LazerCircusBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 90) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1500) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 545) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A79 Lazer Circus Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1500);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							for (int index3 = 0; index3 < (int) (45); index3++) {
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (entity instanceof LivingEntity) {
											Entity _ent = entity;
											if (!_ent.world.isRemote()) {
												LazerCircusItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3.2, (float) 4,
														(int) 0);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 2);
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ThunderCloudInnerWaveBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 120) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 2000) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 376) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A76Thunder Cloud Inner Wave Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 2000);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							entity.getPersistentData().putBoolean("ThunderCloudInnerWaveON", (true));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new ThunderCloudInnerWaveEntity.CustomEntity(ThunderCloudInnerWaveEntity.entity,
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
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShadowlessFlightBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 250) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 100) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 643) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A76Shadowless Flight Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 100);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							{
								Entity _ent = entity;
								_ent.setPositionAndUpdate(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 35, entity.getLook(1f).y * 35,
														entity.getLook(1f).z * 35),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 35, entity.getLook(1f).y * 35,
														entity.getLook(1f).z * 35),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 35, entity.getLook(1f).y * 35,
														entity.getLook(1f).z * 35),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
								if (_ent instanceof ServerPlayerEntity) {
									((ServerPlayerEntity) _ent).connection
											.setPlayerLocation(
													(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 35, entity.getLook(1f).y * 35,
																	entity.getLook(1f).z * 35),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
															.getX()),
													(entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 35,
																			entity.getLook(1f).y * 35, entity.getLook(1f).z * 35),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getY()),
													(entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 35,
																			entity.getLook(1f).y * 35, entity.getLook(1f).z * 35),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()),
													_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
								}
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ConsecutiveBurstingStrongWaindBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 120) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 2000) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 794) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A71Consecutive Bursting Strong Winds Jutsu"),
										(false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 2000);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							entity.getPersistentData().putBoolean("CBSWon", (true));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new CBSWEntityEntity.CustomEntity(CBSWEntityEntity.entity, (World) world);
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
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).GreatConsecutiveBurstingExtremeWindsBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 300) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 10000) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 999) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(
										new StringTextComponent("\u00A710 Great Consecutive Bursting Extreme Winds Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 10000);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("GCBEWon", (true));
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new GCBEWEntityEntity.CustomEntity(GCBEWEntityEntity.entity, (World) world);
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
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ExplosiveSacrificeTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 35) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 264) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Explosive Sacrifice Technique Jutsu"),
										(false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1000);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							if (world instanceof World && !((World) world).isRemote) {
								((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 15, Explosion.Mode.BREAK);
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).FireChakraBombBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 12) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 700) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 572) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Fire Chakra Bomb Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 700);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							world.setBlockState(
									new BlockPos(
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 12, entity.getLook(1f).y * 12,
															entity.getLook(1f).z * 12),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 12, entity.getLook(1f).y * 12,
															entity.getLook(1f).z * 12),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() + 1),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 12, entity.getLook(1f).y * 12,
															entity.getLook(1f).z * 12),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
									FireChakraBombBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).FireShurikenBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 18) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 200) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 147) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Fire Shuriken Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 700);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							entity.getPersistentData().putBoolean("FireShurikenON", (true));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).BlazingShieldBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 25) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 150) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 35) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Blazing Shield Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 150);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							for (int index4 = 0; index4 < (int) (4); index4++) {
								world.setBlockState(new BlockPos((int) (x + 2), (int) (y + BlazingShieldNumber), (int) z),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x + 2), (int) (y + BlazingShieldNumber), (int) (z + 1)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x + 2), (int) (y + BlazingShieldNumber), (int) (z + 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x + 2), (int) (y + BlazingShieldNumber), (int) (z - 1)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x + 2), (int) (y + BlazingShieldNumber), (int) (z - 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 2), (int) (y + BlazingShieldNumber), (int) z),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 2), (int) (y + BlazingShieldNumber), (int) (z + 1)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 2), (int) (y + BlazingShieldNumber), (int) (z + 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 2), (int) (y + BlazingShieldNumber), (int) (z - 1)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 2), (int) (y + BlazingShieldNumber), (int) (z - 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) x, (int) (y + BlazingShieldNumber), (int) (z + 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BlazingShieldNumber), (int) (z + 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BlazingShieldNumber), (int) (z + 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) x, (int) (y + BlazingShieldNumber), (int) (z - 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BlazingShieldNumber), (int) (z - 2)),
										Blocks.FIRE.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BlazingShieldNumber), (int) (z - 2)),
										Blocks.FIRE.getDefaultState(), 3);
								BlazingShieldNumber = (BlazingShieldNumber + 1);
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).StickyFireBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 35) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 200) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 234) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Sticky Fire Jutsu"), (false));
							}
							{
								double _setval = 0;
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JutsuCombo = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 200);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus6", (false));
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									StickyFireShotItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.6, (float) 5, (int) 0.4);
								}
							}
						}
					}
				}
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					entity.getPersistentData().putBoolean("Jutsus6", (false));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 20);
		}
	}
}
