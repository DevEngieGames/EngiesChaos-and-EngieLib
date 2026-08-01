package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.procedures.RoughianEngieGamesToolObtainProcedure;

public class RoughianEngieGamesHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 35000, 125f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:roughian_engie_games_hoe_repair_items")));

	public RoughianEngieGamesHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1499f, 11f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		RoughianEngieGamesToolObtainProcedure.execute(entity);
	}
}