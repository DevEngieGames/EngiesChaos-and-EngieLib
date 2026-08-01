package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DarkMatterEngieGamesPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 50000, 144f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:dark_matter_engie_games_pickaxe_repair_items")));

	public DarkMatterEngieGamesPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2024f, 15.4f, properties);
	}
}