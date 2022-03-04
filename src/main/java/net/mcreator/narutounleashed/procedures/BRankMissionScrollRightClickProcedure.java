package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.BRankMissionScrollItem;
import net.mcreator.narutounleashed.item.BRankMission2Item;
import net.mcreator.narutounleashed.item.BRankMission1Item;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class BRankMissionScrollRightClickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure BRankMissionScrollRightClick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() >= 0.5) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BRankMissionScrollItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BRankMission1Item.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BRankMissionScrollItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BRankMission2Item.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
