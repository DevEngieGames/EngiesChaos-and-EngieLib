package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.UncommonSharkoEntity;

public class UncommonSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof UncommonSharkoEntity _datEntI ? _datEntI.getEntityData().get(UncommonSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof UncommonSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(UncommonSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}