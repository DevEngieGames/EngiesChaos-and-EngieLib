package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class EngieLibNeedProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "EngieLib")).equals("EngieLib")) {
			if ((StringArgumentType.getString(arguments, "Type")).equals("DoomsdayCleanupPlayer")) {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.DoomsdayAlive = false;
						_vars.syncPlayerVariables(entity);
					}
					{
						EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.healthreductiondday = false;
						_vars.syncPlayerVariables(entity);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getSpawnPos().getX())
									: 0),
							((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getSpawnPos().getY())
									: 0),
							((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getSpawnPos().getZ())
									: 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getSpawnPos().getX())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getSpawnPos().getY())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getSpawnPos().getZ())
										: 0),
								_ent.getYRot(), _ent.getXRot());
				}
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("StartChallenge")) {
				ChallengeDialogueProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "Type")).equals("StartEndgameLoot")) {
				if (entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel && _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().get(ResourceLocation.parse("minecraft:end/kill_dragon"))).isDone()
						|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "").equals("EngiesChaos_Dev")) {
					EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}