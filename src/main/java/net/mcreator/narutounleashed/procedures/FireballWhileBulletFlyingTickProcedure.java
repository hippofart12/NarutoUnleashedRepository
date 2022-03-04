package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class FireballWhileBulletFlyingTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure FireballWhileBulletFlyingTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double Xvelo = 0;
		double Yvelo = 0;
		double Zvelo = 0;
		boolean velo = false;
		entity.setNoGravity((true));
	}
}
