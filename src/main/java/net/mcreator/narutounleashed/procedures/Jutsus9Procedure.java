package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.Hand;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.WaterWhipItem;
import net.mcreator.narutounleashed.item.WaterMissileItem;
import net.mcreator.narutounleashed.item.WaterDragonItem;
import net.mcreator.narutounleashed.item.WaterCannonballItem;
import net.mcreator.narutounleashed.item.ViolentWaterWaveShotItem;
import net.mcreator.narutounleashed.item.TornadoOfWaterShotItem;
import net.mcreator.narutounleashed.item.PoisonNeedleItem;
import net.mcreator.narutounleashed.item.MassWaterMissileItem;
import net.mcreator.narutounleashed.item.GrandWaterFallTechniqueShotItem;
import net.mcreator.narutounleashed.entity.SlipperySurfaceEntityEntity;
import net.mcreator.narutounleashed.entity.HiddenMistEntityEntity;
import net.mcreator.narutounleashed.entity.GrandWaterFallTechniqueEntityEntity;
import net.mcreator.narutounleashed.entity.GECEntityEntity;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Jutsus9Procedure {
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
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure Jutsus9!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure Jutsus9!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure Jutsus9!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure Jutsus9!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Jutsus9!");
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
		if (entity.getPersistentData().getBoolean("Jutsus9") == true) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SlipperySurfaceBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 170) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 15) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 317) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Slippery Surface Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 170);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new SlipperySurfaceEntityEntity.CustomEntity(SlipperySurfaceEntityEntity.entity,
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
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SPLASH, x, y, z, (int) 150, 26, 26, 26, 1);
							}
							entity.getPersistentData().putBoolean("SlipperySurfaceOn", (false));
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CannonBallBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 575) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 10) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 904) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Cannon Ball Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 575);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									WaterCannonballItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 0.9, (float) 9, (int) 1);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).RainCoatBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 600) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 25) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 709) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Rain Coat Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("RainCoatOn", (false));
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).PoisonNeedleBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 160) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 15) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 305) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Poison Needle Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 160);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									PoisonNeedleItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.76, (float) 7, (int) 1);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WaterDragonBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 300) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 65) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 475) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Water Dragon Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 300);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									WaterDragonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.5, (float) 12, (int) 1);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).BlackCloudsTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 800) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 40) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 796) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Black Cloud Technique Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("BCTOn", (true));
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WhipOfWaterBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 200) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 35) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 609) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Whip of Water Jutsu"), (false));
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
							if (entity instanceof LivingEntity) {
								ItemStack _setstack = new ItemStack(WaterWhipItem.block);
								_setstack.setCount((int) 1);
								((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
								if (entity instanceof ServerPlayerEntity)
									((ServerPlayerEntity) entity).inventory.markDirty();
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).TornadoOfWaterBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 700) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 90) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 593) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Tornado Of Water Jutsu"), (false));
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
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									TornadoOfWaterShotItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.5, (float) 1, (int) 0);
								}
							}
							entity.getPersistentData().putBoolean("TornadoOfWaterOn", (true));
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ViolentWaterWaveBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 650) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 75) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 599) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Violent Water Wave Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 650);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									ViolentWaterWaveShotItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.8, (float) 23, (int) 3);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).BurstinWaterCollisonWavesBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 90) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 117) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Bursting Water Collison Waves Jutsu"),
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
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.SPLASH, x, y, z, (int) 1000, 15, 3, 15, 1);
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).GrandWaterFallTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 300) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 75) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 845) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Grand Waterfall Technique Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 300);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new GrandWaterFallTechniqueEntityEntity.CustomEntity(
										GrandWaterFallTechniqueEntityEntity.entity, (World) world);
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
											GrandWaterFallTechniqueShotItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2,
													(float) 20, (int) 7);
										}
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 60);
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).GreatExplodingCurrentBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 650) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 45) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 58) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Great Exploding Current Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 650);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new GECEntityEntity.CustomEntity(GECEntityEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
														entity.getLook(1f).z * 10),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
														entity.getLook(1f).z * 10),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
														entity.getLook(1f).z * 10),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
										(float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).HiddenMistBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 550) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 25) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 906) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Hidden Mist Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 550);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new HiddenMistEntityEntity.CustomEntity(HiddenMistEntityEntity.entity, (World) world);
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
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WaterMissileBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 400) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 30) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 90) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Water MissileJutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 400);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									WaterMissileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.5, (float) 16, (int) 1);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MassWaterMissilesBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 800) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 60) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 180) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74Mass Water MissileJutsu"), (false));
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
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									MassWaterMissileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 32, (int) 2);
								}
							}
							entity.getPersistentData().putBoolean("Jutsus9", (false));
						}
					}
				}
			}
			entity.getPersistentData().putBoolean("Jutsus9", (false));
		}
	}
}
