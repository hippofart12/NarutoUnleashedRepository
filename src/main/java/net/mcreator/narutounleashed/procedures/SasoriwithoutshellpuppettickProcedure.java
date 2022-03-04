package net.mcreator.narutounleashed.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.narutounleashed.entity.ThirdKazekagePuppetEntity;
import net.mcreator.narutounleashed.entity.SasoriPuppet9Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet8Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet7Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet6Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet5Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet4Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet3Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet2Entity;
import net.mcreator.narutounleashed.entity.SasoriPuppet10Entity;
import net.mcreator.narutounleashed.entity.MarionetteEntity;
import net.mcreator.narutounleashed.NarutoUnleashedMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class SasoriwithoutshellpuppettickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency world for procedure Sasoriwithoutshellpuppettick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency x for procedure Sasoriwithoutshellpuppettick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency y for procedure Sasoriwithoutshellpuppettick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency z for procedure Sasoriwithoutshellpuppettick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoUnleashedMod.LOGGER.warn("Failed to load dependency entity for procedure Sasoriwithoutshellpuppettick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double random = 0;
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (32 / 2d), y - (32 / 2d), z - (32 / 2d), x + (32 / 2d), y + (32 / 2d), z + (32 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			entity.getPersistentData().putDouble("counter1", (entity.getPersistentData().getDouble("counter1") + 1));
			if (entity.getPersistentData().getDouble("counter1") % 200 == 0) {
				random = (Math.random() * 21);
				if (random < 14) {
					for (int index0 = 0; index0 < (int) (Math.random() * 3); index0++) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new MarionetteEntity.CustomEntity(MarionetteEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (random >= 14 && random < 19) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new MarionetteEntity.CustomEntity(MarionetteEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet2Entity.CustomEntity(SasoriPuppet2Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet3Entity.CustomEntity(SasoriPuppet3Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet4Entity.CustomEntity(SasoriPuppet4Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet5Entity.CustomEntity(SasoriPuppet5Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet6Entity.CustomEntity(SasoriPuppet6Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet7Entity.CustomEntity(SasoriPuppet7Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet8Entity.CustomEntity(SasoriPuppet8Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet9Entity.CustomEntity(SasoriPuppet9Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SasoriPuppet10Entity.CustomEntity(SasoriPuppet10Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6), world.getRandom().nextFloat() * 360F,
								0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
				if (random >= 19) {
					for (int index1 = 0; index1 < (int) (10); index1++) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new MarionetteEntity.CustomEntity(MarionetteEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet2Entity.CustomEntity(SasoriPuppet2Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet3Entity.CustomEntity(SasoriPuppet3Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet4Entity.CustomEntity(SasoriPuppet4Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet5Entity.CustomEntity(SasoriPuppet5Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet6Entity.CustomEntity(SasoriPuppet6Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet7Entity.CustomEntity(SasoriPuppet7Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet8Entity.CustomEntity(SasoriPuppet8Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet9Entity.CustomEntity(SasoriPuppet9Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SasoriPuppet10Entity.CustomEntity(SasoriPuppet10Entity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + Math.random() * 6), y, (z + Math.random() * 6),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
				if (random == 21) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ThirdKazekagePuppetEntity.CustomEntity(ThirdKazekagePuppetEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
