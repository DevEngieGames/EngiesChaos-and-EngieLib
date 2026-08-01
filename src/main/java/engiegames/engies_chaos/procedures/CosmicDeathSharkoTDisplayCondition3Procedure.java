package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.CosmicDeathSharkoEntity;

public class CosmicDeathSharkoTDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 2
				&& (entity instanceof CosmicDeathSharkoEntity _datEntL2 && _datEntL2.getEntityData().get(CosmicDeathSharkoEntity.DATA_AlternateState)) == false) {
			return true;
		}
		return false;
	}
}