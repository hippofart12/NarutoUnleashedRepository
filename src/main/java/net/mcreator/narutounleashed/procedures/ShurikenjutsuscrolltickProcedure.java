package net.mcreator.narutounleashed.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.ShurikenjutsuScrollItem;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class ShurikenjutsuscrolltickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Shurikenjutsuscrolltick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(ShurikenjutsuScrollItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		{
			double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Shurikenjutsu + 1);
			entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Shurikenjutsu = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
