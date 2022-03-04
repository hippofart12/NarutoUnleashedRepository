package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.narutounleashed.item.WaterEncampmentWallItem;
import net.mcreator.narutounleashed.item.TrueSightMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.TrueSightEternalMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.SharkProjectileItem;
import net.mcreator.narutounleashed.item.HellFlameItem;
import net.mcreator.narutounleashed.item.FlameSwordItem;
import net.mcreator.narutounleashed.item.ChidoriSenbonItem;
import net.mcreator.narutounleashed.entity.RockBoulderEntity;
import net.mcreator.narutounleashed.entity.FieryRainTechniqueEntity;
import net.mcreator.narutounleashed.entity.ChidoriNagashiEntityEntity;
import net.mcreator.narutounleashed.entity.AttackPlantsEntityEntity;
import net.mcreator.narutounleashed.entity.AliveAcaicaLogEntity;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Jutsus7Procedure {
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
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure Jutsus7!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure Jutsus7!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure Jutsus7!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure Jutsus7!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Jutsus7!");
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
		if (entity.getPersistentData().getBoolean("Jutsus7") == true) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WaterEncampmentWallBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 25) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 300) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 316) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73 Water Encampment Wall Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									WaterEncampmentWallItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 6, (int) 3);
								}
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SharkProjectileBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 8) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 200) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 127) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73 Shark Projectile Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									SharkProjectileItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 6, (int) 3);
								}
							}
						}
					}
				}
			}
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == TrueSightMangekyoSharinganItem.helmet
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
							.getItem() == TrueSightEternalMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1250) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 768) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72Sight Of Lightning"), (false));
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
									.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1250);
							entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChakraAmount = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putBoolean("Jutsus7", (false));
						entity.getPersistentData().putBoolean("Sight Of Lightning", (true));
					}
				}
			}
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == TrueSightMangekyoSharinganItem.helmet
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
							.getItem() == TrueSightEternalMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 786) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72God of Lightning"), (false));
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
									.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1250);
							entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChakraAmount = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putBoolean("Jutsus7", (false));
						for (int index0 = 0; index0 < (int) (50); index0++) {
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
									if (world instanceof ServerWorld) {
										LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
										_ent.moveForced(
												Vector3d.copyCenteredHorizontally(
														new BlockPos(
																(int) (entity.world
																		.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																				entity.getEyePosition(1f).add(entity.getLook(1f).x * 25,
																						entity.getLook(1f).y * 25, entity.getLook(1f).z * 25),
																				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																				entity))
																		.getPos().getX()),
																(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 25,
																				entity.getLook(1f).y * 25, entity.getLook(1f).z * 25),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																		.getPos().getY()),
																(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 25,
																				entity.getLook(1f).y * 25, entity.getLook(1f).z * 25),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																		.getPos().getZ()))));
										_ent.setEffectOnly(false);
										((World) world).addEntity(_ent);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 1);
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChidoriNagashiBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 85) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1800) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 834) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73 Chidori Nagashi Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 1800);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							entity.getPersistentData().putBoolean("ChidoriNagashied", (false));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new ChidoriNagashiEntityEntity.CustomEntity(ChidoriNagashiEntityEntity.entity, (World) world);
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
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChidoriSenbonBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 70) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1500) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 987) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73 Chidori Senbon Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
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
											ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 2, (int) 0.1);
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
											if (entity instanceof LivingEntity) {
												Entity _ent = entity;
												if (!_ent.world.isRemote()) {
													ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 2,
															(int) 0.1);
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
													if (entity instanceof LivingEntity) {
														Entity _ent = entity;
														if (!_ent.world.isRemote()) {
															ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3,
																	(float) 2, (int) 0.1);
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
															if (entity instanceof LivingEntity) {
																Entity _ent = entity;
																if (!_ent.world.isRemote()) {
																	ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(),
																			(float) 3, (float) 2, (int) 0.1);
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
																	if (entity instanceof LivingEntity) {
																		Entity _ent = entity;
																		if (!_ent.world.isRemote()) {
																			ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(),
																					(float) 3, (float) 2, (int) 0.1);
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
																			if (entity instanceof LivingEntity) {
																				Entity _ent = entity;
																				if (!_ent.world.isRemote()) {
																					ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity,
																							new Random(), (float) 3, (float) 2, (int) 0.1);
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
																					if (entity instanceof LivingEntity) {
																						Entity _ent = entity;
																						if (!_ent.world.isRemote()) {
																							ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity,
																									new Random(), (float) 3, (float) 2, (int) 0.1);
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
																							if (entity instanceof LivingEntity) {
																								Entity _ent = entity;
																								if (!_ent.world.isRemote()) {
																									ChidoriSenbonItem.shoot(_ent.world,
																											(LivingEntity) entity, new Random(),
																											(float) 3, (float) 2, (int) 0.1);
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
																									if (entity instanceof LivingEntity) {
																										Entity _ent = entity;
																										if (!_ent.world.isRemote()) {
																											ChidoriSenbonItem.shoot(_ent.world,
																													(LivingEntity) entity,
																													new Random(), (float) 3,
																													(float) 2, (int) 0.1);
																										}
																									}
																									new Object() {
																										private int ticks = 0;
																										private float waitTicks;
																										private IWorld world;

																										public void start(IWorld world,
																												int waitTicks) {
																											this.waitTicks = waitTicks;
																											MinecraftForge.EVENT_BUS.register(this);
																											this.world = world;
																										}

																										@SubscribeEvent
																										public void tick(
																												TickEvent.ServerTickEvent event) {
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
																													ChidoriSenbonItem.shoot(
																															_ent.world,
																															(LivingEntity) entity,
																															new Random(), (float) 3,
																															(float) 2, (int) 0.1);
																												}
																											}
																											new Object() {
																												private int ticks = 0;
																												private float waitTicks;
																												private IWorld world;

																												public void start(IWorld world,
																														int waitTicks) {
																													this.waitTicks = waitTicks;
																													MinecraftForge.EVENT_BUS
																															.register(this);
																													this.world = world;
																												}

																												@SubscribeEvent
																												public void tick(
																														TickEvent.ServerTickEvent event) {
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
																															ChidoriSenbonItem.shoot(
																																	_ent.world,
																																	(LivingEntity) entity,
																																	new Random(),
																																	(float) 3,
																																	(float) 2,
																																	(int) 0.1);
																														}
																													}
																													new Object() {
																														private int ticks = 0;
																														private float waitTicks;
																														private IWorld world;

																														public void start(
																																IWorld world,
																																int waitTicks) {
																															this.waitTicks = waitTicks;
																															MinecraftForge.EVENT_BUS
																																	.register(this);
																															this.world = world;
																														}

																														@SubscribeEvent
																														public void tick(
																																TickEvent.ServerTickEvent event) {
																															if (event.phase == TickEvent.Phase.END) {
																																this.ticks += 1;
																																if (this.ticks >= this.waitTicks)
																																	run();
																															}
																														}

																														private void run() {
																															if (entity instanceof LivingEntity) {
																																Entity _ent = entity;
																																if (!_ent.world
																																		.isRemote()) {
																																	ChidoriSenbonItem
																																			.shoot(_ent.world,
																																					(LivingEntity) entity,
																																					new Random(),
																																					(float) 3,
																																					(float) 2,
																																					(int) 0.1);
																																}
																															}
																															new Object() {
																																private int ticks = 0;
																																private float waitTicks;
																																private IWorld world;

																																public void start(
																																		IWorld world,
																																		int waitTicks) {
																																	this.waitTicks = waitTicks;
																																	MinecraftForge.EVENT_BUS
																																			.register(
																																					this);
																																	this.world = world;
																																}

																																@SubscribeEvent
																																public void tick(
																																		TickEvent.ServerTickEvent event) {
																																	if (event.phase == TickEvent.Phase.END) {
																																		this.ticks += 1;
																																		if (this.ticks >= this.waitTicks)
																																			run();
																																	}
																																}

																																private void run() {
																																	if (entity instanceof LivingEntity) {
																																		Entity _ent = entity;
																																		if (!_ent.world
																																				.isRemote()) {
																																			ChidoriSenbonItem
																																					.shoot(_ent.world,
																																							(LivingEntity) entity,
																																							new Random(),
																																							(float) 3,
																																							(float) 2,
																																							(int) 0.1);
																																		}
																																	}
																																	new Object() {
																																		private int ticks = 0;
																																		private float waitTicks;
																																		private IWorld world;

																																		public void start(
																																				IWorld world,
																																				int waitTicks) {
																																			this.waitTicks = waitTicks;
																																			MinecraftForge.EVENT_BUS
																																					.register(
																																							this);
																																			this.world = world;
																																		}

																																		@SubscribeEvent
																																		public void tick(
																																				TickEvent.ServerTickEvent event) {
																																			if (event.phase == TickEvent.Phase.END) {
																																				this.ticks += 1;
																																				if (this.ticks >= this.waitTicks)
																																					run();
																																			}
																																		}

																																		private void run() {
																																			if (entity instanceof LivingEntity) {
																																				Entity _ent = entity;
																																				if (!_ent.world
																																						.isRemote()) {
																																					ChidoriSenbonItem
																																							.shoot(_ent.world,
																																									(LivingEntity) entity,
																																									new Random(),
																																									(float) 3,
																																									(float) 2,
																																									(int) 0.1);
																																				}
																																			}
																																			new Object() {
																																				private int ticks = 0;
																																				private float waitTicks;
																																				private IWorld world;

																																				public void start(
																																						IWorld world,
																																						int waitTicks) {
																																					this.waitTicks = waitTicks;
																																					MinecraftForge.EVENT_BUS
																																							.register(
																																									this);
																																					this.world = world;
																																				}

																																				@SubscribeEvent
																																				public void tick(
																																						TickEvent.ServerTickEvent event) {
																																					if (event.phase == TickEvent.Phase.END) {
																																						this.ticks += 1;
																																						if (this.ticks >= this.waitTicks)
																																							run();
																																					}
																																				}

																																				private void run() {
																																					if (entity instanceof LivingEntity) {
																																						Entity _ent = entity;
																																						if (!_ent.world
																																								.isRemote()) {
																																							ChidoriSenbonItem
																																									.shoot(_ent.world,
																																											(LivingEntity) entity,
																																											new Random(),
																																											(float) 3,
																																											(float) 2,
																																											(int) 0.1);
																																						}
																																					}
																																					new Object() {
																																						private int ticks = 0;
																																						private float waitTicks;
																																						private IWorld world;

																																						public void start(
																																								IWorld world,
																																								int waitTicks) {
																																							this.waitTicks = waitTicks;
																																							MinecraftForge.EVENT_BUS
																																									.register(
																																											this);
																																							this.world = world;
																																						}

																																						@SubscribeEvent
																																						public void tick(
																																								TickEvent.ServerTickEvent event) {
																																							if (event.phase == TickEvent.Phase.END) {
																																								this.ticks += 1;
																																								if (this.ticks >= this.waitTicks)
																																									run();
																																							}
																																						}

																																						private void run() {
																																							if (entity instanceof LivingEntity) {
																																								Entity _ent = entity;
																																								if (!_ent.world
																																										.isRemote()) {
																																									ChidoriSenbonItem
																																											.shoot(_ent.world,
																																													(LivingEntity) entity,
																																													new Random(),
																																													(float) 3,
																																													(float) 2,
																																													(int) 0.1);
																																								}
																																							}
																																							MinecraftForge.EVENT_BUS
																																									.unregister(
																																											this);
																																						}
																																					}.start(world,
																																							(int) 1);
																																					MinecraftForge.EVENT_BUS
																																							.unregister(
																																									this);
																																				}
																																			}.start(world,
																																					(int) 1);
																																			MinecraftForge.EVENT_BUS
																																					.unregister(
																																							this);
																																		}
																																	}.start(world,
																																			(int) 1);
																																	MinecraftForge.EVENT_BUS
																																			.unregister(
																																					this);
																																}
																															}.start(world, (int) 1);
																															MinecraftForge.EVENT_BUS
																																	.unregister(this);
																														}
																													}.start(world, (int) 1);
																													MinecraftForge.EVENT_BUS
																															.unregister(this);
																												}
																											}.start(world, (int) 1);
																											MinecraftForge.EVENT_BUS.unregister(this);
																										}
																									}.start(world, (int) 1);
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, (int) 1);
																							MinecraftForge.EVENT_BUS.unregister(this);
																						}
																					}.start(world, (int) 1);
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, (int) 1);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 1);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 1);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 1);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 1);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 1);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 1);
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).RockRainBoulderBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 65) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 300) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 626) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A76 Rock Rain Boulder Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
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
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10), (z + Math.random() * 7),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10), (z + Math.random() * 7),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10), (z - Math.random() * 7),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10), (z - Math.random() * 7),
												world.getRandom().nextFloat() * 360F, 0);
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
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
												entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10), (z + Math.random() * 7),
														world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof MobEntity)
													((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
															world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
															(ILivingEntityData) null, (CompoundNBT) null);
												world.addEntity(entityToSpawn);
											}
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
												entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10), (z + Math.random() * 7),
														world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof MobEntity)
													((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
															world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
															(ILivingEntityData) null, (CompoundNBT) null);
												world.addEntity(entityToSpawn);
											}
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new AliveAcaicaLogEntity.CustomEntity(AliveAcaicaLogEntity.entity,
														(World) world);
												entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10), (z - Math.random() * 7),
														world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof MobEntity)
													((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
															world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
															(ILivingEntityData) null, (CompoundNBT) null);
												world.addEntity(entityToSpawn);
											}
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity, (World) world);
												entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10), (z - Math.random() * 7),
														world.getRandom().nextFloat() * 360F, 0);
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
													if (world instanceof ServerWorld) {
														Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																(World) world);
														entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10), (z + Math.random() * 7),
																world.getRandom().nextFloat() * 360F, 0);
														if (entityToSpawn instanceof MobEntity)
															((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																	world.getDifficultyForLocation(entityToSpawn.getPosition()),
																	SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
														world.addEntity(entityToSpawn);
													}
													if (world instanceof ServerWorld) {
														Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																(World) world);
														entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10), (z + Math.random() * 7),
																world.getRandom().nextFloat() * 360F, 0);
														if (entityToSpawn instanceof MobEntity)
															((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																	world.getDifficultyForLocation(entityToSpawn.getPosition()),
																	SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
														world.addEntity(entityToSpawn);
													}
													if (world instanceof ServerWorld) {
														Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																(World) world);
														entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10), (z - Math.random() * 7),
																world.getRandom().nextFloat() * 360F, 0);
														if (entityToSpawn instanceof MobEntity)
															((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																	world.getDifficultyForLocation(entityToSpawn.getPosition()),
																	SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
														world.addEntity(entityToSpawn);
													}
													if (world instanceof ServerWorld) {
														Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																(World) world);
														entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10), (z - Math.random() * 7),
																world.getRandom().nextFloat() * 360F, 0);
														if (entityToSpawn instanceof MobEntity)
															((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																	world.getDifficultyForLocation(entityToSpawn.getPosition()),
																	SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
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
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																		(World) world);
																entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10),
																		(z + Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																		(World) world);
																entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10),
																		(z + Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																		(World) world);
																entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10),
																		(z - Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new RockBoulderEntity.CustomEntity(RockBoulderEntity.entity,
																		(World) world);
																entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10),
																		(z - Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
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
																	if (world instanceof ServerWorld) {
																		Entity entityToSpawn = new RockBoulderEntity.CustomEntity(
																				RockBoulderEntity.entity, (World) world);
																		entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10),
																				(z + Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																		if (entityToSpawn instanceof MobEntity)
																			((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																					world.getDifficultyForLocation(entityToSpawn.getPosition()),
																					SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																					(CompoundNBT) null);
																		world.addEntity(entityToSpawn);
																	}
																	if (world instanceof ServerWorld) {
																		Entity entityToSpawn = new RockBoulderEntity.CustomEntity(
																				RockBoulderEntity.entity, (World) world);
																		entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10),
																				(z + Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																		if (entityToSpawn instanceof MobEntity)
																			((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																					world.getDifficultyForLocation(entityToSpawn.getPosition()),
																					SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																					(CompoundNBT) null);
																		world.addEntity(entityToSpawn);
																	}
																	if (world instanceof ServerWorld) {
																		Entity entityToSpawn = new RockBoulderEntity.CustomEntity(
																				RockBoulderEntity.entity, (World) world);
																		entityToSpawn.setLocationAndAngles((x - Math.random() * 7), (y + 10),
																				(z - Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																		if (entityToSpawn instanceof MobEntity)
																			((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																					world.getDifficultyForLocation(entityToSpawn.getPosition()),
																					SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																					(CompoundNBT) null);
																		world.addEntity(entityToSpawn);
																	}
																	if (world instanceof ServerWorld) {
																		Entity entityToSpawn = new RockBoulderEntity.CustomEntity(
																				RockBoulderEntity.entity, (World) world);
																		entityToSpawn.setLocationAndAngles((x + Math.random() * 7), (y + 10),
																				(z - Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
																		if (entityToSpawn instanceof MobEntity)
																			((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																					world.getDifficultyForLocation(entityToSpawn.getPosition()),
																					SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																					(CompoundNBT) null);
																		world.addEntity(entityToSpawn);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 5);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 5);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 5);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 5);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 5);
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).AttackingPlantsBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 35) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 400) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 157) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A76 Attacking Plants Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new AttackPlantsEntityEntity.CustomEntity(AttackPlantsEntityEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
														entity.getLook(1f).z * 2),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
														entity.getLook(1f).z * 2),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
														entity.getLook(1f).z * 2),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
										(float) (entity.rotationYaw), (float) (entity.rotationPitch));
								entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
								entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new AttackPlantsEntityEntity.CustomEntity(AttackPlantsEntityEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
														entity.getLook(1f).z * 3),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
														entity.getLook(1f).z * 3),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
														entity.getLook(1f).z * 3),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
										(float) (entity.rotationYaw), (float) (entity.rotationPitch));
								entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
								entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new AttackPlantsEntityEntity.CustomEntity(AttackPlantsEntityEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
														entity.getLook(1f).z * 4),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
														entity.getLook(1f).z * 4),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
														entity.getLook(1f).z * 4),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
										(float) (entity.rotationYaw), (float) (entity.rotationPitch));
								entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
								entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new AttackPlantsEntityEntity.CustomEntity(AttackPlantsEntityEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
										(float) (entity.rotationYaw), (float) (entity.rotationPitch));
								entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
								entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
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
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SmallWindBlastBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 5) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 25) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 74) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A75 Small Wind Blast Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 25);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
									entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 1.8, 0);
									entityToSpawn.setDamage((float) 3);
									entityToSpawn.setKnockbackStrength((int) 8);
									_ent.world.addEntity(entityToSpawn);
								}
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WirlwindPrisonBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 90) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 3500) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 436) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A75Wirlwind Prison Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 3500);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							entity.getPersistentData().putBoolean("WirlwindPrisonJutsuON", (false));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new AliveAcaicaLogEntity.CustomEntity(AliveAcaicaLogEntity.entity, (World) world);
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
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).FieryRainBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 45) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 500) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 682) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72Fiery Rain Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 500);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							entity.getPersistentData().putBoolean("FieryRainOn", (false));
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new FieryRainTechniqueEntity.CustomEntity(FieryRainTechniqueEntity.entity, (World) world);
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
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).FlameSwordBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 65) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1000) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 716) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72Flame Sword Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							if (entity instanceof LivingEntity) {
								ItemStack _setstack = new ItemStack(FlameSwordItem.block);
								_setstack.setCount((int) 1);
								((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
								if (entity instanceof ServerPlayerEntity)
									((ServerPlayerEntity) entity).inventory.markDirty();
							}
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).HellFireSpikesBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 65) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 400) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 569) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72Hell Fire Spikes Jutsu"), (false));
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
										.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 569);
								entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ChakraAmount = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							world.setBlockState(
									new BlockPos(
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																	entity.getLook(1f).z * 15),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getX()),
											(int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 15,
																			entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()))
													+ 1),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
															entity.getLook(1f).z * 10),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
									Blocks.LAVA.getDefaultState(), 3);
							world.setBlockState(
									new BlockPos(
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																	entity.getLook(1f).z * 15),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getX()),
											(int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 15,
																			entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()))
													+ 2),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
															entity.getLook(1f).z * 10),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
									Blocks.LAVA.getDefaultState(), 3);
							world.setBlockState(
									new BlockPos(
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																	entity.getLook(1f).z * 15),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getX()),
											(int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 15,
																			entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()))
													+ 3),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
															entity.getLook(1f).z * 10),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
									Blocks.LAVA.getDefaultState(), 3);
							world.setBlockState(
									new BlockPos(
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
																	entity.getLook(1f).z * 15),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getX()),
											(int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 15,
																			entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()))
													+ 4),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
															entity.getLook(1f).z * 10),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
									Blocks.LAVA.getDefaultState(), 3);
							entity.getPersistentData().putBoolean("Jutsus7", (false));
						}
					}
				}
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).HellFireTechniqueBuy == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Ninjutsu >= 85) {
					if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 1300) {
						if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 916) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A72 Hell Flame Technique Jutsu"), (false));
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
							entity.getPersistentData().putBoolean("Jutsus7", (false));
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									HellFlameItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 0, (int) 0);
								}
							}
						}
					}
				}
			}
			entity.getPersistentData().putBoolean("Jutsus7", (false));
		}
	}
}
