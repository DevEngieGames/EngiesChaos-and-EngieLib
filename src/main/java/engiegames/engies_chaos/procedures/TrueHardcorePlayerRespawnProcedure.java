package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class TrueHardcorePlayerRespawnProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level, event.getEntity(), event.isEndConquered());
	}

	public static void execute(LevelAccessor world, Entity entity, boolean endconquered) {
		execute(null, world, entity, endconquered);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, boolean endconquered) {
		if (entity == null)
			return;
		if (endconquered == false) {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE) == true) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).TrueHardcoreLifeCount != 0) {
					{
						double _setval = (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).TrueHardcoreLifeCount - 1;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TrueHardcoreLifeCount = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					EngiesChaosMod.queueServerWork(5, () -> {
						if (getEntityGameType(entity) == GameType.SPECTATOR) {
							if (entity instanceof ServerPlayer _player)
								_player.setGameMode(GameType.SURVIVAL);
						}
					});
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