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
		if (EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderDoomsdaySpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderSuperDoomsdaySpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberoftheend >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderTheEndSpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberoftheend > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberofdistorted >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderEngieSpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofdistorted > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderMindscapeEngieSpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberofengiegames >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderEngieGamesSpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofengiegames > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderCosmicEngieGamesSpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames >= (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
			EngiesChaosModVariables.MapVariables.get(world).TraderRoughianEngieGamesSpawnLock = true;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames > (world.getLevelData().getGameRules().getInt(EngiesChaosModGameRules.TRADERMAXCOUNT))) {
				if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
	}
}