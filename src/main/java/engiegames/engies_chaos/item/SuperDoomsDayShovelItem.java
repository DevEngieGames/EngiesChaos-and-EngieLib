package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.procedures.SuperDoomsDayToolObtainProcedure;

public class SuperDoomsDayShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6000, 36f, 0, 12, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:super_dooms_day_shovel_repair_items")));

	public SuperDoomsDayShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 274f, -0.2f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SuperDoomsDayToolObtainProcedure.execute(entity, itemstack);
	}
}