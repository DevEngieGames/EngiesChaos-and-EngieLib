package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.RareEngieSharkoEntity;

public class RareEngieSharkoTDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && !(entity.getDisplayName().getString()).equals("Finnegan")
				&& (entity instanceof RareEngieSharkoEntity _datEntI ? _datEntI.getEntityData().get(RareEngieSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof RareEngieSharkoEntity _datEntL3 && _datEntL3.getEntityData().get(RareEngieSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}