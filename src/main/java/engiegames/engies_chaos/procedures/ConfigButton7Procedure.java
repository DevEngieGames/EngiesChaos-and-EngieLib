package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigButton7Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.DoomsdayRiskTrackToggle = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}