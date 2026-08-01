package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class EngieGamesPropMult1Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1)) {
			return false;
		}
		return false;
	}
}