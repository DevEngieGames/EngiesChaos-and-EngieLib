/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import engiegames.engies_chaos.client.gui.XEngieGamesTradeUIPickerScreen;
import engiegames.engies_chaos.client.gui.UncommonTradeUIScreen;
import engiegames.engies_chaos.client.gui.TrashScreen;
import engiegames.engies_chaos.client.gui.TheEndTradeUIScreen;
import engiegames.engies_chaos.client.gui.SuperDoomsDayTradeUIScreen;
import engiegames.engies_chaos.client.gui.RoughianEngieGamesTradeUIScreen;
import engiegames.engies_chaos.client.gui.RegularMetalBundleUIScreen;
import engiegames.engies_chaos.client.gui.RecipeBookVol5GUIScreen;
import engiegames.engies_chaos.client.gui.RecipeBookVol3GUIScreen;
import engiegames.engies_chaos.client.gui.RecipeBookVol2GUIScreen;
import engiegames.engies_chaos.client.gui.RecipeBookVol1GUIScreen;
import engiegames.engies_chaos.client.gui.RareTradeUIScreen;
import engiegames.engies_chaos.client.gui.OutragedEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.MythicTradeUIScreen;
import engiegames.engies_chaos.client.gui.MonstrosityEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.MindscapeTradeUIScreen;
import engiegames.engies_chaos.client.gui.MetalChestUIScreen;
import engiegames.engies_chaos.client.gui.MetalBundleUIScreen;
import engiegames.engies_chaos.client.gui.LegendaryTradeUIScreen;
import engiegames.engies_chaos.client.gui.GearGiverScreen;
import engiegames.engies_chaos.client.gui.ExoticTradeUIScreen;
import engiegames.engies_chaos.client.gui.EpicTradeUIScreen;
import engiegames.engies_chaos.client.gui.EnragedEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.EngiesOwnEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.EngiesBirthdayBundleUIScreen;
import engiegames.engies_chaos.client.gui.EngieTradeUIScreen;
import engiegames.engies_chaos.client.gui.EngieGamesTradeUIScreen;
import engiegames.engies_chaos.client.gui.ETCEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.DoomsDayTradeUIScreen;
import engiegames.engies_chaos.client.gui.DeveloperModeGUIScreen;
import engiegames.engies_chaos.client.gui.DarkMatterMetalChestUIScreen;
import engiegames.engies_chaos.client.gui.CreativeEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.CosmicEngieGamesTradeUIScreen;
import engiegames.engies_chaos.client.gui.ConfigScreen;
import engiegames.engies_chaos.client.gui.CommonTradeUIScreen;
import engiegames.engies_chaos.client.gui.CodeRedemptionsScreen;
import engiegames.engies_chaos.client.gui.BirthdayBundleForYoungestUIScreen;
import engiegames.engies_chaos.client.gui.BiblicallyAccurateEngieBundleUIScreen;
import engiegames.engies_chaos.client.gui.AntimatterTheEndTradeUIScreen;
import engiegames.engies_chaos.client.gui.AntimatterSuperDoomsDayTradeUIScreen;
import engiegames.engies_chaos.client.gui.AntimatterMetalChestUIScreen;
import engiegames.engies_chaos.client.gui.AntimatterEngieTradeUIScreen;
import engiegames.engies_chaos.client.gui.AntimatterEngieGamesTradeUIScreen;
import engiegames.engies_chaos.client.gui.AntimatterDoomsDayTradeUIScreen;
import engiegames.engies_chaos.client.gui.AngryEngieBundleUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EngiesChaosModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EngiesChaosModMenus.METAL_CHEST_UI.get(), MetalChestUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ENGIE_BUNDLE_UI.get(), MetalBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANGRY_ENGIE_BUNDLE_UI.get(), AngryEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ENRAGED_ENGIE_BUNDLE_UI.get(), EnragedEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.OUTRAGED_ENGIE_BUNDLE_UI.get(), OutragedEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI.get(), BiblicallyAccurateEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.MONSTROSITY_ENGIE_BUNDLE_UI.get(), MonstrosityEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ETC_ENGIE_BUNDLE_UI.get(), ETCEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.CREATIVE_ENGIE_BUNDLE_UI.get(), CreativeEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ENGIES_OWN_ENGIE_BUNDLE_UI.get(), EngiesOwnEngieBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ENGIES_BIRTHDAY_BUNDLE_UI.get(), EngiesBirthdayBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.DOOMS_DAY_TRADE_UI.get(), DoomsDayTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.SUPER_DOOMS_DAY_TRADE_UI.get(), SuperDoomsDayTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.THE_END_TRADE_UI.get(), TheEndTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ENGIE_TRADE_UI.get(), EngieTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI.get(), BirthdayBundleForYoungestUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ENGIE_GAMES_TRADE_UI.get(), EngieGamesTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANTIMATTER_DOOMS_DAY_TRADE_UI.get(), AntimatterDoomsDayTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANTIMATTER_SUPER_DOOMS_DAY_TRADE_UI.get(), AntimatterSuperDoomsDayTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANTIMATTER_THE_END_TRADE_UI.get(), AntimatterTheEndTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANTIMATTER_ENGIE_TRADE_UI.get(), AntimatterEngieTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANTIMATTER_ENGIE_GAMES_TRADE_UI.get(), AntimatterEngieGamesTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ROUGHIAN_ENGIE_GAMES_TRADE_UI.get(), RoughianEngieGamesTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.COSMIC_ENGIE_GAMES_TRADE_UI.get(), CosmicEngieGamesTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.ANTIMATTER_METAL_CHEST_UI.get(), AntimatterMetalChestUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.MINDSCAPE_TRADE_UI.get(), MindscapeTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.REGULAR_METAL_BUNDLE_UI.get(), RegularMetalBundleUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.CONFIG.get(), ConfigScreen::new);
			MenuScreens.register(EngiesChaosModMenus.DEVELOPER_MODE_GUI.get(), DeveloperModeGUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.TRASH.get(), TrashScreen::new);
			MenuScreens.register(EngiesChaosModMenus.DARK_MATTER_METAL_CHEST_UI.get(), DarkMatterMetalChestUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.CODE_REDEMPTIONS.get(), CodeRedemptionsScreen::new);
			MenuScreens.register(EngiesChaosModMenus.GEAR_GIVER.get(), GearGiverScreen::new);
			MenuScreens.register(EngiesChaosModMenus.COMMON_TRADE_UI.get(), CommonTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.UNCOMMON_TRADE_UI.get(), UncommonTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.RARE_TRADE_UI.get(), RareTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.EPIC_TRADE_UI.get(), EpicTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.LEGENDARY_TRADE_UI.get(), LegendaryTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.MYTHIC_TRADE_UI.get(), MythicTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.EXOTIC_TRADE_UI.get(), ExoticTradeUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.X_ENGIE_GAMES_TRADE_UI_PICKER.get(), XEngieGamesTradeUIPickerScreen::new);
			MenuScreens.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_1_GUI.get(), RecipeBookVol1GUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_2_GUI.get(), RecipeBookVol2GUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_3_GUI.get(), RecipeBookVol3GUIScreen::new);
			MenuScreens.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_5_GUI.get(), RecipeBookVol5GUIScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}