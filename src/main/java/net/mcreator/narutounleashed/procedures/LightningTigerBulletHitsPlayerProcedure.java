package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class LightningTigerBulletHitsPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure LightningTigerBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 25);
	}
}
