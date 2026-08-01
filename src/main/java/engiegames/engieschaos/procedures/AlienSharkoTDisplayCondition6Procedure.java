package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.AlienSharkoEntity;

public class AlienSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof AlienSharkoEntity _datEntI ? _datEntI.getEntityData().get(AlienSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof AlienSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(AlienSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}