package engiegames.engies_chaos.procedures;

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
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class DoomsdayDialogueProcedure {
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
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (!world.isClientSide()) {
				if (EngiesChaosModVariables.MapVariables.get(world).OHBOY == true && EngiesChaosModVariables.MapVariables.get(world).DoomsDayStart == true) {
					EngiesChaosModVariables.MapVariables.get(world).timecheckstop = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).ddaytimenighttimerblock == false) {
						EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight = EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).TimeUntilNight >= 43) {
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(false, world.getServer());
							if (world instanceof Level _lvl5 && _lvl5.isDay()) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
													.withSuppressedOutput(),
											"time add 100t");
							}
							if (!(world instanceof Level _lvl8 && _lvl8.isDay())) {
								EngiesChaosModVariables.MapVariables.get(world).ddaytimenighttimerblock = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								for (int index0 = 0; index0 < 5; index0++) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
														.withSuppressedOutput(),
												"time add 100t");
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).ddaydialoguetimeblock == false) {
						EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart = EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart + 0.05;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (EngiesChaosModVariables.MapVariables.get(world).DialogueCooldownStart >= 37) {
							EngiesChaosModVariables.MapVariables.get(world).ddaydialoguetimeblock = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).churchbellsnorm = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ddayawardadvancement1 = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = true;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							EngiesChaosMod.queueServerWork(200, () -> {
								EngiesChaosModVariables.MapVariables.get(world).ShowObjectiveOverlay = false;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
							});
							EngiesChaosMod.queueServerWork(100, () -> {
								EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 1;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
								EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								EngiesChaosMod.queueServerWork(120, () -> {
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
								});
								EngiesChaosMod.queueServerWork(200, () -> {
									EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 2;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
									EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									EngiesChaosMod.queueServerWork(120, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
									});
									EngiesChaosMod.queueServerWork(200, () -> {
										EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 3;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
										EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										EngiesChaosMod.queueServerWork(140, () -> {
											EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
										});
										EngiesChaosMod.queueServerWork(200, () -> {
											EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 4;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).ddaydialogue = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(120, () -> {
												EngiesChaosModVariables.MapVariables.get(world).ddaydialoguenum = 0;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
											EngiesChaosMod.queueServerWork(1, () -> {
												EngiesChaosModVariables.MapVariables.get(world).stopeeriesound = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												EngiesChaosModVariables.MapVariables.get(world).ddaymainsongplay = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
											EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes = Math.round(Mth.nextDouble(RandomSource.create(), 7, 30));
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(1, () -> {
												if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 30) {
													EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextDouble(RandomSource.create(), 0, 30));
													EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												} else if (EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes == 7) {
													EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextDouble(RandomSource.create(), 42, 59));
													EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												} else {
													EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds = Math.round(Mth.nextDouble(RandomSource.create(), 0, 59));
													EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												}
											});
											EngiesChaosMod.queueServerWork(2, () -> {
												EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime = 60 * EngiesChaosModVariables.MapVariables.get(world).ddaytimerminutes
														+ EngiesChaosModVariables.MapVariables.get(world).ddaytimerseconds;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
											EngiesChaosMod.queueServerWork(3, () -> {
												EngiesChaosModVariables.MapVariables.get(world).doomsdaytimer = EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											});
											EngiesChaosModVariables.MapVariables.get(world).darknessretrycooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20)) + 3;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).missilecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20)) + 3;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).riftcooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20)) + 3;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).spikecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20)) + 3;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).avalanchecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20)) + 3;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).hordecooldown = Math.round(Mth.nextDouble(RandomSource.create(), 1, 20)) + 3;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).ddayprophnumb = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DDayRiftAmount = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DDayMissileAmount = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = 0;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).ddayhalf1 = true;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosModVariables.MapVariables.get(world).doomsdayprophwait = false;
											EngiesChaosModVariables.MapVariables.get(world).syncData(world);
											EngiesChaosMod.queueServerWork(262, () -> {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""),
																	_level.getServer(), null).withSuppressedOutput(),
															("effect give @a minecraft:regeneration " + new java.text.DecimalFormat("##").format(EngiesChaosModVariables.MapVariables.get(world).doomsdaymaxtime) + " 1 true"));
												EngiesChaosModVariables.MapVariables.get(world).ddayprophshow = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												EngiesChaosModVariables.MapVariables.get(world).ddaystart = true;
												EngiesChaosModVariables.MapVariables.get(world).syncData(world);
												world.getLevelData().getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, world.getServer());
												world.getLevelData().getGameRules().getRule(GameRules.RULE_DOFIRETICK).set(false, world.getServer());
												world.getLevelData().getGameRules().getRule(GameRules.RULE_FIRE_DAMAGE).set(false, world.getServer());
											});
										});
									});
								});
							});
						}
					}
				}
			}
		}
	}
}