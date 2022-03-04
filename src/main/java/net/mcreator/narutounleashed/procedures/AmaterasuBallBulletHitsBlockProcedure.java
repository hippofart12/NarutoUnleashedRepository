package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.narutounleashed.block.AmatersuFlameBlock;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class AmaterasuBallBulletHitsBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure AmaterasuBallBulletHitsBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure AmaterasuBallBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure AmaterasuBallBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure AmaterasuBallBulletHitsBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double Amaterasuflames = 0;
		if (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AmatersuFlameBlock.block)) {
			Amaterasuflames = 0;
			for (int index0 = 0; index0 < (int) (10); index0++) {
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) y, (int) z), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) y, (int) z), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + Amaterasuflames)), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - Amaterasuflames)), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) y, (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) y, (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) y, (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) y, (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + Amaterasuflames), (int) z), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y - Amaterasuflames), (int) z), AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) (y - Amaterasuflames), (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) (y - Amaterasuflames), (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) (y - Amaterasuflames), (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) (y - Amaterasuflames), (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) (y + Amaterasuflames), (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) (y + Amaterasuflames), (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) (y + Amaterasuflames), (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) (y + Amaterasuflames), (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) (y + Amaterasuflames), (int) z),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) (y + Amaterasuflames), (int) z),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + Amaterasuflames), (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + Amaterasuflames), (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x + Amaterasuflames), (int) (y - Amaterasuflames), (int) z),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (x - Amaterasuflames), (int) (y - Amaterasuflames), (int) z),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y - Amaterasuflames), (int) (z - Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y - Amaterasuflames), (int) (z + Amaterasuflames)),
						AmatersuFlameBlock.block.getDefaultState(), 3);
				Amaterasuflames = (Amaterasuflames + 1);
			}
		}
	}
}
