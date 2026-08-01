package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.TigerSharkoEntity;

public class TobyDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getDisplayName().getString()).equals("Toby") && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof TigerSharkoEntity _datEntI ? _datEntI.getEntityData().get(TigerSharkoEntity.DATA_SharkoState) : 0) == 1) {
			return true;
		}
		return false;
	}
}