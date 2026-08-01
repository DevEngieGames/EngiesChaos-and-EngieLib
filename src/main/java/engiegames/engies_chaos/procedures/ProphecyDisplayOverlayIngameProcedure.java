package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ProphecyDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddayprophshow == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophshow == false) {
			return false;
		}
		return false;
	}
}