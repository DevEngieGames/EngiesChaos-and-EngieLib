package engiegames.engielib.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engielib.network.EngielibModVariables;

public class DarknessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (EngielibModVariables.MapVariables.get(world).darknessapplied == false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @a darkness 20 1 true");
			EngielibModVariables.MapVariables.get(world).darknessapplied = true;
			EngielibModVariables.MapVariables.get(world).syncData(world);
		} else if (EngielibModVariables.MapVariables.get(world).darknessapplied == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect clear @a darkness");
			EngielibModVariables.MapVariables.get(world).darknessapplied = false;
			EngielibModVariables.MapVariables.get(world).syncData(world);
		}
	}
}