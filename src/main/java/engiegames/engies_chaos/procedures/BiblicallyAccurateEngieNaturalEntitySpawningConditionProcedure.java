package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieColdSeasonEntity;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DELETED_MOD_ELEMENT) == true) {
			if (!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(BiblicallyAccurateEngieStyle2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(BiblicallyAccurateEngieHalloweenEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(BiblicallyAccurateEngieColdSeasonEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()) {
				return false;
			} else if (!(!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(BiblicallyAccurateEngieStyle2Entity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(BiblicallyAccurateEngieHalloweenEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(BiblicallyAccurateEngieColdSeasonEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty())) {
				return true;
			}
		}
		return false;
	}
}