package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class ChakraStrengthBuyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure ChakraStrengthBuy!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraStrengthBuy == false) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints >= 450) {
				{
					boolean _setval = (true);
					entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChakraStrengthBuy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuPoints - 450);
					entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.JutsuPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
