package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engieschaos.entity.EnragedEngieEntity;

public class EnragedEngieOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EnragedEngieEntity _datEntSetI)
			_datEntSetI.getEntityData().set(EnragedEngieEntity.DATA_style, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)));
	}
}