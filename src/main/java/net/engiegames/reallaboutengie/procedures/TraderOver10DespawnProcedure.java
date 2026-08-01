package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.TheRealEngieGamesHalloweenEntity;
import net.engiegames.reallaboutengie.entity.TheRealEngieGamesEntity;
import net.engiegames.reallaboutengie.entity.TheEndEntity;
import net.engiegames.reallaboutengie.entity.SuperDoomsDayEntity;
import net.engiegames.reallaboutengie.entity.ScorchedEntity;
import net.engiegames.reallaboutengie.entity.RoughianTheRealEngieGamesEntity;
import net.engiegames.reallaboutengie.entity.MindscapeEngieEntity;
import net.engiegames.reallaboutengie.entity.EngieGamesEntity;
import net.engiegames.reallaboutengie.entity.DoomsDayEntity;
import net.engiegames.reallaboutengie.entity.CosmicTheRealEngieGamesEntity;

import javax.annotation.Nullable;

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
				if (AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						if (!entity.level.isClientSide())
							entity.discard();
						AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if (entity instanceof SuperDoomsDayEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof TheEndEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberoftheend > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberoftheend = AllaboutengieModVariables.MapVariables.get(world).numberoftheend - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof EngieGamesEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofdistorted > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = AllaboutengieModVariables.MapVariables.get(world).numberofdistorted - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof MindscapeEngieEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofmindscapetradeable > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofmindscapetradeable = AllaboutengieModVariables.MapVariables.get(world).numberofmindscapetradeable - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof TheRealEngieGamesEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof ScorchedEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof CosmicTheRealEngieGamesEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			if (entity instanceof RoughianTheRealEngieGamesEntity) {
				if (AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames > 10) {
					if (entity.getPersistentData().getBoolean("CanDespawn") == true) {
						AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames - 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}