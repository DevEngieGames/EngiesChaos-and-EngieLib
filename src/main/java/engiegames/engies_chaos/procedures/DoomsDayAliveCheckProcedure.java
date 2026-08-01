package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsDayAliveCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
			return "Currently Alive";
		}
		return "dday.overlay.alivestate=true";
	}
}