/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngiesChaosModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DETECTIVE_MODE = GameRules.register("detectiveMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TRUE_HARDCORE = GameRules.register("trueHardcore", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SUPER_DOOMSDAY_TOGGLE = GameRules.register("superDoomsDayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EXTREME_DOOMSDAY_LIGHTNING = GameRules.register("extremeDoomsdayLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DOOMSDAY_TOGGLE = GameRules.register("doomsdayToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> TRUE_HARDCORE_LIFE_COUNT = GameRules.register("trueHardcoreLifeCount", GameRules.Category.PLAYER, GameRules.IntegerValue.create(10));
	public static final GameRules.Key<GameRules.BooleanValue> HEAVY_LIGHTNING = GameRules.register("heavyLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EXTREME_LIGHTNING = GameRules.register("extremeLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ENRAGED_ZOMBIES_TOGGLE = GameRules.register("enragedZombiesToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TRUE_THROWBACK_TOGGLE = GameRules.register("trueThrowbackToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ONE_HP = GameRules.register("oneHP", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> NIGHTMARE_DIFFICULTY = GameRules.register("nightmareDifficulty", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> INSANITY_DIFFICULTY = GameRules.register("insanityDifficulty", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> APOCALYPSE_ONE = GameRules.register("apocalypseOne", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> APOCALYPSE_TWO = GameRules.register("apocalypseTwo", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> APOCALYPSE_THREE = GameRules.register("apocalypseThree", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DO_SHARKO_SPAWNING = GameRules.register("doSharkoSpawning", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> ENGIES_CHAOS_TOGGLE = GameRules.register("engiesChaosToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> AMBIENCE_MODE = GameRules.register("ambienceMode", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> DOOMSDAY_SUB_DISASTER_LIMIT = GameRules.register("doomsdaySubDisasterLimit", GameRules.Category.UPDATES, GameRules.IntegerValue.create(250));
	public static final GameRules.Key<GameRules.BooleanValue> ENGIE_POC = GameRules.register("engiePoc", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
}