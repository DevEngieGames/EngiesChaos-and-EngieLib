package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.DDayAvalancheEntity;

public class DDayAvalancheOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("avatimebeforescaledown", (entity.getPersistentData().getDouble("avatimebeforescaledown") + 0.05));
			if (entity.getPersistentData().getDouble("avatimebeforescaledown") >= 5) {
				if ((entity instanceof DDayAvalancheEntity _datEntI ? _datEntI.getEntityData().get(DDayAvalancheEntity.DATA_scale) : 0) != 1) {
					entity.getPersistentData().putDouble("avatimebeforescaledown", 0);
					if (entity instanceof DDayAvalancheEntity _datEntSetI)
						_datEntSetI.getEntityData().set(DDayAvalancheEntity.DATA_scale, (int) ((entity instanceof DDayAvalancheEntity _datEntI ? _datEntI.getEntityData().get(DDayAvalancheEntity.DATA_scale) : 0) - 1));
				} else {
					EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount = EngiesChaosModVariables.MapVariables.get(world).DDayAvalancheAmount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
		}
	}
}