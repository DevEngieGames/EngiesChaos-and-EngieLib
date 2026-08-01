package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.procedures.AngryEngieToolObtainProcedure;

public class AntimatterAngryEngiePickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12000, 60f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:antimatter_angry_engie_pickaxe_repair_items")));

	public AntimatterAngryEngiePickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 574f, 2.2f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AngryEngieToolObtainProcedure.execute(entity, itemstack);
	}
}