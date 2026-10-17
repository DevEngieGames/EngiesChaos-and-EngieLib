package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.OutragedDeathSharkoEntity;

public class OutragedDeathSharkoSleepCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof OutragedDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(OutragedDeathSharkoEntity.DATA_SharkoState) : 0) == 4) {
			return false;
		} else if ((entity instanceof OutragedDeathSharkoEntity _datEntI ? _datEntI.getEntityData().get(OutragedDeathSharkoEntity.DATA_SharkoState) : 0) != 4) {
			return true;
		}
		return false;
	}
}