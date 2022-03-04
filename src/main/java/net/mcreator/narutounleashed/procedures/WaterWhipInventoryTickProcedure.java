package net.mcreator.narutounleashed.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.narutounleashed.item.WaterWhipItem;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class WaterWhipInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure WaterWhipInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == WaterWhipItem.block)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(WaterWhipItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == WaterWhipItem.block
				&& !((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).isEnchanted())) {
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
					.addEnchantment(Enchantments.KNOCKBACK, (int) 8);
		}
	}
}
