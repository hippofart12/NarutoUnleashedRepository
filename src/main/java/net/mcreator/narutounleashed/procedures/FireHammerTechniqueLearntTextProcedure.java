package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class FireHammerTechniqueLearntTextProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure FireHammerTechniqueLearntText!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).FireHammerTechniqueBuy == true) {
			return true;
		}
		return false;
	}
}
