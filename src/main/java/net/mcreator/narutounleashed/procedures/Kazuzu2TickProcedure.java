package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.WaterBulletItem;
import net.mcreator.narutounleashed.item.StealThreadShotItem;
import net.mcreator.narutounleashed.item.LightningBallItem;
import net.mcreator.narutounleashed.item.FlameBulletItem;
import net.mcreator.narutounleashed.item.AirBullerItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.Comparator;

public class Kazuzu2TickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure Kazuzu2Tick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure Kazuzu2Tick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure Kazuzu2Tick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure Kazuzu2Tick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Kazuzu2Tick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 150 == 0) {
				if (Math.random() >= 0.2) {
					for (int index0 = 0; index0 < (int) (8); index0++) {
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
										StealThreadShotItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2, (float) 2, (int) 0);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 4);
					}
				} else {
					if (Math.random() <= 0.4) {
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								FlameBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.2, (float) 5, (int) 0);
							}
						}
					} else {
						if (Math.random() >= 0.2) {
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									LightningBallItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 7, (int) 0);
								}
							}
						} else {
							if (Math.random() >= 0.2) {
								if (entity instanceof LivingEntity) {
									Entity _ent = entity;
									if (!_ent.world.isRemote()) {
										AirBullerItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 7, (int) 0);
									}
								}
							} else {
								if (Math.random() >= 0.2) {
									if (entity instanceof LivingEntity) {
										Entity _ent = entity;
										if (!_ent.world.isRemote()) {
											WaterBulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 7, (int) 0);
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
