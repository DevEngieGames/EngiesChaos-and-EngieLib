/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

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

import net.engiegames.reallaboutengie.world.inventory.TheEndTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.SuperDoomsDayTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.RoughianEngieGamesTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.RegularMetalBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.OutragedEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.MonstrosityEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.MindscapeTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.MetalChestUIMenu;
import net.engiegames.reallaboutengie.world.inventory.MetalBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.EnragedEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.EngiesOwnEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.EngiesBirthdayBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.EngieTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.EngieGamesTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.ETCEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.DoomsDayTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.CustomRecipeBookMenu;
import net.engiegames.reallaboutengie.world.inventory.CreativeEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.CosmicEngieGamesTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.BirthdayBundleForYoungestUIMenu;
import net.engiegames.reallaboutengie.world.inventory.BiblicallyAccurateEngieBundleUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AntimatterTheEndTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AntimatterSuperDoomsDayTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AntimatterMetalChestUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AntimatterEngieTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AntimatterEngieGamesTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AntimatterDoomsDayTradeUIMenu;
import net.engiegames.reallaboutengie.world.inventory.AngryEngieBundleUIMenu;
import net.engiegames.reallaboutengie.network.MenuStateUpdateMessage;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import java.util.Map;

public class AllaboutengieModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AllaboutengieMod.MODID);
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
	public static final RegistryObject<MenuType<CustomRecipeBookMenu>> CUSTOM_RECIPE_BOOK = REGISTRY.register("custom_recipe_book", () -> IForgeMenuType.create(CustomRecipeBookMenu::new));
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

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level.isClientSide) {
				if (Minecraft.getInstance().screen instanceof AllaboutengieModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
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