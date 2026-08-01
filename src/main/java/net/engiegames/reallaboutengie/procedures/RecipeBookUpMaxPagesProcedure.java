package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

public class RecipeBookUpMaxPagesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 106;
			entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.pageNumber = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}