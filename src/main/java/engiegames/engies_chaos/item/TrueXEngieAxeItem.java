package engiegames.engies_chaos.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TrueXEngieAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 128000, 250f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:true_x_engie_axe_repair_items")));

	public TrueXEngieAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2499f, 21f, properties);
	}
}