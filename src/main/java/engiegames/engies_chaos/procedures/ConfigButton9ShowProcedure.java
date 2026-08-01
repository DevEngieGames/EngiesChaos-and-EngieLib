package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigButton9ShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == true) {
			return true;
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayTrackToggle == false) {
			return false;
		}
		return false;
	}
}