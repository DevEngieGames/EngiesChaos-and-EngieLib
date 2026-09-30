package engiegames.engies_chaos.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engies_chaos.procedures.TrueChaosMatterRightClickedProcedure;
import engiegames.engies_chaos.procedures.TrueChaosMatterItemInInventoryTickProcedure;
import engiegames.engies_chaos.procedures.TrueChaosMatterInfoProcedure;
import engiegames.engies_chaos.init.EngiesChaosModTabs;

public class TrueChaosMatterItem extends Item {
	public TrueChaosMatterItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		String hoverText = TrueChaosMatterInfoProcedure.execute(level instanceof Level ? (LevelAccessor) level : null);
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		TrueChaosMatterRightClickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TrueChaosMatterRightClickedProcedure.execute(context.getLevel(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TrueChaosMatterItemInInventoryTickProcedure.execute(world, entity, itemstack);
	}
}