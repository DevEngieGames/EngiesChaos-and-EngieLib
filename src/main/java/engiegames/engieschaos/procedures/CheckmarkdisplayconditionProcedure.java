package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class CheckmarkdisplayconditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).checkboxbothnomarked == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).checkboxbothnomarked == false) {
			return false;
		}
		return false;
	}
}