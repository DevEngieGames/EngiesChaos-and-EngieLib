package engiegames.engies_chaos.procedures;

import net.neoforged.fml.ModList;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class DifficultyToggleCheckForOPProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (ModList.get().isLoaded("attributefix")
				&& !((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("[RE:All About Engie Developer] xEngie") || entity instanceof Player _playerCmd3 && _playerCmd3.hasPermissions(4))) {
			return true;
		}
		return false;
	}
}