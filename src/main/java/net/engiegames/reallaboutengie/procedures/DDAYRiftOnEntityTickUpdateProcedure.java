package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;
import net.engiegames.reallaboutengie.entity.MadEngieOldRiftedEntity;
import net.engiegames.reallaboutengie.entity.EnragedEngieOldRiftedEntity;
import net.engiegames.reallaboutengie.entity.BloodyEngieRiftedEntity;
import net.engiegames.reallaboutengie.entity.AngryEngieOldRiftedEntity;
import net.engiegames.reallaboutengie.entity.AngryCreatorRiftedEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class DDAYRiftOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("riftspawntimer", (entity.getPersistentData().getDouble("riftspawntimer") + 0.05));
		if (entity.getPersistentData().getDouble("riftspawntimer") >= 5) {
			if (AllaboutengieModVariables.MapVariables.get(world).riftspawnoneentity == false) {
				AllaboutengieModVariables.MapVariables.get(world).riftspawnoneentity = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (Math.random() <= 0.2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MadEngieOldRiftedEntity(AllaboutengieModEntities.MAD_ENGIE_OLD_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.2 && Math.random() <= 0.4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryEngieOldRiftedEntity(AllaboutengieModEntities.ANGRY_ENGIE_OLD_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.4 && Math.random() <= 0.6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedEngieOldRiftedEntity(AllaboutengieModEntities.ENRAGED_ENGIE_OLD_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.6 && Math.random() <= 0.8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryCreatorRiftedEntity(AllaboutengieModEntities.ANGRY_CREATOR_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.8 && Math.random() <= 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyEngieRiftedEntity(AllaboutengieModEntities.BLOODY_ENGIE_RIFTED.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			AllaboutengieMod.queueServerWork(200, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}