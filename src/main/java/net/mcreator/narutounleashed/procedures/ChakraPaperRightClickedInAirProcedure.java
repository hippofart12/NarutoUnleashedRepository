package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.ChakraPaperYinYangItem;
import net.mcreator.narutounleashed.item.ChakraPaperYinItem;
import net.mcreator.narutounleashed.item.ChakraPaperYangItem;
import net.mcreator.narutounleashed.item.ChakraPaperWoodItem;
import net.mcreator.narutounleashed.item.ChakraPaperWindItem;
import net.mcreator.narutounleashed.item.ChakraPaperWaterItem;
import net.mcreator.narutounleashed.item.ChakraPaperTyphoonItem;
import net.mcreator.narutounleashed.item.ChakraPaperSwiftItem;
import net.mcreator.narutounleashed.item.ChakraPaperStormItem;
import net.mcreator.narutounleashed.item.ChakraPaperSteelItem;
import net.mcreator.narutounleashed.item.ChakraPaperScorchItem;
import net.mcreator.narutounleashed.item.ChakraPaperMudItem;
import net.mcreator.narutounleashed.item.ChakraPaperMagnetItem;
import net.mcreator.narutounleashed.item.ChakraPaperLightningItem;
import net.mcreator.narutounleashed.item.ChakraPaperLavaItem;
import net.mcreator.narutounleashed.item.ChakraPaperIceItem;
import net.mcreator.narutounleashed.item.ChakraPaperFireItem;
import net.mcreator.narutounleashed.item.ChakraPaperExplosiveItem;
import net.mcreator.narutounleashed.item.ChakraPaperEarthItem;
import net.mcreator.narutounleashed.item.ChakraPaperDustItem;
import net.mcreator.narutounleashed.item.ChakraPaperDarkItem;
import net.mcreator.narutounleashed.item.ChakraPaperCrystalItem;
import net.mcreator.narutounleashed.item.ChakraPaperBoilItem;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class ChakraPaperRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure ChakraPaperRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseFire == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperFireItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperWaterItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperWindItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseLightning == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperLightningItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperEarthItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYang == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperYangItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYin == true)) {
			if (Math.random() <= 0.35) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChakraPaperYinItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseYinYang == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYang == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYin == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperYinYangItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseScorch == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseFire == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperScorchItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseLava == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseFire == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperLavaItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWood == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperWoodItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseIce == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperIceItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseBoil == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).WaterShurikenJutsuBuy == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperBoilItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseExplosive == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseLightning == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperExplosiveItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CHakraReleaseMagnet == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperMagnetItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseDust == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseFire == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperDustItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseMud == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperMudItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseSteel == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseFire == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseLightning == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperSteelItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseStorm == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseLightning == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperStormItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseSwift == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYang == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseLightning == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperSwiftItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseTyphoon == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWater == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYin == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperTyphoonItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseCrystal == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYang == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseEarth == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperCrystalItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
		if (!((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseDark == true)) {
			if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseWind == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).CharkaReleaseLightning == true
					&& (entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ChakraReleaseYin == true) {
				if (Math.random() <= 0.35) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(ChakraPaperDarkItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
			}
		}
	}
}
