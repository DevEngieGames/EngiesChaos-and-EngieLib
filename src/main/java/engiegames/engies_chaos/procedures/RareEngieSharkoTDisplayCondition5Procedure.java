package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.RareEngieSharkoEntity;

public class RareEngieSharkoTDisplayCondition5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof RareEngieSharkoEntity _datEntI ? _datEntI.getEntityData().get(RareEngieSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof RareEngieSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(RareEngieSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}