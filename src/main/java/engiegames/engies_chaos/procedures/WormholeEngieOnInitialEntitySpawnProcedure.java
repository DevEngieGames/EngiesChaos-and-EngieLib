package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.entity.WormholeEngieEntity;

public class WormholeEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(WormholeEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(250 / 2d), e -> true).isEmpty()) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else if (!(!world.getEntitiesOfClass(WormholeEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(250 / 2d), e -> true).isEmpty())) {
			if (Math.random() > 0.00005) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}