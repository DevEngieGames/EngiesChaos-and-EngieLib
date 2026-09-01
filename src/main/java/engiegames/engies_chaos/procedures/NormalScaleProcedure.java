package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.NormalEntity;

public class NormalScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return 0.05 * (entity instanceof NormalEntity _datEntI ? _datEntI.getEntityData().get(NormalEntity.DATA_scalemult) : 0);
	}
}