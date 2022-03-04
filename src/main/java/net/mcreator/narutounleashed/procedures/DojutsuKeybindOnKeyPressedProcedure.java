package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.TrueSightMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.TrueSightEternalMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ShisuiMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ShinMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.Sharingan3TomoeItem;
import net.mcreator.narutounleashed.item.Sharingan2TomoeItem;
import net.mcreator.narutounleashed.item.Sharingan1TomoeItem;
import net.mcreator.narutounleashed.item.SasukeMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ObitoMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.MadaraMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.IzunaMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ItachiMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.IndraMangekyoSharinganItem;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class DojutsuKeybindOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure DojutsuKeybindOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Dojutsu == false) {
			{
				boolean _setval = (true);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dojutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).UchihaClanJoin == true) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).OneTomoeSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Sharingan1TomoeItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).TwoTomoeSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Sharingan2TomoeItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ThreeTomoeSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(Sharingan3TomoeItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SasukeMangekyoSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(SasukeMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ItachiMangekyoSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ItachiMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ObitoMangekyoSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ObitoMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MadaraMangekyoSharinganBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(MadaraMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IzunaMSBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(IzunaMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShisuiMSBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ShisuiMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IndraMSBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(IndraMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShinMSBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ShinMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).TrueSightMSBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(TrueSightMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				} else if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).EternalTrueSightMSBuy == true) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(TrueSightEternalMangekyoSharinganItem.helmet);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).Dojutsu == true) {
			{
				boolean _setval = (false);
				entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dojutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
