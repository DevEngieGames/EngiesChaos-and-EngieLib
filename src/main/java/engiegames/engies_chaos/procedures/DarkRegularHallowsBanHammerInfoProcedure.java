package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class DarkRegularHallowsBanHammerInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Dark Matter Hallow's Ban Hammer" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("darkregularhallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}