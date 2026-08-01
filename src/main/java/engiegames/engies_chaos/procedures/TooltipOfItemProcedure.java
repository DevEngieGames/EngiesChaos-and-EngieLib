package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class TooltipOfItemProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.is(ItemTags.create(new ResourceLocation("minecraft:tools"))) || itemstack.is(ItemTags.create(new ResourceLocation("engies_chaos:crucifixes"))) || itemstack.is(ItemTags.create(new ResourceLocation("minecraft:armor")))) {
			if (Screen.hasShiftDown()) {
				tooltip.add(1, Component.literal(("\u00A76Durability: " + (itemstack.getMaxDamage() - itemstack.getDamageValue()) + "/" + itemstack.getMaxDamage())));
			} else {
				tooltip.add(1, Component.literal("\u00A76Press Shift to view the durability of this item..."));
			}
		}
	}
}