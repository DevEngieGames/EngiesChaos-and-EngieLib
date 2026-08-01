package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CodeRedeemersScytheItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 19200, 20f, 0, 30, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:code_redeemers_scythe_repair_items")));

	public CodeRedeemersScytheItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3999f, -3f, properties);
	}
}