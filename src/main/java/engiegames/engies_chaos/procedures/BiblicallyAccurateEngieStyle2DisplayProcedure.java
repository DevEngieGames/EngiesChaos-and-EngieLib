package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieStyle2DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof BiblicallyAccurateEngieEntity _datEntI ? _datEntI.getEntityData().get(BiblicallyAccurateEngieEntity.DATA_style) : 0) == 2
				&& (entity instanceof BiblicallyAccurateEngieEntity _datEntL1 && _datEntL1.getEntityData().get(BiblicallyAccurateEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof BiblicallyAccurateEngieEntity _datEntL2 && _datEntL2.getEntityData().get(BiblicallyAccurateEngieEntity.DATA_holloweened)) == false) {
			return true;
		}
		return false;
	}
}