package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class DarkRegularHallowsScytheInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Dark Matter Hallow's Scythe" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("darkregularhallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}