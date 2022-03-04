package net.mcreator.narutounleashed.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.narutounleashed.item.ShisuiSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.ShisuiSusanooCageItem;
import net.mcreator.narutounleashed.item.ShisuiSusanooArmoredItem;
import net.mcreator.narutounleashed.item.ShisuiMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ShinSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.ShinSusanooCageItem;
import net.mcreator.narutounleashed.item.ShinSusanooArmoredItem;
import net.mcreator.narutounleashed.item.ShinMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.SasukeSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.SasukeSusanooCageItem;
import net.mcreator.narutounleashed.item.SasukeSusanooArmoredItem;
import net.mcreator.narutounleashed.item.SasukeMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ObitoSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.ObitoSusanooCageItem;
import net.mcreator.narutounleashed.item.ObitoSusanooArmoredItem;
import net.mcreator.narutounleashed.item.ObitoMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.MadaraSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.MadaraSusanooCageItem;
import net.mcreator.narutounleashed.item.MadaraSusanooArmoredItem;
import net.mcreator.narutounleashed.item.MadaraMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.IzunaSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.IzunaSusanooCageItem;
import net.mcreator.narutounleashed.item.IzunaSusanooArmoredItem;
import net.mcreator.narutounleashed.item.IzunaMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.ItachiSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.ItachiSusanooCageItem;
import net.mcreator.narutounleashed.item.ItachiSusanooArmoredItem;
import net.mcreator.narutounleashed.item.ItachiMangekyoSharinganItem;
import net.mcreator.narutounleashed.item.IndraSusanooSkeletalItem;
import net.mcreator.narutounleashed.item.IndraSusanooCageItem;
import net.mcreator.narutounleashed.item.IndraSusanooArmoredItem;
import net.mcreator.narutounleashed.item.IndraMangekyoSharinganItem;
import net.mcreator.narutounleashed.NarutoUnleashedModVariables;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;

public class SusanooActivateDeactiveOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure SusanooActivateDeactiveOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SasukeMangekyoSharinganBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == SasukeMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SasukeSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == SasukeSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(SasukeSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(SasukeSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SasukeSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == SasukeSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(SasukeSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(SasukeSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).SasukeSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(SasukeSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(SasukeSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ItachiMangekyoSharinganBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == ItachiMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ItachiSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ItachiSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ItachiSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ItachiSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ItachiSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ItachiSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ItachiSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ItachiSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ItachiSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ItachiSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ItachiSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ObitoMangekyoSharinganBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == ObitoMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ObitoSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ObitoSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ObitoSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ObitoSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ObitoSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ObitoSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ObitoSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ObitoSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ObitoSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ObitoSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ObitoSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MadaraMangekyoSharinganBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == MadaraMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MadaraSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == MadaraSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(MadaraSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(MadaraSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MadaraSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == MadaraSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(MadaraSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(MadaraSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).MadaraSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(MadaraSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(MadaraSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IzunaMSBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == IzunaMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IzunaSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IzunaSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(IzunaSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(IzunaSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IzunaSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IzunaSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(IzunaSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(IzunaSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IzunaSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(IzunaSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(IzunaSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IndraMSBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == IndraMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IndraSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IndraSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(IndraSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(IndraSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IndraSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IndraSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(IndraSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(IndraSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).IndraSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(IndraSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(IndraSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShinMSBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == ShinMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShinSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShinSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ShinSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ShinSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShinSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShinSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ShinSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ShinSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShinSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ShinSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ShinSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShisuiMSBuy == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
					.getItem() == ShisuiMangekyoSharinganItem.helmet) {
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShisuiSusanooArmoredBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShisuiSusanooSkeletalItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ShisuiSusanooArmoredItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ShisuiSusanooArmoredItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShisuiSusanooSkeletalBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShisuiSusanooCageItem.body) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ShisuiSusanooSkeletalItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ShisuiSusanooSkeletalItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
				if ((entity.getCapability(NarutoUnleashedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NarutoUnleashedModVariables.PlayerVariables())).ShisuiSusanooCageBuy == true) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (entity instanceof LivingEntity) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(ShisuiSusanooCageItem.body));
							else
								((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ShisuiSusanooCageItem.body));
							if (entity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) entity).inventory.markDirty();
						}
					}
				}
			}
		}
		if (entity.isSneaking()) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
					.getItem() == SasukeSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ItachiSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ObitoSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == MadaraSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IndraSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IzunaSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShinSusanooCageItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShisuiSusanooCageItem.body) {
				if (entity instanceof LivingEntity) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(Blocks.AIR));
					else
						((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Blocks.AIR));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
					.getItem() == SasukeSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ItachiSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ObitoSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == MadaraSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IndraSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IzunaSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShinSusanooSkeletalItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShisuiSusanooSkeletalItem.body) {
				if (entity instanceof LivingEntity) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(Blocks.AIR));
					else
						((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Blocks.AIR));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
					.getItem() == SasukeSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ItachiSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ObitoSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IndraSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == MadaraSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == IzunaSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShinSusanooArmoredItem.body
					|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
							.getItem() == ShisuiSusanooArmoredItem.body) {
				if (entity instanceof LivingEntity) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(Blocks.AIR));
					else
						((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Blocks.AIR));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
		}
	}
}
