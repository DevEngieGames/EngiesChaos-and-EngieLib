package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.SharkoEntity;

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