package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.MythicSharkoEntity;

public class MythicSharkoSleepCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MythicSharkoEntity _datEntI ? _datEntI.getEntityData().get(MythicSharkoEntity.DATA_SharkoState) : 0) == 4) {
			return false;
		} else if ((entity instanceof MythicSharkoEntity _datEntI ? _datEntI.getEntityData().get(MythicSharkoEntity.DATA_SharkoState) : 0) != 4) {
			return true;
		}
		return false;
	}
}