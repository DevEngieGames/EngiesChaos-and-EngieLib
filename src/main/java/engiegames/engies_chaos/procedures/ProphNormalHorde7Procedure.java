package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ProphNormalHorde7Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb >= 1 && EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb >= 1 && EngiesChaosModVariables.MapVariables.get(world).ddayprophnormhordenumb == 7)) {
			return false;
		}
		return false;
	}
}