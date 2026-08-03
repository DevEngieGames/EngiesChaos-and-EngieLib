package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class PlayerAdvancemntCheck3Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 30 && entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:cosmic_sword_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement30 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement30 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 30;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 30 && !(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:cosmic_sword_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement30 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement30 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 31 && entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement31 == true) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement31 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 31;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 31 && !(entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
				&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement31 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement31 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32 && entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
				&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement32 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement32 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe = EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 32;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32 && !(entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
				&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement32 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement32 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe = EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}