package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ThrowbackBigBanHammerItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1200, 4f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:throwback_big_ban_hammer_repair_items")));

	public ThrowbackBigBanHammerItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 299f, -3f, properties);
	}
}