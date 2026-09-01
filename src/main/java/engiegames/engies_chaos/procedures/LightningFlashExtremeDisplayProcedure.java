package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class LightningFlashExtremeDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).ddaystart == true
				|| EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).sddaystart == true
				|| EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
				return true;
			}
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).ddaystart == true
				|| EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).sddaystart == true
				|| EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).thestart == true
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true)) {
			if (world.getLevelData().isThundering()) {
				if (EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled == true && EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled == true) {
					return true;
				}
			}
		}
		return false;
	}
}