package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class SuperDoomsdayProphShowProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true)) {
			return false;
		}
		return false;
	}
}