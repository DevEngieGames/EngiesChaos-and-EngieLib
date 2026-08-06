package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class PlayerAdvancemntCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 15 && entity instanceof ServerPlayer _plr42 && _plr42.level instanceof ServerLevel
					&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_mini_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 15 && !(entity instanceof ServerPlayer _plr44 && _plr44.level instanceof ServerLevel
					&& _plr44.getAdvancements().getOrStartProgress(_plr44.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_mini_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 16 && entity instanceof ServerPlayer _plr45 && _plr45.level instanceof ServerLevel
					&& _plr45.getAdvancements().getOrStartProgress(_plr45.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 16 && !(entity instanceof ServerPlayer _plr47 && _plr47.level instanceof ServerLevel
					&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 17 && entity instanceof ServerPlayer _plr48 && _plr48.level instanceof ServerLevel
					&& _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_big_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 17 && !(entity instanceof ServerPlayer _plr50 && _plr50.level instanceof ServerLevel
					&& _plr50.getAdvancements().getOrStartProgress(_plr50.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_big_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 18 && entity instanceof ServerPlayer _plr51 && _plr51.level instanceof ServerLevel
					&& _plr51.getAdvancements().getOrStartProgress(_plr51.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_large_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 18 && !(entity instanceof ServerPlayer _plr53 && _plr53.level instanceof ServerLevel
					&& _plr53.getAdvancements().getOrStartProgress(_plr53.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_large_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 19 && entity instanceof ServerPlayer _plr54 && _plr54.level instanceof ServerLevel
					&& _plr54.getAdvancements().getOrStartProgress(_plr54.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_huge_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 19 && !(entity instanceof ServerPlayer _plr56 && _plr56.level instanceof ServerLevel
					&& _plr56.getAdvancements().getOrStartProgress(_plr56.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_huge_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 20 && entity instanceof ServerPlayer _plr57 && _plr57.level instanceof ServerLevel
					&& _plr57.getAdvancements().getOrStartProgress(_plr57.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_enormous_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 20 && !(entity instanceof ServerPlayer _plr59 && _plr59.level instanceof ServerLevel
					&& _plr59.getAdvancements().getOrStartProgress(_plr59.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:massive_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 21 && entity instanceof ServerPlayer _plr60 && _plr60.level instanceof ServerLevel
					&& _plr60.getAdvancements().getOrStartProgress(_plr60.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_gigantic_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 21 && !(entity instanceof ServerPlayer _plr62 && _plr62.level instanceof ServerLevel
					&& _plr62.getAdvancements().getOrStartProgress(_plr62.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_gigantic_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 22 && entity instanceof ServerPlayer _plr63 && _plr63.level instanceof ServerLevel
					&& _plr63.getAdvancements().getOrStartProgress(_plr63.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_massive_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 22 && !(entity instanceof ServerPlayer _plr65 && _plr65.level instanceof ServerLevel
					&& _plr65.getAdvancements().getOrStartProgress(_plr65.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_massive_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 23 && entity instanceof ServerPlayer _plr66 && _plr66.level instanceof ServerLevel
					&& _plr66.getAdvancements().getOrStartProgress(_plr66.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_biblically_accurate_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 23 && !(entity instanceof ServerPlayer _plr68 && _plr68.level instanceof ServerLevel
					&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_biblically_accurate_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 24 && entity instanceof ServerPlayer _plr69 && _plr69.level instanceof ServerLevel
					&& _plr69.getAdvancements().getOrStartProgress(_plr69.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_monstrosity_ban_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 24 && !(entity instanceof ServerPlayer _plr71 && _plr71.level instanceof ServerLevel
					&& _plr71.getAdvancements().getOrStartProgress(_plr71.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_monstrosity_ban_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 25 && entity instanceof ServerPlayer _plr72 && _plr72.level instanceof ServerLevel
					&& _plr72.getAdvancements().getOrStartProgress(_plr72.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_doomsday_ban_scythe_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 25 && !(entity instanceof ServerPlayer _plr74 && _plr74.level instanceof ServerLevel
					&& _plr74.getAdvancements().getOrStartProgress(_plr74.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_doomsday_ban_scythe_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 26 && entity instanceof ServerPlayer _plr75 && _plr75.level instanceof ServerLevel
					&& _plr75.getAdvancements().getOrStartProgress(_plr75.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_super_doomsday_ban_scythe_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 26 && !(entity instanceof ServerPlayer _plr77 && _plr77.level instanceof ServerLevel
					&& _plr77.getAdvancements().getOrStartProgress(_plr77.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_super_doomsday_ban_scythe_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 27 && entity instanceof ServerPlayer _plr78 && _plr78.level instanceof ServerLevel
					&& _plr78.getAdvancements().getOrStartProgress(_plr78.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_the_end_ban_scythe_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 27 && !(entity instanceof ServerPlayer _plr80 && _plr80.level instanceof ServerLevel
					&& _plr80.getAdvancements().getOrStartProgress(_plr80.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_the_end_ban_scythe_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 28 && entity instanceof ServerPlayer _plr81 && _plr81.level instanceof ServerLevel
					&& _plr81.getAdvancements().getOrStartProgress(_plr81.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engies_ban_scythe_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 28 && !(entity instanceof ServerPlayer _plr83 && _plr83.level instanceof ServerLevel
					&& _plr83.getAdvancements().getOrStartProgress(_plr83.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engies_ban_scythe_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 29 && entity instanceof ServerPlayer _plr84 && _plr84.level instanceof ServerLevel
					&& _plr84.getAdvancements().getOrStartProgress(_plr84.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engie_games_sword_obtained"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 29 && !(entity instanceof ServerPlayer _plr86 && _plr86.level instanceof ServerLevel
					&& _plr86.getAdvancements().getOrStartProgress(_plr86.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engie_games_sword_obtained"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 30 && entity instanceof ServerPlayer _plr87 && _plr87.level instanceof ServerLevel
					&& _plr87.getAdvancements().getOrStartProgress(_plr87.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:cosmic_sword_obtain"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 30 && !(entity instanceof ServerPlayer _plr89 && _plr89.level instanceof ServerLevel
					&& _plr89.getAdvancements().getOrStartProgress(_plr89.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:cosmic_sword_obtain"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 31 && entity instanceof ServerPlayer _plr90 && _plr90.level instanceof ServerLevel
					&& _plr90.getAdvancements().getOrStartProgress(_plr90.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained"))).isDone()) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).diffadvancement31 == false) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 31 && !(entity instanceof ServerPlayer _plr92 && _plr92.level instanceof ServerLevel
					&& _plr92.getAdvancements().getOrStartProgress(_plr92.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained"))).isDone())) {
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
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32 && entity instanceof ServerPlayer _plr93 && _plr93.level instanceof ServerLevel
					&& _plr93.getAdvancements().getOrStartProgress(_plr93.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained"))).isDone()) {
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
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32 && !(entity instanceof ServerPlayer _plr95 && _plr95.level instanceof ServerLevel
					&& _plr95.getAdvancements().getOrStartProgress(_plr95.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained"))).isDone())) {
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
}