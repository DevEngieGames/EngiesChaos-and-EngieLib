package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class ObjectiveOverlayCheckProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay == true) {
			return true;
		} else if (EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay == false) {
			return false;
		}
		return false;
	}
}