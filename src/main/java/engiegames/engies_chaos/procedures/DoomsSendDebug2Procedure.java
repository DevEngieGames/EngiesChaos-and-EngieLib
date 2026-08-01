package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class DoomsSendDebug2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 == true) {
			EngiesChaosModVariables.MapVariables.get(world).doomssentdebug2 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayRiskTrackToggle == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise chance to " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")), false);
			}
		}
	}
}