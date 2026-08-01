package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsDayDeadCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == false) {
			return "Currently Dead";
		}
		return "dday.overlay.alivestate=false";
	}
}