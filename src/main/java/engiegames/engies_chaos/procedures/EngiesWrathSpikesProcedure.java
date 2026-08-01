package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class EngiesWrathSpikesProcedure {
	public static void execute(LevelAccessor world) {
		if (Math.random() <= 0.5) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 1, 6 + Mth.nextDouble(RandomSource.create(), 0, 1)); index0++) {
					for (int index1 = 0; index1 < 5; index1++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				for (int index2 = 0; index2 < (int) Mth.nextDouble(RandomSource.create(), 1, 12 + Mth.nextDouble(RandomSource.create(), 0, 1)); index2++) {
					for (int index3 = 0; index3 < 5; index3++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				for (int index4 = 0; index4 < (int) Mth.nextDouble(RandomSource.create(), 1, 25); index4++) {
					for (int index5 = 0; index5 < 5; index5++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos spike");
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				for (int index6 = 0; index6 < (int) Mth.nextDouble(RandomSource.create(), 1, 50); index6++) {
					for (int index7 = 0; index7 < 5; index7++) {
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
}