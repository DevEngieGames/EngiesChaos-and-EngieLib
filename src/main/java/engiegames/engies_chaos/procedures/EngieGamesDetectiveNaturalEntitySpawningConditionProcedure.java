package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class EngieGamesDetectiveNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.DETECTIVE_MODE)) == true) {
			return true;
		}
		return false;
	}
}