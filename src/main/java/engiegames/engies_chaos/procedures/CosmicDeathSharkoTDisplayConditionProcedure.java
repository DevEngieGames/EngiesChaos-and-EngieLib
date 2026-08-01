package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.CosmicDeathSharkoEntity;

public class CosmicDeathSharkoTDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 0) {
			return true;
		}
		return false;
	}
}