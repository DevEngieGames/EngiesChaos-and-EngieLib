package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class DifficultyOverlayShow2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).difficultyoverlaytoggle == 2) {
			return true;
		} else if (!((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).difficultyoverlaytoggle == 2)) {
			return false;
		}
		return false;
	}
}