package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class SuperDoomsDayNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == true) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				if ((world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE)) == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
						return true;
					} else if (!(EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true)) {
						return false;
					}
				} else if ((world instanceof ServerLevel _serverLevelGR5 && _serverLevelGR5.getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE)) == false) {
					if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
						return true;
					} else if (!(world.getLevelData().isRaining() && world.getLevelData().isThundering())) {
						return false;
					}
				}
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
				return false;
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
				return false;
			}
		}
		return false;
	}
}