package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ForecastDisplay8Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 8) {
			return true;
		}
		return false;
	}
}