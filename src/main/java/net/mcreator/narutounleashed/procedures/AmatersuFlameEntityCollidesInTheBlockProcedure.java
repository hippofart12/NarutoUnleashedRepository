package net.mcreator.narutounleashed.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.potion.AmaterasuFireEffectPotionEffect;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class AmatersuFlameEntityCollidesInTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure AmatersuFlameEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(AmaterasuFireEffectPotionEffect.potion, (int) 300, (int) 0, (true), (true)));
	}
}
