package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class DifficultyOverlayShow2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).difficultyoverlaytoggle == 2) {
			return true;
		} else if (!((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).difficultyoverlaytoggle == 2)) {
			return false;
		}
		return false;
	}
}