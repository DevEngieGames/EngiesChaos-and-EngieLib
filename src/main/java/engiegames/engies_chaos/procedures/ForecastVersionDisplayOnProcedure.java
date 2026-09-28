package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ForecastVersionDisplayOnProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart == true || EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
			return false;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart == true || EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true)) {
			return true;
		}
		return false;
	}
}