package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class HordeSpawnsProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
			if (Math.random() > 0.125) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos horde");
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
			if (Math.random() > 0.25) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos horde");
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
			if (Math.random() > 0.375) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos horde");
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
			if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos horde");
			}
		}
	}
}