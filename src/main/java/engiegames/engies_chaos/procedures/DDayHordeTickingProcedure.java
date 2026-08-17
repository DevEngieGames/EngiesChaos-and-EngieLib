package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class DDayHordeTickingProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity.getPersistentData().getBoolean("hordespawned") == true) {
				if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart || EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart
						|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).ddayprophshow == false) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).DoomsdayAlive) {
								if (getEntityGameType(entityiterator) == GameType.SURVIVAL || getEntityGameType(entityiterator) == GameType.ADVENTURE) {
									if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
										_entity.setTarget(_ent);
								}
							}
						}
					} else {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				} else {
					entity.getPersistentData().putBoolean("hordespawned", false);
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level.isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}