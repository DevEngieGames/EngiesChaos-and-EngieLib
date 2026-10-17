package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.ExoticSharkoEntity;

public class ExoticSharkoSleepCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof ExoticSharkoEntity _datEntI ? _datEntI.getEntityData().get(ExoticSharkoEntity.DATA_SharkoState) : 0) == 4) {
			return false;
		} else if ((entity instanceof ExoticSharkoEntity _datEntI ? _datEntI.getEntityData().get(ExoticSharkoEntity.DATA_SharkoState) : 0) != 4) {
			return true;
		}
		return false;
	}
}