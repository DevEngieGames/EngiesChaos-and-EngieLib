package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.BlueBurstEntity;

public class BlueBurstScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return 0.05 * (entity instanceof BlueBurstEntity _datEntI ? _datEntI.getEntityData().get(BlueBurstEntity.DATA_scalemult) : 0);
	}
}