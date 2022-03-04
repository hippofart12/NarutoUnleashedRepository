package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.ChakraPaperItem;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class ChakraPaperBUYProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure ChakraPaperBUY!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure ChakraPaperBUY!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (NarutoUnleashedModVariables.MapVariables.get(world).PlayerLevelUpPoints >= 5) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ChakraPaperItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			NarutoUnleashedModVariables.MapVariables
					.get(world).PlayerLevelUpPoints = (NarutoUnleashedModVariables.MapVariables.get(world).PlayerLevelUpPoints - 5);
			NarutoUnleashedModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
