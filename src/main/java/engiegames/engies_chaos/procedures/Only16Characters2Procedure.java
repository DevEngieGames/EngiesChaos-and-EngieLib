package engiegames.engies_chaos.procedures;

import net.minecraft.world.entity.Entity;

public class Only16Characters2Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ">// " + entity.getDisplayName().getString();
	}
}