package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.AngryEngieEntity;

public class AngryEngieNormalDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AngryEngieEntity _datEntL0 && _datEntL0.getEntityData().get(AngryEngieEntity.DATA_holloweened)) == false
				&& (entity instanceof AngryEngieEntity _datEntL1 && _datEntL1.getEntityData().get(AngryEngieEntity.DATA_coldseasoned)) == false) {
			return true;
		}
		return false;
	}
}