package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class ChallengeCompletionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "EngieLib REAAE challengecompleted");
			}
		}
		AllaboutengieMod.queueServerWork(120, () -> {
			AllaboutengieMod.queueServerWork(80, () -> {
				AllaboutengieMod.queueServerWork(160, () -> {
					AllaboutengieMod.queueServerWork(1, () -> {
						AllaboutengieModVariables.MapVariables.get(world).MobDifficulty = 8;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather clear");
							}
						}
						world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, world.getServer());
						AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).BYEBYE = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).madlads = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						}
					});
				});
			});
		});
	}
}