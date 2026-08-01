package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ConfigRaiseDiff1Procedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= -1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = EngiesChaosModVariables.MapVariables.get(world).MobDifficulty + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 32) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 525;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 690;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 250000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 500000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000) {
			EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 525000;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}