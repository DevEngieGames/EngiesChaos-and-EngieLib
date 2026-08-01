/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EngiesChaosModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DETECTIVE_MODE;
	public static GameRules.Key<GameRules.BooleanValue> TRUE_HARDCORE;
	public static GameRules.Key<GameRules.BooleanValue> SUPER_DOOMSDAY_TOGGLE;
	public static GameRules.Key<GameRules.BooleanValue> EXTREME_DOOMSDAY_LIGHTNING;
	public static GameRules.Key<GameRules.BooleanValue> DOOMSDAY_TOGGLE;
	public static GameRules.Key<GameRules.IntegerValue> TRUE_HARDCORE_LIFE_COUNT;
	public static GameRules.Key<GameRules.BooleanValue> HEAVY_LIGHTNING;
	public static GameRules.Key<GameRules.BooleanValue> EXTREME_LIGHTNING;
	public static GameRules.Key<GameRules.BooleanValue> ENRAGED_ZOMBIES_TOGGLE;
	public static GameRules.Key<GameRules.BooleanValue> TRUE_THROWBACK_TOGGLE;
	public static GameRules.Key<GameRules.BooleanValue> ONE_HP;
	public static GameRules.Key<GameRules.BooleanValue> NIGHTMARE_DIFFICULTY;
	public static GameRules.Key<GameRules.BooleanValue> INSANITY_DIFFICULTY;
	public static GameRules.Key<GameRules.BooleanValue> APOCALYPSE_ONE;
	public static GameRules.Key<GameRules.BooleanValue> APOCALYPSE_TWO;
	public static GameRules.Key<GameRules.BooleanValue> APOCALYPSE_THREE;
	public static GameRules.Key<GameRules.BooleanValue> DO_SHARKO_SPAWNING;
	public static GameRules.Key<GameRules.BooleanValue> ENGIES_CHAOS_TOGGLE;
	public static GameRules.Key<GameRules.BooleanValue> AMBIENCE_MODE;
	public static GameRules.Key<GameRules.IntegerValue> DOOMSDAY_SUB_DISASTER_LIMIT;
	public static GameRules.Key<GameRules.BooleanValue> ENGIE_POC;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DETECTIVE_MODE = GameRules.register("detectiveMode", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
		TRUE_HARDCORE = GameRules.register("trueHardcore", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		SUPER_DOOMSDAY_TOGGLE = GameRules.register("superDoomsDayToggle", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
		EXTREME_DOOMSDAY_LIGHTNING = GameRules.register("extremeDoomsdayLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		DOOMSDAY_TOGGLE = GameRules.register("doomsdayToggle", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
		TRUE_HARDCORE_LIFE_COUNT = GameRules.register("trueHardcoreLifeCount", GameRules.Category.PLAYER, GameRules.IntegerValue.create(10));
		HEAVY_LIGHTNING = GameRules.register("heavyLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		EXTREME_LIGHTNING = GameRules.register("extremeLightning", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		ENRAGED_ZOMBIES_TOGGLE = GameRules.register("enragedZombiesToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		TRUE_THROWBACK_TOGGLE = GameRules.register("trueThrowbackToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		ONE_HP = GameRules.register("oneHP", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		NIGHTMARE_DIFFICULTY = GameRules.register("nightmareDifficulty", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
		INSANITY_DIFFICULTY = GameRules.register("insanityDifficulty", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
		APOCALYPSE_ONE = GameRules.register("apocalypseOne", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
		APOCALYPSE_TWO = GameRules.register("apocalypseTwo", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
		APOCALYPSE_THREE = GameRules.register("apocalypseThree", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
		DO_SHARKO_SPAWNING = GameRules.register("doSharkoSpawning", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
		ENGIES_CHAOS_TOGGLE = GameRules.register("engiesChaosToggle", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
		AMBIENCE_MODE = GameRules.register("ambienceMode", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
		DOOMSDAY_SUB_DISASTER_LIMIT = GameRules.register("doomsdaySubDisasterLimit", GameRules.Category.UPDATES, GameRules.IntegerValue.create(250));
		ENGIE_POC = GameRules.register("engiePoc", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	}
}