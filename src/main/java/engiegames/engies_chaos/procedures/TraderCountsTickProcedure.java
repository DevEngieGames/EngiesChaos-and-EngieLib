package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engies_chaos.entity.TheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.TheEndEntity;
import engiegames.engies_chaos.entity.SuperDoomsDayEntity;
import engiegames.engies_chaos.entity.ScorchedEntity;
import engiegames.engies_chaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.MindscapeEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesEntity;
import engiegames.engies_chaos.entity.DoomsDayEntity;
import engiegames.engies_chaos.entity.CosmicTheRealEngieGamesEntity;

@Mod.EventBusSubscriber
public class TraderCountsTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT)) == 0) {
			if (entity instanceof DoomsDayEntity || entity instanceof SuperDoomsDayEntity || entity instanceof TheEndEntity || entity instanceof EngieGamesEntity || entity instanceof MindscapeEngieEntity || entity instanceof TheRealEngieGamesEntity
					|| entity instanceof ScorchedEntity || entity instanceof TheRealEngieGamesHalloweenEntity || entity instanceof CosmicTheRealEngieGamesEntity || entity instanceof RoughianTheRealEngieGamesEntity) {
				EngiesChaosModVariables.MapVariables.get(world).TraderDoomsdaySpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderSuperDoomsdaySpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderTheEndSpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderEngieSpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderMindscapeEngieSpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderEngieGamesSpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderCosmicEngieGamesSpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).TraderRoughianEngieGamesSpawnLock = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		} else if ((world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT)) != 0) {
			if (entity instanceof DoomsDayEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderDoomsdaySpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderDoomsdaySpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof SuperDoomsDayEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderSuperDoomsdaySpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderSuperDoomsdaySpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof TheEndEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberoftheend >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderTheEndSpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderTheEndSpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberoftheend > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof EngieGamesEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofdistorted >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderEngieSpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderEngieSpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofdistorted > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof MindscapeEngieEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderMindscapeEngieSpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderMindscapeEngieSpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof TheRealEngieGamesEntity || entity instanceof ScorchedEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofengiegames >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderEngieGamesSpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderEngieGamesSpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofengiegames > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof CosmicTheRealEngieGamesEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderCosmicEngieGamesSpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderCosmicEngieGamesSpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof RoughianTheRealEngieGamesEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					EngiesChaosModVariables.MapVariables.get(world).TraderRoughianEngieGamesSpawnLock = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).TraderRoughianEngieGamesSpawnLock = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}