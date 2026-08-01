package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.EngiEntity;

public class EngiDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof EngiEntity _datEntI ? _datEntI.getEntityData().get(EngiEntity.DATA_Variant) : 0) == 3) {
			return true;
		}
		return false;
	}
}