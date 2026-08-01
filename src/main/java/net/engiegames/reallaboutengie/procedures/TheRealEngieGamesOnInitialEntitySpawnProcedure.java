package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;
import net.engiegames.reallaboutengie.entity.ScorchedEntity;

public class TheRealEngieGamesOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.25) {
			if (!entity.level.isClientSide())
				entity.discard();
			AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames - 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ScorchedEntity(AllaboutengieModEntities.SCORCHED.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			entity.getPersistentData().putBoolean("CanDespawn", true);
		}
	}
}