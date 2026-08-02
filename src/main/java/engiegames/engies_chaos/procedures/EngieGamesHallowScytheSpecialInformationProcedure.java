package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class EngieGamesHallowScytheSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "Hallow Scythe" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount")) + "("
				+ new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("engiegameshallowbasecount")) + "/525)";
	}
}