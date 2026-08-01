package engiegames.engieschaos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModEntities;
import engiegames.engieschaos.entity.YellowLightningEntity;
import engiegames.engieschaos.entity.NormalEntity;
import engiegames.engieschaos.entity.MOABEntity;
import engiegames.engieschaos.entity.DDayLightningSpawnerEntity;
import engiegames.engieschaos.entity.DDAYRiftEntity;
import engiegames.engieschaos.entity.BlueBurstEntity;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class DoomsdayChaosProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getY(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double y, Entity entity) {
		execute(null, world, y, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true && EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
				entity.getPersistentData().putDouble("doomsdaymainsongtimer", (entity.getPersistentData().getDouble("doomsdaymainsongtimer") + 0.05));
				if (entity.getPersistentData().getDouble("doomsdaymainsongtimer") >= 140) {
					entity.getPersistentData().putDouble("doomsdaymainsongtimer", 0);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosMod.queueServerWork(1, () -> {
						if (EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongstart == false) {
							EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongstart = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:doomsday_start")), SoundSource.MUSIC, (float) 0.5, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:doomsday_start")), SoundSource.MUSIC, (float) 0.5, 1, false);
								}
							}
						}
					});
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather thunder");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
					}
				}
				entity.getPersistentData().putDouble("doomsdaytimer", (entity.getPersistentData().getDouble("doomsdaytimer") + 0.05));
				if (entity.getPersistentData().getDouble("doomsdaytimer") >= 720) {
					entity.getPersistentData().putDouble("doomsdaytimer", 0);
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather clear");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @a");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @p instant_health 1 28 true");
						}
					}
					{
						boolean _setval = false;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.healthreductiondday = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					EngiesChaosModVariables.MapVariables.get(world).waittildoomsday = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).ddaystart = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).ddaywait = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).Risk = 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
					if (EngiesChaosModVariables.MapVariables.get(world).timecheckstop == true) {
						if (world instanceof ServerLevel _level)
							_level.setDayTime((int) EngiesChaosModVariables.MapVariables.get(world).timebeforespecial);
						EngiesChaosMod.queueServerWork(5, () -> {
							EngiesChaosModVariables.MapVariables.get(world).timecheckstop = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					}
					if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
						if (!(entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
								&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:conqueror"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
				}
				if (EngiesChaosModVariables.MapVariables.get(world).darknesscooldown == true) {
					entity.getPersistentData().putDouble("darknessretrycooldown", (entity.getPersistentData().getDouble("darknessretrycooldown") + 0.05));
					if (entity.getPersistentData().getDouble("darknessretrycooldown") >= 5) {
						entity.getPersistentData().putDouble("darknessretrycooldown", 0);
						if (Math.random() <= 0.25) {
							EngiesChaosModVariables.MapVariables.get(world).darknesscooldown = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 18 1 true");
									}
								}
							});
						}
					}
				} else {
					entity.getPersistentData().putDouble("darknessretrycooldown", (entity.getPersistentData().getDouble("darknessretrycooldown") + 0.05));
					if (entity.getPersistentData().getDouble("darknessretrycooldown") >= 5) {
						entity.getPersistentData().putDouble("darknessretrycooldown", 0);
						if (Math.random() <= 0.25) {
							EngiesChaosModVariables.MapVariables.get(world).darknesscooldown = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @a darkness");
									}
								}
							});
						}
					}
				}
				entity.getPersistentData().putDouble("missilecooldown", (entity.getPersistentData().getDouble("missilecooldown") + 0.05));
				if (entity.getPersistentData().getDouble("missilecooldown") >= 5) {
					entity.getPersistentData().putDouble("missilecooldown", 0);
					if (Math.random() <= 0.25) {
						EngiesChaosMod.queueServerWork(1, () -> {
							if (Math.random() <= 0.25) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new YellowLightningEntity(EngiesChaosModEntities.YELLOW_LIGHTNING.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new YellowLightningEntity(EngiesChaosModEntities.YELLOW_LIGHTNING.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.random() <= 0.5 && Math.random() > 0.25) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new BlueBurstEntity(EngiesChaosModEntities.BLUE_BURST.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new BlueBurstEntity(EngiesChaosModEntities.BLUE_BURST.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.random() <= 0.75 && Math.random() > 0.5) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new NormalEntity(EngiesChaosModEntities.NORMAL.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new NormalEntity(EngiesChaosModEntities.NORMAL.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.random() <= 1 && Math.random() > 0.75) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new MOABEntity(EngiesChaosModEntities.MOAB.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new MOABEntity(EngiesChaosModEntities.MOAB.get(), _level);
										entityToSpawn.moveTo(
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY),
												((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
												world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						});
					}
				}
				entity.getPersistentData().putDouble("Nlightningcooldown", (entity.getPersistentData().getDouble("Nlightningcooldown") + 0.05));
				if (entity.getPersistentData().getDouble("Nlightningcooldown") >= 0.5) {
					entity.getPersistentData().putDouble("Nlightningcooldown", 0);
					if (Math.random() <= 0.75) {
						EngiesChaosMod.queueServerWork(1, () -> {
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96)),
											y, ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.random() >= 0.25 && Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96)),
											y, ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.random() >= 0.5 && Math.random() < 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96)),
											y, ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.random() >= 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDayLightningSpawnerEntity(EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96)),
											y, ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						});
					}
				}
				entity.getPersistentData().putDouble("riftcooldown", (entity.getPersistentData().getDouble("riftcooldown") + 0.05));
				if (entity.getPersistentData().getDouble("riftcooldown") >= 5) {
					entity.getPersistentData().putDouble("riftcooldown", 0);
					if (Math.random() <= 0.25) {
						EngiesChaosMod.queueServerWork(1, () -> {
							if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.random() >= 0.25 && Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 96)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.random() >= 0.5 && Math.random() < 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.random() >= 0.75) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new DDAYRiftEntity(EngiesChaosModEntities.DDAY_RIFT.get(), _level);
									entityToSpawn.moveTo(((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 96)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerY + Mth.nextDouble(RandomSource.create(), 5, 40)),
											((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 96)),
											world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						});
					}
				}
			}
		}
	}
}