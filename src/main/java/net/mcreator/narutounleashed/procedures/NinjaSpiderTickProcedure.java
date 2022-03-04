package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.ThunderBoltItem;
import net.mcreator.narutounleashed.item.LightningBallItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Random;
import java.util.Map;

public class NinjaSpiderTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure NinjaSpiderTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity
				|| ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof MobEntity) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 100 == 0) {
				if (Math.random() >= 0.5) {
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							ThunderBoltItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.5, (float) 5, (int) 1);
						}
					}
				} else {
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							LightningBallItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1.9, (float) 8, (int) 1.5);
						}
					}
				}
			}
		}
	}
}
