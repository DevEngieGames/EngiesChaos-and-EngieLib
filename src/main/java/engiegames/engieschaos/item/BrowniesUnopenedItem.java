package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import engiegames.engieschaos.procedures.BrowniesUnopenedRightclickedProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;

public class BrowniesUnopenedItem extends Item {
	public BrowniesUnopenedItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_AAE_ITEMS_FOOD));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BrowniesUnopenedRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BrowniesUnopenedRightclickedProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}