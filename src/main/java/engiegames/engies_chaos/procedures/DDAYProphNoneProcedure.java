package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DDAYProphNoneProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 0) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).ddaystart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 0)) {
			return false;
		}
		return false;
	}
}