package net.mcreator.narutounleashed.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.LightningEdgeItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class LightningEdgeInvtickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure LightningEdgeInvtick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == LightningEdgeItem.block)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(LightningEdgeItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
