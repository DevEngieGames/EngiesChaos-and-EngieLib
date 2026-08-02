package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.MonstrosityEngieEntity;

public class MonstrosityEngieHalloweenedDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MonstrosityEngieEntity _datEntL0 && _datEntL0.getEntityData().get(MonstrosityEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof MonstrosityEngieEntity _datEntL1 && _datEntL1.getEntityData().get(MonstrosityEngieEntity.DATA_holloweened)) == true) {
			return true;
		}
		return false;
	}
}