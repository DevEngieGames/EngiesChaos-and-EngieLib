package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.UUID;
import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;
import engiegames.engies_chaos.entity.DDayLightningSpawner2Entity;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class DoomsdayNormalProcedure {
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
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && !world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayEerie == false) {
					EngiesChaosModVariables.MapVariables.get(world).DoomsdayEerie = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:doomsday_eerie ambient @s");
							}
						}
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportedPlayers == false) {
					EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportTime = EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportTime + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportTime >= 23.15) {
						EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportedPlayers = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @s instant_health 1 28 true");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "worldborder set 338");
								}
							}
							{
								boolean _setval = false;
								entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ddayplayeraddedtodeadcount = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								boolean _setval = true;
								entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.healthreductiondday = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								boolean _setval = false;
								entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DoomsdayAlive = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								boolean _setval = true;
								entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.crucifixbypass = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "spreadplayers 0 0 0 128 false @s");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @s engies_chaos:gravity_coil");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @s engies_chaos:small_goblet");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @s engies_chaos:goblet");
								}
							}
							if (entityiterator.getUUID().equals(new Object() {
								UUID UUIDSafeParse(String s) {
									try {
										return UUID.fromString(s);
									} catch (Exception e) {
									}
									return new UUID(0, 0);
								}
							}.UUIDSafeParse("0b2e6bf517764c90a0797cd0addc1320")) || entityiterator.getUUID().equals(new Object() {
								UUID UUIDSafeParse(String s) {
									try {
										return UUID.fromString(s);
									} catch (Exception e) {
									}
									return new UUID(0, 0);
								}
							}.UUIDSafeParse("0b2e6bf5-1776-4c90-a079-7cd0addc1320")) || entityiterator.getUUID().equals(new Object() {
								UUID UUIDSafeParse(String s) {
									try {
										return UUID.fromString(s);
									} catch (Exception e) {
									}
									return new UUID(0, 0);
								}
							}.UUIDSafeParse("447fceafed574b92be559ae4a47b33bf")) || entityiterator.getUUID().equals(new Object() {
								UUID UUIDSafeParse(String s) {
									try {
										return UUID.fromString(s);
									} catch (Exception e) {
									}
									return new UUID(0, 0);
								}
							}.UUIDSafeParse("447fceaf-ed57-4b92-be55-9ae4a47b33bf"))) {
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @s engies_chaos:engie_goblet");
									}
								}
							}
						}
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayTeleportedPlayers == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTime == false) {
						EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTimeDelayTimer = EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTimeDelayTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTimeDelayTimer >= 41) {
							if (world instanceof Level _lvl26 && _lvl26.isDay()) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) (world.dayTime() + 100));
							} else if (!(world instanceof Level _lvl29 && _lvl29.isDay())) {
								EngiesChaosModVariables.MapVariables.get(world).DoomsdayNightTime = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (int index0 = 0; index0 < 15; index0++) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) (world.dayTime() + 100));
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelay == true) {
						EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelayTimer = EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelayTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelayTimer >= 37) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if (entityiterator instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:i_guess_this_is_dday"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueDelay == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum >= 1) {
							EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueTimer = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).DialogueDisappearTimer = EngiesChaosModVariables.MapVariables.get(world).DialogueDisappearTimer + 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (EngiesChaosModVariables.MapVariables.get(world).DialogueDisappearTimer >= 5) {
								EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginning == false) {
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginning == true) {
									EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							}
							if (EngiesChaosModVariables.MapVariables.get(world).DialogueDisappearTimer >= 10) {
								EngiesChaosModVariables.MapVariables.get(world).DialogueDisappearTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginning == false) {
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							}
						} else {
							if (EngiesChaosModVariables.MapVariables.get(world).pausedialogue == false) {
								EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueTimer = EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueTimer + 0.05;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueTimer >= 5) {
									if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 0) {
										EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 1;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 1;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 1) {
										EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 2;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 2;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 2) {
										EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 3;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 3;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 3) {
										EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 4;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 4;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginning = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									}
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginning == true) {
						EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginningTimer = EngiesChaosModVariables.MapVariables.get(world).StartDoomsdayBeginningTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayDialogueTimer >= 12.5) {
							EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).prophallowticking = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true && EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 338");
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a music minecraft:music.game");
						}
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).RX = Math.round(Mth.nextDouble(RandomSource.create(), -168, 168));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).RY = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ);
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).RZ = Math.round(Mth.nextDouble(RandomSource.create(), -168, 168));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds > 0) {
							EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds - 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds <= 0) {
							if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes != 0) {
								EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = 60;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes - 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							} else {
								if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddayhappened = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(95, () -> {
										EngiesChaosModVariables.MapVariables.get(world).DoomsdayHalf = 2;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								} else {
									EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).prophallowticking = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
								}
							}
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = EngiesChaosModVariables.MapVariables.get(world).lightningcooldown + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown - 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).missilecooldown = EngiesChaosModVariables.MapVariables.get(world).missilecooldown - 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).riftcooldown = EngiesChaosModVariables.MapVariables.get(world).riftcooldown - 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).spikecooldown = EngiesChaosModVariables.MapVariables.get(world).spikecooldown - 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown - 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).hordecooldown = EngiesChaosModVariables.MapVariables.get(world).hordecooldown - 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == true) {
						if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.4) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
								if ((world.getBlockState(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX, EngiesChaosModVariables.MapVariables.get(world).RY, EngiesChaosModVariables.MapVariables.get(world).RZ)))
										.is(BlockTags.create(new ResourceLocation("engies_chaos:ddaylightningstrikeable")))) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
										entityToSpawn.moveTo(EngiesChaosModVariables.MapVariables.get(world).RX,
												(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
												EngiesChaosModVariables.MapVariables.get(world).RZ, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
									entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								EngiesChaosMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
										entityToSpawn.moveTo(168, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
									EngiesChaosMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
											entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168), world.getRandom().nextFloat() * 360F, 0);
											if (entityToSpawn instanceof Mob _mobToSpawn)
												_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
											_level.addFreshEntity(entityToSpawn);
										}
										EngiesChaosMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new DDayLightningSpawner2Entity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER_2.get(), _level);
												entityToSpawn.moveTo((-168), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												_level.addFreshEntity(entityToSpawn);
											}
											EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
									});
								});
							}
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.5) {
							EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning");
							} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos lightning2");
								EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosMod.queueServerWork(10, () -> {
									EngiesChaosMod.queueServerWork(10, () -> {
										EngiesChaosMod.queueServerWork(10, () -> {
											EngiesChaosMod.queueServerWork(10, () -> {
												EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning = false;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
										});
									});
								});
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (Math.random() <= 0.75) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						MissileSpawnProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						RiftSpawnsProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						SpikeSpawnsProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						AvalancheSpawnProcedure.execute(world);
					}
					if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						HordeSpawnsProcedure.execute(world);
					}
				}
			}
		}
	}
}