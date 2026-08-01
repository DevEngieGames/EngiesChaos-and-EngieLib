package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.MadEngieEntity;

public class MadEngieNormDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MadEngieEntity _datEntL0 && _datEntL0.getEntityData().get(MadEngieEntity.DATA_coldseasoned)) == false) {
			return true;
		}
		return false;
	}
}