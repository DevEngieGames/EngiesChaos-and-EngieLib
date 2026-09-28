package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsDayAliveDeathCountDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
			return true;
		}
		return false;
	}
}