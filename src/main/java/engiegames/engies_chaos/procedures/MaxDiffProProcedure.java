package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class MaxDiffProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MaxPercentGiveOptionToDoHardestMobDiff == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
				if (world.players().size() > 1) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" wants to set the Mob Difficulty to its max.\\nDo you also want to set the Mob Difficulty to its max?\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"\\n\",\"bold\":true},{\"text\":\" \",\"bold\":true,\"color\":\"dark_green\"},{\"text\":\"[\",\"bold\":true,\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/trymaxdiff\"}},{\"text\":\"Yes\",\"bold\":true,\"color\":\"green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/trymaxdiff\"}},{\"text\":\"]\",\"bold\":true,\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/trymaxdiff\"}}]");
						}
					}
				} else if (world.players().size() == 1) {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 525;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
				if (world.players().size() > 1) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" wants to reset the Mob Difficulty to 13.\\nDo you also want to reset the Mob Difficulty to 13?\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"\\n\",\"bold\":true},{\"text\":\" \",\"bold\":true,\"color\":\"dark_green\"},{\"text\":\"[\",\"bold\":true,\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/trymaxdiff\"}},{\"text\":\"Yes\",\"bold\":true,\"color\":\"green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/trymaxdiff\"}},{\"text\":\"]\",\"bold\":true,\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/trymaxdiff\"}}]");
						}
					}
				} else if (world.players().size() == 1) {
					EngiesChaosModVariables.MapVariables.get(world).MobDifficulty = 28;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}