package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.MythicSharkoEntity;

public class MythicSharkoTDisplayCondition5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof MythicSharkoEntity _datEntI ? _datEntI.getEntityData().get(MythicSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof MythicSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(MythicSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}