package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class UncommonSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:uncommon_sword_repair_items")));

	public UncommonSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -2.4f, properties);
	}
}