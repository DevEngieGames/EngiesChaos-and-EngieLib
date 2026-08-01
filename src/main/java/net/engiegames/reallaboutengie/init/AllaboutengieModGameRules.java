/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DETECTIVE_MODE = GameRules.register("detectiveMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TRUE_HARDCORE = GameRules.register("trueHardcore", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SUPER_DOOMS_DAY_TOGGLE = GameRules.register("superDoomsDayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EXTREME_DOOMSDAY_LIGHTNING = GameRules.register("extremeDoomsdayLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DOOMSDAY_TOGGLE = GameRules.register("doomsdayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> TRUE_HARDCORE_LIFE_COUNT = GameRules.register("trueHardcoreLifeCount", GameRules.Category.PLAYER, GameRules.IntegerValue.create(10));
	public static final GameRules.Key<GameRules.BooleanValue> HEAVY_LIGHTNING = GameRules.register("heavyLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EXTREME_LIGHTNING = GameRules.register("extremeLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ALL_ABOUT_ENGIE_TOGGLE = GameRules.register("allAboutEngieToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> ENRAGED_ZOMBIES_TOGGLE = GameRules.register("enragedZombiesToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TRUE_THROWBACK_TOGGLE = GameRules.register("trueThrowbackToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ONE_HP = GameRules.register("oneHP", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}