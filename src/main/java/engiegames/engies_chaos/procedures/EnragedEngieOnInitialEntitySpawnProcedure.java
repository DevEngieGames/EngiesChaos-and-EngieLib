package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.entity.EnragedEngieEntity;

public class EnragedEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EnragedEngieEntity _datEntSetI)
			_datEntSetI.getEntityData().set(EnragedEngieEntity.DATA_style, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)));
		EntitySpawnsProcedure.execute(world, entity);
	}
}