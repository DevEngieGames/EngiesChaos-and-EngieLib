package engiegames.engieschaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;

public class WormholeSharkoSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DO_SHARKO_SPAWNING) == true) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				if (world instanceof Level _lvl4 && _lvl4.isDay() && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
					if (EngiesChaosModVariables.MapVariables.get(world).wormholesharkoabletospawn == true) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
				return false;
			} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END) {
				return false;
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DO_SHARKO_SPAWNING) == false) {
			return false;
		}
		return false;
	}
}