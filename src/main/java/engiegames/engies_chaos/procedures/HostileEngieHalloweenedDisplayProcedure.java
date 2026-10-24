package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.HsotileEngieEntity;

public class HostileEngieHalloweenedDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof HsotileEngieEntity _datEntL0 && _datEntL0.getEntityData().get(HsotileEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof HsotileEngieEntity _datEntL1 && _datEntL1.getEntityData().get(HsotileEngieEntity.DATA_halloweened)) == true) {
			return true;
		}
		return false;
	}
}