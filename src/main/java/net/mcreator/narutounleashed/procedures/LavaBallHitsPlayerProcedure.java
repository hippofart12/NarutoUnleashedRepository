package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class LavaBallHitsPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure LavaBallHitsPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure LavaBallHitsPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure LavaBallHitsPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure LavaBallHitsPlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure LavaBallHitsPlayer!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency sourceentity for procedure LavaBallHitsPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (!(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) == sourceentity)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.LAVA.getDefaultState(), 3);
		}
	}
}
