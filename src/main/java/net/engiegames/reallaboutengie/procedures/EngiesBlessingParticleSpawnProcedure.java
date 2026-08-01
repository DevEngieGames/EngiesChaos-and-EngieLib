package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.engiegames.reallaboutengie.init.AllaboutengieModParticleTypes;
import net.engiegames.reallaboutengie.init.AllaboutengieModEnchantments;

public class EngiesBlessingParticleSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AllaboutengieModParticleTypes.ENGIES_BLESSING_ATTACK.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()),
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()), 5, 5, 5, 1);
	}
}