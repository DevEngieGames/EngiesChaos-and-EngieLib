package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;

public class HostileBiblicallyAccurateEngieColdSeasonedDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof HostileBiblicallyAccurateEngieEntity _datEntI ? _datEntI.getEntityData().get(HostileBiblicallyAccurateEngieEntity.DATA_style) : 0) == 1
				&& (entity instanceof HostileBiblicallyAccurateEngieEntity _datEntL1 && _datEntL1.getEntityData().get(HostileBiblicallyAccurateEngieEntity.DATA_coldseasoned)) == true) {
			return true;
		}
		return false;
	}
}