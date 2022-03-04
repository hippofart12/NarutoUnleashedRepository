package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.ChidoriSenbonItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class ChidoriSenbonONProcedure {
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
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure ChidoriSenbonON!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure ChidoriSenbonON!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("ChidoriSenbonON") == true) {
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
									ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
											ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
													(int) 0.2);
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
													ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
															(int) 0.2);
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
															ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4,
																	(float) 7, (int) 0.2);
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
																			(float) 1.4, (float) 7, (int) 0.2);
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
																					(float) 1.4, (float) 7, (int) 0.2);
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
																							new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																									new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																											(float) 1.4, (float) 7, (int) 0.2);
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
																													new Random(), (float) 1.4,
																													(float) 7, (int) 0.2);
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
																															new Random(), (float) 1.4,
																															(float) 7, (int) 0.2);
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
																																	(float) 1.4,
																																	(float) 7,
																																	(int) 0.2);
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
																																					(float) 1.4,
																																					(float) 7,
																																					(int) 0.2);
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
																																							(float) 1.4,
																																							(float) 7,
																																							(int) 0.2);
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
																																									(float) 1.4,
																																									(float) 7,
																																									(int) 0.2);
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
																																											(float) 1.4,
																																											(float) 7,
																																											(int) 0.2);
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
																																													(float) 1.4,
																																													(float) 7,
																																													(int) 0.2);
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
																																															(float) 1.4,
																																															(float) 7,
																																															(int) 0.2);
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
																																																	(float) 1.4,
																																																	(float) 7,
																																																	(int) 0.2);
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
																																																			(float) 1.4,
																																																			(float) 7,
																																																			(int) 0.2);
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
																																																					(float) 1.4,
																																																					(float) 7,
																																																					(int) 0.2);
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
																																																							(float) 1.4,
																																																							(float) 7,
																																																							(int) 0.2);
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
																																																									(float) 1.4,
																																																									(float) 7,
																																																									(int) 0.2);
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
																																																											(float) 1.4,
																																																											(float) 7,
																																																											(int) 0.2);
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
																																																													(float) 1.4,
																																																													(float) 7,
																																																													(int) 0.2);
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
																																																															(float) 1.4,
																																																															(float) 7,
																																																															(int) 0.2);
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
																																																																	(float) 1.4,
																																																																	(float) 7,
																																																																	(int) 0.2);
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
																																																																			(float) 1.4,
																																																																			(float) 7,
																																																																			(int) 0.2);
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
																																																																					(float) 1.4,
																																																																					(float) 7,
																																																																					(int) 0.2);
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
																																																																							(float) 1.4,
																																																																							(float) 7,
																																																																							(int) 0.2);
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
																																																																									(float) 1.4,
																																																																									(float) 7,
																																																																									(int) 0.2);
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
																																																																											(float) 1.4,
																																																																											(float) 7,
																																																																											(int) 0.2);
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
																																																																													(float) 1.4,
																																																																													(float) 7,
																																																																													(int) 0.2);
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
																																																																															(float) 1.4,
																																																																															(float) 7,
																																																																															(int) 0.2);
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
																																																																																	(float) 1.4,
																																																																																	(float) 7,
																																																																																	(int) 0.2);
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
																																																																																			(float) 1.4,
																																																																																			(float) 7,
																																																																																			(int) 0.2);
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
																																																																																					(float) 1.4,
																																																																																					(float) 7,
																																																																																					(int) 0.2);
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
																																																																																							(float) 1.4,
																																																																																							(float) 7,
																																																																																							(int) 0.2);
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
																																																																																									(float) 1.4,
																																																																																									(float) 7,
																																																																																									(int) 0.2);
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
																																																																																											(float) 1.4,
																																																																																											(float) 7,
																																																																																											(int) 0.2);
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
																																																																																													(float) 1.4,
																																																																																													(float) 7,
																																																																																													(int) 0.2);
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
																																																																																															(float) 1.4,
																																																																																															(float) 7,
																																																																																															(int) 0.2);
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
																																																																																					}.start(world,
																																																																																							(int) 2);
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
																																																																																	}.start(world,
																																																																																			(int) 2);
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
																																																																													}.start(world,
																																																																															(int) 2);
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
																																																																									}.start(world,
																																																																											(int) 2);
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
																																																																					}.start(world,
																																																																							(int) 2);
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
																																																																	}.start(world,
																																																																			(int) 2);
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
																																																													}.start(world,
																																																															(int) 2);
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
																																																									}.start(world,
																																																											(int) 2);
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
																																																					}.start(world,
																																																							(int) 2);
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
																																																	}.start(world,
																																																			(int) 2);
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
																																													}.start(world,
																																															(int) 2);
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
																																									}.start(world,
																																											(int) 2);
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
																																					}.start(world,
																																							(int) 2);
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
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
									ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
											ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
													(int) 0.2);
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
													ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
															(int) 0.2);
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
															ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
															entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z,
																	(float) 1.4, 0);
															entityToSpawn.setDamage((float) 7);
															entityToSpawn.setKnockbackStrength((int) 0.2);
															_ent.world.addEntity(entityToSpawn);
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
																			(float) 1.4, (float) 7, (int) 0.2);
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
																					(float) 1.4, (float) 7, (int) 0.2);
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
																							new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																									new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																											(float) 1.4, (float) 7, (int) 0.2);
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
																													new Random(), (float) 1.4,
																													(float) 7, (int) 0.2);
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
																															new Random(), (float) 1.4,
																															(float) 7, (int) 0.2);
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
																																	(float) 1.4,
																																	(float) 7,
																																	(int) 0.2);
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
																																					(float) 1.4,
																																					(float) 7,
																																					(int) 0.2);
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
																																							(float) 1.4,
																																							(float) 7,
																																							(int) 0.2);
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
																																									(float) 1.4,
																																									(float) 7,
																																									(int) 0.2);
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
																																											(float) 1.4,
																																											(float) 7,
																																											(int) 0.2);
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
																																													(float) 1.4,
																																													(float) 7,
																																													(int) 0.2);
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
																																															(float) 1.4,
																																															(float) 7,
																																															(int) 0.2);
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
																																																	(float) 1.4,
																																																	(float) 7,
																																																	(int) 0.2);
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
																																																			(float) 1.4,
																																																			(float) 7,
																																																			(int) 0.2);
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
																																																					(float) 1.4,
																																																					(float) 7,
																																																					(int) 0.2);
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
																																																							(float) 1.4,
																																																							(float) 7,
																																																							(int) 0.2);
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
																																																									(float) 1.4,
																																																									(float) 7,
																																																									(int) 0.2);
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
																																																											(float) 1.4,
																																																											(float) 7,
																																																											(int) 0.2);
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
																																																													(float) 1.4,
																																																													(float) 7,
																																																													(int) 0.2);
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
																																																															(float) 1.4,
																																																															(float) 7,
																																																															(int) 0.2);
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
																																																																	(float) 1.4,
																																																																	(float) 7,
																																																																	(int) 0.2);
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
																																																																			(float) 1.4,
																																																																			(float) 7,
																																																																			(int) 0.2);
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
																																																																					(float) 1.4,
																																																																					(float) 7,
																																																																					(int) 0.2);
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
																																																																							(float) 1.4,
																																																																							(float) 7,
																																																																							(int) 0.2);
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
																																																																									(float) 1.4,
																																																																									(float) 7,
																																																																									(int) 0.2);
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
																																																																											(float) 1.4,
																																																																											(float) 7,
																																																																											(int) 0.2);
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
																																																																													(float) 1.4,
																																																																													(float) 7,
																																																																													(int) 0.2);
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
																																																																															(float) 1.4,
																																																																															(float) 7,
																																																																															(int) 0.2);
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
																																																																																	(float) 1.4,
																																																																																	(float) 7,
																																																																																	(int) 0.2);
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
																																																																																			(float) 1.4,
																																																																																			(float) 7,
																																																																																			(int) 0.2);
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
																																																																																					(float) 1.4,
																																																																																					(float) 7,
																																																																																					(int) 0.2);
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
																																																																																							(float) 1.4,
																																																																																							(float) 7,
																																																																																							(int) 0.2);
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
																																																																																									(float) 1.4,
																																																																																									(float) 7,
																																																																																									(int) 0.2);
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
																																																																																											(float) 1.4,
																																																																																											(float) 7,
																																																																																											(int) 0.2);
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
																																																																																													(float) 1.4,
																																																																																													(float) 7,
																																																																																													(int) 0.2);
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
																																																																																															(float) 1.4,
																																																																																															(float) 7,
																																																																																															(int) 0.2);
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
																																																																																					}.start(world,
																																																																																							(int) 2);
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
																																																																																	}.start(world,
																																																																																			(int) 2);
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
																																																																													}.start(world,
																																																																															(int) 2);
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
																																																																									}.start(world,
																																																																											(int) 2);
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
																																																																					}.start(world,
																																																																							(int) 2);
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
																																																																	}.start(world,
																																																																			(int) 2);
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
																																																													}.start(world,
																																																															(int) 2);
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
																																																									}.start(world,
																																																											(int) 2);
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
																																																					}.start(world,
																																																							(int) 2);
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
																																																	}.start(world,
																																																			(int) 2);
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
																																													}.start(world,
																																															(int) 2);
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
																																									}.start(world,
																																											(int) 2);
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
																																					}.start(world,
																																							(int) 2);
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
									ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
											ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
													(int) 0.2);
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
													ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
															(int) 0.2);
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
															ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
															entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z,
																	(float) 1.4, 0);
															entityToSpawn.setDamage((float) 7);
															entityToSpawn.setKnockbackStrength((int) 0.2);
															_ent.world.addEntity(entityToSpawn);
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
																			(float) 1.4, (float) 7, (int) 0.2);
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
																					(float) 1.4, (float) 7, (int) 0.2);
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
																							new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																									new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																											(float) 1.4, (float) 7, (int) 0.2);
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
																													new Random(), (float) 1.4,
																													(float) 7, (int) 0.2);
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
																															new Random(), (float) 1.4,
																															(float) 7, (int) 0.2);
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
																																	(float) 1.4,
																																	(float) 7,
																																	(int) 0.2);
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
																																					(float) 1.4,
																																					(float) 7,
																																					(int) 0.2);
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
																																							(float) 1.4,
																																							(float) 7,
																																							(int) 0.2);
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
																																									(float) 1.4,
																																									(float) 7,
																																									(int) 0.2);
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
																																											(float) 1.4,
																																											(float) 7,
																																											(int) 0.2);
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
																																													(float) 1.4,
																																													(float) 7,
																																													(int) 0.2);
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
																																															(float) 1.4,
																																															(float) 7,
																																															(int) 0.2);
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
																																																	(float) 1.4,
																																																	(float) 7,
																																																	(int) 0.2);
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
																																																			(float) 1.4,
																																																			(float) 7,
																																																			(int) 0.2);
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
																																																					(float) 1.4,
																																																					(float) 7,
																																																					(int) 0.2);
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
																																																							(float) 1.4,
																																																							(float) 7,
																																																							(int) 0.2);
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
																																																									(float) 1.4,
																																																									(float) 7,
																																																									(int) 0.2);
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
																																																											(float) 1.4,
																																																											(float) 7,
																																																											(int) 0.2);
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
																																																													(float) 1.4,
																																																													(float) 7,
																																																													(int) 0.2);
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
																																																															(float) 1.4,
																																																															(float) 7,
																																																															(int) 0.2);
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
																																																																	(float) 1.4,
																																																																	(float) 7,
																																																																	(int) 0.2);
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
																																																																			(float) 1.4,
																																																																			(float) 7,
																																																																			(int) 0.2);
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
																																																																					(float) 1.4,
																																																																					(float) 7,
																																																																					(int) 0.2);
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
																																																																							(float) 1.4,
																																																																							(float) 7,
																																																																							(int) 0.2);
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
																																																																									(float) 1.4,
																																																																									(float) 7,
																																																																									(int) 0.2);
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
																																																																											(float) 1.4,
																																																																											(float) 7,
																																																																											(int) 0.2);
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
																																																																													(float) 1.4,
																																																																													(float) 7,
																																																																													(int) 0.2);
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
																																																																															(float) 1.4,
																																																																															(float) 7,
																																																																															(int) 0.2);
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
																																																																																	(float) 1.4,
																																																																																	(float) 7,
																																																																																	(int) 0.2);
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
																																																																																			(float) 1.4,
																																																																																			(float) 7,
																																																																																			(int) 0.2);
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
																																																																																					(float) 1.4,
																																																																																					(float) 7,
																																																																																					(int) 0.2);
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
																																																																																							(float) 1.4,
																																																																																							(float) 7,
																																																																																							(int) 0.2);
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
																																																																																									(float) 1.4,
																																																																																									(float) 7,
																																																																																									(int) 0.2);
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
																																																																																											(float) 1.4,
																																																																																											(float) 7,
																																																																																											(int) 0.2);
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
																																																																																													(float) 1.4,
																																																																																													(float) 7,
																																																																																													(int) 0.2);
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
																																																																																															(float) 1.4,
																																																																																															(float) 7,
																																																																																															(int) 0.2);
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
																																																																																					}.start(world,
																																																																																							(int) 2);
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
																																																																																	}.start(world,
																																																																																			(int) 2);
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
																																																																													}.start(world,
																																																																															(int) 2);
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
																																																																									}.start(world,
																																																																											(int) 2);
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
																																																																					}.start(world,
																																																																							(int) 2);
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
																																																																	}.start(world,
																																																																			(int) 2);
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
																																																													}.start(world,
																																																															(int) 2);
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
																																																									}.start(world,
																																																											(int) 2);
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
																																																					}.start(world,
																																																							(int) 2);
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
																																																	}.start(world,
																																																			(int) 2);
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
																																													}.start(world,
																																															(int) 2);
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
																																									}.start(world,
																																											(int) 2);
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
																																					}.start(world,
																																							(int) 2);
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
									ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
											ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
													(int) 0.2);
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
													ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4, (float) 7,
															(int) 0.2);
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
															ChidoriSenbonItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.4,
																	(float) 7, (int) 0.2);
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
																			(float) 1.4, (float) 7, (int) 0.2);
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
																					(float) 1.4, (float) 7, (int) 0.2);
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
																							new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																									new Random(), (float) 1.4, (float) 7, (int) 0.2);
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
																											(float) 1.4, (float) 7, (int) 0.2);
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
																													new Random(), (float) 1.4,
																													(float) 7, (int) 0.2);
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
																															new Random(), (float) 1.4,
																															(float) 7, (int) 0.2);
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
																																	(float) 1.4,
																																	(float) 7,
																																	(int) 0.2);
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
																																					(float) 1.4,
																																					(float) 7,
																																					(int) 0.2);
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
																																							(float) 1.4,
																																							(float) 7,
																																							(int) 0.2);
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
																																									(float) 1.4,
																																									(float) 7,
																																									(int) 0.2);
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
																																											(float) 1.4,
																																											(float) 7,
																																											(int) 0.2);
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
																																													(float) 1.4,
																																													(float) 7,
																																													(int) 0.2);
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
																																															(float) 1.4,
																																															(float) 7,
																																															(int) 0.2);
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
																																																	(float) 1.4,
																																																	(float) 7,
																																																	(int) 0.2);
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
																																																			(float) 1.4,
																																																			(float) 7,
																																																			(int) 0.2);
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
																																																					(float) 1.4,
																																																					(float) 7,
																																																					(int) 0.2);
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
																																																							(float) 1.4,
																																																							(float) 7,
																																																							(int) 0.2);
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
																																																									(float) 1.4,
																																																									(float) 7,
																																																									(int) 0.2);
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
																																																											(float) 1.4,
																																																											(float) 7,
																																																											(int) 0.2);
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
																																																													(float) 1.4,
																																																													(float) 7,
																																																													(int) 0.2);
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
																																																															(float) 1.4,
																																																															(float) 7,
																																																															(int) 0.2);
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
																																																																	(float) 1.4,
																																																																	(float) 7,
																																																																	(int) 0.2);
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
																																																																			(float) 1.4,
																																																																			(float) 7,
																																																																			(int) 0.2);
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
																																																																					(float) 1.4,
																																																																					(float) 7,
																																																																					(int) 0.2);
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
																																																																							(float) 1.4,
																																																																							(float) 7,
																																																																							(int) 0.2);
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
																																																																									(float) 1.4,
																																																																									(float) 7,
																																																																									(int) 0.2);
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
																																																																											(float) 1.4,
																																																																											(float) 7,
																																																																											(int) 0.2);
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
																																																																													(float) 1.4,
																																																																													(float) 7,
																																																																													(int) 0.2);
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
																																																																															(float) 1.4,
																																																																															(float) 7,
																																																																															(int) 0.2);
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
																																																																																	(float) 1.4,
																																																																																	(float) 7,
																																																																																	(int) 0.2);
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
																																																																																			(float) 1.4,
																																																																																			(float) 7,
																																																																																			(int) 0.2);
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
																																																																																					(float) 1.4,
																																																																																					(float) 7,
																																																																																					(int) 0.2);
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
																																																																																							(float) 1.4,
																																																																																							(float) 7,
																																																																																							(int) 0.2);
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
																																																																																									(float) 1.4,
																																																																																									(float) 7,
																																																																																									(int) 0.2);
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
																																																																																											(float) 1.4,
																																																																																											(float) 7,
																																																																																											(int) 0.2);
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
																																																																																													(float) 1.4,
																																																																																													(float) 7,
																																																																																													(int) 0.2);
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
																																																																																			}.start(world,
																																																																																					(int) 2);
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
																																																																															}.start(world,
																																																																																	(int) 2);
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
																																																																											}.start(world,
																																																																													(int) 2);
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
																																																																							}.start(world,
																																																																									(int) 2);
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
																																																																			}.start(world,
																																																																					(int) 2);
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
																																																															}.start(world,
																																																																	(int) 2);
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
																																																											}.start(world,
																																																													(int) 2);
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
																																																							}.start(world,
																																																									(int) 2);
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
																																																			}.start(world,
																																																					(int) 2);
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
																																															}.start(world,
																																																	(int) 2);
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
																																											}.start(world,
																																													(int) 2);
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
																																							}.start(world,
																																									(int) 2);
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
																																			}.start(world,
																																					(int) 2);
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
			entity.getPersistentData().putBoolean("ChidoriSenbonON", (false));
		}
	}
}
