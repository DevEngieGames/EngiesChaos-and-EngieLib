package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.entity.Entity;

public class ConfigCheckForOPProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (ModList.get().isLoaded("attributefix") && (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true || entity.hasPermissions(4))) {
			return true;
		}
		return false;
	}
}