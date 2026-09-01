package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class LightningFlashEngiesWrathDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			return true;
		}
		return false;
	}
}