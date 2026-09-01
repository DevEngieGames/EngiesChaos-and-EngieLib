package engiegames.engies_chaos.procedures;

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

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class DDaySFXPlayProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:churchbells neutral @s");
						}
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:doomsdaydisasterreveal neutral @s");
							}
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:churchbells2 neutral @s");
						}
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:doomsdaydisasterreveal neutral @s");
							}
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay == true) {
				EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s music engies_chaos:doomshalf2");
						}
					}
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:doomshalf1 music @s");
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ddayaltsongplay == true) {
				EngiesChaosModVariables.MapVariables.get(world).ddayaltsongplay = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s music engies_chaos:doomshalf1");
						}
					}
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:doomshalf2 music @s");
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ddaydialogue == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:dialoguepromt neutral @s");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).ddayavalanche == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:avalanche ambient @s ~ ~ ~ 0.5");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).ddayavalanche = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).playriftsound == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:riftopens ambient @s ~ ~ ~ 0.5");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playriftsound = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:missile_spawn ambient @s ~ ~ ~ 0.5");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:missile_explosion ambient @s ~ ~ ~ 0.5");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}