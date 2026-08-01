package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SmallBanHammerItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 400, 4f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:small_ban_hammer_repair_items")));

	public SmallBanHammerItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 99f, -3f, properties);
	}
}