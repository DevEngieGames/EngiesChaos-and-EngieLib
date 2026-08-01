package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engieschaos.entity.RiftBallEntity;

public class RiftBallOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof RiftBallEntity _datEntSetI)
			_datEntSetI.getEntityData().set(RiftBallEntity.DATA_size, (int) Mth.nextDouble(RandomSource.create(), 3, 9));
	}
}