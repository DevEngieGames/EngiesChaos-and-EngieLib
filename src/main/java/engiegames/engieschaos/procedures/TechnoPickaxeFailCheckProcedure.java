package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;

public class TechnoPickaxeFailCheckProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount > 0) {
			itemstack.getOrCreateTag().putBoolean("playerfailedtechnochallenge", true);
		}
	}
}