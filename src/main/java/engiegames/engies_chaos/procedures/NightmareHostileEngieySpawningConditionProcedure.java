package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class NightmareHostileEngieySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == true) {
			if ((world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE)) == false) {
				if ((world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY)) == true
						|| (world instanceof ServerLevel _serverLevelGR3 && _serverLevelGR3.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO)) == true
						|| (world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == true
						|| (world instanceof ServerLevel _serverLevelGR5 && _serverLevelGR5.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC)) == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true
						|| EngiesChaosModVariables.MapVariables.get(world).thestart == true || EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
					if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
						return true;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
						return true;
					} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
						return false;
					}
				} else if (!((world instanceof ServerLevel _serverLevelGR15 && _serverLevelGR15.getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY)) == true
						|| (world instanceof ServerLevel _serverLevelGR16 && _serverLevelGR16.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO)) == true
						|| (world instanceof ServerLevel _serverLevelGR17 && _serverLevelGR17.getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == true
						|| (world instanceof ServerLevel _serverLevelGR18 && _serverLevelGR18.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC)) == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true
						|| EngiesChaosModVariables.MapVariables.get(world).thestart == true || EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true)) {
					return false;
				}
			} else if ((world instanceof ServerLevel _serverLevelGR19 && _serverLevelGR19.getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE)) == true) {
				return false;
			}
		} else if ((world instanceof ServerLevel _serverLevelGR20 && _serverLevelGR20.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == false) {
			return false;
		}
		return false;
	}
}