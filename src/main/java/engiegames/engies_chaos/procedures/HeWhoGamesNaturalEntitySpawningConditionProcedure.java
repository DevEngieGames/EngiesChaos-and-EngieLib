package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class HeWhoGamesNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == true) {
			if ((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT)) == 0 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == -1) {
				if (EngiesChaosModVariables.MapVariables.get(world).lockhewhogamesotherspawn == false) {
					return true;
				} else if (EngiesChaosModVariables.MapVariables.get(world).lockhewhogamesotherspawn == true) {
					return false;
				}
			} else if (!((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT)) == 0 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == -1)) {
				return false;
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == false) {
			return false;
		}
		return false;
	}
}