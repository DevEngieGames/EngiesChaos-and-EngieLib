package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import engiegames.engieschaos.procedures.BrowniesOpenedRightclickedProcedure;
import engiegames.engieschaos.procedures.BrowniesOpenedInventoryTickProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;

public class BrowniesOpenedItem extends Item {
	public BrowniesOpenedItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BrowniesOpenedRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BrowniesOpenedRightclickedProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BrowniesOpenedInventoryTickProcedure.execute(entity);
	}
}