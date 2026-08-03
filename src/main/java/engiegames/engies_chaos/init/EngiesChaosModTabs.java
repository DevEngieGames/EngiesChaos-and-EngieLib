/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EngiesChaosModTabs {
	public static CreativeModeTab TAB_ENGIES_CHAOS_WEAPONS;
	public static CreativeModeTab TAB_ENGIES_CHAOS_ITEMS;
	public static CreativeModeTab TAB_ENGIES_CHAOS_ARMOR;
	public static CreativeModeTab TAB_ENGIES_CHAOS_MOBS;
	public static CreativeModeTab TAB_ENGIES_CHAOS_SHARKOS;
	public static CreativeModeTab TAB_ENGIES_CHAOS_ZOMBIES;
	public static CreativeModeTab TAB_ENGIES_CHAOS_FOOD;

	public static void load() {
		TAB_ENGIES_CHAOS_WEAPONS = new CreativeModeTab("engies_chaos.engies_chaos_weapons") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(EngiesChaosModItems.BAN_HAMMER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ENGIES_CHAOS_ITEMS = new CreativeModeTab("engies_chaos.engies_chaos_items") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(EngiesChaosModItems.ENGIE_GEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ENGIES_CHAOS_ARMOR = new CreativeModeTab("engies_chaos.engies_chaos_armor") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(EngiesChaosModItems.TRUE_X_ENGIE_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ENGIES_CHAOS_MOBS = new CreativeModeTab("engies_chaos.engies_chaos_mobs") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(EngiesChaosModItems.AAE_ENGIE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ENGIES_CHAOS_SHARKOS = new CreativeModeTab("engies_chaos.engies_chaos_sharkos") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(Items.COOKIE);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ENGIES_CHAOS_ZOMBIES = new CreativeModeTab("engies_chaos.engies_chaos_zombies") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(EngiesChaosModItems.ENRAGED_ZOMBIES_PLAQUE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ENGIES_CHAOS_FOOD = new CreativeModeTab("engies_chaos.engies_chaos_food") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(EngiesChaosModItems.PIZZA_SLICE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}