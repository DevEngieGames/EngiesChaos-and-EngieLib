package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.TigerSharkoEntity;

public class TigerDisplayCondition6Procedure {
	public static boolean execute(Entity entity) {
		if ((entity.getDisplayName().getString()).equals("Tiger") && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof TigerSharkoEntity _datEntI ? _datEntI.getEntityData().get(TigerSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof TigerSharkoEntity _datEntL3 && _datEntL3.getEntityData().get(TigerSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}