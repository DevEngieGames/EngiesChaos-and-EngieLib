package engiegames.engielib.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class LibNeedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "LibNeed")).equals("info")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A76EngieLib Version v0.2.5" + "\n" + "\u00A7cAuthor: EngieGames" + "\n" + "\u00A76License: Apache License 2.0" + "\n"
						+ "\u00A7fDescription: Designed for Engie's Chaos currently. Works in unison with Engie's Chaos to stop some strange bugs that couldn't have been fixed without this mod.")), false);
		}
	}
}