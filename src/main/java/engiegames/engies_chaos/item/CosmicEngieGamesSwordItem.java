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

import engiegames.engies_chaos.procedures.CosmicEngieSwordsTickProcedure;

public class CosmicEngieGamesSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 72400, 96f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:cosmic_engie_games_sword_repair_items")));

	public CosmicEngieGamesSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8749f, -3f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CosmicEngieSwordsTickProcedure.execute(world, entity, itemstack);
	}
}