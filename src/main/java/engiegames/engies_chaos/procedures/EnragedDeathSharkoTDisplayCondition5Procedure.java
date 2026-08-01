package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.EnragedDeathSharkoEntity;

public class EnragedDeathSharkoTDisplayCondition5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof EnragedDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(EnragedDeathSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof EnragedDeathSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(EnragedDeathSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}