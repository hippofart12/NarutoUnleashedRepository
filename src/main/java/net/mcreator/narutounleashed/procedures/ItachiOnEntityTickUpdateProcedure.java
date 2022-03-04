package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.ShurikenItem;
import net.mcreator.narutounleashed.item.KunaiItem;
import net.mcreator.narutounleashed.item.FlameBulletItem;
import net.mcreator.narutounleashed.item.FireballItem;
import net.mcreator.narutounleashed.item.ExplosiveKunaiItem;
import net.mcreator.narutounleashed.item.AmaterasuBallItem;
import net.mcreator.narutounleashed.entity.CrowEntity;
import net.mcreator.narutounleashed.block.AmatersuFlameBlock;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.Comparator;

public class ItachiOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure ItachiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure ItachiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure ItachiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure ItachiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure ItachiOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (18 / 2d), y - (18 / 2d), z - (18 / 2d), x + (18 / 2d), y + (18 / 2d), z + (18 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 70 == 0) {
				if (Math.random() <= 0.4) {
					for (int index0 = 0; index0 < (int) (5); index0++) {
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
										ShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 5);
					}
				} else {
					if (Math.random() <= 0.05) {
						for (int index1 = 0; index1 < (int) (5); index1++) {
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
									world.setBlockState(
											new BlockPos(
													(int) (entity.world
															.rayTraceBlocks(
																	new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																					entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getY()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 10,
																			entity.getLook(1f).y * 10, entity.getLook(1f).z * 10),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ())),
											AmatersuFlameBlock.block.getDefaultState(), 3);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 5);
						}
					} else {
						if (Math.random() <= 0.01) {
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									AmaterasuBallItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 4, (int) 0);
								}
							}
						} else {
							if (Math.random() <= 0.3) {
								for (int index2 = 0; index2 < (int) (5); index2++) {
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
													KunaiItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 5);
												}
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 5);
								}
							} else {
								if (Math.random() <= 0.3) {
									for (int index3 = 0; index3 < (int) (5); index3++) {
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
														ExplosiveKunaiItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1,
																(float) 5, (int) 5);
													}
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 5);
									}
								} else {
									if (Math.random() <= 0.3) {
										if (entity instanceof LivingEntity)
											((LivingEntity) entity)
													.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (true), (false)));
										for (int index4 = 0; index4 < (int) (3); index4++) {
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new CrowEntity.CustomEntity(CrowEntity.entity, (World) world);
												entityToSpawn.setLocationAndAngles(x, (y + 0), z, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof MobEntity)
													((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
															world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
															(ILivingEntityData) null, (CompoundNBT) null);
												world.addEntity(entityToSpawn);
											}
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new CrowEntity.CustomEntity(CrowEntity.entity, (World) world);
												entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof MobEntity)
													((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
															world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
															(ILivingEntityData) null, (CompoundNBT) null);
												world.addEntity(entityToSpawn);
											}
											if (world instanceof ServerWorld) {
												Entity entityToSpawn = new CrowEntity.CustomEntity(CrowEntity.entity, (World) world);
												entityToSpawn.setLocationAndAngles(x, (y + 2), z, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof MobEntity)
													((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
															world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
															(ILivingEntityData) null, (CompoundNBT) null);
												world.addEntity(entityToSpawn);
											}
										}
									} else {
										if (Math.random() <= 0.3) {
											if (entity instanceof LivingEntity) {
												Entity _ent = entity;
												if (!_ent.world.isRemote()) {
													FireballItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.8, (float) 8,
															(int) 1);
												}
											}
										} else {
											if (entity instanceof LivingEntity) {
												Entity _ent = entity;
												if (!_ent.world.isRemote()) {
													FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2.7, (float) 12,
															(int) 1.5);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
