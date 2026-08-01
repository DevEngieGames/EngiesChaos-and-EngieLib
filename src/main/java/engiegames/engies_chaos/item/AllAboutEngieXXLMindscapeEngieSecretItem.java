package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engies_chaos.procedures.AllAboutEngieXXLMindscapeEngieSecretItemInInventoryTickProcedure;

public class AllAboutEngieXXLMindscapeEngieSecretItem extends Item {
	public AllAboutEngieXXLMindscapeEngieSecretItem() {
		super(new Item.Properties().tab(null).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.engies_chaos.xxl_mindscape_engie_secret.description_0"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AllAboutEngieXXLMindscapeEngieSecretItemInInventoryTickProcedure.execute(entity);
	}
}