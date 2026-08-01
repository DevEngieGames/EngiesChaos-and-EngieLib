package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class LightningFlashNormDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == false) {
				return true;
			}
		} else if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart == false || EngiesChaosModVariables.MapVariables.get(world).sddaystart == false) && EngiesChaosModVariables.MapVariables.get(world).thestart == false) {
			if (EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled == true && EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled == false) {
				return true;
			}
		}
		return false;
	}
}