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

import engiegames.engies_chaos.procedures.AngryEngieToolObtainProcedure;

public class AngryEngieAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1000, 16f, 0, 6, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:angry_engie_axe_repair_items")));

	public AngryEngieAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 49f, -2.6f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AngryEngieToolObtainProcedure.execute(entity, itemstack);
	}
}