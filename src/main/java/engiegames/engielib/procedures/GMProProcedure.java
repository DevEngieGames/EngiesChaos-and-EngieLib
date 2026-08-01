package engiegames.engielib.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class GMProProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 0) {
			if (entity instanceof Player _playerCmd1 && _playerCmd1.hasPermissions(4) || entity instanceof Player _playerCmd2 && _playerCmd2.hasPermissions(3) || entity instanceof Player _playerCmd3 && _playerCmd3.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SURVIVAL);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gmc, gmsp, gma for other modes"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), true);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 1) {
			if (entity instanceof Player _playerCmd8 && _playerCmd8.hasPermissions(4) || entity instanceof Player _playerCmd9 && _playerCmd9.hasPermissions(3) || entity instanceof Player _playerCmd10 && _playerCmd10.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.CREATIVE);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gms, gmsp, gma for other modes"), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), false);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 2) {
			if (entity instanceof Player _playerCmd15 && _playerCmd15.hasPermissions(4) || entity instanceof Player _playerCmd16 && _playerCmd16.hasPermissions(3) || entity instanceof Player _playerCmd17 && _playerCmd17.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gmc, gms, gmsp for other modes"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), true);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 3) {
			if (entity instanceof Player _playerCmd22 && _playerCmd22.hasPermissions(4) || entity instanceof Player _playerCmd23 && _playerCmd23.hasPermissions(3) || entity instanceof Player _playerCmd24 && _playerCmd24.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SPECTATOR);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gmc, gms, gma for other modes"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), true);
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("s") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("S")) {
			if (entity instanceof Player _playerCmd30 && _playerCmd30.hasPermissions(4) || entity instanceof Player _playerCmd31 && _playerCmd31.hasPermissions(3) || entity instanceof Player _playerCmd32 && _playerCmd32.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SURVIVAL);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gmc, gmsp, gma for other modes"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), true);
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("c") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("C")) {
			if (entity instanceof Player _playerCmd38 && _playerCmd38.hasPermissions(4) || entity instanceof Player _playerCmd39 && _playerCmd39.hasPermissions(3) || entity instanceof Player _playerCmd40 && _playerCmd40.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.CREATIVE);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gms, gmsp, gma for other modes"), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), false);
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("a") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("A")) {
			if (entity instanceof Player _playerCmd46 && _playerCmd46.hasPermissions(4) || entity instanceof Player _playerCmd47 && _playerCmd47.hasPermissions(3) || entity instanceof Player _playerCmd48 && _playerCmd48.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gmc, gms, gmsp for other modes"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), true);
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("sp") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("Sp")
				|| (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("sP") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("SP")) {
			if (entity instanceof Player _playerCmd56 && _playerCmd56.hasPermissions(4) || entity instanceof Player _playerCmd57 && _playerCmd57.hasPermissions(3) || entity instanceof Player _playerCmd58 && _playerCmd58.hasPermissions(2)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SPECTATOR);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A76gmc, gms, gma for other modes"), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to people with command level 2 and above."), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("\u00A7cGamemode number " + DoubleArgumentType.getDouble(arguments, "gamemodenumber") + " doesn't exist or is invalid." + "\n" + "\u00A7cThe proper gamemode numbers are 0, 1, 2, and 3 and s, c, a, and sp respectively.")),
						false);
		}
	}
}