package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DoomsDayAliveCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
			return "Currently Alive";
		}
		return "dday.overlay.alivestate=true";
	}
}