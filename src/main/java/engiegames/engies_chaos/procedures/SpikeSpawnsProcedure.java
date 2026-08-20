package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class SpikeSpawnsProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
			for (int index0 = 0; index0 < 50; index0++) {
				if (Math.random() > 0.125) {
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
					});
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
			for (int index1 = 0; index1 < 50; index1++) {
				if (Math.random() > 0.25) {
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
					});
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			for (int index2 = 0; index2 < 50; index2++) {
				if (Math.random() > 0.375) {
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
					});
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			for (int index3 = 0; index3 < 50; index3++) {
				if (Math.random() > 0.5) {
					EngiesChaosMod.queueServerWork(5, () -> {
						EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
									Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
					});
				}
			}
		}
	}
}