package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.MonstrosityEngieEntity;

public class MonstrosityEngieStyle1DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MonstrosityEngieEntity _datEntI ? _datEntI.getEntityData().get(MonstrosityEngieEntity.DATA_variant) : 0) == 1
				&& (entity instanceof MonstrosityEngieEntity _datEntL1 && _datEntL1.getEntityData().get(MonstrosityEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof MonstrosityEngieEntity _datEntL2 && _datEntL2.getEntityData().get(MonstrosityEngieEntity.DATA_holloweened)) == false) {
			return true;
		}
		return false;
	}
}