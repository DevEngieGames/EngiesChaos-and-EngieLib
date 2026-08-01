package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import engiegames.engieschaos.init.EngiesChaosModTabs;

public class DarkMatterBiblicallyAccurateEngieEssenceItem extends Item {
	public DarkMatterBiblicallyAccurateEngieEssenceItem() {
		super(new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.engies_chaos.dark_matter_biblically_accurate_engie_essence.description_0"));
	}
}