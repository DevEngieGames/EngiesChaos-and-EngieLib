package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DarkMatterBiblicallyAccurateEngieSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 44000, 120f, 0, 22,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:dark_matter_biblically_accurate_engie_sword_repair_items")));

	public DarkMatterBiblicallyAccurateEngieSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1749f, 13f, properties);
	}
}