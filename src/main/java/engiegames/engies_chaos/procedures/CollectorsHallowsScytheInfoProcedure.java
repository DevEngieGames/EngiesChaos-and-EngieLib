package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class CollectorsHallowsScytheInfoProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Collectors Hallow's Scythe" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("collectorshallowskillcount")) + " - ("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/525)";
	}
}