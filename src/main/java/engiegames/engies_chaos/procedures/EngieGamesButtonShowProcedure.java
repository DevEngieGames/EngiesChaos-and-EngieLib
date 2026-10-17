package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class EngieGamesButtonShowProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 13 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == -1) {
			return true;
		}
		return false;
	}
}