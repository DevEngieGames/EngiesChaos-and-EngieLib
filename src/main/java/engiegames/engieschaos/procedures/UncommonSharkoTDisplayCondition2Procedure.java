package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.UncommonSharkoEntity;

public class UncommonSharkoTDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof UncommonSharkoEntity _datEntI ? _datEntI.getEntityData().get(UncommonSharkoEntity.DATA_SharkoState) : 0) == 1) {
			return true;
		}
		return false;
	}
}