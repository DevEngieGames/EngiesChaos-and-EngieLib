package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class AvalancheBallCollisionProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true && sourceentity.getPersistentData().getDouble("avadmgcd") <= 0) {
			sourceentity.hurt(DamageSource.FREEZE, Mth.nextInt(RandomSource.create(), 35, 80));
			sourceentity.getPersistentData().putDouble("avadmgcd", 2);
		}
	}
}