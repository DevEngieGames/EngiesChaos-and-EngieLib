package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engieschaos.entity.MonstrosityEngieEntity;

public class MonstrosityEngieOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MonstrosityEngieEntity _datEntSetI)
			_datEntSetI.getEntityData().set(MonstrosityEngieEntity.DATA_style, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)));
	}
}