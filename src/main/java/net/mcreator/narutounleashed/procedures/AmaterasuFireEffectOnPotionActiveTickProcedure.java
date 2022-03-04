package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.particle.AmaterasuParticleParticle;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class AmaterasuFireEffectOnPotionActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure AmaterasuFireEffectOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure AmaterasuFireEffectOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure AmaterasuFireEffectOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure AmaterasuFireEffectOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure AmaterasuFireEffectOnPotionActiveTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
		if (entity.getPersistentData().getDouble("counter1") % 40 == 0) {
			entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 3);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(AmaterasuParticleParticle.particle, x, y, z, (int) 5, 1.5, 1.8, 1.5, 1);
		}
	}
}
