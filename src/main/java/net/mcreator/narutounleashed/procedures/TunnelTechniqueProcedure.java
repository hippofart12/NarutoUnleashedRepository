package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;
import java.util.HashMap;

public class TunnelTechniqueProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure TunnelTechnique!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure TunnelTechnique!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure TunnelTechnique!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure TunnelTechnique!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure TunnelTechnique!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double tunneltechniqueY = 0;
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).TunnelTechniquePlayer == true) {
			for (int index0 = 0; index0 < (int) (30); index0++) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y - tunneltechniqueY), (int) z))).getBlock() == Blocks.BEDROCK)) {
					world.destroyBlock(new BlockPos((int) x, (int) (y - tunneltechniqueY), (int) z), false);
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - tunneltechniqueY), (int) z), false);
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - tunneltechniqueY), (int) z), false);
					world.destroyBlock(new BlockPos((int) x, (int) (y - tunneltechniqueY), (int) (z + 1)), false);
					world.destroyBlock(new BlockPos((int) x, (int) (y - tunneltechniqueY), (int) (z - 1)), false);
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - tunneltechniqueY), (int) (z - 1)), false);
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - tunneltechniqueY), (int) (z - 1)), false);
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - tunneltechniqueY), (int) (z + 1)), false);
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - tunneltechniqueY), (int) (z + 1)), false);
					tunneltechniqueY = (tunneltechniqueY + 1);
				}
			}
			{
				boolean _setval = (false);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TunnelTechniquePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
