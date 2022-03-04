package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.entity.Pain3Entity;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class RinneganOxOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure RinneganOxOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure RinneganOxOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure RinneganOxOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure RinneganOxOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure RinneganOxOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!(((Entity) world
				.getEntitiesWithinAABB(Pain3Entity.CustomEntity.class,
						new AxisAlignedBB(x - (64 / 2d), y - (64 / 2d), z - (64 / 2d), x + (64 / 2d), y + (64 / 2d), z + (64 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (!entity.world.isRemote())
				entity.remove();
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, x, y, z, (int) 40, 3, 3, 3, 1);
			}
		}
	}
}
