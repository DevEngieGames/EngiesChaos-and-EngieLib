package engiegames.engies_chaos.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import javax.annotation.Nonnull;

import engiegames.engies_chaos.world.inventory.BirthdayBundleForYoungestUIMenu;
import engiegames.engies_chaos.init.EngiesChaosModItems;

@EventBusSubscriber
public class EngieBirthdayBundleForYoungestInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == EngiesChaosModItems.ENGIE_BIRTHDAY_BUNDLE_FOR_YOUNGEST.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof BirthdayBundleForYoungestUIMenu)
				player.closeContainer();
		}
	}

	public EngieBirthdayBundleForYoungestInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 105);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != EngiesChaosModItems.ENGIE_BIRTHDAY_BUNDLE_FOR_YOUNGEST.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}