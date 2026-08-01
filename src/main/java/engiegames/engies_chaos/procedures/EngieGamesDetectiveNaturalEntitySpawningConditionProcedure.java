package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class EngieGamesDetectiveNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DETECTIVE_MODE) == true) {
			return true;
		}
		return false;
	}
}