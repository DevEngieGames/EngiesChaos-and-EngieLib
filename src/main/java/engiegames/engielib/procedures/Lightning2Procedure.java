package engiegames.engielib.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engielib.EngielibMod;

public class Lightning2Procedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
							.withSuppressedOutput(),
					"summon engies_chaos:d_day_lightning_spawner");
		EngielibMod.queueServerWork(10, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
								.withSuppressedOutput(),
						"summon engies_chaos:d_day_lightning_spawner");
			EngielibMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
									.withSuppressedOutput(),
							"summon engies_chaos:d_day_lightning_spawner");
				EngielibMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
										.withSuppressedOutput(),
								"summon engies_chaos:d_day_lightning_spawner");
				});
			});
		});
	}
}