package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.ExoticSharkoEntity;

public class ExoticSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof ExoticSharkoEntity _datEntI ? _datEntI.getEntityData().get(ExoticSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof ExoticSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(ExoticSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}