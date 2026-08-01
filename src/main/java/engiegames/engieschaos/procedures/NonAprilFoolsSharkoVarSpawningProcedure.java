package engiegames.engieschaos.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import engiegames.engieschaos.init.EngiesChaosModGameRules;

public class NonAprilFoolsSharkoVarSpawningProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DO_SHARKO_SPAWNING) == true) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				return true;
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