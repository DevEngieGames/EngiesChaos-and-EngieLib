package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigButton6ShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == false) {
			return true;
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
			return false;
		}
		return false;
	}
}