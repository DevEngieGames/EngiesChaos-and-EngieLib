package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class DoomsSendDebug1Procedure {
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
		if (EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 == true) {
			EngiesChaosModVariables.MapVariables.get(world).doomssentdebug1 = false;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 6.25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 12.5) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Low.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Low.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Low.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn ENGIES WRATH with risk: " + "Low.")), false);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 12.5 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 18.75) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Medium.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Medium.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Medium.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn ENGIES WRATH with risk: " + "Medium.")), false);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 18.75 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 25) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "High.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "High.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "High.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn ENGIES WRATH with risk: " + "High.")), false);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 50) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Extreme.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Extreme.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Extreme.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn ENGIES WRATH with risk: " + "Extreme.")), false);
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 50) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Doomsday with risk: " + "Guaranteed.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn Super Doomsday with risk: " + "Guaranteed.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn The End with risk: " + "Guaranteed.")), false);
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("DEBUG: Attempted to spawn ENGIES WRATH with risk: " + "Guaranteed.")), false);
					}
				}
			}
		}
	}
}