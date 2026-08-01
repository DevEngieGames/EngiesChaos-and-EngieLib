package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.HeWhoGamesHostileEntity;

public class HeWhoGamesHostileNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(HeWhoGamesHostileEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(100000 / 2d), e -> true).isEmpty()) && EngiesChaosModVariables.MapVariables.get(world).nightmare >= 25
				&& EngiesChaosModVariables.MapVariables.get(world).hewhowatches == true) {
			return true;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).nightmare >= 25 && EngiesChaosModVariables.MapVariables.get(world).hewhowatches == true)) {
			return false;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).nightmare < 25)) {
			return false;
		} else if (!(EngiesChaosModVariables.MapVariables.get(world).hewhowatches == true)) {
			return false;
		}
		return true;
	}
}