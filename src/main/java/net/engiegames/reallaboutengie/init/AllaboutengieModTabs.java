/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AllaboutengieModTabs {
	public static CreativeModeTab TAB_AAE_ITEMS_ITEMS;
	public static CreativeModeTab TAB_BAN_HAMMERS;
	public static CreativeModeTab TAB_AAE_ITEMS_ARMOR;
	public static CreativeModeTab TAB_AAE_ITEMS_FOOD;
	public static CreativeModeTab TAB_SHARKOS;
	public static CreativeModeTab TAB_MOBS;
	public static CreativeModeTab TAB_ZOMBIES;

	public static void load() {
		TAB_AAE_ITEMS_ITEMS = new CreativeModeTab("allaboutengie.aae_items_items") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.ENGIE_GEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BAN_HAMMERS = new CreativeModeTab("allaboutengie.ban_hammers") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.BAN_HAMMER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_ARMOR = new CreativeModeTab("allaboutengie.aae_items_armor") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_FOOD = new CreativeModeTab("allaboutengie.aae_items_food") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.COOKED_PIZZA.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SHARKOS = new CreativeModeTab("allaboutengie.sharkos") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(Items.COOKIE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MOBS = new CreativeModeTab("allaboutengie.mobs") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.AAE_ENGIE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZOMBIES = new CreativeModeTab("allaboutengie.zombies") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.ENRAGED_ZOMBIES_PLAQUE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}