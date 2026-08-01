package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class TrueHardcorePlayerRespawnProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity(), event.isEndConquered());
	}

	public static void execute(LevelAccessor world, Entity entity, boolean endconquered) {
		execute(null, world, entity, endconquered);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, boolean endconquered) {
		if (entity == null)
			return;
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == true) {
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).TrueHardcoreLifeCount > 1) {
				if (endconquered == false) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.TrueHardcoreLifeCount = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).TrueHardcoreLifeCount - 1;
						_vars.syncPlayerVariables(entity);
					}
					EngiesChaosMod.queueServerWork(5, () -> {
						if (getEntityGameType(entity) == GameType.SPECTATOR) {
							if (entity instanceof ServerPlayer _player)
								_player.setGameMode(GameType.SURVIVAL);
						}
						{
							EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
							_vars.RespawnTrueHardcoreGraceStart = false;
							_vars.syncPlayerVariables(entity);
						}
						{
							EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
							_vars.playeralive = true;
							_vars.syncPlayerVariables(entity);
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76You can run /back in order to teleport back to your death point!"), false);
					});
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).TrueHardcoreLifeCount <= 1 && !(getEntityGameType(entity) == GameType.CREATIVE)) {
				if (endconquered == false) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.TrueHardcoreLifeCount = 0;
						_vars.syncPlayerVariables(entity);
					}
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
				} else if (endconquered == true) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.TrueHardcoreLifeCount = 1;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		} else if ((world instanceof ServerLevel _serverLevelGR7 && _serverLevelGR7.getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)) == false) {
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).playeralive == false) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.RespawnNormInstantHealth = false;
					_vars.syncPlayerVariables(entity);
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.playeralive = true;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76You can run /back in order to teleport back to your death point!"), false);
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}