package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.EnragedDeathSharkoEntity;

public class EnragedDeathSharkoTDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof EnragedDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(EnragedDeathSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}