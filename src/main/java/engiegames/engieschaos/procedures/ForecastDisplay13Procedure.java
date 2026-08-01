package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ForecastDisplay13Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum == 13) {
			return true;
		}
		return false;
	}
}