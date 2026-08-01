package engiegames.engieschaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ConfigButton4Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 4;
			entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.difficultyoverlaytoggle = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}