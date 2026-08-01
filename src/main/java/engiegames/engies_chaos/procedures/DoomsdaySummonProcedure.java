package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

public class DoomsdaySummonProcedure {
	public static void execute(LevelAccessor world) {
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true
				&& (world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true
				&& (world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
			EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			EngiesChaosMod.queueServerWork(1, () -> {
				EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			});
		} else if (!((world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true
				&& (world instanceof ServerLevel _serverLevelGR5 && _serverLevelGR5.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true
				&& (world instanceof ServerLevel _serverLevelGR6 && _serverLevelGR6.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true)) {
			if ((world instanceof ServerLevel _serverLevelGR7 && _serverLevelGR7.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == true) {
				if (Math.random() <= 0.15) {
					EngiesChaosModVariables.MapVariables.get(world).TheEndStart = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				} else if (Math.random() > 0.15) {
					if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
						EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
						EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					EngiesChaosMod.queueServerWork(1, () -> {
						EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					});
				}
			} else if ((world instanceof ServerLevel _serverLevelGR10 && _serverLevelGR10.getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)) == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == false) {
					EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else if (EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle == true) {
					EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).SDDAYToggle = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
	}
}