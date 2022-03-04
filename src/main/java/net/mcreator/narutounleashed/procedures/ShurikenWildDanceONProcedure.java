package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.particle.CrystalParticlesParticle;
import net.mcreator.narutounleashed.item.CrystalShurikenItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class ShurikenWildDanceONProcedure {
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
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure ShurikenWildDanceON!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure ShurikenWildDanceON!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure ShurikenWildDanceON!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure ShurikenWildDanceON!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure ShurikenWildDanceON!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("ShurikenWildDanceON") == true) {
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
						((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y, z, (int) 35, 3, 3, 3, 1);
					}
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y, z, (int) 35, 3, 3, 3, 1);
							}
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y, z, (int) 35, 3, 3, 3, 1);
									}
									if (entity instanceof LivingEntity) {
										Entity _ent = entity;
										if (!_ent.world.isRemote()) {
											CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
											if (world instanceof ServerWorld) {
												((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y, z, (int) 35, 3, 3, 3, 1);
											}
											if (entity instanceof LivingEntity) {
												Entity _ent = entity;
												if (!_ent.world.isRemote()) {
													CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5,
															(int) 5);
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
													if (world instanceof ServerWorld) {
														((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y, z, (int) 35, 3,
																3, 3, 1);
													}
													if (entity instanceof LivingEntity) {
														Entity _ent = entity;
														if (!_ent.world.isRemote()) {
															CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1,
																	(float) 5, (int) 5);
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
															if (world instanceof ServerWorld) {
																((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y, z,
																		(int) 35, 3, 3, 3, 1);
															}
															if (entity instanceof LivingEntity) {
																Entity _ent = entity;
																if (!_ent.world.isRemote()) {
																	CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(),
																			(float) 1, (float) 5, (int) 5);
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
																	if (world instanceof ServerWorld) {
																		((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle, x, y,
																				z, (int) 35, 3, 3, 3, 1);
																	}
																	if (entity instanceof LivingEntity) {
																		Entity _ent = entity;
																		if (!_ent.world.isRemote()) {
																			CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(),
																					(float) 1, (float) 5, (int) 5);
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
																			if (world instanceof ServerWorld) {
																				((ServerWorld) world).spawnParticle(CrystalParticlesParticle.particle,
																						x, y, z, (int) 35, 3, 3, 3, 1);
																			}
																			if (entity instanceof LivingEntity) {
																				Entity _ent = entity;
																				if (!_ent.world.isRemote()) {
																					CrystalShurikenItem.shoot(_ent.world, (LivingEntity) entity,
																							new Random(), (float) 1, (float) 5, (int) 5);
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
																					if (world instanceof ServerWorld) {
																						((ServerWorld) world).spawnParticle(
																								CrystalParticlesParticle.particle, x, y, z, (int) 35,
																								3, 3, 3, 1);
																					}
																					if (entity instanceof LivingEntity) {
																						Entity _ent = entity;
																						if (!_ent.world.isRemote()) {
																							CrystalShurikenItem.shoot(_ent.world,
																									(LivingEntity) entity, new Random(), (float) 1,
																									(float) 5, (int) 5);
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
																							if (world instanceof ServerWorld) {
																								((ServerWorld) world).spawnParticle(
																										CrystalParticlesParticle.particle, x, y, z,
																										(int) 35, 3, 3, 3, 1);
																							}
																							if (entity instanceof LivingEntity) {
																								Entity _ent = entity;
																								if (!_ent.world.isRemote()) {
																									CrystalShurikenItem.shoot(_ent.world,
																											(LivingEntity) entity, new Random(),
																											(float) 1, (float) 5, (int) 5);
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
																									if (world instanceof ServerWorld) {
																										((ServerWorld) world).spawnParticle(
																												CrystalParticlesParticle.particle, x,
																												y, z, (int) 35, 3, 3, 3, 1);
																									}
																									if (entity instanceof LivingEntity) {
																										Entity _ent = entity;
																										if (!_ent.world.isRemote()) {
																											CrystalShurikenItem.shoot(_ent.world,
																													(LivingEntity) entity,
																													new Random(), (float) 1,
																													(float) 5, (int) 5);
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
																											if (world instanceof ServerWorld) {
																												((ServerWorld) world).spawnParticle(
																														CrystalParticlesParticle.particle,
																														x, y, z, (int) 35, 3, 3, 3,
																														1);
																											}
																											if (entity instanceof LivingEntity) {
																												Entity _ent = entity;
																												if (!_ent.world.isRemote()) {
																													CrystalShurikenItem.shoot(
																															_ent.world,
																															(LivingEntity) entity,
																															new Random(), (float) 1,
																															(float) 5, (int) 5);
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
																													if (world instanceof ServerWorld) {
																														((ServerWorld) world)
																																.spawnParticle(
																																		CrystalParticlesParticle.particle,
																																		x, y, z,
																																		(int) 35, 3,
																																		3, 3, 1);
																													}
																													if (entity instanceof LivingEntity) {
																														Entity _ent = entity;
																														if (!_ent.world.isRemote()) {
																															CrystalShurikenItem.shoot(
																																	_ent.world,
																																	(LivingEntity) entity,
																																	new Random(),
																																	(float) 1,
																																	(float) 5,
																																	(int) 5);
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
																															if (world instanceof ServerWorld) {
																																((ServerWorld) world)
																																		.spawnParticle(
																																				CrystalParticlesParticle.particle,
																																				x, y,
																																				z,
																																				(int) 35,
																																				3, 3,
																																				3, 1);
																															}
																															if (entity instanceof LivingEntity) {
																																Entity _ent = entity;
																																if (!_ent.world
																																		.isRemote()) {
																																	CrystalShurikenItem
																																			.shoot(_ent.world,
																																					(LivingEntity) entity,
																																					new Random(),
																																					(float) 1,
																																					(float) 5,
																																					(int) 5);
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
																																	if (world instanceof ServerWorld) {
																																		((ServerWorld) world)
																																				.spawnParticle(
																																						CrystalParticlesParticle.particle,
																																						x,
																																						y,
																																						z,
																																						(int) 35,
																																						3,
																																						3,
																																						3,
																																						1);
																																	}
																																	if (entity instanceof LivingEntity) {
																																		Entity _ent = entity;
																																		if (!_ent.world
																																				.isRemote()) {
																																			CrystalShurikenItem
																																					.shoot(_ent.world,
																																							(LivingEntity) entity,
																																							new Random(),
																																							(float) 1,
																																							(float) 5,
																																							(int) 5);
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
																																			if (world instanceof ServerWorld) {
																																				((ServerWorld) world)
																																						.spawnParticle(
																																								CrystalParticlesParticle.particle,
																																								x,
																																								y,
																																								z,
																																								(int) 35,
																																								3,
																																								3,
																																								3,
																																								1);
																																			}
																																			if (entity instanceof LivingEntity) {
																																				Entity _ent = entity;
																																				if (!_ent.world
																																						.isRemote()) {
																																					CrystalShurikenItem
																																							.shoot(_ent.world,
																																									(LivingEntity) entity,
																																									new Random(),
																																									(float) 1,
																																									(float) 5,
																																									(int) 5);
																																				}
																																			}
																																			MinecraftForge.EVENT_BUS
																																					.unregister(
																																							this);
																																		}
																																	}.start(world,
																																			(int) 2);
																																	MinecraftForge.EVENT_BUS
																																			.unregister(
																																					this);
																																}
																															}.start(world, (int) 2);
																															MinecraftForge.EVENT_BUS
																																	.unregister(this);
																														}
																													}.start(world, (int) 2);
																													MinecraftForge.EVENT_BUS
																															.unregister(this);
																												}
																											}.start(world, (int) 2);
																											MinecraftForge.EVENT_BUS.unregister(this);
																										}
																									}.start(world, (int) 2);
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, (int) 2);
																							MinecraftForge.EVENT_BUS.unregister(this);
																						}
																					}.start(world, (int) 2);
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, (int) 2);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 2);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 2);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 2);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 2);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 2);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 2);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 2);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 2);
			entity.getPersistentData().putBoolean("ShurikenWildDanceON", (false));
		}
	}
}
