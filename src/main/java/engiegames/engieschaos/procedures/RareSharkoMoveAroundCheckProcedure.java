package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.RareSharkoEntity;

public class RareSharkoMoveAroundCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				|| (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof RareSharkoEntity _datEntI ? _datEntI.getEntityData().get(RareSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}