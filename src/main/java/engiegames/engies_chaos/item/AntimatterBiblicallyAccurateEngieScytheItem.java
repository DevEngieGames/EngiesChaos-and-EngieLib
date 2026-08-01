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

import engiegames.engies_chaos.procedures.BiblicallyAccurateBanObtainProProcedure;

public class AntimatterBiblicallyAccurateEngieScytheItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 47400, 10f, 0, 22,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:antimatter_biblically_accurate_engie_scythe_repair_items")));

	public AntimatterBiblicallyAccurateEngieScytheItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6999f, -2.75f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BiblicallyAccurateBanObtainProProcedure.execute(world, entity, itemstack);
	}
}