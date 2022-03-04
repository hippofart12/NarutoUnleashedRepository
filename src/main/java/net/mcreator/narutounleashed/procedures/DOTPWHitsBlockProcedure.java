package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class DOTPWHitsBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure DOTPWHitsBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure DOTPWHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure DOTPWHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure DOTPWHitsBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double dotpwheight = 0;
		dotpwheight = 0;
		for (int index0 = 0; index0 < (int) (5); index0++) {
			world.setBlockState(new BlockPos((int) x, (int) (y - dotpwheight), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - dotpwheight), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - dotpwheight), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y - dotpwheight), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y - dotpwheight), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - dotpwheight), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - dotpwheight), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - dotpwheight), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - dotpwheight), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - dotpwheight), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - dotpwheight), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - dotpwheight), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - dotpwheight), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - dotpwheight), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - dotpwheight), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - dotpwheight), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - dotpwheight), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y - dotpwheight), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y - dotpwheight), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y - dotpwheight), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y - dotpwheight), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y - dotpwheight), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 2), (int) (y - dotpwheight), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y - dotpwheight), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y - dotpwheight), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			dotpwheight = (dotpwheight + 1);
		}
	}
}
