package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.items.ItemHandlerHelper;
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
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.UUID;
import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class TheEndAltProcedure {
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
			if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == false) {
					if (EngiesChaosModVariables.MapVariables.get(world).TheEndEerie == false) {
						EngiesChaosModVariables.MapVariables.get(world).TheEndEerie = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, world.getServer());
						world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(false, world.getServer());
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:theend_eerie ambient @s");
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportedPlayers == false) {
						EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportTime = EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportTime + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportTime >= 23.15) {
							EngiesChaosModVariables.MapVariables.get(world).TheEndTeleportedPlayers = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @s instant_health 1 28 true");
									}
								}
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "worldborder set 338");
									}
								}
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												("execute in minecraft:overworld run tp @s 0 " + new java.text.DecimalFormat("##").format(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)) + " 0"));
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
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "spreadplayers 0 0 0 128 false @s");
									}
								}
								if (entityiterator instanceof Player _player) {
									ItemStack _setstack = new ItemStack(EngiesChaosModItems.GRAVITY_COIL.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entityiterator instanceof Player _player) {
									ItemStack _setstack = new ItemStack(EngiesChaosModItems.SMALL_GOBLET.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entityiterator instanceof Player _player) {
									ItemStack _setstack = new ItemStack(EngiesChaosModItems.GOBLET.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
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
									if (entityiterator instanceof Player _player) {
										ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GOBLET.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).TheEndNightTime == false) {
						EngiesChaosModVariables.MapVariables.get(world).TheEndNightTimeDelayTimer = EngiesChaosModVariables.MapVariables.get(world).TheEndNightTimeDelayTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndNightTimeDelayTimer >= 41) {
							if (world instanceof Level _lvl30 && _lvl30.isDay()) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) (world.dayTime() + 100));
							} else if (!(world instanceof Level _lvl33 && _lvl33.isDay())) {
								EngiesChaosModVariables.MapVariables.get(world).TheEndNightTime = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (int index0 = 0; index0 < 15; index0++) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) (world.dayTime() + 100));
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelay == true) {
						EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelayTimer = EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelayTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelayTimer >= 37) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if (entityiterator instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:theendofyourstory"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
								EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
							EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(160, () -> {
								EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
							EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelay = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDelay == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).pausedialogue == true) {
							if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == false) {
								EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDisappearTimer = EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDisappearTimer + 0.05;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDisappearTimer >= 5) {
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDisappearTimer = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
								EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueDisappearTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						} else {
							EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueTimer = EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueTimer + 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (EngiesChaosModVariables.MapVariables.get(world).TheEndDialogueTimer >= 5) {
								if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 0) {
									EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 1;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 1;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 1) {
									EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 2;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 2;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 2) {
									EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 3;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 3;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 3) {
									EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 4;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 4;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else if (EngiesChaosModVariables.MapVariables.get(world).dialogueamount == 4) {
									EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 5;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 5;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).StartTheEndBeginning = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).stopeeriesound == true) {
						EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s ambient engies_chaos:doomsday_eerie");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s ambient engies_chaos:theend_eerie");
								}
							}
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s ambient engies_chaos:engieswrath_eerie");
								}
							}
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == false) {
								{
									boolean _setval = true;
									entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.DoomsdayAlive = _setval;
										capability.syncPlayerVariables(entityiterator);
									});
								}
								EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount + 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).StartTheEndBeginning == true) {
						EngiesChaosModVariables.MapVariables.get(world).StartTheEndBeginning = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(262, () -> {
							EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).prophallowticking = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, world.getServer());
						});
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).TheEndStart == true && EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 338");
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a music minecraft:music.game");
							}
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).RX = Mth.nextInt(RandomSource.create(), -168, 168);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).RZ = Mth.nextInt(RandomSource.create(), -168, 168);
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).ddayoncleanup == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer == false) {
							if (EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds > 0) {
								EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = EngiesChaosModVariables.MapVariables.get(world).sddaytimerseconds - 0.05;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
							if (EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds <= 0) {
								if (EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes != 0) {
									EngiesChaosModVariables.MapVariables.get(world).theendtimerseconds = 60;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes = EngiesChaosModVariables.MapVariables.get(world).theendtimerminutes - 1;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								} else {
									if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 4) {
										EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = 0;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).DDAYCleanup = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddayhappened = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									} else if (EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb == 2) {
										EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = 0;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosMod.queueServerWork(95, () -> {
											EngiesChaosModVariables.MapVariables.get(world).DoomsdayHalf = 2;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
									} else {
										EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = 0;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).hordespawnstoggle = false;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosMod.queueServerWork(200, () -> {
											EngiesChaosModVariables.MapVariables.get(world).prophallowticking = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
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
									DoomsdayNormalLightningProcedure.execute(world, EngiesChaosModVariables.MapVariables.get(world).RX,
											Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
											EngiesChaosModVariables.MapVariables.get(world).RZ);
								} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
									EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									DoomsdayCornerLightningProcedure.execute(world, 168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168);
									EngiesChaosMod.queueServerWork(10, () -> {
										DoomsdayCornerLightningProcedure.execute(world, 168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), -168);
										EngiesChaosMod.queueServerWork(10, () -> {
											DoomsdayCornerLightningProcedure.execute(world, -168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), -168);
											EngiesChaosMod.queueServerWork(10, () -> {
												DoomsdayCornerLightningProcedure.execute(world, -168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168);
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
									DoomsdayNormalLightningProcedure.execute(world, EngiesChaosModVariables.MapVariables.get(world).RX,
											Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
											EngiesChaosModVariables.MapVariables.get(world).RZ);
								} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
									EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									DoomsdayCornerLightningProcedure.execute(world, 168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168);
									EngiesChaosMod.queueServerWork(10, () -> {
										DoomsdayCornerLightningProcedure.execute(world, 168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), -168);
										EngiesChaosMod.queueServerWork(10, () -> {
											DoomsdayCornerLightningProcedure.execute(world, -168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), -168);
											EngiesChaosMod.queueServerWork(10, () -> {
												DoomsdayCornerLightningProcedure.execute(world, -168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168);
											});
										});
									});
								}
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 10));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Math.random() <= 0.45) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							MissileSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							RiftSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							SpikeSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							AvalancheSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							HordeSpawnsProcedure.execute(world);
						}
					}
				}
			}
		}
	}
}