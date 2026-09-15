package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class RegularHallowsScytheInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Hallow's Scythe" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("regularhallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}