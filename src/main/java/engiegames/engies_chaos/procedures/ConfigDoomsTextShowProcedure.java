package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class ConfigDoomsTextShowProcedure {
	public static String execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == false) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE) == true) {
					return "ENGIE'S WRATH";
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.THE_END_TOGGLE) == true) {
					return "The End";
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
					return "Super Doomsday";
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
					return "Doomsday";
				}
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
				return "ENGIE'S WRATH";
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == false) {
			return "Doomsday is off.";
		}
		return "";
	}
}