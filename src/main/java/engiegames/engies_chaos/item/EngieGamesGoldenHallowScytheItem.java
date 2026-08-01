package engiegames.engies_chaos.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import java.util.List;

import engiegames.engies_chaos.procedures.EngieGamesHallowScytheSpecialInformationProcedure;
import engiegames.engies_chaos.procedures.EngieGamesGoldenHallowScytheToolInHandTickProcedure;

public class EngieGamesGoldenHallowScytheItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 72800, 125f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:engie_games_golden_hallow_scythe_repair_items")));

	public EngieGamesGoldenHallowScytheItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9249f, -3f, properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		Entity entity = itemstack.getEntityRepresentation() != null ? itemstack.getEntityRepresentation() : Minecraft.getInstance().player;
		String hoverText = EngieGamesHallowScytheSpecialInformationProcedure.execute(itemstack);
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EngieGamesGoldenHallowScytheToolInHandTickProcedure.execute(world, entity, itemstack);
	}
}