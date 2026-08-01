package engiegames.engieschaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import engiegames.engieschaos.init.EngiesChaosModGameRules;

public class InsanityHostileEngieSpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == true) {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == false) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true
						|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
					if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
						return true;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
						return true;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
						return true;
					}
				} else if (!(world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true
						|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true)) {
					return false;
				}
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == true) {
				return false;
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == false) {
			return false;
		}
		return false;
	}
}