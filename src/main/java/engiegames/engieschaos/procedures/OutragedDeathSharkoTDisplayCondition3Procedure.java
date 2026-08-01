package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.OutragedDeathSharkoEntity;

public class OutragedDeathSharkoTDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof OutragedDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(OutragedDeathSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof OutragedDeathSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(OutragedDeathSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}