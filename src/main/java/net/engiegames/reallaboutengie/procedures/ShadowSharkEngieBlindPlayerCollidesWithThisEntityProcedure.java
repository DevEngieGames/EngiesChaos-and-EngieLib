package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import java.util.Comparator;

public class ShadowSharkEngieBlindPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			(findEntityInWorldRange(world, Player.class, x, y, z, 4)).getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BlindShadowSharkEngieAttack = _setval;
				capability.syncPlayerVariables((findEntityInWorldRange(world, Player.class, x, y, z, 4)));
			});
		}
		(findEntityInWorldRange(world, Player.class, x, y, z, 4)).hurt(DamageSource.GENERIC, 1);
		if ((findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 255, false, false));
		if (!entity.level.isClientSide())
			entity.discard();
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}