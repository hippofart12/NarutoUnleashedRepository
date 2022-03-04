package net.mcreator.narutounleashed.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.potion.BleedingEffectPotionEffect;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class SharkProjectileBulletHitsPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure SharkProjectileBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("WaterSharkShooter") == false) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(BleedingEffectPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
		}
	}
}
