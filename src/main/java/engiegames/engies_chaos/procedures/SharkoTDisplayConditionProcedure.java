package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.SharkoEntity;

public class SharkoTDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof SharkoEntity _datEntI ? _datEntI.getEntityData().get(SharkoEntity.DATA_SharkoState) : 0) == 0
				&& (entity instanceof SharkoEntity _datEntL2 && _datEntL2.getEntityData().get(SharkoEntity.DATA_Albino)) == false) {
			return true;
		}
		return false;
	}
}