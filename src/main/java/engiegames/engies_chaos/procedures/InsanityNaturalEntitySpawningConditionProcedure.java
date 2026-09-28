package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class InsanityNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == true) {
			if ((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)
					|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) || EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart
					|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true) {
				if ((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC)
						|| EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart || EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true) {
					return true;
				} else if (!((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC)
						|| EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart || EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true)) {
					if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == false) {
						return true;
					} else if (EngiesChaosModVariables.MapVariables.get(world).ChallengeToggle == true) {
						if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
							return true;
						} else if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
							return false;
						}
					}
				}
			} else if (!((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)
					|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) || EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart
					|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true)) {
				return false;
			}
		}
		return true;
	}
}