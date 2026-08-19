package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class MindscapeEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.15 && Math.random() > 0.05) {
			entity.getPersistentData().putBoolean("mindscapecandespawn", false);
			entity.getPersistentData().putBoolean("CanDespawn", true);
			EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable = EngiesChaosModVariables.MapVariables.get(world).numberofmindscapetradeable + 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
		} else if (Math.random() > 0.15) {
			entity.getPersistentData().putBoolean("mindscapecandespawn", true);
		}
	}
}