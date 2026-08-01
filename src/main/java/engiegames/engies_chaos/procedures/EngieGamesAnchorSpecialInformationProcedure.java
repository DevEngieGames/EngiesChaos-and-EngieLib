package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;

public class EngieGamesAnchorSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "EngieGames's Roughian Anchor" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("engiegameshallowscythestatclockcount"))
				+ (" - (" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("countuntilbasedrop")) + "/" + "525" + ")");
	}
}