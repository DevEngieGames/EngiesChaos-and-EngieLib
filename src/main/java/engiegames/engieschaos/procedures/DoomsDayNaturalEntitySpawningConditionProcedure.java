package engiegames.engieschaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;

public class DoomsDayNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DELETED_MOD_ELEMENT) == true) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
						return true;
					} else if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == false) {
						return false;
					}
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == false) {
					if (world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
						return true;
					} else if (!(world.getLevelData().isRaining() && !world.getLevelData().isThundering())) {
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