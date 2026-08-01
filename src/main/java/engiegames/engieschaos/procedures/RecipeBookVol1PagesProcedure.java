package engiegames.engieschaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class RecipeBookVol1PagesProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		RecipeBookVol1Procedure.execute(entity, itemstack);
		RecipeBookVol12Procedure.execute(entity, itemstack);
	}
}