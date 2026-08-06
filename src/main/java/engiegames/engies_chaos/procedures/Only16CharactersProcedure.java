package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class Only16CharactersProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true && (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == true) {
			return "\u00A74" + entity.getDisplayName().getString();
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == true
				&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == true) {
			return "\u00A71" + entity.getDisplayName().getString();
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == true
				&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == true) {
			return "\u00A73" + entity.getDisplayName().getString();
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_Tester") == true
				&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == true) {
			return "\u00A72" + entity.getDisplayName().getString();
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true && entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == true && entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == true
				&& entity.getPersistentData().getBoolean("EngiesChaos_Tester") == true
				&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == false) {
			return entity.getDisplayName().getString();
		} else if (!(entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true && entity.getPersistentData().getBoolean("EngiesChaos_Contributor") == true && entity.getPersistentData().getBoolean("EngiesChaos_BetaTester") == true
				&& entity.getPersistentData().getBoolean("EngiesChaos_Tester") == true
				&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerdebugmode == true)) {
			return entity.getDisplayName().getString();
		}
		return entity.getDisplayName().getString();
	}
}