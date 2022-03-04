package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.EightGatesItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class OpenEightGatesOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure OpenEightGatesOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.isSneaking()) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(EightGatesItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (entity.isSneaking()) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(EightGatesItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
