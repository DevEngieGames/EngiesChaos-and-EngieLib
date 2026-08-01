package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ConfigButton8ShowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == false) {
			return true;
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
			return false;
		}
		return false;
	}
}