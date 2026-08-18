package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class EngiesWrathProphShowProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true)) {
			return false;
		}
		return false;
	}
}