package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.AvalancheBallEntity;

public class AvalancheBallScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof AvalancheBallEntity _datEntI ? _datEntI.getEntityData().get(AvalancheBallEntity.DATA_scale) : 0;
	}
}