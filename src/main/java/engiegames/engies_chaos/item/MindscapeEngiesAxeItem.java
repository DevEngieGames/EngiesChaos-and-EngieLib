package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.procedures.MindscapeEngieGamesToolObtainProcedure;

public class MindscapeEngiesAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 48f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:mindscape_engies_axe_repair_items")));

	public MindscapeEngiesAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 499f, 1.4f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MindscapeEngieGamesToolObtainProcedure.execute(entity);
	}
}