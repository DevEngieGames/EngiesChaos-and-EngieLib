package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TrueHardcoreLivesCheckProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if (EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld == true) {
			return new java.text.DecimalFormat("####").format((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).TrueHardcoreLifeCount);
		} else if (EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld == false) {
			return "DISABLED";
		}
		return "DISABLED";
	}
}