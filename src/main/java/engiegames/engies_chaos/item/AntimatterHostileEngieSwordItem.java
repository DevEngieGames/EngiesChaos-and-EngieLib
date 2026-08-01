package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.procedures.HostileEngieToolObtainProcedure;

public class AntimatterHostileEngieSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 16500, 78.5f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:antimatter_hostile_engie_sword_repair_items")));

	public AntimatterHostileEngieSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 824f, 4f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HostileEngieToolObtainProcedure.execute(entity, itemstack);
	}
}