package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.EngieSharkoEntity;

public class EngieSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof EngieSharkoEntity _datEntI ? _datEntI.getEntityData().get(EngieSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof EngieSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(EngieSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}