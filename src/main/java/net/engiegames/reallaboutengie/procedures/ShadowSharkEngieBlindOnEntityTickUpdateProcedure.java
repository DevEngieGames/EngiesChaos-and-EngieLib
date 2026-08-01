package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;

import java.util.ArrayList;

public class ShadowSharkEngieBlindOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double rx = 0;
		double ry = 0;
		double rz = 0;
		boolean entity_found = false;
		Entity player = null;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			player = entityiterator;
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(200 / 2d), e -> true).isEmpty()) {
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((player.getX()), (player.getY() + 1.5), (player.getZ())));
				if ((player.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).BlindShadowSharkEngieAttack == false) {
					if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(100 / 2d), e -> true).isEmpty())) {
						if ((player.getDirection()) == Direction.NORTH) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							}
						} else if ((player.getDirection()) == Direction.SOUTH) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() + Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() - Mth.nextDouble(RandomSource.create(), 1, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							}
						} else if ((player.getDirection()) == Direction.EAST) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							}
						} else if ((player.getDirection()) == Direction.WEST) {
							if (Mth.nextDouble(RandomSource.create(), 1, 4) <= 2) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() + Mth.nextDouble(RandomSource.create(), 1, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							} else if (Mth.nextDouble(RandomSource.create(), 1, 4) >= 3) {
								{
									Entity _ent = entity;
									_ent.teleportTo((player.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((player.getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), (player.getY()), (player.getZ() - Mth.nextDouble(RandomSource.create(), 1, 45)), _ent.getYRot(),
												_ent.getXRot());
								}
							}
						}
					} else if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(5 / 2d), e -> true).isEmpty()) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 15, 1, 2, 1, 1);
					} else {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().stop();
					}
				} else if ((player.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).BlindShadowSharkEngieAttack == true) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((player.getX()), (player.getY()), (player.getZ()), 1);
				}
			}
		}
	}
}