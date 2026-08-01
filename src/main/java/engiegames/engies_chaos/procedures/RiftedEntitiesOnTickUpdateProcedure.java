package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.RiftBallEntity;

public class RiftedEntitiesOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof RiftBallEntity) {
				entity.getPersistentData().putDouble("rifttimebeforescaledown", (entity.getPersistentData().getDouble("rifttimebeforescaledown") + 0.05));
				if (entity.getPersistentData().getDouble("rifttimebeforescaledown") >= 5) {
					entity.getPersistentData().putDouble("rifttimebeforescaledown", 0);
					if ((entity instanceof RiftBallEntity _datEntI ? _datEntI.getEntityData().get(RiftBallEntity.DATA_size) : 0) != 1) {
						if (entity instanceof RiftBallEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RiftBallEntity.DATA_size, (int) ((entity instanceof RiftBallEntity _datEntI ? _datEntI.getEntityData().get(RiftBallEntity.DATA_size) : 0) - 1));
					} else {
						if (!entity.level().isClientSide())
							entity.discard();
						EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount - 1;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else {
				entity.getPersistentData().putDouble("riftedentitydespawntimer", (entity.getPersistentData().getDouble("riftedentitydespawntimer") + 0.05));
				if (entity.getPersistentData().getDouble("riftedentitydespawntimer") >= 36) {
					if (!entity.level().isClientSide())
						entity.discard();
					EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount = EngiesChaosModVariables.MapVariables.get(world).DDayRiftedEntityCount - 1;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
				if ((EngiesChaosModVariables.MapVariables.get(world).ddaystart || EngiesChaosModVariables.MapVariables.get(world).sddaystart || EngiesChaosModVariables.MapVariables.get(world).thestart
						|| EngiesChaosModVariables.MapVariables.get(world).engieswrathstart) == true) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).DoomsdayAlive) {
							if (getEntityGameType(entityiterator) == GameType.SURVIVAL || getEntityGameType(entityiterator) == GameType.ADVENTURE) {
								if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
									_entity.setTarget(_ent);
							}
						}
					}
				} else {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (getEntityGameType(entityiterator) == GameType.SURVIVAL || getEntityGameType(entityiterator) == GameType.ADVENTURE) {
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}