package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.RiftBallEntity;

public class ReturnRiftBallSizeProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof RiftBallEntity _datEntI ? _datEntI.getEntityData().get(RiftBallEntity.DATA_size) : 0;
	}
}