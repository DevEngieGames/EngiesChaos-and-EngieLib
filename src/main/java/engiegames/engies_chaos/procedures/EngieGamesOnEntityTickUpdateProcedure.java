package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;

public class EngieGamesOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
			if (!entity.level().isClientSide())
				entity.discard();
			EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = EngiesChaosModVariables.MapVariables.get(world).numberofdistorted - 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EngiesChaosModEntities.DISTORTED.get().spawn(_level, BlockPos.containing(x, Math.ceil(y), z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}