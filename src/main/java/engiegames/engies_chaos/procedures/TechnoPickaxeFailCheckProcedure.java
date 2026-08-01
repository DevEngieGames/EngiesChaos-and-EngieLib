package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class TechnoPickaxeFailCheckProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount > 0) {
			{
				final String _tagName = "playerfailedtechnochallenge";
				final boolean _tagValue = true;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putBoolean(_tagName, _tagValue));
			}
		}
	}
}