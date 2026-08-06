package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DoomsdayAvalanchesProcedure {
	public static void execute(LevelAccessor world) {
		if (Math.random() <= 0.5) {
			EngiesChaosModVariables.MapVariables.get(world).ddayavalanche = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 1) {
				for (int index0 = 0; index0 < 25; index0++) {
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level, 4,
										"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
				for (int index1 = 0; index1 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)); index1++) {
					for (int index2 = 0; index2 < 25; index2++) {
						EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
											new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level,
											4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 3) {
				for (int index3 = 0; index3 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 4)); index3++) {
					for (int index4 = 0; index4 < 25; index4++) {
						EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
											new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level,
											4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
				for (int index5 = 0; index5 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 8)); index5++) {
					for (int index6 = 0; index6 < 25; index6++) {
						EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
											new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level,
											4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
					}
				}
			}
		}
	}
}