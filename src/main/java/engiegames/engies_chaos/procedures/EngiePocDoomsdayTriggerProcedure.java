package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Comparator;
import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class EngiePocDoomsdayTriggerProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 6.25) {
				EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.625;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayRiskTrackToggle == true) {
						EngiesChaosMod.queueServerWork(1, () -> {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise chance to " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")), false);
						});
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 6.25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 12.5) {
				if (Mth.nextDouble(RandomSource.create(), 0, 100) + Math.random() <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
					EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:EngiesWrathStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
					EngiesChaosMod.queueServerWork(1, () -> {
						if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart) == false) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
								}
							}
							{
								Entity _ent = (findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 29999984));
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib EChaos summondoomsday");
								}
							}
						}
					});
				} else {
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.25;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							EngiesChaosMod.queueServerWork(1, () -> {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise chance to " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")), false);
							});
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 12.5 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 18.75) {
				if (Mth.nextDouble(RandomSource.create(), 0, 100) + Math.random() <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
					EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:EngiesWrathStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
					EngiesChaosMod.queueServerWork(1, () -> {
						if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart) == false) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
								}
							}
							{
								Entity _ent = (findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 29999984));
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib EChaos summondoomsday");
								}
							}
						}
					});
				} else {
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.25;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							EngiesChaosMod.queueServerWork(1, () -> {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise chance to " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")), false);
							});
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 18.75 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 25) {
				if (Mth.nextDouble(RandomSource.create(), 0, 100) + Math.random() <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
					EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:EngiesWrathStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
					EngiesChaosMod.queueServerWork(1, () -> {
						if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart) == false) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
								}
							}
							{
								Entity _ent = (findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 29999984));
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib EChaos summondoomsday");
								}
							}
						}
					});
				} else {
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 0.25;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							EngiesChaosMod.queueServerWork(1, () -> {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise chance to " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")), false);
							});
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 25 && EngiesChaosModVariables.MapVariables.get(world).doomsdaychance < 50) {
				if (Mth.nextDouble(RandomSource.create(), 0, 100) + Math.random() <= EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) {
					EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: Set Global:EngiesWrathStart to \"false\" as it was \"true\""), false);
							}
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
					EngiesChaosMod.queueServerWork(1, () -> {
						if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart) == false) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
								}
							}
							{
								Entity _ent = (findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 29999984));
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib EChaos summondoomsday");
								}
							}
						}
					});
				} else {
					EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = EngiesChaosModVariables.MapVariables.get(world).doomsdaychance + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							EngiesChaosMod.queueServerWork(1, () -> {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(("DEBUG: Attempted to raise chance to " + new java.text.DecimalFormat("##.###").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaychance) + "%")), false);
							});
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).doomsdaychance >= 50) {
				EngiesChaosModVariables.MapVariables.get(world).OHBOY = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("DEBUG: Set Global:DoomsDayStart to \"false\" as it was \"true\""), false);
						}
						EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("DEBUG: Set Global:SuperDoomsDayStart to \"false\" as it was \"true\""), false);
						}
						EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("DEBUG: Set Global:TheEndStart to \"false\" as it was \"true\""), false);
						}
						EngiesChaosModVariables.MapVariables.get(world).TheEndStart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true) {
						if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("DEBUG: Set Global:EngiesWrathStart to \"false\" as it was \"true\""), false);
						}
						EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).SuperDoomsDayStart && EngiesChaosModVariables.MapVariables.get(world).TheEndStart) == false) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayTrackToggle == true) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("DEBUG: DoomsDay cleanup completed! Summoning DoomsDay..."), false);
							}
						}
						{
							Entity _ent = (findEntityInWorldRange(world, Player.class, 0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, 29999984));
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib EChaos summondoomsday");
							}
						}
					}
				});
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}