package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class Difficulty15to29ReturnTrueCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 15 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 29) {
			return true;
		}
		return false;
	}
}