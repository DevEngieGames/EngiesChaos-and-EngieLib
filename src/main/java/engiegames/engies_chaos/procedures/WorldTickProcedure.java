package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@EventBusSubscriber
public class WorldTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
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
				if ((world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.AMBIENCE_MODE)) == true) {
					EngiesChaosModVariables.MapVariables.get(world).difficultytoggle = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR3 && _serverLevelGR3.getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE)) == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == false) {
					EngiesChaosModVariables.MapVariables.get(world).timeticks = EngiesChaosModVariables.MapVariables.get(world).timeticks + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if ((world instanceof ServerLevel _serverLevelGR4 && _serverLevelGR4.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == true) {
				EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).truehardcoreenabledonworld = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if ((world instanceof ServerLevel _serverLevelGR5 && _serverLevelGR5.getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE)) == false
					&& (world instanceof ServerLevel _serverLevelGR6 && _serverLevelGR6.getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)) == false
					&& (world instanceof ServerLevel _serverLevelGR7 && _serverLevelGR7.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_THROWBACK_TOGGLE)) == false) {
				if (world instanceof ServerLevel _serverLevel)
					_serverLevel.getGameRules().getRule(EngiesChaosModGameRules.ENGIES_CHAOS_TOGGLE).set(true, world.getServer());
			}
			if ((world instanceof ServerLevel _serverLevelGR9 && _serverLevelGR9.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true) {
				EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).heavylightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if ((world instanceof ServerLevel _serverLevelGR10 && _serverLevelGR10.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true) {
				EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).extremelightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if ((world instanceof ServerLevel _serverLevelGR11 && _serverLevelGR11.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)) == true) {
				EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
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
		}
	}
}