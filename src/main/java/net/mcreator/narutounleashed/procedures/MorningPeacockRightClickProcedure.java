package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.FlameBulletItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;

public class MorningPeacockRightClickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure MorningPeacockRightClick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure MorningPeacockRightClick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
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
						FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
								FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
										FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
												FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
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
														FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5,
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
														if (entity instanceof LivingEntity) {
															Entity _ent = entity;
															if (!_ent.world.isRemote()) {
																FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1,
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
																if (entity instanceof LivingEntity) {
																	Entity _ent = entity;
																	if (!_ent.world.isRemote()) {
																		FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(),
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
																		if (entity instanceof LivingEntity) {
																			Entity _ent = entity;
																			if (!_ent.world.isRemote()) {
																				FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(),
																						(float) 1, (float) 5, (int) 5);
																			}
																		}
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
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 80, (int) 1, (false), (false)));
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Morning Peacock"), (false));
		}
	}
}
