package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class RemovePlayerImmunityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
			_vars.playerhasimmunity = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}