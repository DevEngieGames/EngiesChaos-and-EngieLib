package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class LightningFlashGoDownProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			{
				EngiesChaosModVariables.PlayerVariables _vars = entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
				_vars.lightningflashnum = Math.max(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).lightningflashnum - 0.025, 0);
				_vars.syncPlayerVariables(entityiterator);
			}
		}
	}
}