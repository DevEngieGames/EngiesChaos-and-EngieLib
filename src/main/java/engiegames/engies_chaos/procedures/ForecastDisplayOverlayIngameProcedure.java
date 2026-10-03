package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ForecastDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart == true && EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == false
				|| EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart == true && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == false
				|| EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == false
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == false) {
			return true;
		}
		return false;
	}
}