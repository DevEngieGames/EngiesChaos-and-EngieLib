package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DarkMatterOutragedEngieShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 43000, 116f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:dark_matter_outraged_engie_shovel_repair_items")));

	public DarkMatterOutragedEngieShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1674f, 12.6f, properties);
	}
}