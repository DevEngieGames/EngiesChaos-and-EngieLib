package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class SDDAYProphNoneProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 0) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).sddaystart == true && EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 0)) {
			return false;
		}
		return false;
	}
}