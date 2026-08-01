package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ThrowbackBanHammerItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 800, 4f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:throwback_ban_hammer_repair_items")));

	public ThrowbackBanHammerItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 199f, -3f, properties);
	}
}