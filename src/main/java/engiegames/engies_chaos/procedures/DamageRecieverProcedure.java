package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.init.EngiesChaosModDamageSources;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DamageRecieverProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "missiletype") == 1) {
			if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
				if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SURVIVAL || getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.ADVENTURE) {
					(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.YELLOW_LIGHTNING_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
				}
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.YELLOW_LIGHTNING_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 2) {
			if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
				if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SURVIVAL || getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.ADVENTURE) {
					(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.BLUE_BURST_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
				}
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.BLUE_BURST_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 3) {
			if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
				if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SURVIVAL || getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.ADVENTURE) {
					(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.NORMAL_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
				}
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.NORMAL_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 4) {
			if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
				if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SURVIVAL || getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.ADVENTURE) {
					(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.MOAB_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
				}
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.MOAB_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (!(DoubleArgumentType.getDouble(arguments, "missiletype") == 1 || DoubleArgumentType.getDouble(arguments, "missiletype") == 2 || DoubleArgumentType.getDouble(arguments, "missiletype") == 3
				|| DoubleArgumentType.getDouble(arguments, "missiletype") == 4)) {
			if ((commandParameterEntity(arguments, "entity")) instanceof Player) {
				if (getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.SURVIVAL || getEntityGameType((commandParameterEntity(arguments, "entity"))) == GameType.ADVENTURE) {
					(commandParameterEntity(arguments, "entity")).hurt(DamageSource.OUT_OF_WORLD, (float) DoubleArgumentType.getDouble(arguments, "amount"));
				}
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(DamageSource.OUT_OF_WORLD, (float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		}
	}

	private static Entity commandParameterEntity(CommandContext<CommandSourceStack> arguments, String parameter) {
		try {
			return EntityArgument.getEntity(arguments, parameter);
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level.isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}