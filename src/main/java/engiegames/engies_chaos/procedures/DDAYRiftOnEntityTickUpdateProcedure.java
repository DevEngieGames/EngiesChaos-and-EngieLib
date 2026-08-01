package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.DDAYRiftEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class DDAYRiftOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("riftspawntimer", (entity.getPersistentData().getDouble("riftspawntimer") + 0.05));
		if (entity.getPersistentData().getDouble("riftspawntimer") >= 5) {
			if ((entity instanceof DDAYRiftEntity _datEntL3 && _datEntL3.getEntityData().get(DDAYRiftEntity.DATA_spawnedentity)) == false) {
				if (Math.random() <= 0.75) {
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EngiesChaosModEntities.RIFT_BALL.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (entity instanceof DDAYRiftEntity _datEntSetL)
						_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
				} else if (Math.random() > 0.75) {
					if (Math.random() < 0.2) {
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EngiesChaosModEntities.MAD_ENGIE_OLD_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (entity instanceof DDAYRiftEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
					} else if (Math.random() >= 0.2 && Math.random() < 0.4) {
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EngiesChaosModEntities.ANGRY_ENGIE_OLD_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (entity instanceof DDAYRiftEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
					} else if (Math.random() >= 0.4 && Math.random() < 0.6) {
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EngiesChaosModEntities.ENRAGED_ENGIE_OLD_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (entity instanceof DDAYRiftEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
					} else if (Math.random() >= 0.6 && Math.random() < 0.8) {
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EngiesChaosModEntities.ANGRY_CREATOR_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (entity instanceof DDAYRiftEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
					} else if (Math.random() >= 0.8) {
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EngiesChaosModEntities.BLOODY_ENGIE_RIFTED.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (entity instanceof DDAYRiftEntity _datEntSetL)
							_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
					}
				}
			}
			if ((entity instanceof DDAYRiftEntity _datEntL34 && _datEntL34.getEntityData().get(DDAYRiftEntity.DATA_spawnedentity)) == true) {
				EngiesChaosMod.queueServerWork(200, () -> {
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!entity.level().isClientSide())
						entity.discard();
				});
			}
		}
	}
}