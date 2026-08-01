package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.XEngieSharkoEntity;

public class XEngieSharkoTDisplayCondition4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof XEngieSharkoEntity _datEntI ? _datEntI.getEntityData().get(XEngieSharkoEntity.DATA_SharkoState) : 0) == 3) {
			return true;
		}
		return false;
	}
}