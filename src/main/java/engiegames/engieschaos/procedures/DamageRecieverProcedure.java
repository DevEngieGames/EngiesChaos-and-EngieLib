package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import engiegames.engieschaos.init.EngiesChaosModDamageSources;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DamageRecieverProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "missiletype") == 1) {
			(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.YELLOW_LIGHTNING_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 2) {
			(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.BLUE_BURST_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 3) {
			(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.NORMAL_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
		} else if (DoubleArgumentType.getDouble(arguments, "missiletype") == 4) {
			(commandParameterEntity(arguments, "entity")).hurt(EngiesChaosModDamageSources.MOAB_EXPLOSION, (float) DoubleArgumentType.getDouble(arguments, "amount"));
		} else {
			(commandParameterEntity(arguments, "entity")).hurt(DamageSource.GENERIC, (float) DoubleArgumentType.getDouble(arguments, "amount"));
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
}