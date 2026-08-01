package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class RecipeBookVol5UpMaxPagesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.pageNumber = 120;
			_vars.syncPlayerVariables(entity);
		}
	}
}