package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.TigerSharkoEntity;

public class TonyDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getDisplayName().getString()).equals("Tony") && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof TigerSharkoEntity _datEntI ? _datEntI.getEntityData().get(TigerSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof TigerSharkoEntity _datEntL3 && _datEntL3.getEntityData().get(TigerSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}