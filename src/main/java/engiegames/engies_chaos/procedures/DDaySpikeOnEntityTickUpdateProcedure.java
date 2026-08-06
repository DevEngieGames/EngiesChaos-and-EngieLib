package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.entity.DDaySpikeEntity;

public class DDaySpikeOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join @s DDayNoCol");
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getX()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entity.getX(), (int) entity.getZ())), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
		}
		if (entity instanceof DDaySpikeEntity _datEntSetI)
			_datEntSetI.getEntityData().set(DDaySpikeEntity.DATA_spikelifespan, (int) ((entity instanceof DDaySpikeEntity _datEntI ? _datEntI.getEntityData().get(DDaySpikeEntity.DATA_spikelifespan) : 0) - 1));
		if ((entity instanceof DDaySpikeEntity _datEntI ? _datEntI.getEntityData().get(DDaySpikeEntity.DATA_spikelifespan) : 0) <= 0) {
			EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount = EngiesChaosModVariables.MapVariables.get(world).DDaySpikeAmount - 1;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}