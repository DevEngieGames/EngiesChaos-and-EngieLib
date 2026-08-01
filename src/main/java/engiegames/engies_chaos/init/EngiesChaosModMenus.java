/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
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
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, EngiesChaosMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MetalChestUIMenu>> METAL_CHEST_UI = REGISTRY.register("metal_chest_ui", () -> IMenuTypeExtension.create(MetalChestUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MetalBundleUIMenu>> ENGIE_BUNDLE_UI = REGISTRY.register("engie_bundle_ui", () -> IMenuTypeExtension.create(MetalBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AngryEngieBundleUIMenu>> ANGRY_ENGIE_BUNDLE_UI = REGISTRY.register("angry_engie_bundle_ui", () -> IMenuTypeExtension.create(AngryEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EnragedEngieBundleUIMenu>> ENRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("enraged_engie_bundle_ui", () -> IMenuTypeExtension.create(EnragedEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<OutragedEngieBundleUIMenu>> OUTRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("outraged_engie_bundle_ui", () -> IMenuTypeExtension.create(OutragedEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BiblicallyAccurateEngieBundleUIMenu>> BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI = REGISTRY.register("biblically_accurate_engie_bundle_ui",
			() -> IMenuTypeExtension.create(BiblicallyAccurateEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MonstrosityEngieBundleUIMenu>> MONSTROSITY_ENGIE_BUNDLE_UI = REGISTRY.register("monstrosity_engie_bundle_ui", () -> IMenuTypeExtension.create(MonstrosityEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ETCEngieBundleUIMenu>> ETC_ENGIE_BUNDLE_UI = REGISTRY.register("etc_engie_bundle_ui", () -> IMenuTypeExtension.create(ETCEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CreativeEngieBundleUIMenu>> CREATIVE_ENGIE_BUNDLE_UI = REGISTRY.register("creative_engie_bundle_ui", () -> IMenuTypeExtension.create(CreativeEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngiesOwnEngieBundleUIMenu>> ENGIES_OWN_ENGIE_BUNDLE_UI = REGISTRY.register("engies_own_engie_bundle_ui", () -> IMenuTypeExtension.create(EngiesOwnEngieBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngiesBirthdayBundleUIMenu>> ENGIES_BIRTHDAY_BUNDLE_UI = REGISTRY.register("engies_birthday_bundle_ui", () -> IMenuTypeExtension.create(EngiesBirthdayBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DoomsDayTradeUIMenu>> DOOMS_DAY_TRADE_UI = REGISTRY.register("dooms_day_trade_ui", () -> IMenuTypeExtension.create(DoomsDayTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SuperDoomsDayTradeUIMenu>> SUPER_DOOMS_DAY_TRADE_UI = REGISTRY.register("super_dooms_day_trade_ui", () -> IMenuTypeExtension.create(SuperDoomsDayTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TheEndTradeUIMenu>> THE_END_TRADE_UI = REGISTRY.register("the_end_trade_ui", () -> IMenuTypeExtension.create(TheEndTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngieTradeUIMenu>> ENGIE_TRADE_UI = REGISTRY.register("engie_trade_ui", () -> IMenuTypeExtension.create(EngieTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BirthdayBundleForYoungestUIMenu>> BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI = REGISTRY.register("birthday_bundle_for_youngest_ui",
			() -> IMenuTypeExtension.create(BirthdayBundleForYoungestUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EngieGamesTradeUIMenu>> ENGIE_GAMES_TRADE_UI = REGISTRY.register("engie_games_trade_ui", () -> IMenuTypeExtension.create(EngieGamesTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AntimatterDoomsDayTradeUIMenu>> ANTIMATTER_DOOMS_DAY_TRADE_UI = REGISTRY.register("antimatter_dooms_day_trade_ui", () -> IMenuTypeExtension.create(AntimatterDoomsDayTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AntimatterSuperDoomsDayTradeUIMenu>> ANTIMATTER_SUPER_DOOMS_DAY_TRADE_UI = REGISTRY.register("antimatter_super_dooms_day_trade_ui",
			() -> IMenuTypeExtension.create(AntimatterSuperDoomsDayTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AntimatterTheEndTradeUIMenu>> ANTIMATTER_THE_END_TRADE_UI = REGISTRY.register("antimatter_the_end_trade_ui", () -> IMenuTypeExtension.create(AntimatterTheEndTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AntimatterEngieTradeUIMenu>> ANTIMATTER_ENGIE_TRADE_UI = REGISTRY.register("antimatter_engie_trade_ui", () -> IMenuTypeExtension.create(AntimatterEngieTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AntimatterEngieGamesTradeUIMenu>> ANTIMATTER_ENGIE_GAMES_TRADE_UI = REGISTRY.register("antimatter_engie_games_trade_ui",
			() -> IMenuTypeExtension.create(AntimatterEngieGamesTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RoughianEngieGamesTradeUIMenu>> ROUGHIAN_ENGIE_GAMES_TRADE_UI = REGISTRY.register("roughian_engie_games_trade_ui", () -> IMenuTypeExtension.create(RoughianEngieGamesTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CosmicEngieGamesTradeUIMenu>> COSMIC_ENGIE_GAMES_TRADE_UI = REGISTRY.register("cosmic_engie_games_trade_ui", () -> IMenuTypeExtension.create(CosmicEngieGamesTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AntimatterMetalChestUIMenu>> ANTIMATTER_METAL_CHEST_UI = REGISTRY.register("antimatter_metal_chest_ui", () -> IMenuTypeExtension.create(AntimatterMetalChestUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MindscapeTradeUIMenu>> MINDSCAPE_TRADE_UI = REGISTRY.register("mindscape_trade_ui", () -> IMenuTypeExtension.create(MindscapeTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RegularMetalBundleUIMenu>> REGULAR_METAL_BUNDLE_UI = REGISTRY.register("regular_metal_bundle_ui", () -> IMenuTypeExtension.create(RegularMetalBundleUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ConfigMenu>> CONFIG = REGISTRY.register("config", () -> IMenuTypeExtension.create(ConfigMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DeveloperModeGUIMenu>> DEVELOPER_MODE_GUI = REGISTRY.register("developer_mode_gui", () -> IMenuTypeExtension.create(DeveloperModeGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TrashMenu>> TRASH = REGISTRY.register("trash", () -> IMenuTypeExtension.create(TrashMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DarkMatterMetalChestUIMenu>> DARK_MATTER_METAL_CHEST_UI = REGISTRY.register("dark_matter_metal_chest_ui", () -> IMenuTypeExtension.create(DarkMatterMetalChestUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CodeRedemptionsMenu>> CODE_REDEMPTIONS = REGISTRY.register("code_redemptions", () -> IMenuTypeExtension.create(CodeRedemptionsMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GearGiverMenu>> GEAR_GIVER = REGISTRY.register("gear_giver", () -> IMenuTypeExtension.create(GearGiverMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CommonTradeUIMenu>> COMMON_TRADE_UI = REGISTRY.register("common_trade_ui", () -> IMenuTypeExtension.create(CommonTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<UncommonTradeUIMenu>> UNCOMMON_TRADE_UI = REGISTRY.register("uncommon_trade_ui", () -> IMenuTypeExtension.create(UncommonTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RareTradeUIMenu>> RARE_TRADE_UI = REGISTRY.register("rare_trade_ui", () -> IMenuTypeExtension.create(RareTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EpicTradeUIMenu>> EPIC_TRADE_UI = REGISTRY.register("epic_trade_ui", () -> IMenuTypeExtension.create(EpicTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<LegendaryTradeUIMenu>> LEGENDARY_TRADE_UI = REGISTRY.register("legendary_trade_ui", () -> IMenuTypeExtension.create(LegendaryTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MythicTradeUIMenu>> MYTHIC_TRADE_UI = REGISTRY.register("mythic_trade_ui", () -> IMenuTypeExtension.create(MythicTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ExoticTradeUIMenu>> EXOTIC_TRADE_UI = REGISTRY.register("exotic_trade_ui", () -> IMenuTypeExtension.create(ExoticTradeUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<XEngieGamesTradeUIPickerMenu>> X_ENGIE_GAMES_TRADE_UI_PICKER = REGISTRY.register("x_engie_games_trade_ui_picker", () -> IMenuTypeExtension.create(XEngieGamesTradeUIPickerMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RecipeBookVol1GUIMenu>> RECIPE_BOOK_VOL_1_GUI = REGISTRY.register("recipe_book_vol_1_gui", () -> IMenuTypeExtension.create(RecipeBookVol1GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RecipeBookVol2GUIMenu>> RECIPE_BOOK_VOL_2_GUI = REGISTRY.register("recipe_book_vol_2_gui", () -> IMenuTypeExtension.create(RecipeBookVol2GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RecipeBookVol3GUIMenu>> RECIPE_BOOK_VOL_3_GUI = REGISTRY.register("recipe_book_vol_3_gui", () -> IMenuTypeExtension.create(RecipeBookVol3GUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RecipeBookVol5GUIMenu>> RECIPE_BOOK_VOL_5_GUI = REGISTRY.register("recipe_book_vol_5_gui", () -> IMenuTypeExtension.create(RecipeBookVol5GUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof EngiesChaosModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
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