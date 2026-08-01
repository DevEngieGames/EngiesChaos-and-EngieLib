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

import engiegames.engies_chaos.procedures.CosmicEngieGamesToolObtainProcedure;

public class CosmicEngieGamesShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 75000, 100f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:cosmic_engie_games_shovel_repair_items")));

	public CosmicEngieGamesShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1074f, 6.2f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CosmicEngieGamesToolObtainProcedure.execute(entity);
	}
}