package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TheEndDialogueForecastDisplay3Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 3 && EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			return true;
		}
		return false;
	}
}