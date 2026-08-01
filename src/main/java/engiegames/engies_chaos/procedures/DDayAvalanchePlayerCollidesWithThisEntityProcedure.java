package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DDayAvalanchePlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity.getPersistentData().getDouble("avadmgcd") <= 0) {
			if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
				sourceentity.getPersistentData().putDouble("avadmgcd", 40);
				{
					boolean _setval = true;
					sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.crucifixbypass = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				sourceentity.hurt(DamageSource.FREEZE, (float) Mth.nextDouble(RandomSource.create(), 20, 60));
			}
		}
	}
}