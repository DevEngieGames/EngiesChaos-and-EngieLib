package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.EnragedEngieEntity;

public class EnragedEngieStyle2DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof EnragedEngieEntity _datEntI ? _datEntI.getEntityData().get(EnragedEngieEntity.DATA_style) : 0) == 2
				&& (entity instanceof EnragedEngieEntity _datEntL1 && _datEntL1.getEntityData().get(EnragedEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof EnragedEngieEntity _datEntL2 && _datEntL2.getEntityData().get(EnragedEngieEntity.DATA_holloweened)) == false) {
			return true;
		}
		return false;
	}
}