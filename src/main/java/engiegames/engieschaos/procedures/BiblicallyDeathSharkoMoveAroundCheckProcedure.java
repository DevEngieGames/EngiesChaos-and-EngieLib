package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.BiblicallyDeathSharkoEntity;

public class BiblicallyDeathSharkoMoveAroundCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				|| (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof BiblicallyDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(BiblicallyDeathSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}