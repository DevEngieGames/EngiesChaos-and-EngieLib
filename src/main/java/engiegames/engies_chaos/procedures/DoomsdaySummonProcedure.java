package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

public class DoomsdaySummonProcedure {
	public static void execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE) == true) {
			EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosMod.queueServerWork(1, () -> {
				EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			});
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.THE_END_TOGGLE) == true) {
			EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosMod.queueServerWork(1, () -> {
				EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			});
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
			EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosMod.queueServerWork(1, () -> {
				EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			});
		} else {
			EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosMod.queueServerWork(1, () -> {
				EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			});
		}
	}
}