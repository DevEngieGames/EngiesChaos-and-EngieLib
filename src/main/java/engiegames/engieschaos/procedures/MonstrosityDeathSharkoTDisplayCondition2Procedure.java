package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.MonstrosityDeathSharkoEntity;

public class MonstrosityDeathSharkoTDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof MonstrosityDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(MonstrosityDeathSharkoEntity.DATA_SharkoState) : 0) == 1) {
			return true;
		}
		return false;
	}
}