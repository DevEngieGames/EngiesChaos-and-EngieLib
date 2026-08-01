package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.SharkoEntity;

public class SharkoOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.25) {
			if (entity instanceof SharkoEntity _datEntSetL)
				_datEntSetL.getEntityData().set(SharkoEntity.DATA_Albino, true);
		}
	}
}