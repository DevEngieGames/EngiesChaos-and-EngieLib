package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.MOABEntity;

public class MOABScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return 0.05 * (entity instanceof MOABEntity _datEntI ? _datEntI.getEntityData().get(MOABEntity.DATA_scalemult) : 0);
	}
}