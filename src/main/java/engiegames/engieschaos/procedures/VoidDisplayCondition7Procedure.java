package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.TigerSharkoEntity;

public class VoidDisplayCondition7Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getDisplayName().getString()).equals("Void") && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof TigerSharkoEntity _datEntI ? _datEntI.getEntityData().get(TigerSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof TigerSharkoEntity _datEntL3 && _datEntL3.getEntityData().get(TigerSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}