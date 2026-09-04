package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.AngryCreatorEntity;

public class OutragedEngieNormalDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AngryCreatorEntity _datEntL0 && _datEntL0.getEntityData().get(AngryCreatorEntity.DATA_coldseasoned)) == false
				&& (entity instanceof AngryCreatorEntity _datEntL1 && _datEntL1.getEntityData().get(AngryCreatorEntity.DATA_holloweened)) == false) {
			return true;
		}
		return false;
	}
}