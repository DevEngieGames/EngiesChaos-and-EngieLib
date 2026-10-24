package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.entity.AvalancheBallEntity;

public class AvalancheBallSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof AvalancheBallEntity _datEntSetI)
			_datEntSetI.getEntityData().set(AvalancheBallEntity.DATA_scale, Mth.nextInt(RandomSource.create(), 4, 8));
		entity.push((Mth.nextInt(RandomSource.create(), -10, 10)), (Mth.nextInt(RandomSource.create(), -5, 5)), (Mth.nextInt(RandomSource.create(), -10, 10)));
	}
}