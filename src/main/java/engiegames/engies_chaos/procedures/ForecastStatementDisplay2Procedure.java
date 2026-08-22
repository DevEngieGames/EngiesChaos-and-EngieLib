package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ForecastStatementDisplay2Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum >= 5) {
					return true;
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true || EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum >= 1) {
					return true;
				}
			}
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true || EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true)) {
			return false;
		}
		return false;
	}
}