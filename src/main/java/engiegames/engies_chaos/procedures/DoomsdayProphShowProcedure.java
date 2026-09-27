package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsdayProphShowProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true)) {
			return false;
		}
		return false;
	}
}