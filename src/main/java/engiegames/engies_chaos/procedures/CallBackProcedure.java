package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class CallBackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathX != 0 && entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathY != -250 && entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathZ != 0) {
			{
				Entity _ent = entity;
				_ent.teleportTo(entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathX, entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathY, entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathZ);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathX, entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathY,
							entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerDeathZ, _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A76Teleported you back to your death point!"), false);
			EngiesChaosMod.queueServerWork(1, () -> {
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.PlayerDeathX = 0;
					_vars.syncPlayerVariables(entity);
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.PlayerDeathY = -250;
					_vars.syncPlayerVariables(entity);
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.PlayerDeathZ = 0;
					_vars.syncPlayerVariables(entity);
				}
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cYou cannot teleport back to your death point as you haven't died yet!"), false);
		}
	}
}