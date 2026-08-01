package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engieschaos.entity.AngryCreatorEntity;

public class OutragedEngieOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof AngryCreatorEntity _datEntSetI)
			_datEntSetI.getEntityData().set(AngryCreatorEntity.DATA_style, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)));
	}
}