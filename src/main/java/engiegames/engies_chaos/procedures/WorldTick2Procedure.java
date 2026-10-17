package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class WorldTick2Procedure {
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
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.RANDOM) == true) {
				EngiesChaosModVariables.MapVariables.get(world).random25minutetimer = EngiesChaosModVariables.MapVariables.get(world).random25minutetimer + 0.05;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (EngiesChaosModVariables.MapVariables.get(world).random25minutetimer >= 1500) {
					EngiesChaosModVariables.MapVariables.get(world).random25minutetimer = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if ((EngiesChaosModVariables.MapVariables.get(world).DoomsdayStart || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayStart || EngiesChaosModVariables.MapVariables.get(world).TheEndStart
							|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathStart) == false) {
						if (Math.random() <= 0.25) {
							if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
								if (Math.random() <= 0.125) {
									world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.DOOMSDAY_TOGGLE).set(false, world.getServer());
								}
								if (Math.random() <= 0.25) {
									world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE)), world.getServer());
								}
								if (Math.random() <= 0.25) {
									world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.THE_END_TOGGLE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.THE_END_TOGGLE)), world.getServer());
								}
								if (Math.random() <= 0.25) {
									world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE)), world.getServer());
								}
								if (Math.random() <= 0.25) {
									world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING)),
											world.getServer());
								}
							} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == false) {
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.DOOMSDAY_TOGGLE).set(true, world.getServer());
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.SUPER_DOOMSDAY_TOGGLE).set(false, world.getServer());
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.THE_END_TOGGLE).set(false, world.getServer());
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENGIES_WRATH_TOGGLE).set(false, world.getServer());
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING).set(false, world.getServer());
							}
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.HEAVY_LIGHTNING).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.EXTREME_LIGHTNING).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENRAGED_ZOMBIES_TOGGLE)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.ONE_HP).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ONE_HP)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.NIGHTMARE_DIFFICULTY)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.INSANITY_DIFFICULTY).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.INSANITY_DIFFICULTY)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.TRUE_HARDCORE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_HARDCORE)), world.getServer());
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.TRUE_HARDCORE_LIFE_COUNT).set((int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 25)), world.getServer());
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								{
									Entity _ent = entityiterator;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("EngiesChaos Lives Set2 @s " + Math.round(Mth.nextDouble(RandomSource.create(), 1, 25))));
									}
								}
							}
						}
						if (Math.random() <= 0.25) {
							if ((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == false) {
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.APOCALYPSE_ONE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE)), world.getServer());
							} else if ((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)) == false) {
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.APOCALYPSE_TWO).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO)), world.getServer());
							} else if ((world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO)) == false) {
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.APOCALYPSE_THREE).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE)), world.getServer());
							} else {
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.APOCALYPSE_ONE).set(false, world.getServer());
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.APOCALYPSE_TWO).set(false, world.getServer());
								world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.APOCALYPSE_THREE).set(false, world.getServer());
							}
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.DO_SHARKO_SPAWNING).set((!world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DO_SHARKO_SPAWNING)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.DOOMSDAY_SUB_DISASTER_LIMIT).set((int) Math.round(Mth.nextDouble(RandomSource.create(), 250, 1250)), world.getServer());
						}
						if (Math.random() <= 0.25) {
							world.getLevelData().getGameRules().getRule(EngiesChaosModGameRules.TRADERMAXCOUNT).set((int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 25)), world.getServer());
						}
					}
				}
			}
		}
	}
}