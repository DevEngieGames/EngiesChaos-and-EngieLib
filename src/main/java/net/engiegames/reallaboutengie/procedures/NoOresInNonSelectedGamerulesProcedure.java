package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoOresInNonSelectedGamerulesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == true && world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == false
				&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK_TOGGLE) == false) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:antimatter_engie_ore");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:deepslate_antimatter_engie_ore");
					}
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:deepslate_unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:old_engie_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:old_deepslate_engie_ore");
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == true && world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == true
				&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK_TOGGLE) == false) {
			if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:antimatter_engie_ore");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:deepslate_antimatter_engie_ore");
					}
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:old_engie_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:deepslate_engie_ore replace allaboutengie:old_deepslate_engie_ore");
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ALL_ABOUT_ENGIE_TOGGLE) == false && world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.ENRAGED_ZOMBIES_TOGGLE) == false
				&& world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_THROWBACK_TOGGLE) == true) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:old_engie_ore replace allaboutengie:unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:old_deepslate_engie_ore replace allaboutengie:deepslate_unobtainium_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:engie_ore");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "fill ~15 ~15 ~15 ~-15 ~-15 ~-15 allaboutengie:engie_ore replace allaboutengie:deepslate_engie_ore");
				}
			}
		}
	}
}