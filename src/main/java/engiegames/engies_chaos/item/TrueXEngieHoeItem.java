package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TrueXEngieHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 128000, 250f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:true_x_engie_hoe_repair_items")));

	public TrueXEngieHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2499f, 21f, properties);
	}
}