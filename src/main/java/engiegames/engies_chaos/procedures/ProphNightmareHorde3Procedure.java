package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ProphNightmareHorde3Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb >= 2 && EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb >= 2 && EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 3)) {
			return false;
		}
		return false;
	}
}