package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import engiegames.engies_chaos.init.EngiesChaosModParticleTypes;

public class BanHammerParticleSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (EngiesChaosModParticleTypes.BAN_HAMMER_HIT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 1, 0, 0, 0, 1);
	}
}