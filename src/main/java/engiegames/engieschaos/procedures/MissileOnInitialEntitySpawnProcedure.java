package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.EngiesChaosMod;

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