package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class MobHPBaseMultToggledOnCheckProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true && (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true || entity.hasPermissions(4))) {
			return true;
		}
		return false;
	}
}