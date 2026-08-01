package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engieschaos.entity.TheRealEngieGamesEntity;
import engiegames.engieschaos.entity.TheEndEntity;
import engiegames.engieschaos.entity.SuperDoomsDayEntity;
import engiegames.engieschaos.entity.ScorchedEntity;
import engiegames.engieschaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engieschaos.entity.MindscapeEngieEntity;
import engiegames.engieschaos.entity.EngieGamesEntity;
import engiegames.engieschaos.entity.DoomsDayEntity;
import engiegames.engieschaos.entity.CosmicTheRealEngieGamesEntity;

@Mod.EventBusSubscriber
public class TraderOver10DespawnProcedure {
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
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/tradeable")))) {
			if (entity instanceof DoomsDayEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
						EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if (entity instanceof SuperDoomsDayEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof TheEndEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberoftheend > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberoftheend = EngiesChaosModVariables.MapVariables.get(world).numberoftheend - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof EngieGamesEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofdistorted > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = EngiesChaosModVariables.MapVariables.get(world).numberofdistorted - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof MindscapeEngieEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable = EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof TheRealEngieGamesEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof ScorchedEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof CosmicTheRealEngieGamesEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof RoughianTheRealEngieGamesEntity) {
				if (EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}