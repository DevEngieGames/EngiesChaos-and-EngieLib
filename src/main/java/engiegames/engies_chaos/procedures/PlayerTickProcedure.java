package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.ShadowSharkEngieEntity;
import engiegames.engies_chaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engies_chaos.entity.OMENEntity;

@EventBusSubscriber
public class PlayerTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		double raytrace_distance1 = 0;
		double rx1 = 0;
		double ry1 = 0;
		double rz1 = 0;
		double raytrace_distance2 = 0;
		double rx2 = 0;
		double ry2 = 0;
		double rz2 = 0;
		boolean entity_found = false;
		boolean entity_found1 = false;
		boolean entity_found2 = false;
		if (!world.isClientSide()) {
			if (!world.getEntitiesOfClass(ShadowSharkEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
				entity_found = false;
				raytrace_distance = 0;
				for (int index0 = 0; index0 < 101; index0++) {
					rx = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getX();
					ry = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getY();
					rz = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getZ();
					if (!world.getEntitiesOfClass(ShadowSharkEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(rx, ry, rz)).inflate(2 / 2d), e -> true).isEmpty()
							&& !((findEntityInWorldRange(world, ShadowSharkEngieEntity.class, rx, ry, rz, 2)) == entity)) {
						entity_found = true;
						if (!(findEntityInWorldRange(world, ShadowSharkEngieEntity.class, rx, ry, rz, 2)).level().isClientSide())
							(findEntityInWorldRange(world, ShadowSharkEngieEntity.class, rx, ry, rz, 2)).discard();
					} else {
						entity_found = false;
						raytrace_distance = raytrace_distance + 1;
					}
				}
			}
			if (!world.getEntitiesOfClass(ShadowSharkEngieBlindEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
				entity_found1 = false;
				raytrace_distance1 = 0;
				for (int index1 = 0; index1 < 101; index1++) {
					rx1 = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance1)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getX();
					ry1 = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance1)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getY();
					rz1 = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance1)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getZ();
					if (!world.getEntitiesOfClass(ShadowSharkEngieBlindEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(rx1, ry1, rz1)).inflate(2 / 2d), e -> true).isEmpty()
							&& !((findEntityInWorldRange(world, ShadowSharkEngieBlindEntity.class, rx1, ry1, rz1, 2)) == entity)) {
						{
							EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
							_vars.BlindShadowSharkEngieAttack = true;
							_vars.syncPlayerVariables(entity);
						}
						entity_found1 = true;
					} else {
						entity_found1 = false;
						raytrace_distance1 = raytrace_distance1 + 1;
					}
				}
			}
			if (!world.getEntitiesOfClass(OMENEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
				entity_found2 = false;
				raytrace_distance2 = 0;
				for (int index2 = 0; index2 < 101; index2++) {
					rx2 = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance2)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getX();
					ry2 = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance2)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getY();
					rz2 = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance2)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
							.getZ();
					if (!world.getEntitiesOfClass(OMENEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(rx2, ry2, rz2)).inflate(6 / 2d), e -> true).isEmpty()
							&& !((findEntityInWorldRange(world, OMENEntity.class, rx2, ry2, rz2, 6)) == entity)) {
						entity_found2 = true;
						if (!(findEntityInWorldRange(world, OMENEntity.class, rx2, ry2, rz2, 6)).level().isClientSide())
							(findEntityInWorldRange(world, OMENEntity.class, rx2, ry2, rz2, 6)).discard();
					} else {
						entity_found2 = false;
						raytrace_distance2 = raytrace_distance2 + 1;
					}
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}