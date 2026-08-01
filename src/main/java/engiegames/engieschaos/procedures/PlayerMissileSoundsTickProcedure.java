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

@Mod.EventBusSubscriber
public class PlayerMissileSoundsTickProcedure {
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
		if (EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound2 == true) {
				EngiesChaosModVariables.MapVariables.get(world).playmissilespawnsound2 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "execute as @a run playsound engies_chaos:missile_spawn ambient @s ~ ~ ~ 0.5");
					}
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 == true) {
				EngiesChaosModVariables.MapVariables.get(world).playmissileexplosionsound2 = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "execute as @a run playsound engies_chaos:missile_explosion ambient @s ~ ~ ~ 0.5");
					}
				}
			}
		}
	}
}