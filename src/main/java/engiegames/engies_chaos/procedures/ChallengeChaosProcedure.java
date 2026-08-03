package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import javax.annotation.Nullable;

import java.util.Optional;
import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class ChallengeChaosProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == true) {
			if (ModList.get().isLoaded("enhancedcelestials") == true) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("engies_chaos:challenge_chaos_enhanced_celestials_1"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(),
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getX()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getY()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if (ModList.get().isLoaded("weather2") == true) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("engies_chaos:challenge_chaos_weather_mod"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(),
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getX()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getY()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if (ModList.get().isLoaded("weather2") == false && ModList.get().isLoaded("enhancedcelestials") == false) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("engies_chaos:challenge_chaos_normal_1"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(),
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getX()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getY()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).BYEBYE == false) {
			if (ModList.get().isLoaded("enhancedcelestials") == true) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("engies_chaos:challenge_chaos_enhanced_celestials_2"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(),
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getX()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getY()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if (ModList.get().isLoaded("weather2") == true) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("engies_chaos:challenge_chaos_weather_mod"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(),
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getX()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getY()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if (ModList.get().isLoaded("weather2") == false && ModList.get().isLoaded("enhancedcelestials") == false) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("engies_chaos:challenge_chaos_normal_2"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(),
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getX()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getY()),
												((findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 30000512)).getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}