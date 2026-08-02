package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (!(!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty())) {
			if (Math.random() > 0.25) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				if (entity instanceof BiblicallyAccurateEngieEntity _datEntSetI)
					_datEntSetI.getEntityData().set(BiblicallyAccurateEngieEntity.DATA_style, (int) Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)));
				EntitySpawnsProcedure.execute(world, entity);
			}
		}
	}
}