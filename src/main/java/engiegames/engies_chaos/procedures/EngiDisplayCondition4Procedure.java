package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.EngiEntity;

public class EngiDisplayCondition4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof EngiEntity _datEntI ? _datEntI.getEntityData().get(EngiEntity.DATA_Variant) : 0) == 4) {
			return true;
		}
		return false;
	}
}