package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieColdSeasonEntity;

import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BiblicallyAccurateEngieStyle2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BiblicallyAccurateEngieHalloweenEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BiblicallyAccurateEngieColdSeasonEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (!(!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BiblicallyAccurateEngieStyle2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BiblicallyAccurateEngieHalloweenEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BiblicallyAccurateEngieColdSeasonEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty())) {
			if (Math.random() > 0.25) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				EntitySpawnsProcedure.execute(world, entity);
			}
		}
	}
}