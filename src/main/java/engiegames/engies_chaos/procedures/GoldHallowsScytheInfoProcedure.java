package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class GoldHallowsScytheInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Golden Hallow's Scythe" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("goldhallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}