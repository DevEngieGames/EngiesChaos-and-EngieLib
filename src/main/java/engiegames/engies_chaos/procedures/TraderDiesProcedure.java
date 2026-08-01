package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEntities;
import engiegames.engies_chaos.entity.XEngieGamesEntity;
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
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class TraderDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:mobs/tradeable")))) {
			EngiesChaosMod.queueServerWork(1, () -> {
				if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).crucifixsavedentity == false) {
					if (entity instanceof DoomsDayEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof SuperDoomsDayEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof TheEndEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberoftheend = EngiesChaosModVariables.MapVariables.get(world).numberoftheend - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof EngieGamesEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = EngiesChaosModVariables.MapVariables.get(world).numberofdistorted - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof MindscapeEngieEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable = EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof TheRealEngieGamesEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof ScorchedEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof CosmicTheRealEngieGamesEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof RoughianTheRealEngieGamesEntity) {
						EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof XEngieGamesEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EngiesChaosModEntities.X_ENGIE_GAMES.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(entity.getYRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setXRot(entity.getXRot());
								entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z()));
							}
						}
					}
				}
			});
		}
	}
}