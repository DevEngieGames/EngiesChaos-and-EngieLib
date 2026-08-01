package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class PlayerLightningSoundTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).playlightningsound == false) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "execute as @a run stopsound @s weather engies_chaos:lightning_strike");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "execute as @a run stopsound @s weather engies_chaos:ddaylightning");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "execute as @a run stopsound @s weather engies_chaos:extreme_lightning_strike");
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).playlightningsound == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound == true) {
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:lightning_strike weather @s ~ ~ ~ 0.5");
						}
					}
				} else {
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
							}
						}
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:ddaylightning weather @s ~ ~ ~ 0.5");
							}
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound == true) {
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playlightningcornersound = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:lightning_strike weather @s ~ ~ ~ 0.5");
						}
					}
				} else {
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 == true) {
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:lightning_strike weather @s ~ ~ ~ 0.5");
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).playlightningsound5 == true) {
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound5 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
					}
				}
			}
		}
	}
}