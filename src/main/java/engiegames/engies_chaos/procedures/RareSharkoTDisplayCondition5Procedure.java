package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.RareSharkoEntity;

public class RareSharkoTDisplayCondition5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof RareSharkoEntity _datEntI ? _datEntI.getEntityData().get(RareSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof RareSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(RareSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}