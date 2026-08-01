package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BiblicallyAccurateEngieEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BiblicallyAccurateEngieEntity.DATA_style, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)));
	}
}