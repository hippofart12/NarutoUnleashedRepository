package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class PheonixFireBuyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure PheonixFireBuy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).PheonixFireBuy == false) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints >= 300) {
				{
					boolean _setval = (true);
					entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PheonixFireBuy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints - 300);
					entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.JutsuPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
