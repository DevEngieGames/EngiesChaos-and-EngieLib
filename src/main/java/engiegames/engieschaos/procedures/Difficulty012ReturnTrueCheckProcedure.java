package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class Difficulty012ReturnTrueCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 0 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 1 || EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 2) {
			return true;
		}
		return false;
	}
}