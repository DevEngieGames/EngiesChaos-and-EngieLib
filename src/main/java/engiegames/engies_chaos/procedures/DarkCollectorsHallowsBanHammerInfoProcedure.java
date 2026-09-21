package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class DarkCollectorsHallowsBanHammerInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Dark Matter Collectors Hallow's Ban Hammer" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("darkcollectorshallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}