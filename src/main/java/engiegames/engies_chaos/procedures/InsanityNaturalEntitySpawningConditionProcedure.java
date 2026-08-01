package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class InsanityNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == true) {
			if ((world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE)) == false) {
				if ((world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY)) == true
						|| (world instanceof ServerLevel _serverLevelGR3 && _serverLevelGR3.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == true
						|| (world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC)) == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true
						|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
					return true;
				} else if (!((world instanceof ServerLevel _serverLevelGR5 && _serverLevelGR5.getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY)) == true
						|| (world instanceof ServerLevel _serverLevelGR6 && _serverLevelGR6.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == true
						|| (world instanceof ServerLevel _serverLevelGR7 && _serverLevelGR7.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC)) == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true
						|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true)) {
					return false;
				}
			} else if (true) {
				return false;
			}
		} else if ((world instanceof ServerLevel _serverLevelGR8 && _serverLevelGR8.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == false) {
			return false;
		}
		return false;
	}
}