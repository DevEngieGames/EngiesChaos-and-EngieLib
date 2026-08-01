package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class DDaySpikePlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity.getPersistentData().getDouble("spikedmgcd") <= 0) {
			if (sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive == true) {
				sourceentity.getPersistentData().putDouble("spikedmgcd", 40);
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables(sourceentity);
				}
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.FREEZE)), (float) Mth.nextDouble(RandomSource.create(), 20, 80));
			}
		}
	}
}