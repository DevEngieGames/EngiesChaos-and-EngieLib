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

public class SuperDoomsdaySpikesProcedure {
	public static void execute(LevelAccessor world) {
		if (Math.random() <= 0.5) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 1, 2); index0++) {
					for (int index1 = 0; index1 < 20; index1++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos spike");
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				for (int index2 = 0; index2 < (int) Mth.nextDouble(RandomSource.create(), 1, 4); index2++) {
					for (int index3 = 0; index3 < 20; index3++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos spike");
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				for (int index4 = 0; index4 < (int) Mth.nextDouble(RandomSource.create(), 1, 8); index4++) {
					for (int index5 = 0; index5 < 20; index5++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos spike");
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				for (int index6 = 0; index6 < (int) Mth.nextDouble(RandomSource.create(), 1, 16); index6++) {
					for (int index7 = 0; index7 < 20; index7++) {
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount + 1;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO, _level, 4,
												"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"EngieLib EChaos spike");
						});
					}
				}
			}
		}
	}
}