package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.SharkoEntity;

public class AlbinoSharkoTDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof SharkoEntity _datEntI ? _datEntI.getEntityData().get(SharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof SharkoEntity _datEntL2 && _datEntL2.getEntityData().get(SharkoEntity.DATA_AlternateState)) == false
				&& (entity instanceof SharkoEntity _datEntL3 && _datEntL3.getEntityData().get(SharkoEntity.DATA_Albino)) == true) {
			return true;
		}
		return false;
	}
}