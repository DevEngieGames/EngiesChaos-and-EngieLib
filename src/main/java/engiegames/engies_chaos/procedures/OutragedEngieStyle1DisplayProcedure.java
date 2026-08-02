package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.AngryCreatorEntity;

public class OutragedEngieStyle1DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AngryCreatorEntity _datEntI ? _datEntI.getEntityData().get(AngryCreatorEntity.DATA_style) : 0) == 1
				&& (entity instanceof AngryCreatorEntity _datEntL1 && _datEntL1.getEntityData().get(AngryCreatorEntity.DATA_coldseasoned)) == false
				&& (entity instanceof AngryCreatorEntity _datEntL2 && _datEntL2.getEntityData().get(AngryCreatorEntity.DATA_holloweened)) == false) {
			return true;
		}
		return false;
	}
}