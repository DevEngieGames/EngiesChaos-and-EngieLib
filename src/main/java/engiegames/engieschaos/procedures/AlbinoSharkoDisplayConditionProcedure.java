package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.SharkoEntity;

public class AlbinoSharkoDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof SharkoEntity _datEntL1 && _datEntL1.getEntityData().get(SharkoEntity.DATA_Albino)) == true) {
			return true;
		}
		return false;
	}
}