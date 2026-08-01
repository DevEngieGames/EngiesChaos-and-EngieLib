package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class DamageRecieverProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "type") == 1) {
			if (BoolArgumentType.getBool(arguments, "crucibypass") == true) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
				}
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:yellow_lightning_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.crucifixbypass = false;
						_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
					}
				});
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:yellow_lightning_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "type") == 2) {
			if (BoolArgumentType.getBool(arguments, "crucibypass") == true) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
				}
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:blue_burst_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.crucifixbypass = false;
						_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
					}
				});
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:blue_burst_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "type") == 3) {
			if (BoolArgumentType.getBool(arguments, "crucibypass") == true) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
				}
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:normal_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.crucifixbypass = false;
						_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
					}
				});
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:normal_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "type") == 4) {
			if (BoolArgumentType.getBool(arguments, "crucibypass") == true) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
				}
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:moab_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.crucifixbypass = false;
						_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
					}
				});
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("engies_chaos:moab_explosion")))),
						(float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "type") == 5) {
			if (BoolArgumentType.getBool(arguments, "crucibypass") == true) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
				}
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(DamageTypes.LIGHTNING_BOLT)), (float) DoubleArgumentType.getDouble(arguments, "amount"));
			} else {
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.crucifixbypass = false;
						_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
					}
				});
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(DamageTypes.LIGHTNING_BOLT)), (float) DoubleArgumentType.getDouble(arguments, "amount"));
			}
		} else {
			if (BoolArgumentType.getBool(arguments, "crucibypass") == true) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.crucifixbypass = true;
					_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
				}
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) DoubleArgumentType.getDouble(arguments, "amount"));
				EngiesChaosMod.queueServerWork(1, () -> {
					{
						EngiesChaosModVariables.PlayerVariables _vars = (commandParameterEntity(arguments, "entity")).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
						_vars.crucifixbypass = false;
						_vars.syncPlayerVariables((commandParameterEntity(arguments, "entity")));
					}
				});
			} else {
				(commandParameterEntity(arguments, "entity")).hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) DoubleArgumentType.getDouble(arguments, "amount"));
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
}