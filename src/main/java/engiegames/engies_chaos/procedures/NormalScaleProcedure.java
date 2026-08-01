package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class NormalScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).missilenormalscale;
	}
}