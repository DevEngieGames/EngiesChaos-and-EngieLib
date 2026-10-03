package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class WorldTick3Procedure {
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
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportedPlayers || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayTeleportedPlayers
						|| EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportedPlayers || EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportedPlayers) == true) {
					if (getEntityGameType(entityiterator) == GameType.SURVIVAL) {
						if (entityiterator instanceof ServerPlayer _player)
							_player.setGameMode(GameType.ADVENTURE);
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathForceCreativePlayersAdventure == true) {
					if (getEntityGameType(entityiterator) == GameType.CREATIVE) {
						if (entityiterator instanceof ServerPlayer _player)
							_player.setGameMode(GameType.ADVENTURE);
					}
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level.isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}