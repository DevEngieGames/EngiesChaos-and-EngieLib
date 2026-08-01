package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsDayDeadOverlayCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == false) {
			return true;
		}
		return false;
	}
}