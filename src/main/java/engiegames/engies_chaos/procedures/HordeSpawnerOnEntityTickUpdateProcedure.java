package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class HordeSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999, 255, false, false));
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, _ent.getYRot(), _ent.getXRot());
			}
		} else {
			if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == true) {
				HordeSpawner2Procedure.execute(world, entity.getX(), world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ()), entity.getZ());
			} else if (EngiesChaosModVariables.MapVariables.get(world).engiestruewrath == false) {
				HordeSpawner1Procedure.execute(world, entity.getX(), world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ()), entity.getZ());
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}