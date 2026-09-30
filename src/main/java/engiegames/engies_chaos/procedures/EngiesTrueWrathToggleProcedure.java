package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class EngiesTrueWrathToggleProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
			EngiesChaosModVariables.MapVariables.get(world).engiestruewrath = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
			EngiesChaosModVariables.MapVariables.get(world).engiestruewrath = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).truechaosenabledbydev = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}