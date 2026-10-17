package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.CosmicDeathSharkoEntity;

public class CosmicDeathSharkoSleepCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) == 4) {
			return false;
		} else if ((entity instanceof CosmicDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(CosmicDeathSharkoEntity.DATA_SharkoState) : 0) != 4) {
			return true;
		}
		return false;
	}
}