package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class DoomsdayCornerLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true || EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect give @a[distance=..6.25] engies_chaos:stunned 5 0 true");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("damages @a[distance=..6.25] " + Math.round(Mth.nextDouble(RandomSource.create(), 30, 100)) + " 5"));
			}
		}
	}
}