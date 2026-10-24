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
				if (entity.getY() > 320) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cYou are higher than the build height, please be below Y: 321 to set your home point!"), false);
				} else if (entity.getY() < -64) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cYou are lower than the build height, please be above Y: -64 to set your home point!"), false);
				} else {
					{
						double _setval = Math.floor(entity.getX()) + 0.5;
						entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.homeX = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = Math.floor(entity.getY());
						entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.homeY = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = Math.floor(entity.getZ()) + 0.5;
						entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.homeZ = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Home point set to " + Math.floor(entity.getX()) + ", " + Math.floor(entity.getY()) + ", " + Math.floor(entity.getZ()) + "!")), false);
				}
			} else if ((StringArgumentType.getString(arguments, "type")).equals("teleport") || (StringArgumentType.getString(arguments, "type")).equals("tp")) {
				if ((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeY != 999999) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeX),
								((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeY),
								((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeZ));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeX),
									((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeY),
									((entity.getCapability(EngielibModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngielibModVariables.PlayerVariables())).homeZ), _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Teleported you to your home point!"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cYou need to set your home point before teleporting!"), false);
				}
			}
		}
	}
}