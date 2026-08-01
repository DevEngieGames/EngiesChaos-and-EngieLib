package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ForecastDisplay12Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 12) {
			return true;
		}
		return false;
	}
}