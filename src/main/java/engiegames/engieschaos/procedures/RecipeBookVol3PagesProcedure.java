package engiegames.engieschaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class RecipeBookVol3PagesProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		RecipeBookVol3Procedure.execute(entity, itemstack);
	}
}