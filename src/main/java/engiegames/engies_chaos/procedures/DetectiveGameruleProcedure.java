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
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class DetectiveGameruleProcedure {
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
		if (EngiesChaosModVariables.MapVariables.get(world).Birthday == false && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DETECTIVE_MODE) == false) {
			if (EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart == false) {
				EngiesChaosMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.detecstart = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).Birthday == false && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DETECTIVE_MODE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart == false) {
				EngiesChaosMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).detecstart == false) {
				if (!(entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
						&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world_new_problem"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world_new_problem"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"Hello Detective \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\". We didn't find a journal this time. As for everything else, it seems to be the same. Good luck out there.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 102d");
						}
					}
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.detecstart = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).Birthday == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DETECTIVE_MODE) == false) {
			if (EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart == false) {
				EngiesChaosMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (!(entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel && _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.detecstart = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).Birthday == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DETECTIVE_MODE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart == false) {
				EngiesChaosMod.queueServerWork(5, () -> {
					RiskCheckProcedure.execute(world, entity);
				});
				EngiesChaosModVariables.MapVariables.get(world).riskcheckedstart = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).detecstart == false) {
				if (!(entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
						&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world_new_problem"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:new_world_new_problem"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"Hello Detective \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\". We didn't find a journal this time. As for everything else, it seems to be the same. Good luck out there.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 102d");
						}
					}
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.detecstart = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}