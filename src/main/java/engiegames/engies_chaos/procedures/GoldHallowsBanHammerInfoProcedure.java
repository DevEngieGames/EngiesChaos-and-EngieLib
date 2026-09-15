package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class GoldHallowsBanHammerInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Golden Hallow's Ban Hammer" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("goldhallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}