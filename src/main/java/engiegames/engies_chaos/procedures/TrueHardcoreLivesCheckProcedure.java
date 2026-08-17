package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class TrueHardcoreLivesCheckProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
			return new java.text.DecimalFormat("####").format((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).TrueHardcoreLifeCount);
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == false) {
			return "DISABLED";
		}
		return "DISABLED";
	}
}