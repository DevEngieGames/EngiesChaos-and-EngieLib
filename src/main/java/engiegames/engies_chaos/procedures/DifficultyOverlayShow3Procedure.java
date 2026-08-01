package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DifficultyOverlayShow3Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).difficultyoverlaytoggle == 3) {
				return true;
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false) {
			return false;
		}
		return false;
	}
}