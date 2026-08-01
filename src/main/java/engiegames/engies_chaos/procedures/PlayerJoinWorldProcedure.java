package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.Calendar;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class PlayerJoinWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (EngiesChaosModVariables.MapVariables.get(world).Birthday == false) {
				EngiesChaosMod.queueServerWork(10, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("tellraw @p [\"\",{\"text\":\"-------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"<\",\"bold\":true,\"color\":\"white\"},{\"text\":\"Engie's\",\"bold\":true,\"underlined\":true,\"color\":\"gold\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://modrinth.com/mod/engieschaos\"}},{\"text\":\" \",\"bold\":true,\"color\":\"red\"},{\"text\":\"Chaos\",\"bold\":true,\"underlined\":true,\"color\":\"red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.curseforge.com/minecraft/mc-mods/engieschaos\"}},{\"text\":\">\",\"bold\":true,\"color\":\"white\"},{\"text\":\"-------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"\\n\"},{\"text\":\"Hey \",\"color\":\"white\"},{\"selector\":\"@s\",\"color\":\"white\"},{\"text\":\"! If you do manage to find a bug with \",\"color\":\"white\"},{\"text\":\"Engie's\",\"color\":\"gold\"},{\"text\":\" Chaos\",\"color\":\"red\"},{\"text\":\", make sure to stop by the \"},{\"text\":\"GitHub\",\"underlined\":true,\"color\":\"blue\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://github.com/DevEngieGames/EngiesChaos-and-EngieLib/issues\"}},{\"text\":\" and report any issues you come across! It would be \"},{\"text\":\"VERY\",\"bold\":true,\"italic\":true},{\"text\":\" appreciated if you did.\\n\\nAnyways, the version you're running right now is.. \"},"
											+ "" + "{\"text\":\"v21.52.54\",\"bold\":true,\"color\":\"gold\"}"
											+ ",{\"text\":\"! Hope you read the changelog!\\n\"},{\"text\":\"----------------------------------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"\\n \"}]"));
						}
					}
				});
			} else if (EngiesChaosModVariables.MapVariables.get(world).Birthday == true) {
				EngiesChaosMod.queueServerWork(10, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("tellraw @p [\"\",{\"text\":\"-------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"<\",\"bold\":true,\"color\":\"white\"},{\"text\":\"Engie's\",\"bold\":true,\"underlined\":true,\"color\":\"gold\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://modrinth.com/mod/engieschaos\"}},{\"text\":\" \",\"bold\":true,\"color\":\"red\"},{\"text\":\"Chaos\",\"bold\":true,\"underlined\":true,\"color\":\"red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.curseforge.com/minecraft/mc-mods/engieschaos\"}},{\"text\":\">\",\"bold\":true,\"color\":\"white\"},{\"text\":\"-------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"\\n\"},{\"text\":\"Hey \",\"color\":\"white\"},{\"selector\":\"@s\",\"color\":\"white\"},{\"text\":\"! If you do manage to find a bug with \",\"color\":\"white\"},{\"text\":\"Engie's\",\"color\":\"gold\"},{\"text\":\" Chaos\",\"color\":\"red\"},{\"text\":\", make sure to stop by the \"},{\"text\":\"GitHub\",\"underlined\":true,\"color\":\"blue\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://github.com/DevEngieGames/EngiesChaos-and-EngieLib/issues\"}},{\"text\":\" and report any issues you come across! It would be \"},{\"text\":\"VERY\",\"bold\":true,\"italic\":true},{\"text\":\" appreciated if you did.\\n\\nAnyways, the version you're running right now is.. \"},"
											+ "" + "{\"text\":\"v21.52.54\",\"bold\":true,\"color\":\"gold\"}"
											+ ",{\"text\":\"! Hope you read the changelog!\\n\\n\"},{\"text\":\"Also, make sure to pop into the config and wish Engie a happy birthday!\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"\\n\"},{\"text\":\"----------------------------------------\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"\\n \"}]"));
						}
					}
				});
			}
			if (Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) < 5) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
					EngiesChaosModVariables.MapVariables.get(world).Birthday = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				} else {
					EngiesChaosModVariables.MapVariables.get(world).Birthday = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (!(Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) < 5)) {
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