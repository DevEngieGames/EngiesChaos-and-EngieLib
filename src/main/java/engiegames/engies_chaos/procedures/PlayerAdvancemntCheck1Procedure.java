package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class PlayerAdvancemntCheck1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 1 && entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:big_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement1 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 1 && !(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:big_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement1 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 2 && entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:large_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement2 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 2;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 2 && !(entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
				&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:large_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement2 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 3 && entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
				&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:huge_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement3 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 3;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 3 && !(entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
				&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:huge_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement3 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 4 && entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
				&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enormous_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement4 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 4;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 4 && !(entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
				&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enormous_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement4 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 5 && entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
				&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gigantic_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement5 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 5;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 5 && !(entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel
				&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gigantic_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement5 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 6 && entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
				&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:massive_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement6 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 6;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 6 && !(entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
				&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:massive_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement6 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 7 && entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel
				&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement7 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement7 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 7;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 7 && !(entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel
				&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement7 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement7 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 8 && entity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel
				&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement8 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement8 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 8;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 8 && !(entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
				&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement8 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement8 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 9 && entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
				&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:doomsday_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement9 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement9 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 9;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 9 && !(entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
				&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:doomsday_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement9 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement9 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 10 && entity instanceof ServerPlayer _plr27 && _plr27.level instanceof ServerLevel
				&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:super_doomsday_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement10 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement10 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 10;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 10 && !(entity instanceof ServerPlayer _plr29 && _plr29.level instanceof ServerLevel
				&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:super_doomsday_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement10 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement10 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 11 && entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
				&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_end_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement11 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement11 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 11;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 11 && !(entity instanceof ServerPlayer _plr32 && _plr32.level instanceof ServerLevel
				&& _plr32.getAdvancements().getOrStartProgress(_plr32.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_end_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement11 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement11 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 12 && entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
				&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement12 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement12 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 12;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 12 && !(entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
				&& _plr35.getAdvancements().getOrStartProgress(_plr35.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement12 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement12 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 13 && entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
				&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mindscape_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement13 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement13 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 13;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 13 && !(entity instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
				&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mindscape_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement13 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement13 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 14 && entity instanceof ServerPlayer _plr39 && _plr39.level instanceof ServerLevel
				&& _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_games_sword_obtained"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement14 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement14 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 14;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 14 && !(entity instanceof ServerPlayer _plr41 && _plr41.level instanceof ServerLevel
				&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_games_sword_obtained"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement14 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement14 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}