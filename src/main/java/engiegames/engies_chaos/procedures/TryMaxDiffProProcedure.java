package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class TryMaxDiffProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) {
			if (EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff != world.players().size()) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playerrequested == false) {
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.playerrequested = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff = EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
		EngiesChaosMod.queueServerWork(1, () -> {
			if (EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff == world.players().size()) {
				if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 525;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							boolean _setval = false;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.playerrequested = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 32;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playersaidyestotrymaxdiff = 0;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							boolean _setval = false;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.playerrequested = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
				}
			}
		});
	}
}