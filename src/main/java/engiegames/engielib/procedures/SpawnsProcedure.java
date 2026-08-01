package engiegames.engielib.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class SpawnsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0, _ent.getYRot(), _ent.getXRot());
		}
	}
}