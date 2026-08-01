package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DoomsDayMobsFightEachotherToggleProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
			return true;
		}
		return false;
	}
}