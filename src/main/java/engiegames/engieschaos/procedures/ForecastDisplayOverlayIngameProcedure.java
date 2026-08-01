package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class ForecastDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).ddaystart == false
				|| EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).sddaystart == false
				|| EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).thestart == false
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == false) {
			return true;
		}
		return false;
	}
}