package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.engiegames.reallaboutengie.entity.EngieSharkoRareTamedEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareTamedAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareSleepEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareSitEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareLayOnSideEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareLayEntity;
import net.engiegames.reallaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RareEngieSharkoNameCheckProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EngieSharkoRareTamedAprilFoolsEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_sleep ~ ~ ~");
					}
				}
			}
		}
		if (entity instanceof EngieSharkoRareTamedEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareSitEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_sit ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareLayEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareLayOnSideEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay_on_side ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareSleepEntity) {
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_sleep ~ ~ ~");
					}
				}
			}
		}
	}
}