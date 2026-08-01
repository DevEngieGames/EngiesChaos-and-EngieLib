package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.MadEngieEntity;

public class MadEngieColdDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MadEngieEntity _datEntL0 && _datEntL0.getEntityData().get(MadEngieEntity.DATA_coldseasoned)) == true) {
			return true;
		}
		return false;
	}
}