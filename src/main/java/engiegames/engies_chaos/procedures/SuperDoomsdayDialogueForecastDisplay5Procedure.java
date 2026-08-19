package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class SuperDoomsdayDialogueForecastDisplay5Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 5 && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
			return true;
		}
		return false;
	}
}