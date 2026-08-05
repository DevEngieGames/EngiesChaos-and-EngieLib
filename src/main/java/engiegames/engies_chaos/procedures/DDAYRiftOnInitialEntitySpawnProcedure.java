package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class DDAYRiftOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).playriftsound = false;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosMod.queueServerWork(1, () -> {
			EngiesChaosModVariables.MapVariables.get(world).playriftsound = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playriftsound2 = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		});
	}
}