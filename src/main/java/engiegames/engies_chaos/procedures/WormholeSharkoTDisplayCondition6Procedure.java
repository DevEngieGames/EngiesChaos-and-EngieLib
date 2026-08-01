package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.WormholeSharkoEntity;

public class WormholeSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof WormholeSharkoEntity _datEntI ? _datEntI.getEntityData().get(WormholeSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof WormholeSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(WormholeSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}