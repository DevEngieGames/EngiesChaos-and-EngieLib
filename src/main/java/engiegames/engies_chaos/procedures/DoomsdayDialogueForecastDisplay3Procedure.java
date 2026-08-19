package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsdayDialogueForecastDisplay3Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 3 && (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true)) {
			return true;
		}
		return false;
	}
}