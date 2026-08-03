package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.Calendar;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class PlayerJoinWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			EngiesChaosMod.queueServerWork(10, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								("tellraw @p [\"\",{\"text\":\"-------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"<\",\"bold\":true,\"color\":\"white\"},{\"text\":\"Engie's\",\"bold\":true,\"underlined\":true,\"color\":\"gold\"},{\"text\":\" \",\"bold\":true,\"color\":\"white\"},{\"text\":\"Chaos\",\"bold\":true,\"underlined\":true,\"color\":\"red\"},{\"text\":\">\",\"bold\":true,\"color\":\"white\"},{\"text\":\"-------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"\\nHey \"},{\"selector\":\"@p\"},{\"text\":\"! If you do manage to find a bug with \"},{\"text\":\"Engie's\",\"color\":\"gold\"},{\"text\":\" Chaos\",\"color\":\"red\"},{\"text\":\", make sure to stop by the \",\"color\":\"white\"},{\"text\":\"GitHub\",\"underlined\":true,\"color\":\"blue\"},{\"text\":\" and report any issues you come across! It would be \",\"color\":\"white\"},{\"text\":\"VERY\",\"bold\":true,\"italic\":true,\"color\":\"white\"},{\"text\":\" appreciated if you did.\\n\\nAnyways, the version you're running right now is.. \",\"color\":\"white\"},"
										+ "" + "{\"text\":\"v21.53.54\",\"bold\":true,\"color\":\"gold\"}"
										+ ",{\"text\":\"! Hope you read the changelog!\",\"color\":\"white\"},{\"text\":\"\\n\"},{\"text\":\"----------------------------------------\",\"bold\":true,\"color\":\"dark_purple\"}]"));
					}
				}
			});
			EngiesChaosMod.queueServerWork(200, () -> {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).playercountedtoplayercount == false) {
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.playercountedtoplayercount = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld = EngiesChaosModVariables.MapVariables.get(world).totalplayersinworld + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			});
			if (Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) <= 5) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
					EngiesChaosModVariables.MapVariables.get(world).Birthday = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).Birthday = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (!(Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) <= 5)) {
				EngiesChaosModVariables.MapVariables.get(world).Birthday = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 2 && Calendar.getInstance().get(Calendar.MONTH) < 5) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 5 && Calendar.getInstance().get(Calendar.MONTH) < 8) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 8 && Calendar.getInstance().get(Calendar.MONTH) < 11) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 11 || Calendar.getInstance().get(Calendar.MONTH) < 2) {
				EngiesChaosModVariables.MapVariables.get(world).seasonspring = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonsummer = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonautumn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).seasonwinter = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (Calendar.getInstance().get(Calendar.MONTH) >= 11) {
					if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
						if (EngiesChaosModVariables.decembercodeblock == false) {
							EngiesChaosModVariables.decembercodeblock = true;
						}
					} else {
						if (EngiesChaosModVariables.decembercodeblock == true) {
							EngiesChaosModVariables.decembercodeblock = false;
						}
					}
				} else {
					if (EngiesChaosModVariables.decembercodeblock == true) {
						EngiesChaosModVariables.decembercodeblock = false;
					}
				}
			}
		}
	}
}