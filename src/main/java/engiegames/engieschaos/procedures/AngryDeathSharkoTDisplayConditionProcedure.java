package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.AngryDeathSharkoEntity;

public class AngryDeathSharkoTDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof AngryDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(AngryDeathSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}