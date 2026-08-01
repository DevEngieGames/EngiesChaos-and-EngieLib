package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class ThunderstormChaosProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == false && EngiesChaosModVariables.MapVariables.get(world).sddaystart == false && EngiesChaosModVariables.MapVariables.get(world).thestart == false
					&& EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == false) {
				if ((world instanceof ServerLevel _serverLevelGR2 && _serverLevelGR2.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true
						&& (world instanceof ServerLevel _serverLevelGR3 && _serverLevelGR3.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == false) {
					EngiesChaosModVariables.MapVariables.get(world).heavylightningcd = EngiesChaosModVariables.MapVariables.get(world).heavylightningcd + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).heavylightningcd >= 0.9) {
						EngiesChaosModVariables.MapVariables.get(world).heavylightningcd = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 50) {
								EngiesChaosMod.queueServerWork(1, () -> {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER
												.get().spawn(
														_level, BlockPos.containing(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), -168, 168),
																world.getLevelData().getSpawnPos().getY(), entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), -168, 168)),
														EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								});
							}
						}
					}
				} else if ((world instanceof ServerLevel _serverLevelGR11 && _serverLevelGR11.getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING)) == true
						&& (world instanceof ServerLevel _serverLevelGR12 && _serverLevelGR12.getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING)) == true) {
					EngiesChaosModVariables.MapVariables.get(world).extremelightningcd = EngiesChaosModVariables.MapVariables.get(world).extremelightningcd + 0.05;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (EngiesChaosModVariables.MapVariables.get(world).extremelightningcd >= 0.9) {
						EngiesChaosModVariables.MapVariables.get(world).extremelightningcd = 0;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (Mth.nextDouble(RandomSource.create(), 1, 100) < 50) {
								EngiesChaosMod.queueServerWork(1, () -> {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = EngiesChaosModEntities.D_DAY_LIGHTNING_SPAWNER
												.get().spawn(
														_level, BlockPos.containing(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerX + Mth.nextDouble(RandomSource.create(), -168, 168),
																world.getLevelData().getSpawnPos().getY(), entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerZ + Mth.nextDouble(RandomSource.create(), -168, 168)),
														EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
								});
							}
						}
					}
				}
			}
		}
	}
}