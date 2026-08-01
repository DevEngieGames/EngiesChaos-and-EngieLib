package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigButton11Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).hphudtoggle == true) {
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.hphudtoggle = false;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).hphudtoggle == false) {
			{
				EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.hphudtoggle = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}