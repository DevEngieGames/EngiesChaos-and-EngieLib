package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.AngryEngieEntity;

public class AngryEngieStyle1DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AngryEngieEntity _datEntI ? _datEntI.getEntityData().get(AngryEngieEntity.DATA_style) : 0) == 1
				&& (entity instanceof AngryEngieEntity _datEntL1 && _datEntL1.getEntityData().get(AngryEngieEntity.DATA_holloweened)) == false
				&& (entity instanceof AngryEngieEntity _datEntL2 && _datEntL2.getEntityData().get(AngryEngieEntity.DATA_coldseasoned)) == false) {
			return true;
		}
		return false;
	}
}