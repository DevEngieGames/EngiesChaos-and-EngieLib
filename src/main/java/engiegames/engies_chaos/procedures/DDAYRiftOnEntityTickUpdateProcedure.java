package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.RiftBallEntity;
import engiegames.engies_chaos.entity.MadEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.EnragedEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.DDAYRiftEntity;
import engiegames.engies_chaos.entity.BloodyEngieRiftedEntity;
import engiegames.engies_chaos.entity.AngryEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.AngryCreatorRiftedEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class DDAYRiftOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("riftspawntimer", (entity.getPersistentData().getDouble("riftspawntimer") + 0.05));
		if (entity.getPersistentData().getDouble("riftspawntimer") >= 5) {
			if ((entity instanceof DDAYRiftEntity _datEntL3 && _datEntL3.getEntityData().get(DDAYRiftEntity.DATA_spawnedentity)) == false) {
				if (entity instanceof DDAYRiftEntity _datEntSetL)
					_datEntSetL.getEntityData().set(DDAYRiftEntity.DATA_spawnedentity, true);
				if (Math.random() <= 0.75) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RiftBallEntity(EngiesChaosModEntities.RIFT_BALL.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() <= 0.2) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MadEngieOldRiftedEntity(EngiesChaosModEntities.MAD_ENGIE_OLD_RIFTED.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.2 && Math.random() <= 0.4) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryEngieOldRiftedEntity(EngiesChaosModEntities.ANGRY_ENGIE_OLD_RIFTED.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.4 && Math.random() <= 0.6) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EnragedEngieOldRiftedEntity(EngiesChaosModEntities.ENRAGED_ENGIE_OLD_RIFTED.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.6 && Math.random() <= 0.8) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryCreatorRiftedEntity(EngiesChaosModEntities.ANGRY_CREATOR_RIFTED.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.8 && Math.random() <= 1) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new BloodyEngieRiftedEntity(EngiesChaosModEntities.BLOODY_ENGIE_RIFTED.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			EngiesChaosMod.queueServerWork(200, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}