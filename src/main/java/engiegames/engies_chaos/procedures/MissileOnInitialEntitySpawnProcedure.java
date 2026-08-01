package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class MissileOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world) {
		EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound2 = true;
		EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		EngiesChaosMod.queueServerWork(1, () -> {
			EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound2 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		});
	}
}