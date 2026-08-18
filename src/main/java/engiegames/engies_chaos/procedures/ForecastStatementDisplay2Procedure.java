package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ForecastStatementDisplay2Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).forecastdialogue >= 6 && EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum >= 6) {
			return true;
		}
		return false;
	}
}