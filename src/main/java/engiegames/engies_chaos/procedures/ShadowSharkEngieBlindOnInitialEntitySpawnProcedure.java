package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

import engiegames.engies_chaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engies_chaos.EngiesChaosMod;

public class ShadowSharkEngieBlindOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("neoforge:spawn_type")).equals("SPAWN_ITEM_USE") || (entity.getPersistentData().getString("forge:spawn_type")).equals("SPAWN_EGG")) {
			EngiesChaosMod.queueServerWork(1, () -> {
				if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.NORTH) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.SOUTH) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.EAST) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() - Mth.nextDouble(RandomSource.create(), 25, 45)),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), _ent.getYRot(), _ent.getXRot());
					}
				} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.WEST) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() + Mth.nextDouble(RandomSource.create(), 25, 45)),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX(), (findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY(),
								(findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("ambient.cave")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
								((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("ambient.cave")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			});
		} else {
			if (!world.getEntitiesOfClass(ShadowSharkEngieBlindEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty()) {
				if (!entity.level().isClientSide())
					entity.discard();
			} else if (!(!world.getEntitiesOfClass(ShadowSharkEngieBlindEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(500 / 2d), e -> true).isEmpty())) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.NORTH) {
						{
							Entity _ent = entity;
							_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
										((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() + Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.SOUTH) {
						{
							Entity _ent = entity;
							_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
										((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ() - Mth.nextDouble(RandomSource.create(), 25, 45)), _ent.getYRot(), _ent.getXRot());
						}
					} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.EAST) {
						{
							Entity _ent = entity;
							_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() - Mth.nextDouble(RandomSource.create(), 25, 45)), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() - Mth.nextDouble(RandomSource.create(), 25, 45)),
										((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), _ent.getYRot(), _ent.getXRot());
						}
					} else if (((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getDirection()) == Direction.WEST) {
						{
							Entity _ent = entity;
							_ent.teleportTo(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() + Mth.nextDouble(RandomSource.create(), 25, 45)), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX() + Mth.nextDouble(RandomSource.create(), 25, 45)),
										((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), _ent.getYRot(), _ent.getXRot());
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX(), (findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY(),
									(findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("ambient.cave")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getY()),
									((findEntityInWorldRange(world, Player.class, x, y, z, 1000)).getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("ambient.cave")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				});
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}