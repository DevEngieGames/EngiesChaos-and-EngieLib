package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DenymarkdisplayconditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).checkboxbothmarked == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).checkboxbothmarked == false) {
			return false;
		}
		return false;
	}
}