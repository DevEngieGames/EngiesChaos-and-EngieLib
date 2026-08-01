package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TrueHardcoreLivesCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).TrueHardcoreLifeCount > 1) {
			return new java.text.DecimalFormat("####").format(entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).TrueHardcoreLifeCount);
		}
		return new java.text.DecimalFormat("####").format(entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).TrueHardcoreLifeCount);
	}
}