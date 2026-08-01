package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.entity.Entity;

public class DifficultyToggleCheckForOPProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (ModList.get().isLoaded("attributefix") && !((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] xEngie") || entity.hasPermissions(4))) {
			return true;
		}
		return false;
	}
}