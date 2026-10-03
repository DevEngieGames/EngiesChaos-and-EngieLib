package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class PlayerDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			{
				double _setval = x;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDeathX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = y;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDeathY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = z;
				entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDeathZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart || EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart || EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart
					|| EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart) == true) {
				if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).ddayplayeraddedtodeadcount == false) {
					{
						boolean _setval = false;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DoomsdayAlive = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ddayplayeraddedtodeadcount = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount = EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount = EngiesChaosModVariables.MapVariables.get(world).ddayplayerdeadcount + 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (!(world.getServer() != null ? world.getServer().isSingleplayer() : (Minecraft.getInstance().getSingleplayerServer() != null && !Minecraft.getInstance().getSingleplayerServer().isPublished()))) {
						EngiesChaosMod.queueServerWork(1, () -> {
							if (EngiesChaosModVariables.MapVariables.get(world).ddayplayeralivecount == 1) {
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive == true) {
										{
											Entity _ent = entityiterator;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																		_ent.getDisplayName(), _ent.level.getServer(), _ent),
																"tellraw @a [\"\",{\"selector\":\"@s\",\"bold\":true},{\"text\":\" is the last alive!\",\"bold\":true,\"color\":\"#50FF50\"}]");
											}
										}
									}
								}
							}
						});
					}
				}
			}
		}
	}
}