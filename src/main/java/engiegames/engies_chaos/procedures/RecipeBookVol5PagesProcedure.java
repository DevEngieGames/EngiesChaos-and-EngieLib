package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class RecipeBookVol5PagesProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		RecipeBookVol5Portion1Procedure.execute(entity, itemstack);
		RecipeBookVol5Portion12Procedure.execute(entity, itemstack);
		RecipeBookVol5Portion2Procedure.execute(entity, itemstack);
		RecipeBookVol5Portion3Procedure.execute(entity, itemstack);
	}
}