package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class StoneTrapBlockEntityWalksOnTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure StoneTrapBlockEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure StoneTrapBlockEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure StoneTrapBlockEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure StoneTrapBlockEntityWalksOnTheBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double StoneTrap = 0;
		StoneTrap = 0;
		for (int index0 = 0; index0 < (int) (10); index0++) {
			world.destroyBlock(new BlockPos((int) x, (int) (y - StoneTrap), (int) z), false);
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - StoneTrap), (int) z), false);
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - StoneTrap), (int) z), false);
			world.destroyBlock(new BlockPos((int) x, (int) (y - StoneTrap), (int) (z + 1)), false);
			world.destroyBlock(new BlockPos((int) x, (int) (y - StoneTrap), (int) (z - 1)), false);
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - StoneTrap), (int) (z - 1)), false);
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - StoneTrap), (int) (z - 1)), false);
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - StoneTrap), (int) (z + 1)), false);
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - StoneTrap), (int) (z + 1)), false);
			StoneTrap = (StoneTrap + 1);
		}
	}
}
