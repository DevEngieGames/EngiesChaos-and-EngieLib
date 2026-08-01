package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Calendar;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class AprilFoolsDespawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.DO_SHARKO_SPAWNING)) == true) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				if (world instanceof Level _lvl4 && _lvl4.isDay() && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 7) {
					if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) < 8) {
						return false;
					} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) < 8)) {
						return true;
					}
				} else {
					return false;
				}
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
				return false;
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
				return false;
			}
		} else if ((world instanceof ServerLevel _serverLevelGR12 && _serverLevelGR12.getGameRules().getBoolean(EngiesChaosModGameRules.DO_SHARKO_SPAWNING)) == false) {
			return false;
		}
		return false;
	}
}