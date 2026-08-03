package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class PlayerAdvancemntCheck2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 15 && entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_mini_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement15 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement15 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 15;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 15 && !(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_mini_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement15 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement15 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 16 && entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement16 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement16 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 16;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 16 && !(entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
				&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement16 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement16 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 17 && entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
				&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_big_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement17 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement17 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 17;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 17 && !(entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
				&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_big_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement17 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement17 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 18 && entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
				&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_large_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement18 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement18 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 18;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 18 && !(entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
				&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_large_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement18 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement18 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 19 && entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
				&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_huge_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement19 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement19 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 19;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 19 && !(entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel
				&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_huge_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement19 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement19 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 20 && entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
				&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_enormous_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement20 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement20 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 20;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 20 && !(entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
				&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:massive_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement20 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement20 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 21 && entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel
				&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_gigantic_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement21 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement21 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 21;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 21 && !(entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel
				&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_gigantic_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement21 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement21 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 22 && entity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel
				&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_massive_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement22 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement22 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 22;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 22 && !(entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
				&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_massive_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement22 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement22 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 23 && entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
				&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_biblically_accurate_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement23 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement23 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 23;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 23 && !(entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
				&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_biblically_accurate_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement23 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement23 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 24 && entity instanceof ServerPlayer _plr27 && _plr27.level instanceof ServerLevel
				&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_monstrosity_ban_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement24 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement24 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 24;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 24 && !(entity instanceof ServerPlayer _plr29 && _plr29.level instanceof ServerLevel
				&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_monstrosity_ban_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement24 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement24 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 25 && entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
				&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_doomsday_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement25 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement25 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 25;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 25 && !(entity instanceof ServerPlayer _plr32 && _plr32.level instanceof ServerLevel
				&& _plr32.getAdvancements().getOrStartProgress(_plr32.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_doomsday_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement25 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement25 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 26 && entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
				&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_super_doomsday_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement26 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement26 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 26;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 26 && !(entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
				&& _plr35.getAdvancements().getOrStartProgress(_plr35.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_super_doomsday_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement26 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement26 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 27 && entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
				&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_the_end_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement27 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement27 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 27;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 27 && !(entity instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
				&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_the_end_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement27 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement27 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 28 && entity instanceof ServerPlayer _plr39 && _plr39.level instanceof ServerLevel
				&& _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engies_ban_scythe_obtain"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement28 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement28 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 28;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 28 && !(entity instanceof ServerPlayer _plr41 && _plr41.level instanceof ServerLevel
				&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engies_ban_scythe_obtain"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement28 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement28 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 29 && entity instanceof ServerPlayer _plr42 && _plr42.level instanceof ServerLevel
				&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engie_games_sword_obtained"))).isDone()) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement29 == false) {
				{
					boolean _setval = true;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement29 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					if (EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount >= EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld) {
						EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 29;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 29 && !(entity instanceof ServerPlayer _plr44 && _plr44.level instanceof ServerLevel
				&& _plr44.getAdvancements().getOrStartProgress(_plr44.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engie_games_sword_obtained"))).isDone())) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement29 == true) {
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.diffadvancement29 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount - 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}