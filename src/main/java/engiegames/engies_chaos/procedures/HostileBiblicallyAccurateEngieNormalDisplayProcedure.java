package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;

public class HostileBiblicallyAccurateEngieNormalDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof HostileBiblicallyAccurateEngieEntity _datEntL0 && _datEntL0.getEntityData().get(HostileBiblicallyAccurateEngieEntity.DATA_coldseasoned)) == false
				&& (entity instanceof HostileBiblicallyAccurateEngieEntity _datEntL1 && _datEntL1.getEntityData().get(HostileBiblicallyAccurateEngieEntity.DATA_halloweened)) == false) {
			return true;
		}
		return false;
	}
}