package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engieschaos.entity.TheRealEngieGamesEntity;
import engiegames.engieschaos.entity.TheEndEntity;
import engiegames.engieschaos.entity.SuperDoomsDayEntity;
import engiegames.engieschaos.entity.ScorchedEntity;
import engiegames.engieschaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engieschaos.entity.EngieGamesEntity;
import engiegames.engieschaos.entity.DoomsDayEntity;
import engiegames.engieschaos.entity.CosmicTheRealEngieGamesEntity;

public class TraderOnEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("CanDespawn", true);
		if (entity instanceof DoomsDayEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofdoomsdays + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof SuperDoomsDayEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays = EngiesChaosModVariables.MapVariables.get(world).numberofsuperdoomsdays + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof TheEndEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberoftheend = EngiesChaosModVariables.MapVariables.get(world).numberoftheend + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof EngieGamesEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofdistorted = EngiesChaosModVariables.MapVariables.get(world).numberofdistorted + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof TheRealEngieGamesEntity || entity instanceof TheRealEngieGamesHalloweenEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof ScorchedEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofengiegames + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof CosmicTheRealEngieGamesEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofcosmicengiegames + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof RoughianTheRealEngieGamesEntity) {
			EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames = EngiesChaosModVariables.MapVariables.get(world).numberofroughianengiegames + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		}
	}
}