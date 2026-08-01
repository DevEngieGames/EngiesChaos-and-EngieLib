package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.GlitchSharkoEntity;

public class GlitchSharkoTDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof GlitchSharkoEntity _datEntI ? _datEntI.getEntityData().get(GlitchSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof GlitchSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(GlitchSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}