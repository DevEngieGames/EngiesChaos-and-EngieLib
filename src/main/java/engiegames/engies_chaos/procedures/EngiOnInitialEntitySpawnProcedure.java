package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.entity.EngiEntity;

public class EngiOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EngiEntity _datEntSetI)
			_datEntSetI.getEntityData().set(EngiEntity.DATA_Variant, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 8)));
	}
}