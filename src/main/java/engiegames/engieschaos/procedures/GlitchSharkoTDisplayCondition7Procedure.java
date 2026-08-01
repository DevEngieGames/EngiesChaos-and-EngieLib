package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.GlitchSharkoEntity;

public class GlitchSharkoTDisplayCondition7Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof GlitchSharkoEntity _datEntI ? _datEntI.getEntityData().get(GlitchSharkoEntity.DATA_SharkoState) : 0) == 4
				&& (entity instanceof GlitchSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(GlitchSharkoEntity.DATA_AlternateState)) == true) {
			return true;
		}
		return false;
	}
}