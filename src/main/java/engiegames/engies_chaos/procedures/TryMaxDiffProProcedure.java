package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class TryMaxDiffProProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff != world.players().size()) {
			EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff = EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		EngiesChaosMod.queueServerWork(1, () -> {
			if (EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff == world.players().size()) {
				if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 525;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 13;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		});
	}
}