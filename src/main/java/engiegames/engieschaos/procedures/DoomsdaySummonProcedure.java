package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;
import engiegames.engieschaos.EngiesChaosMod;

public class DoomsdaySummonProcedure {
	public static void execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true
				&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
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
		} else if (!(world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true
				&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true)) {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == true) {
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
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE) == false) {
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