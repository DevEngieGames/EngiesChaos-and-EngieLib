package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.SharkoEntity;

public class SharkoTDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof SharkoEntity _datEntI ? _datEntI.getEntityData().get(SharkoEntity.DATA_SharkoState) : 0) == 1
				&& (entity instanceof SharkoEntity _datEntL2 && _datEntL2.getEntityData().get(SharkoEntity.DATA_Albino)) == false) {
			return true;
		}
		return false;
	}
}