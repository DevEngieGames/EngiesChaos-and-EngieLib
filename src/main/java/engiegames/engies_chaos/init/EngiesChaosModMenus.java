/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import java.util.Map;

import engiegames.engies_chaos.world.inventory.XEngieGamesTradeUIPickerMenu;
import engiegames.engies_chaos.world.inventory.UncommonTradeUIMenu;
import engiegames.engies_chaos.world.inventory.TrashMenu;
import engiegames.engies_chaos.world.inventory.TheEndTradeUIMenu;
import engiegames.engies_chaos.world.inventory.SuperDoomsDayTradeUIMenu;
import engiegames.engies_chaos.world.inventory.RoughianEngieGamesTradeUIMenu;
import engiegames.engies_chaos.world.inventory.RegularMetalBundleUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol5GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol3GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol2GUIMenu;
import engiegames.engies_chaos.world.inventory.RecipeBookVol1GUIMenu;
import engiegames.engies_chaos.world.inventory.RareTradeUIMenu;
import engiegames.engies_chaos.world.inventory.OutragedEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.MythicTradeUIMenu;
import engiegames.engies_chaos.world.inventory.MonstrosityEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.MindscapeTradeUIMenu;
import engiegames.engies_chaos.world.inventory.MetalChestUIMenu;
import engiegames.engies_chaos.world.inventory.MetalBundleUIMenu;
import engiegames.engies_chaos.world.inventory.LegendaryTradeUIMenu;
import engiegames.engies_chaos.world.inventory.GearGiverMenu;
import engiegames.engies_chaos.world.inventory.ExoticTradeUIMenu;
import engiegames.engies_chaos.world.inventory.EpicTradeUIMenu;
import engiegames.engies_chaos.world.inventory.EnragedEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.EngiesOwnEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.EngiesBirthdayBundleUIMenu;
import engiegames.engies_chaos.world.inventory.EngieTradeUIMenu;
import engiegames.engies_chaos.world.inventory.EngieGamesTradeUIMenu;
import engiegames.engies_chaos.world.inventory.ETCEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.DoomsDayTradeUIMenu;
import engiegames.engies_chaos.world.inventory.DeveloperModeGUIMenu;
import engiegames.engies_chaos.world.inventory.DarkMatterMetalChestUIMenu;
import engiegames.engies_chaos.world.inventory.CreativeEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.CosmicEngieGamesTradeUIMenu;
import engiegames.engies_chaos.world.inventory.ConfigMenu;
import engiegames.engies_chaos.world.inventory.CommonTradeUIMenu;
import engiegames.engies_chaos.world.inventory.CodeRedemptionsMenu;
import engiegames.engies_chaos.world.inventory.BirthdayBundleForYoungestUIMenu;
import engiegames.engies_chaos.world.inventory.BiblicallyAccurateEngieBundleUIMenu;
import engiegames.engies_chaos.world.inventory.AntimatterTheEndTradeUIMenu;
import engiegames.engies_chaos.world.inventory.AntimatterSuperDoomsDayTradeUIMenu;
import engiegames.engies_chaos.world.inventory.AntimatterMetalChestUIMenu;
import engiegames.engies_chaos.world.inventory.AntimatterEngieTradeUIMenu;
import engiegames.engies_chaos.world.inventory.AntimatterEngieGamesTradeUIMenu;
import engiegames.engies_chaos.world.inventory.AntimatterDoomsDayTradeUIMenu;
import engiegames.engies_chaos.world.inventory.AngryEngieBundleUIMenu;
import engiegames.engies_chaos.network.MenuStateUpdateMessage;
import engiegames.engies_chaos.EngiesChaosMod;

public class EngiesChaosModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EngiesChaosMod.MODID);
	public static final RegistryObject<MenuType<MetalChestUIMenu>> METAL_CHEST_UI = REGISTRY.register("metal_chest_ui", () -> IForgeMenuType.create(MetalChestUIMenu::new));
	public static final RegistryObject<MenuType<MetalBundleUIMenu>> ENGIE_BUNDLE_UI = REGISTRY.register("engie_bundle_ui", () -> IForgeMenuType.create(MetalBundleUIMenu::new));
	public static final RegistryObject<MenuType<AngryEngieBundleUIMenu>> ANGRY_ENGIE_BUNDLE_UI = REGISTRY.register("angry_engie_bundle_ui", () -> IForgeMenuType.create(AngryEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<EnragedEngieBundleUIMenu>> ENRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("enraged_engie_bundle_ui", () -> IForgeMenuType.create(EnragedEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<OutragedEngieBundleUIMenu>> OUTRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("outraged_engie_bundle_ui", () -> IForgeMenuType.create(OutragedEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<BiblicallyAccurateEngieBundleUIMenu>> BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI = REGISTRY.register("biblically_accurate_engie_bundle_ui",
			() -> IForgeMenuType.create(BiblicallyAccurateEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<MonstrosityEngieBundleUIMenu>> MONSTROSITY_ENGIE_BUNDLE_UI = REGISTRY.register("monstrosity_engie_bundle_ui", () -> IForgeMenuType.create(MonstrosityEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<ETCEngieBundleUIMenu>> ETC_ENGIE_BUNDLE_UI = REGISTRY.register("etc_engie_bundle_ui", () -> IForgeMenuType.create(ETCEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<CreativeEngieBundleUIMenu>> CREATIVE_ENGIE_BUNDLE_UI = REGISTRY.register("creative_engie_bundle_ui", () -> IForgeMenuType.create(CreativeEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<EngiesOwnEngieBundleUIMenu>> ENGIES_OWN_ENGIE_BUNDLE_UI = REGISTRY.register("engies_own_engie_bundle_ui", () -> IForgeMenuType.create(EngiesOwnEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<EngiesBirthdayBundleUIMenu>> ENGIES_BIRTHDAY_BUNDLE_UI = REGISTRY.register("engies_birthday_bundle_ui", () -> IForgeMenuType.create(EngiesBirthdayBundleUIMenu::new));
	public static final RegistryObject<MenuType<DoomsDayTradeUIMenu>> DOOMS_DAY_TRADE_UI = REGISTRY.register("dooms_day_trade_ui", () -> IForgeMenuType.create(DoomsDayTradeUIMenu::new));
	public static final RegistryObject<MenuType<SuperDoomsDayTradeUIMenu>> SUPER_DOOMS_DAY_TRADE_UI = REGISTRY.register("super_dooms_day_trade_ui", () -> IForgeMenuType.create(SuperDoomsDayTradeUIMenu::new));
	public static final RegistryObject<MenuType<TheEndTradeUIMenu>> THE_END_TRADE_UI = REGISTRY.register("the_end_trade_ui", () -> IForgeMenuType.create(TheEndTradeUIMenu::new));
	public static final RegistryObject<MenuType<EngieTradeUIMenu>> ENGIE_TRADE_UI = REGISTRY.register("engie_trade_ui", () -> IForgeMenuType.create(EngieTradeUIMenu::new));
	public static final RegistryObject<MenuType<BirthdayBundleForYoungestUIMenu>> BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI = REGISTRY.register("birthday_bundle_for_youngest_ui", () -> IForgeMenuType.create(BirthdayBundleForYoungestUIMenu::new));
	public static final RegistryObject<MenuType<EngieGamesTradeUIMenu>> ENGIE_GAMES_TRADE_UI = REGISTRY.register("engie_games_trade_ui", () -> IForgeMenuType.create(EngieGamesTradeUIMenu::new));
	public static final RegistryObject<MenuType<AntimatterDoomsDayTradeUIMenu>> ANTIMATTER_DOOMS_DAY_TRADE_UI = REGISTRY.register("antimatter_dooms_day_trade_ui", () -> IForgeMenuType.create(AntimatterDoomsDayTradeUIMenu::new));
	public static final RegistryObject<MenuType<AntimatterSuperDoomsDayTradeUIMenu>> ANTIMATTER_SUPER_DOOMS_DAY_TRADE_UI = REGISTRY.register("antimatter_super_dooms_day_trade_ui", () -> IForgeMenuType.create(AntimatterSuperDoomsDayTradeUIMenu::new));
	public static final RegistryObject<MenuType<AntimatterTheEndTradeUIMenu>> ANTIMATTER_THE_END_TRADE_UI = REGISTRY.register("antimatter_the_end_trade_ui", () -> IForgeMenuType.create(AntimatterTheEndTradeUIMenu::new));
	public static final RegistryObject<MenuType<AntimatterEngieTradeUIMenu>> ANTIMATTER_ENGIE_TRADE_UI = REGISTRY.register("antimatter_engie_trade_ui", () -> IForgeMenuType.create(AntimatterEngieTradeUIMenu::new));
	public static final RegistryObject<MenuType<AntimatterEngieGamesTradeUIMenu>> ANTIMATTER_ENGIE_GAMES_TRADE_UI = REGISTRY.register("antimatter_engie_games_trade_ui", () -> IForgeMenuType.create(AntimatterEngieGamesTradeUIMenu::new));
	public static final RegistryObject<MenuType<RoughianEngieGamesTradeUIMenu>> ROUGHIAN_ENGIE_GAMES_TRADE_UI = REGISTRY.register("roughian_engie_games_trade_ui", () -> IForgeMenuType.create(RoughianEngieGamesTradeUIMenu::new));
	public static final RegistryObject<MenuType<CosmicEngieGamesTradeUIMenu>> COSMIC_ENGIE_GAMES_TRADE_UI = REGISTRY.register("cosmic_engie_games_trade_ui", () -> IForgeMenuType.create(CosmicEngieGamesTradeUIMenu::new));
	public static final RegistryObject<MenuType<AntimatterMetalChestUIMenu>> ANTIMATTER_METAL_CHEST_UI = REGISTRY.register("antimatter_metal_chest_ui", () -> IForgeMenuType.create(AntimatterMetalChestUIMenu::new));
	public static final RegistryObject<MenuType<MindscapeTradeUIMenu>> MINDSCAPE_TRADE_UI = REGISTRY.register("mindscape_trade_ui", () -> IForgeMenuType.create(MindscapeTradeUIMenu::new));
	public static final RegistryObject<MenuType<RegularMetalBundleUIMenu>> REGULAR_METAL_BUNDLE_UI = REGISTRY.register("regular_metal_bundle_ui", () -> IForgeMenuType.create(RegularMetalBundleUIMenu::new));
	public static final RegistryObject<MenuType<ConfigMenu>> CONFIG = REGISTRY.register("config", () -> IForgeMenuType.create(ConfigMenu::new));
	public static final RegistryObject<MenuType<DeveloperModeGUIMenu>> DEVELOPER_MODE_GUI = REGISTRY.register("developer_mode_gui", () -> IForgeMenuType.create(DeveloperModeGUIMenu::new));
	public static final RegistryObject<MenuType<TrashMenu>> TRASH = REGISTRY.register("trash", () -> IForgeMenuType.create(TrashMenu::new));
	public static final RegistryObject<MenuType<DarkMatterMetalChestUIMenu>> DARK_MATTER_METAL_CHEST_UI = REGISTRY.register("dark_matter_metal_chest_ui", () -> IForgeMenuType.create(DarkMatterMetalChestUIMenu::new));
	public static final RegistryObject<MenuType<CodeRedemptionsMenu>> CODE_REDEMPTIONS = REGISTRY.register("code_redemptions", () -> IForgeMenuType.create(CodeRedemptionsMenu::new));
	public static final RegistryObject<MenuType<GearGiverMenu>> GEAR_GIVER = REGISTRY.register("gear_giver", () -> IForgeMenuType.create(GearGiverMenu::new));
	public static final RegistryObject<MenuType<CommonTradeUIMenu>> COMMON_TRADE_UI = REGISTRY.register("common_trade_ui", () -> IForgeMenuType.create(CommonTradeUIMenu::new));
	public static final RegistryObject<MenuType<UncommonTradeUIMenu>> UNCOMMON_TRADE_UI = REGISTRY.register("uncommon_trade_ui", () -> IForgeMenuType.create(UncommonTradeUIMenu::new));
	public static final RegistryObject<MenuType<RareTradeUIMenu>> RARE_TRADE_UI = REGISTRY.register("rare_trade_ui", () -> IForgeMenuType.create(RareTradeUIMenu::new));
	public static final RegistryObject<MenuType<EpicTradeUIMenu>> EPIC_TRADE_UI = REGISTRY.register("epic_trade_ui", () -> IForgeMenuType.create(EpicTradeUIMenu::new));
	public static final RegistryObject<MenuType<LegendaryTradeUIMenu>> LEGENDARY_TRADE_UI = REGISTRY.register("legendary_trade_ui", () -> IForgeMenuType.create(LegendaryTradeUIMenu::new));
	public static final RegistryObject<MenuType<MythicTradeUIMenu>> MYTHIC_TRADE_UI = REGISTRY.register("mythic_trade_ui", () -> IForgeMenuType.create(MythicTradeUIMenu::new));
	public static final RegistryObject<MenuType<ExoticTradeUIMenu>> EXOTIC_TRADE_UI = REGISTRY.register("exotic_trade_ui", () -> IForgeMenuType.create(ExoticTradeUIMenu::new));
	public static final RegistryObject<MenuType<XEngieGamesTradeUIPickerMenu>> X_ENGIE_GAMES_TRADE_UI_PICKER = REGISTRY.register("x_engie_games_trade_ui_picker", () -> IForgeMenuType.create(XEngieGamesTradeUIPickerMenu::new));
	public static final RegistryObject<MenuType<RecipeBookVol1GUIMenu>> RECIPE_BOOK_VOL_1_GUI = REGISTRY.register("recipe_book_vol_1_gui", () -> IForgeMenuType.create(RecipeBookVol1GUIMenu::new));
	public static final RegistryObject<MenuType<RecipeBookVol2GUIMenu>> RECIPE_BOOK_VOL_2_GUI = REGISTRY.register("recipe_book_vol_2_gui", () -> IForgeMenuType.create(RecipeBookVol2GUIMenu::new));
	public static final RegistryObject<MenuType<RecipeBookVol3GUIMenu>> RECIPE_BOOK_VOL_3_GUI = REGISTRY.register("recipe_book_vol_3_gui", () -> IForgeMenuType.create(RecipeBookVol3GUIMenu::new));
	public static final RegistryObject<MenuType<RecipeBookVol5GUIMenu>> RECIPE_BOOK_VOL_5_GUI = REGISTRY.register("recipe_book_vol_5_gui", () -> IForgeMenuType.create(RecipeBookVol5GUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level.isClientSide) {
				if (Minecraft.getInstance().screen instanceof EngiesChaosModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				EngiesChaosMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}