package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ForecastStatementMainDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).forecastdialogue > 0 && EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum > 0) {
			return true;
		}
		return false;
	}
}