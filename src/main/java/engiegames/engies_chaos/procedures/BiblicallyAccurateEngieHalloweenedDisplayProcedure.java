package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieHalloweenedDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof BiblicallyAccurateEngieEntity _datEntL0 && _datEntL0.getEntityData().get(BiblicallyAccurateEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof BiblicallyAccurateEngieEntity _datEntL1 && _datEntL1.getEntityData().get(BiblicallyAccurateEngieEntity.DATA_holloweened)) == true) {
			return true;
		}
		return false;
	}
}