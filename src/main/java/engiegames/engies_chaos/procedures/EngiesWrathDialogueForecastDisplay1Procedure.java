package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class EngiesWrathDialogueForecastDisplay1Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 1 && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
			return true;
		}
		return false;
	}
}