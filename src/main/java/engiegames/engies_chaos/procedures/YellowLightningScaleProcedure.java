package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.YellowLightningEntity;

public class YellowLightningScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return 0.05 * (entity instanceof YellowLightningEntity _datEntI ? _datEntI.getEntityData().get(YellowLightningEntity.DATA_scalemult) : 0);
	}
}