package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.AngryEngieEntity;

public class AngryEngieColdSeasonedProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true)
				&& (entity instanceof AngryEngieEntity _datEntL0 && _datEntL0.getEntityData().get(AngryEngieEntity.DATA_coldseasoned)) == true) {
			return true;
		}
		return false;
	}
}