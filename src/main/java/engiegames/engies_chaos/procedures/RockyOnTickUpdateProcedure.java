package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.Comparator;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class RockyOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(50 / 2d), e -> true).isEmpty())) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					{
						Entity _ent = entity;
						_ent.teleportTo(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerY,
								entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerZ);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerY,
									entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerZ, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerY,
								entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerZ, 1);
				}
			}
		} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(50 / 2d), e -> true).isEmpty()) {
			if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(25 / 2d), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo(entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerX, entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerY,
									entityiterator.getData(EngiesChaosModVariables.PLAYER_VARIABLES).PlayerZ, 1);
					}
				}
			}
		}
	}
}