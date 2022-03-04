package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.particle.DarkParticlesParticle;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class JudgementBulletHitsPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure JudgementBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure JudgementBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure JudgementBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure JudgementBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure JudgementBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency sourceentity for procedure JudgementBulletHitsPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") >= 150) {
			if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") <= 300) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 6);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(DarkParticlesParticle.particle, x, y, z, (int) 35, 1, 1, 1, 1);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 3, Explosion.Mode.BREAK);
				}
				sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", 0);
			}
		}
		if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") > 300) {
			if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") <= 450) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(DarkParticlesParticle.particle, x, y, z, (int) 35, 1, 1, 1, 1);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
				}
				sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", 0);
			}
		}
		if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") > 450) {
			if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") <= 600) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 15);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(DarkParticlesParticle.particle, x, y, z, (int) 35, 1, 1, 1, 1);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 5, Explosion.Mode.BREAK);
				}
				sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", 0);
			}
		}
		if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") > 600) {
			if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") <= 750) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 25);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(DarkParticlesParticle.particle, x, y, z, (int) 35, 1, 1, 1, 1);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 8, Explosion.Mode.BREAK);
				}
				sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", 0);
			}
		}
		if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") > 750) {
			if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") <= 1000) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 50);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(DarkParticlesParticle.particle, x, y, z, (int) 35, 1, 1, 1, 1);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 12, Explosion.Mode.BREAK);
				}
				sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", 0);
			}
		}
		if (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") > 1500) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 100);
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(DarkParticlesParticle.particle, x, y, z, (int) 35, 1, 1, 1, 1);
			}
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 20, Explosion.Mode.BREAK);
			}
			sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", 0);
		}
	}
}
