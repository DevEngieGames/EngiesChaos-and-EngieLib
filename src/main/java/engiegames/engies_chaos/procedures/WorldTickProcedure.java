package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class WorldTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			if (ModList.get().isLoaded("attributefix") == false) {
				EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE) == true) {
					EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
				EngiesChaosModVariables.MapVariables.get(world).timeticks = world.dayTime();
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
				EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE) == false && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE) == false
					&& world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_THROWBACK_TOGGLE) == false) {
				world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE).set(true, world.getServer());
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true) {
				EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true) {
				EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
				EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY) == true
					|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true
					|| world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true || world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
				if (world.getServer() != null)
					world.getServer().setDifficulty(Difficulty.HARD, true);
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator.getPersistentData().getDouble("riftballdmgcd") > 0) {
					entityiterator.getPersistentData().putDouble("riftballdmgcd", (entityiterator.getPersistentData().getDouble("riftballdmgcd") - 1));
				}
				if (entityiterator.getPersistentData().getDouble("avadmgcd") > 0) {
					entityiterator.getPersistentData().putDouble("avadmgcd", (entityiterator.getPersistentData().getDouble("avadmgcd") - 1));
				}
				if (entityiterator.getPersistentData().getDouble("spikedmgcd") > 0) {
					entityiterator.getPersistentData().putDouble("spikedmgcd", (entityiterator.getPersistentData().getDouble("spikedmgcd") - 1));
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
				for (int index0 = 0; index0 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 2d); index0++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=engies_chaos:d_day_avalanche,limit=1]");
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
				for (int index1 = 0; index1 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 2d); index1++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=engies_chaos:dday_rift,limit=1]");
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
				for (int index2 = 0; index2 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 2d); index2++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=engies_chaos:d_day_spike,limit=1]");
					EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT))) {
				for (int index3 = 0; index3 < Math.round((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT)) / 8d); index3++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=#engies_chaos:ddaymissiles,limit=1]");
					EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}