package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DarkMatterDoomsDayAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 46000, 128f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:dark_matter_dooms_day_axe_repair_items")));

	public DarkMatterDoomsDayAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1849f, 13.8f, properties);
	}
}