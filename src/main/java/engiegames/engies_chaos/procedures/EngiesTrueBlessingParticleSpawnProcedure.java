package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import engiegames.engies_chaos.init.EngiesChaosModParticleTypes;
import engiegames.engies_chaos.EngiesChaosMod;

public class EngiesTrueBlessingParticleSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (EngiesChaosModParticleTypes.ENGIES_BLESSING_ATTACK.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()),
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("engies_chaos:engies_true_blessing")))),
					5, 5, 5, 1);
		EngiesChaosMod.queueServerWork(1, () -> {
			entity.getPersistentData().putBoolean("entityblessinged", false);
		});
	}
}