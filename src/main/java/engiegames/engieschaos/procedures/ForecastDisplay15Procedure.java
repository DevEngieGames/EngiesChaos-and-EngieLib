package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ForecastDisplay15Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum >= 1 && EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum < 6) {
			return true;
		}
		return false;
	}
}