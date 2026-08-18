package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TheEndProphShowProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).thestart == true)) {
			return false;
		}
		return false;
	}
}