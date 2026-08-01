package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import engiegames.engieschaos.init.EngiesChaosModParticleTypes;
import engiegames.engieschaos.init.EngiesChaosModEnchantments;
import engiegames.engieschaos.EngiesChaosMod;

public class EngiesTrueBlessing2ParticleSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (EngiesChaosModParticleTypes.ENGIES_BLESSING_ATTACK.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()),
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()),
					5, 5, 5, 1);
		EngiesChaosMod.queueServerWork(1, () -> {
			entity.getPersistentData().putBoolean("entityblessinged", false);
		});
	}
}