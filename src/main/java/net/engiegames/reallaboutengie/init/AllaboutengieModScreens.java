/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.engiegames.reallaboutengie.client.gui.TheEndTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.SuperDoomsDayTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.RoughianEngieGamesTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.RegularMetalBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.OutragedEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.MonstrosityEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.MindscapeTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.MetalChestUIScreen;
import net.engiegames.reallaboutengie.client.gui.MetalBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.EnragedEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.EngiesOwnEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.EngiesBirthdayBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.EngieTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.EngieGamesTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.ETCEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.DoomsDayTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.CustomRecipeBookScreen;
import net.engiegames.reallaboutengie.client.gui.CreativeEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.CosmicEngieGamesTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.BirthdayBundleForYoungestUIScreen;
import net.engiegames.reallaboutengie.client.gui.BiblicallyAccurateEngieBundleUIScreen;
import net.engiegames.reallaboutengie.client.gui.AntimatterTheEndTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.AntimatterSuperDoomsDayTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.AntimatterMetalChestUIScreen;
import net.engiegames.reallaboutengie.client.gui.AntimatterEngieTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.AntimatterEngieGamesTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.AntimatterDoomsDayTradeUIScreen;
import net.engiegames.reallaboutengie.client.gui.AngryEngieBundleUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllaboutengieModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AllaboutengieModMenus.METAL_CHEST_UI.get(), MetalChestUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIE_BUNDLE_UI.get(), MetalBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANGRY_ENGIE_BUNDLE_UI.get(), AngryEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENRAGED_ENGIE_BUNDLE_UI.get(), EnragedEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.OUTRAGED_ENGIE_BUNDLE_UI.get(), OutragedEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI.get(), BiblicallyAccurateEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.MONSTROSITY_ENGIE_BUNDLE_UI.get(), MonstrosityEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ETC_ENGIE_BUNDLE_UI.get(), ETCEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.CREATIVE_ENGIE_BUNDLE_UI.get(), CreativeEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIES_OWN_ENGIE_BUNDLE_UI.get(), EngiesOwnEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIES_BIRTHDAY_BUNDLE_UI.get(), EngiesBirthdayBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.DOOMS_DAY_TRADE_UI.get(), DoomsDayTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.SUPER_DOOMS_DAY_TRADE_UI.get(), SuperDoomsDayTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.THE_END_TRADE_UI.get(), TheEndTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIE_TRADE_UI.get(), EngieTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI.get(), BirthdayBundleForYoungestUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.CUSTOM_RECIPE_BOOK.get(), CustomRecipeBookScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIE_GAMES_TRADE_UI.get(), EngieGamesTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANTIMATTER_DOOMS_DAY_TRADE_UI.get(), AntimatterDoomsDayTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANTIMATTER_SUPER_DOOMS_DAY_TRADE_UI.get(), AntimatterSuperDoomsDayTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANTIMATTER_THE_END_TRADE_UI.get(), AntimatterTheEndTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANTIMATTER_ENGIE_TRADE_UI.get(), AntimatterEngieTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANTIMATTER_ENGIE_GAMES_TRADE_UI.get(), AntimatterEngieGamesTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ROUGHIAN_ENGIE_GAMES_TRADE_UI.get(), RoughianEngieGamesTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.COSMIC_ENGIE_GAMES_TRADE_UI.get(), CosmicEngieGamesTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANTIMATTER_METAL_CHEST_UI.get(), AntimatterMetalChestUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.MINDSCAPE_TRADE_UI.get(), MindscapeTradeUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.REGULAR_METAL_BUNDLE_UI.get(), RegularMetalBundleUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}