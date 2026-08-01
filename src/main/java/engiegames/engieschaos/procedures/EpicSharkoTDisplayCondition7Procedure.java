package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.EpicSharkoEntity;

public class EpicSharkoTDisplayCondition7Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof EpicSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(EpicSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}