package engiegames.engielib.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import engiegames.engielib.network.EngielibModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class HomesProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if ((StringArgumentType.getString(arguments, "type")).equals("set")) {
				{
					EngielibModVariables.PlayerVariables _vars = entity.getData(EngielibModVariables.PLAYER_VARIABLES);
					_vars.homeX = Math.floor(entity.getX()) + 0.5;
					_vars.syncPlayerVariables(entity);
				}
				{
					EngielibModVariables.PlayerVariables _vars = entity.getData(EngielibModVariables.PLAYER_VARIABLES);
					_vars.homeY = Math.floor(entity.getY());
					_vars.syncPlayerVariables(entity);
				}
				{
					EngielibModVariables.PlayerVariables _vars = entity.getData(EngielibModVariables.PLAYER_VARIABLES);
					_vars.homeZ = Math.floor(entity.getZ()) + 0.5;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Home point set to " + Math.floor(entity.getX()) + ", " + Math.floor(entity.getY()) + ", " + Math.floor(entity.getZ()) + "!")), false);
			} else if ((StringArgumentType.getString(arguments, "type")).equals("teleport") || (StringArgumentType.getString(arguments, "type")).equals("tp")) {
				{
					Entity _ent = entity;
					_ent.teleportTo(entity.getData(EngielibModVariables.PLAYER_VARIABLES).homeX, entity.getData(EngielibModVariables.PLAYER_VARIABLES).homeY, entity.getData(EngielibModVariables.PLAYER_VARIABLES).homeZ);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(entity.getData(EngielibModVariables.PLAYER_VARIABLES).homeX, entity.getData(EngielibModVariables.PLAYER_VARIABLES).homeY, entity.getData(EngielibModVariables.PLAYER_VARIABLES).homeZ,
								_ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Teleported you to your home point!"), false);
			}
		}
	}
}