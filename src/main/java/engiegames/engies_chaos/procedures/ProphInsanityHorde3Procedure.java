package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ProphInsanityHorde3Procedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb >= 3 && EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb >= 3 && EngiesChaosModVariables.MapVariables.get(world).ddayprophinsanityhordenumb == 3)) {
			return false;
		}
		return false;
	}
}