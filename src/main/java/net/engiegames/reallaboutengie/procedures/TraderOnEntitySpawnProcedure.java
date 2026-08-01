package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.entity.TheRealEngieGamesHalloweenEntity;
import net.engiegames.reallaboutengie.entity.TheRealEngieGamesEntity;
import net.engiegames.reallaboutengie.entity.TheEndEntity;
import net.engiegames.reallaboutengie.entity.SuperDoomsDayEntity;
import net.engiegames.reallaboutengie.entity.ScorchedEntity;
import net.engiegames.reallaboutengie.entity.RoughianTheRealEngieGamesEntity;
import net.engiegames.reallaboutengie.entity.EngieGamesEntity;
import net.engiegames.reallaboutengie.entity.DoomsDayEntity;
import net.engiegames.reallaboutengie.entity.CosmicTheRealEngieGamesEntity;

public class TraderOnEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("CanDespawn", true);
		if (entity instanceof DoomsDayEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays = AllaboutengieModVariables.MapVariables.get(world).numberofdoomsdays + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof SuperDoomsDayEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays = AllaboutengieModVariables.MapVariables.get(world).numberofsuperdoomsdays + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof TheEndEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberoftheend = AllaboutengieModVariables.MapVariables.get(world).numberoftheend + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof EngieGamesEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofdistorted = AllaboutengieModVariables.MapVariables.get(world).numberofdistorted + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof TheRealEngieGamesEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof ScorchedEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofengiegames + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof CosmicTheRealEngieGamesEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofcosmicengiegames + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof RoughianTheRealEngieGamesEntity) {
			AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames = AllaboutengieModVariables.MapVariables.get(world).numberofroughianengiegames + 1;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}