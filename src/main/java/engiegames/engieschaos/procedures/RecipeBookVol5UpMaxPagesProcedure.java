package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class RecipeBookVol5UpMaxPagesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 120;
			entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.pageNumber = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}