package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class NegativeDifficultyAICheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == -1) {
			return false;
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > -1) {
			return true;
		}
		return false;
	}
}