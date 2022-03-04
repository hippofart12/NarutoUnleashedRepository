package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.particle.KamuiParticleParticle;
import net.mcreator.narutounleashed.item.ShurikenItem;
import net.mcreator.narutounleashed.item.KunaiItem;
import net.mcreator.narutounleashed.item.ExplosiveKunaiItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.Comparator;

public class TobiOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure TobiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure TobiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure TobiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure TobiOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure TobiOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (42 / 2d), y - (42 / 2d), z - (42 / 2d), x + (42 / 2d), y + (42 / 2d), z + (42 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 150 == 0) {
				if (Math.random() <= 0.7) {
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							ShurikenItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.8, (float) 8, (int) 5);
						}
					}
					world.addParticle(KamuiParticleParticle.particle, x, (y + 1.8), z, 0, 0, 0);
				} else {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								KunaiItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.8, (float) 8, (int) 5);
							}
						}
						world.addParticle(KamuiParticleParticle.particle, x, (y + 1.8), z, 0, 0, 0);
					} else {
						if (entity instanceof LivingEntity) {
							Entity _ent = entity;
							if (!_ent.world.isRemote()) {
								ExplosiveKunaiItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.8, (float) 8, (int) 5);
							}
						}
						world.addParticle(KamuiParticleParticle.particle, x, (y + 1.8), z, 0, 0, 0);
					}
				}
			}
		}
		if (((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getHealth()
				: -1) <= ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 2) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 3, (int) 0, (false), (false)));
		}
	}
}
