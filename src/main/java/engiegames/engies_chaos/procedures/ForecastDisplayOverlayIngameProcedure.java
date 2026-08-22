package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ForecastDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart || EngiesChaosModVariables.MapVariables.get(world).TheEndStart
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == true) {
			return true;
		}
		return false;
	}
}