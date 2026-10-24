package engiegames.engielib.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class ToppingProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(Math.round(entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) Math.round(entity.getX()), (int) Math.round(entity.getZ()))), Math.round(entity.getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(Math.round(entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) Math.round(entity.getX()), (int) Math.round(entity.getZ()))), Math.round(entity.getZ()), _ent.getYRot(),
						_ent.getXRot());
		}
	}
}