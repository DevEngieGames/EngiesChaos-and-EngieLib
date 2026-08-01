package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class EnragedNormalNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == true) {
			if ((world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE)) == false) {
				if ((world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE)) == true
						|| (world instanceof ServerLevel _serverLevelGR3 && _serverLevelGR3.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO)) == true
						|| (world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == true) {
					if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
						return true;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
						return false;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
						return false;
					}
				} else {
					if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
						return true;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
						return false;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
						return false;
					}
				}
			} else if ((world instanceof ServerLevel _serverLevelGR23 && _serverLevelGR23.getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE)) == true) {
				return false;
			}
		} else if ((world instanceof ServerLevel _serverLevelGR24 && _serverLevelGR24.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == false) {
			return false;
		}
		return false;
	}
}