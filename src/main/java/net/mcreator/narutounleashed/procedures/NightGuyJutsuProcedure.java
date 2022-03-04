package net.mcreator.narutounleashed.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class NightGuyJutsuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure NightGuyJutsu!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = 0;
		double y = 0;
		double z = 0;
		if (entity.isSneaking()) {
			{
				boolean _setval = (true);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EighthGateOpened = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = (true);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NightGuy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity.isSneaking()
				&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).EighthGateOpened == true
				&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).NightGuy == true) {
			{
				boolean _setval = (false);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EighthGateOpened = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = (false);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NightGuy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
