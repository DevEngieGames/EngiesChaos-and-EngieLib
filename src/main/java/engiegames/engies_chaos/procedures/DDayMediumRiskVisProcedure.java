package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DDayMediumRiskVisProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 12.5 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 18.75) {
			return true;
		}
		return false;
	}
}