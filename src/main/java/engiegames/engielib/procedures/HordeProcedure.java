package engiegames.engielib.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class HordeProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
							new Vec3((Mth.nextDouble(RandomSource.create(), -168, 168)),
									(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) Mth.nextDouble(RandomSource.create(), -168, 168), (int) Mth.nextDouble(RandomSource.create(), -168, 168))),
									(Mth.nextDouble(RandomSource.create(), -168, 168))),
							Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon engies_chaos:horde_spawner");
	}
}