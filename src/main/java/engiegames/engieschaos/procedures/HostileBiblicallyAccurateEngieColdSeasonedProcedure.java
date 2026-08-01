package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;

public class HostileBiblicallyAccurateEngieColdSeasonedProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if ((EngiesChaosModVariables.MapVariables.get(world).seasonautumn == true || EngiesChaosModVariables.MapVariables.get(world).seasonwinter == true)
				&& (entity instanceof HostileBiblicallyAccurateEngieEntity _datEntL0 && _datEntL0.getEntityData().get(HostileBiblicallyAccurateEngieEntity.DATA_coldseasoned)) == true) {
			return true;
		}
		return false;
	}
}