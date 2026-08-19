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

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class DDayEerieStopProcedure {
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
		if (!world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).stopeeriesound == true) {
				EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s neutral engies_chaos:doomsday_eerie");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s neutral engies_chaos:engieswrath_eerie");
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == false) {
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DoomsdayAlive = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}