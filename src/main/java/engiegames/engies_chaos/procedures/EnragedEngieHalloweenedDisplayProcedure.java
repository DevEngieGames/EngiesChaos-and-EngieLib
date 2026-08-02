package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.EnragedEngieEntity;

public class EnragedEngieHalloweenedDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof EnragedEngieEntity _datEntL0 && _datEntL0.getEntityData().get(EnragedEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof EnragedEngieEntity _datEntL1 && _datEntL1.getEntityData().get(EnragedEngieEntity.DATA_holloweened)) == true) {
			return true;
		}
		return false;
	}
}