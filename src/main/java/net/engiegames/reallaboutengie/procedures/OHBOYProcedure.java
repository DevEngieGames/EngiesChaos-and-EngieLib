package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OHBOYProcedure {
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
			if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
					if (world instanceof Level _lvl2 && _lvl2.isDay()) {
						if (AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle == false) {
							if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == true) {
								entity.getPersistentData().putDouble("riskcooldown", (entity.getPersistentData().getDouble("riskcooldown") + 0.05));
								if (entity.getPersistentData().getDouble("riskcooldown") >= 5) {
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									entity.getPersistentData().putDouble("riskcooldown", 0);
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == false) {
								if (AllaboutengieModVariables.MapVariables.get(world).Risk == 1) {
									if (Math.random() <= 0.0005) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart
													&& AllaboutengieModVariables.MapVariables.get(world).TheEndStart) == false) {
												if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
												}
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"EngieLib REAAE summondoomsday");
													}
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 2;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "Medium.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(
																("DEBUG: Attemping to raise risk to " + "Medium " + "as Doomsday risk fail count is >= to 30." + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												} else {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 2) {
									if (Math.random() <= 0.007) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart
													&& AllaboutengieModVariables.MapVariables.get(world).TheEndStart) == false) {
												if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
												}
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"EngieLib REAAE summondoomsday");
													}
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 3;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "High.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(
																("DEBUG: Attemping to raise risk to " + "High " + "as Doomsday risk fail count is >= to 30." + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												} else {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 3) {
									if (Math.random() <= 0.013) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart
													&& AllaboutengieModVariables.MapVariables.get(world).TheEndStart) == false) {
												if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
												}
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"EngieLib REAAE summondoomsday");
													}
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 4;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "Extreme.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attemping to raise risk to " + "Extreme " + "as Doomsday risk fail count is >= to 30." + "("
																+ AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")), false);
												} else {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 4) {
									if (Math.random() <= 0.02) {
										AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart
													&& AllaboutengieModVariables.MapVariables.get(world).TheEndStart) == false) {
												if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
												}
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"EngieLib REAAE summondoomsday");
													}
												}
											}
										});
									} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
										AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk to " + "Guaranteed.")), false);
											}
										});
									} else {
										AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(1, () -> {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount == 30) {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attemping to raise risk to " + "Guaranteed " + "as Doomsday risk fail count is >= to 30 next try." + "("
																+ AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")), false);
												} else {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise risk fail count by 1. " + "(" + AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + "/30)")),
																false);
												}
											}
										});
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 5) {
									AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
										if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
										}
										AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									}
									if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
										if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
										}
										AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									}
									if (AllaboutengieModVariables.MapVariables.get(world).TheEndStart == true) {
										if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
										}
										AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									}
									AllaboutengieMod.queueServerWork(1, () -> {
										if ((AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart
												&& AllaboutengieModVariables.MapVariables.get(world).TheEndStart) == false) {
											if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
											}
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE summondoomsday");
												}
											}
										}
									});
								}
							}
						}
					} else if (!(world instanceof Level _lvl57 && _lvl57.isDay())) {
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}