package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsdayBlizzardDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart || EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true) {
			return EngiesChaosModVariables.MapVariables.get(world).blizzard;
		} else if (!((EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart || EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true)) {
			return false;
		}
		return false;
	}
}