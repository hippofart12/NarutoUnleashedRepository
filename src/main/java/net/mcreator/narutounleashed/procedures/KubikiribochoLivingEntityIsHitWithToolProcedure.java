package net.mcreator.narutounleashed.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class KubikiribochoLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency itemstack for procedure KubikiribochoLivingEntityIsHitWithTool!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (Math.random() >= 0.7) {
			(itemstack).setDamage((int) ((itemstack).getDamage() + Math.random() * 5));
		}
	}
}
