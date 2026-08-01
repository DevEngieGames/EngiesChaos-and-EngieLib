package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class EngieGamesHallowScytheSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A78" + "EngieGames's Hallow Scythe" + " - Kills: " + new java.text.DecimalFormat("##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount"))
				+ (" - (" + new java.text.DecimalFormat("##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("countuntilbasedrop")) + "/" + "525" + ")");
	}
}