package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class SwapCraftsToAntimatterButtonClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.recipebookantimattercraftstoggle = false;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.recipebookantimattercraftstoggle = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}