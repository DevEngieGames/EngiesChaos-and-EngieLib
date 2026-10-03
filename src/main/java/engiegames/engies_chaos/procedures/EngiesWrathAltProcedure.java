package engiegames.engies_chaos.procedures;

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
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
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

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class EngiesWrathAltProcedure {
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
				if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == false) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s music minecraft:music.creative");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a music minecraft:music.game");
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathEerie == false) {
						EngiesChaosModVariables.MapVariables.get(world).EngiesWrathEerie = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, world.getServer());
						world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(false, world.getServer());
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							{
								Entity _ent = entityiterator;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:engieswrath_eerie ambient @s");
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportedPlayers == false) {
						EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportTime = EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportTime + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportTime >= 23.15) {
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathTeleportedPlayers = true;
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
								if (entityiterator instanceof Player _player) {
									ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GOBLET.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTime == false) {
						EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTimeDelayTimer = EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTimeDelayTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTimeDelayTimer >= 41) {
							if (world instanceof Level _lvl21 && _lvl21.isDay()) {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) (world.dayTime() + 100));
							} else if (!(world instanceof Level _lvl24 && _lvl24.isDay())) {
								EngiesChaosModVariables.MapVariables.get(world).EngiesWrathNightTime = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (int index0 = 0; index0 < 15; index0++) {
									if (world instanceof ServerLevel _level)
										_level.setDayTime((int) (world.dayTime() + 100));
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelay == true) {
						EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelayTimer = EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelayTimer + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelayTimer >= 37) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if (entityiterator instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:goodbye"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
								EngiesChaosModVariables.MapVariables.get(world).churchbellsewrath = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
							EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(160, () -> {
								EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelay = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						}
					} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDelay == false) {
						if (EngiesChaosModVariables.MapVariables.get(world).pausedialogue == true) {
							if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == false) {
								EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDisappearTimer = EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDisappearTimer + 0.05;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDisappearTimer >= 5) {
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDisappearTimer = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).pausedialogue = false;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								}
							} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
								EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueDisappearTimer = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).dialogueamount = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
						} else {
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueTimer = EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueTimer + 0.05;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathDialogueTimer >= 5) {
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
									EngiesChaosModVariables.MapVariables.get(world).EngiesWrathForceCreativePlayersAdventure = true;
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
									EngiesChaosModVariables.MapVariables.get(world).StartEngiesWrathBeginning = true;
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
					if (EngiesChaosModVariables.MapVariables.get(world).StartEngiesWrathBeginning == true) {
						EngiesChaosModVariables.MapVariables.get(world).StartEngiesWrathBeginning = false;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).ddaystoptimer = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5)) + 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(262, () -> {
							EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).prophallowticking = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, world.getServer());
						});
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart == true && EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "worldborder set 338");
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s music minecraft:music.creative");
							}
						}
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
							if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds > 0) {
								EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds - 0.05;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							}
							if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds <= 0) {
								if (EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes != 0) {
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerseconds = 60;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes = EngiesChaosModVariables.MapVariables.get(world).ewrathtimerminutes - 1;
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
							if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.1) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										{
											double _setval = 0.25;
											entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.lightningflashnum = _setval;
												capability.syncPlayerVariables(entityiterator);
											});
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"stopsound @s weather engies_chaos:extreme_lightning_strike");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
											}
										}
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX,
												Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
												EngiesChaosModVariables.MapVariables.get(world).RZ)));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									for (int index1 = 0; index1 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index1++) {
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)),
													Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
													EngiesChaosModVariables.MapVariables.get(world).RZ + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
											entityToSpawn.setVisualOnly(true);
											_level.addFreshEntity(entityToSpawn);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL,
														new Vec3(EngiesChaosModVariables.MapVariables.get(world).RX,
																Math.round(
																		world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
																EngiesChaosModVariables.MapVariables.get(world).RZ),
														Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL,
														new Vec3(EngiesChaosModVariables.MapVariables.get(world).RX,
																Math.round(
																		world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
																EngiesChaosModVariables.MapVariables.get(world).RZ),
														Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
								} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
									EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										{
											double _setval = 0.25;
											entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.lightningflashnum = _setval;
												capability.syncPlayerVariables(entityiterator);
											});
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"stopsound @s weather engies_chaos:extreme_lightning_strike");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
											}
										}
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168)));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
									EngiesChaosMod.queueServerWork(10, () -> {
										for (Entity entityiterator : new ArrayList<>(world.players())) {
											{
												double _setval = 0.25;
												entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.lightningflashnum = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"stopsound @s weather engies_chaos:extreme_lightning_strike");
												}
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
												}
											}
										}
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), -168)));
											entityToSpawn.setVisualOnly(true);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168)),
													Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168)),
													Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
										EngiesChaosMod.queueServerWork(10, () -> {
											for (Entity entityiterator : new ArrayList<>(world.players())) {
												{
													double _setval = 0.25;
													entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.lightningflashnum = _setval;
														capability.syncPlayerVariables(entityiterator);
													});
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"stopsound @s weather engies_chaos:extreme_lightning_strike");
													}
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
													}
												}
											}
											if (world instanceof ServerLevel _level) {
												LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
												entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(-168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), -168)));
												entityToSpawn.setVisualOnly(true);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands()
														.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168)), Vec2.ZERO,
																_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands()
														.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168)), Vec2.ZERO,
																_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
											EngiesChaosMod.queueServerWork(10, () -> {
												for (Entity entityiterator : new ArrayList<>(world.players())) {
													{
														double _setval = 0.25;
														entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.lightningflashnum = _setval;
															capability.syncPlayerVariables(entityiterator);
														});
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"stopsound @s weather engies_chaos:extreme_lightning_strike");
														}
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
														}
													}
												}
												if (world instanceof ServerLevel _level) {
													LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
													entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(-168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168)));
													entityToSpawn.setVisualOnly(true);
													_level.addFreshEntity(entityToSpawn);
												}
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands()
															.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168), Vec2.ZERO,
																	_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands()
															.performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168), Vec2.ZERO, _level, 4, "",
																			Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
											});
										});
									});
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).extremeddaylightningenabled == false) {
							if (EngiesChaosModVariables.MapVariables.get(world).lightningcooldown >= 0.25) {
								EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = 0;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								if (Mth.nextDouble(RandomSource.create(), 1, 100) < 85) {
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										{
											double _setval = 0.25;
											entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.lightningflashnum = _setval;
												capability.syncPlayerVariables(entityiterator);
											});
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"stopsound @s weather engies_chaos:extreme_lightning_strike");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
											}
										}
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX,
												Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
												EngiesChaosModVariables.MapVariables.get(world).RZ)));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									for (int index2 = 0; index2 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index2++) {
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(EngiesChaosModVariables.MapVariables.get(world).RX + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)),
													Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
													EngiesChaosModVariables.MapVariables.get(world).RZ + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
											entityToSpawn.setVisualOnly(true);
											_level.addFreshEntity(entityToSpawn);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL,
														new Vec3(EngiesChaosModVariables.MapVariables.get(world).RX,
																Math.round(
																		world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
																EngiesChaosModVariables.MapVariables.get(world).RZ),
														Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL,
														new Vec3(EngiesChaosModVariables.MapVariables.get(world).RX,
																Math.round(
																		world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) EngiesChaosModVariables.MapVariables.get(world).RX, (int) EngiesChaosModVariables.MapVariables.get(world).RZ)),
																EngiesChaosModVariables.MapVariables.get(world).RZ),
														Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
								} else if (Mth.nextDouble(RandomSource.create(), 1, 100) >= 85) {
									EngiesChaosModVariables.MapVariables.get(world).lightningcooldown = -2.5;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										{
											double _setval = 0.25;
											entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.lightningflashnum = _setval;
												capability.syncPlayerVariables(entityiterator);
											});
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"stopsound @s weather engies_chaos:extreme_lightning_strike");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
											}
										}
									}
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168)));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, 168)), 168),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
									EngiesChaosMod.queueServerWork(10, () -> {
										for (Entity entityiterator : new ArrayList<>(world.players())) {
											{
												double _setval = 0.25;
												entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.lightningflashnum = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"stopsound @s weather engies_chaos:extreme_lightning_strike");
												}
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
												}
											}
										}
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), -168)));
											entityToSpawn.setVisualOnly(true);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168)),
													Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 168, -168)), (-168)),
													Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
										EngiesChaosMod.queueServerWork(10, () -> {
											for (Entity entityiterator : new ArrayList<>(world.players())) {
												{
													double _setval = 0.25;
													entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.lightningflashnum = _setval;
														capability.syncPlayerVariables(entityiterator);
													});
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"stopsound @s weather engies_chaos:extreme_lightning_strike");
													}
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
													}
												}
											}
											if (world instanceof ServerLevel _level) {
												LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
												entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(-168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), -168)));
												entityToSpawn.setVisualOnly(true);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands()
														.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168)), Vec2.ZERO,
																_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands()
														.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, -168)), (-168)), Vec2.ZERO,
																_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
											EngiesChaosMod.queueServerWork(10, () -> {
												for (Entity entityiterator : new ArrayList<>(world.players())) {
													{
														double _setval = 0.25;
														entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.lightningflashnum = _setval;
															capability.syncPlayerVariables(entityiterator);
														});
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"stopsound @s weather engies_chaos:extreme_lightning_strike");
														}
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"playsound engies_chaos:extreme_lightning_strike weather @s ~ ~ ~ 0.5");
														}
													}
												}
												if (world instanceof ServerLevel _level) {
													LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
													entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(-168, Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168)));
													entityToSpawn.setVisualOnly(true);
													_level.addFreshEntity(entityToSpawn);
												}
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands()
															.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168), Vec2.ZERO,
																	_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands()
															.performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3((-168), Math.round(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, -168, 168)), 168), Vec2.ZERO, _level, 4, "",
																			Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("damages @a[distance=..12.5] " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " 5"));
											});
										});
									});
								}
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (Math.random() <= 0.15) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn())), Vec2.ZERO, _level, 4,
													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "EngieLib EChaos darkness");
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).missilecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							MissileSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).riftcooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							RiftSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).spikecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							SpikeSpawnsProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							AvalancheSpawnProcedure.execute(world);
						}
						if (EngiesChaosModVariables.MapVariables.get(world).hordecooldown <= 0) {
							EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 2.5));
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							HordeSpawnsProcedure.execute(world);
						}
					}
				}
			}
		}
	}
}