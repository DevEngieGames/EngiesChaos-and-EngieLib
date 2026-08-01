package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;
import net.engiegames.reallaboutengie.entity.TheRealEngieGamesHalloweenEntity;
import net.engiegames.reallaboutengie.entity.PunisherEntity;

import java.util.Calendar;

public class TheRealEngieGamesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525000) {
			if (!entity.level.isClientSide())
				entity.discard();
			AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames - 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PunisherEntity(AllaboutengieModEntities.PUNISHER.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (!(AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 525000)) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 29) {
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames - 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TheRealEngieGamesHalloweenEntity(AllaboutengieModEntities.THE_REAL_ENGIE_GAMES_HALLOWEEN.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}