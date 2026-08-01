package engiegames.engielib.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class EGMProProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 0) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 1) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.CREATIVE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egms, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.CREATIVE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egms, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 2) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.ADVENTURE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egmsp for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.ADVENTURE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egmsp for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
				}
			}
		} else if (DoubleArgumentType.getDouble(arguments, "gamemodenumber") == 3) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("s") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("S")) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("c") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("C")) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.CREATIVE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egms, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.CREATIVE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egms, egmsp, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("a") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("A")) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.ADVENTURE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egmsp for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.ADVENTURE);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egmsp for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "gamemodeshortened")).equals("sp") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("Sp")
				|| (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("sP") || (StringArgumentType.getString(arguments, "gamemodeshortened")).equals("SP")) {
			if (ModList.get().isLoaded("allaboutengie")) {
				if ((entity.getDisplayName().getString()).contains("[All About Engie Developer]") || (entity.getDisplayName().getString()).contains("[RE:All About Engie Developer]")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just the Developers of All About Engie and RE:All About Engie."), false);
				}
			} else {
				if ((entity.getDisplayName().getString()).equals("xEngie") || (entity.getDisplayName().getString()).equals("Dev")) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76egmc, egms, egma for other modes"), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cSorry! This command is limited to just Engie."), false);
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(
						("\u00A7cGamemode number " + DoubleArgumentType.getDouble(arguments, "gamemodenumber") + " doesn't exist or is invalid." + "\n" + "\u00A7cThe proper gamemode numbers are 0, 1, 2, and 3 and s, c, a, and sp respectively.")),
						false);
		}
	}
}