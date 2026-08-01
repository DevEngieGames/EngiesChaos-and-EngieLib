package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class SwapCraftsToAntimatterButtonClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
			{
				boolean _setval = false;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.recipebookantimattercraftstoggle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
			{
				boolean _setval = true;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.recipebookantimattercraftstoggle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}