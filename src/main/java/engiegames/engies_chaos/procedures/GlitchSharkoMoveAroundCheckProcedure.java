package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.GlitchSharkoEntity;

public class GlitchSharkoMoveAroundCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				|| (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof GlitchSharkoEntity _datEntI ? _datEntI.getEntityData().get(GlitchSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}