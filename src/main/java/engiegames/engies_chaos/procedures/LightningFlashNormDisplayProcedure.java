package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class LightningFlashNormDisplayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart == true && EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart == true && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == false) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).Photosensitivity == false) {
					return true;
				}
			}
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart == true && EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart == true && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true
				|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true)) {
			if (EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled == true) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).Photosensitivity == false) {
					return true;
				}
			}
		}
		return false;
	}
}