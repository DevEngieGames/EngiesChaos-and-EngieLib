package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engieschaos.entity.DDayAvalancheEntity;

public class DDayAvalancheOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DDayAvalancheEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DDayAvalancheEntity.DATA_scale, (int) Mth.nextDouble(RandomSource.create(), 3, 15));
		entity.push((Mth.nextDouble(RandomSource.create(), -10, 10)), (Mth.nextDouble(RandomSource.create(), -1, 1)), (Mth.nextDouble(RandomSource.create(), -10, 10)));
	}
}