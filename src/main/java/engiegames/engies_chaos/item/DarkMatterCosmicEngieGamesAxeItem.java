package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DarkMatterCosmicEngieGamesAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 51000, 148f, 0, 22,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:dark_matter_cosmic_engie_games_axe_repair_items")));

	public DarkMatterCosmicEngieGamesAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2099f, 15.8f, properties);
	}
}