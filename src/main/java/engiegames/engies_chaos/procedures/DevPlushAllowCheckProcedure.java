package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

public class DevPlushAllowCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == true) {
			return false;
		} else if (entity.getPersistentData().getBoolean("EngiesChaos_Dev") == false) {
			return true;
		}
		return true;
	}
}