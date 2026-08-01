package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class ThrowbackSpawningCondProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_THROWBACK_TOGGLE)) == true) {
			return true;
		}
		return false;
	}
}