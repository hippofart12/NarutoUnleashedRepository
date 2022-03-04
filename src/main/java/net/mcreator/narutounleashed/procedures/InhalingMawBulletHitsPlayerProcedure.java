package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class InhalingMawBulletHitsPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure InhalingMawBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency sourceentity for procedure InhalingMawBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		entity.getPersistentData().putBoolean("Inhaling Maw Chakra", (true));
		sourceentity.getPersistentData().putDouble("Inhaled Maw Chakra", (sourceentity.getPersistentData().getDouble("Inhaled Maw Chakra") + 150));
	}
}
