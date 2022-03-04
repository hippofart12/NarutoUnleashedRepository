package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.IronSandSpikesItem;
import net.mcreator.narutounleashed.item.IronSandBigSpikeItem;
import net.mcreator.narutounleashed.item.IronSandBigRectangleItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.Comparator;

public class IronSandJutsusItemInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure IronSandJutsusItemInInventoryTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure IronSandJutsusItemInInventoryTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure IronSandJutsusItemInInventoryTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure IronSandJutsusItemInInventoryTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure IronSandJutsusItemInInventoryTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
		if (entity.getPersistentData().getDouble("counter1") % 150 == 0) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (32 / 2d), y - (32 / 2d), z - (32 / 2d), x + (32 / 2d), y + (32 / 2d), z + (32 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
				if (Math.random() <= 0.3333333) {
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							IronSandBigRectangleItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2, (float) 8, (int) 2);
						}
					}
				} else {
					if (Math.random() <= 0.3333333) {
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								IronSandBigSpikeItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2, (float) 12, (int) 0);
							}
						}
					} else {
						if (Math.random() <= 0.3333333) {
							if (entity instanceof LivingEntity) {
								Entity _ent = entity;
								if (!_ent.world.isRemote()) {
									IronSandSpikesItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 2, (float) 2, (int) 0);
								}
							}
						}
					}
				}
			}
		}
	}
}
