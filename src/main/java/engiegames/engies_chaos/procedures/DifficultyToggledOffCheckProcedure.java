package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DifficultyToggledOffCheckProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (ModList.get().isLoaded("attributefix") && EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false && (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true || entity.hasPermissions(4))) {
			return true;
		}
		return false;
	}
}