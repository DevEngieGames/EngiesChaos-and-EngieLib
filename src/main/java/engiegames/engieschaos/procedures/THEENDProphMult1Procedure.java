package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class THEENDProphMult1Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).thestart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).thestart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1)) {
			return false;
		}
		return false;
	}
}