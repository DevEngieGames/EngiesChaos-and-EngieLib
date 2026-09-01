package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.DDAYRiftEntity;

public class DDAYRiftOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EngiesChaosModVariables.MapVariables.get(world).playriftsound = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		if (Math.random() <= 0.75) {
			if (entity instanceof DDAYRiftEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DDAYRiftEntity.DATA_riftsize, (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 15)));
			if (entity instanceof DDAYRiftEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DDAYRiftEntity.DATA_entityspawntype, 1);
		} else {
			if (entity instanceof DDAYRiftEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DDAYRiftEntity.DATA_riftsize, 2);
			if (entity instanceof DDAYRiftEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DDAYRiftEntity.DATA_entityspawntype, 2);
		}
	}
}