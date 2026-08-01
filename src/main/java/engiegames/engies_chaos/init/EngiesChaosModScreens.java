/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

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

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EngiesChaosModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(EngiesChaosModMenus.METAL_CHEST_UI.get(), MetalChestUIScreen::new);
		event.register(EngiesChaosModMenus.ENGIE_BUNDLE_UI.get(), MetalBundleUIScreen::new);
		event.register(EngiesChaosModMenus.ANGRY_ENGIE_BUNDLE_UI.get(), AngryEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.ENRAGED_ENGIE_BUNDLE_UI.get(), EnragedEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.OUTRAGED_ENGIE_BUNDLE_UI.get(), OutragedEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI.get(), BiblicallyAccurateEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.MONSTROSITY_ENGIE_BUNDLE_UI.get(), MonstrosityEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.ETC_ENGIE_BUNDLE_UI.get(), ETCEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.CREATIVE_ENGIE_BUNDLE_UI.get(), CreativeEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.ENGIES_OWN_ENGIE_BUNDLE_UI.get(), EngiesOwnEngieBundleUIScreen::new);
		event.register(EngiesChaosModMenus.ENGIES_BIRTHDAY_BUNDLE_UI.get(), EngiesBirthdayBundleUIScreen::new);
		event.register(EngiesChaosModMenus.DOOMS_DAY_TRADE_UI.get(), DoomsDayTradeUIScreen::new);
		event.register(EngiesChaosModMenus.SUPER_DOOMS_DAY_TRADE_UI.get(), SuperDoomsDayTradeUIScreen::new);
		event.register(EngiesChaosModMenus.THE_END_TRADE_UI.get(), TheEndTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ENGIE_TRADE_UI.get(), EngieTradeUIScreen::new);
		event.register(EngiesChaosModMenus.BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI.get(), BirthdayBundleForYoungestUIScreen::new);
		event.register(EngiesChaosModMenus.ENGIE_GAMES_TRADE_UI.get(), EngieGamesTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ANTIMATTER_DOOMS_DAY_TRADE_UI.get(), AntimatterDoomsDayTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ANTIMATTER_SUPER_DOOMS_DAY_TRADE_UI.get(), AntimatterSuperDoomsDayTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ANTIMATTER_THE_END_TRADE_UI.get(), AntimatterTheEndTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ANTIMATTER_ENGIE_TRADE_UI.get(), AntimatterEngieTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ANTIMATTER_ENGIE_GAMES_TRADE_UI.get(), AntimatterEngieGamesTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ROUGHIAN_ENGIE_GAMES_TRADE_UI.get(), RoughianEngieGamesTradeUIScreen::new);
		event.register(EngiesChaosModMenus.COSMIC_ENGIE_GAMES_TRADE_UI.get(), CosmicEngieGamesTradeUIScreen::new);
		event.register(EngiesChaosModMenus.ANTIMATTER_METAL_CHEST_UI.get(), AntimatterMetalChestUIScreen::new);
		event.register(EngiesChaosModMenus.MINDSCAPE_TRADE_UI.get(), MindscapeTradeUIScreen::new);
		event.register(EngiesChaosModMenus.REGULAR_METAL_BUNDLE_UI.get(), RegularMetalBundleUIScreen::new);
		event.register(EngiesChaosModMenus.CONFIG.get(), ConfigScreen::new);
		event.register(EngiesChaosModMenus.DEVELOPER_MODE_GUI.get(), DeveloperModeGUIScreen::new);
		event.register(EngiesChaosModMenus.TRASH.get(), TrashScreen::new);
		event.register(EngiesChaosModMenus.DARK_MATTER_METAL_CHEST_UI.get(), DarkMatterMetalChestUIScreen::new);
		event.register(EngiesChaosModMenus.CODE_REDEMPTIONS.get(), CodeRedemptionsScreen::new);
		event.register(EngiesChaosModMenus.GEAR_GIVER.get(), GearGiverScreen::new);
		event.register(EngiesChaosModMenus.COMMON_TRADE_UI.get(), CommonTradeUIScreen::new);
		event.register(EngiesChaosModMenus.UNCOMMON_TRADE_UI.get(), UncommonTradeUIScreen::new);
		event.register(EngiesChaosModMenus.RARE_TRADE_UI.get(), RareTradeUIScreen::new);
		event.register(EngiesChaosModMenus.EPIC_TRADE_UI.get(), EpicTradeUIScreen::new);
		event.register(EngiesChaosModMenus.LEGENDARY_TRADE_UI.get(), LegendaryTradeUIScreen::new);
		event.register(EngiesChaosModMenus.MYTHIC_TRADE_UI.get(), MythicTradeUIScreen::new);
		event.register(EngiesChaosModMenus.EXOTIC_TRADE_UI.get(), ExoticTradeUIScreen::new);
		event.register(EngiesChaosModMenus.X_ENGIE_GAMES_TRADE_UI_PICKER.get(), XEngieGamesTradeUIPickerScreen::new);
		event.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_1_GUI.get(), RecipeBookVol1GUIScreen::new);
		event.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_2_GUI.get(), RecipeBookVol2GUIScreen::new);
		event.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_3_GUI.get(), RecipeBookVol3GUIScreen::new);
		event.register(EngiesChaosModMenus.RECIPE_BOOK_VOL_5_GUI.get(), RecipeBookVol5GUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}