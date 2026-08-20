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

public class AvalancheSpawnProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true) {
			EngiesChaosModVariables.MapVariables.get(world).ddayavalanche = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			for (int index0 = 0; index0 < 50; index0++) {
				if (Math.random() > 0.125) {
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level, 4,
										"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).sddaystart == true) {
			EngiesChaosModVariables.MapVariables.get(world).ddayavalanche = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			for (int index1 = 0; index1 < 50; index1++) {
				if (Math.random() > 0.25) {
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level, 4,
										"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
			EngiesChaosModVariables.MapVariables.get(world).ddayavalanche = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			for (int index2 = 0; index2 < 50; index2++) {
				if (Math.random() > 0.375) {
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level, 4,
										"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			EngiesChaosModVariables.MapVariables.get(world).ddayavalanche = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			for (int index3 = 0; index3 < 50; index3++) {
				if (Math.random() < 0.5) {
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
										new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 100), (Mth.nextDouble(RandomSource.create(), -168, 168))), Vec2.ZERO, _level, 4,
										"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:d_day_avalanche");
				}
			}
		}
	}
}