package net.mcreator.narutounleashed.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.item.TaijutsuScrollItem;
import net.mcreator.narutounleashed.item.ShurikenjutsuScrollItem;
import net.mcreator.narutounleashed.item.SenjutsuScrollItem;
import net.mcreator.narutounleashed.item.NintaijutsuScrollItem;
import net.mcreator.narutounleashed.item.NinjutsuScrollItem;
import net.mcreator.narutounleashed.item.MedicalScrollItem;
import net.mcreator.narutounleashed.item.MaxChakraScrollItem;
import net.mcreator.narutounleashed.item.KinjutsuScrollItem;
import net.mcreator.narutounleashed.item.KenJutsuScrollItem;
import net.mcreator.narutounleashed.item.JutsuPointsScrollItem;
import net.mcreator.narutounleashed.item.HidenScrollItem;
import net.mcreator.narutounleashed.item.GenjutsuScrollItem;
import net.mcreator.narutounleashed.item.BukijutsuScrollItem;
import net.mcreator.narutounleashed.entity.HailEntity;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.Map;
import java.util.HashMap;

public class JutsuPointsScrollDropProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure JutsuPointsScrollDrop!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure JutsuPointsScrollDrop!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure JutsuPointsScrollDrop!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure JutsuPointsScrollDrop!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure JutsuPointsScrollDrop!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity instanceof HailEntity.CustomEntity)) {
			for (int index0 = 0; index0 < (int) (Math.random() * 4 - 1); index0++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(JutsuPointsScrollItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if (Math.random() <= 0.2) {
				for (int index1 = 0; index1 < (int) (Math.random() * 4 - 1); index1++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(MaxChakraScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index2 = 0; index2 < (int) (Math.random() * 4 - 1); index2++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ShurikenjutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index3 = 0; index3 < (int) (Math.random() * 4 - 1); index3++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BukijutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index4 = 0; index4 < (int) (Math.random() * 4 - 1); index4++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GenjutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index5 = 0; index5 < (int) (Math.random() * 4 - 1); index5++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(HidenScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index6 = 0; index6 < (int) (Math.random() * 4 - 1); index6++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(KenJutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index7 = 0; index7 < (int) (Math.random() * 4 - 1); index7++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(KinjutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index8 = 0; index8 < (int) (Math.random() * 4 - 1); index8++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(MedicalScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index9 = 0; index9 < (int) (Math.random() * 4 - 1); index9++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(NinjutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index10 = 0; index10 < (int) (Math.random() * 4 - 1); index10++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(NintaijutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index11 = 0; index11 < (int) (Math.random() * 4 - 1); index11++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(SenjutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() <= 0.05) {
				for (int index12 = 0; index12 < (int) (Math.random() * 4 - 1); index12++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(TaijutsuScrollItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
