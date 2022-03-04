package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.block.FlyingRaijinMarkingBlock;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;
import java.util.Collections;

public class FlyingRaijinKunaiEntitySwingsItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure FlyingRaijinKunaiEntitySwingsItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure FlyingRaijinKunaiEntitySwingsItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure FlyingRaijinKunaiEntitySwingsItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure FlyingRaijinKunaiEntitySwingsItem!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure FlyingRaijinKunaiEntitySwingsItem!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount >= 100) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 1) {
				{
					double _setval = 0;
					entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.JutsuCombo = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 100);
					entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChakraAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), FlyingRaijinMarkingBlock.block.getDefaultState(), 3);
				entity.getPersistentData().putDouble("FlyingRaijinX", x);
				entity.getPersistentData().putDouble("FlyingRaijinY", y);
				entity.getPersistentData().putDouble("FlyingRaijinZ", z);
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).JutsuCombo == 2) {
				if (entity.getPersistentData().getDouble("FlyingRaijinX") != 0 && entity.getPersistentData().getDouble("FlyingRaijinY") != 0
						&& entity.getPersistentData().getDouble("FlyingRaijinZ") != 0) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((entity.getPersistentData().getDouble("FlyingRaijinX")),
								(entity.getPersistentData().getDouble("FlyingRaijinY")), (entity.getPersistentData().getDouble("FlyingRaijinZ")));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPersistentData().getDouble("FlyingRaijinX")),
									(entity.getPersistentData().getDouble("FlyingRaijinY")), (entity.getPersistentData().getDouble("FlyingRaijinZ")),
									_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
					{
						double _setval = 0;
						entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.JutsuCombo = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraAmount - 100);
						entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ChakraAmount = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
