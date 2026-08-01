package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class EngieGamesPropMult2Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2)) {
			return false;
		}
		return false;
	}
}