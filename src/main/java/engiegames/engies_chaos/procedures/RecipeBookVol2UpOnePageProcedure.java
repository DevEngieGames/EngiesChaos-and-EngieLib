package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class RecipeBookVol2UpOnePageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber < 30) {
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.pageNumber = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber + 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}