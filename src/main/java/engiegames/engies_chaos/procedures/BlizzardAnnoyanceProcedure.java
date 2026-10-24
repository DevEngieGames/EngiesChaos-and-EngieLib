package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

public class BlizzardAnnoyanceProcedure {
	public static void execute(LevelAccessor world) {
		if (EngiesChaosModVariables.MapVariables.get(world).DoomsdayFullStart == true) {
			if (Math.random() > 0.125) {
				if (EngiesChaosModVariables.MapVariables.get(world).blizzard == false) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:blizzard weather @s ~ ~ ~ 2");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 999999, 20));
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).blizzard == true) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:blizzard");
							}
						}
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DARKNESS);
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).SuperDoomsdayFullStart == true) {
			if (Math.random() > 0.25) {
				if (EngiesChaosModVariables.MapVariables.get(world).blizzard == false) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:blizzard weather @s ~ ~ ~ 2");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 999999, 20));
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).blizzard == true) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:blizzard");
							}
						}
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DARKNESS);
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).TheEndFullStart == true) {
			if (Math.random() > 0.375) {
				if (EngiesChaosModVariables.MapVariables.get(world).blizzard == false) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:blizzard weather @s ~ ~ ~ 2");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 999999, 20));
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).blizzard == true) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:blizzard");
							}
						}
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DARKNESS);
					}
				}
			}
		} else if (EngiesChaosModVariables.MapVariables.get(world).EngiesWrathFullStart == true) {
			if (Math.random() > 0.5) {
				if (EngiesChaosModVariables.MapVariables.get(world).blizzard == false) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:blizzard weather @s ~ ~ ~ 2");
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 999999, 20));
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).blizzard == true) {
					EngiesChaosModVariables.MapVariables.get(world).blizzard = false;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							Entity _ent = entityiterator;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:blizzard");
							}
						}
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DARKNESS);
					}
				}
			}
		} else {
			if (EngiesChaosModVariables.MapVariables.get(world).blizzard == false) {
				EngiesChaosModVariables.MapVariables.get(world).blizzard = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound engies_chaos:blizzard weather @s ~ ~ ~ 2");
						}
					}
					if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 999999, 20));
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).blizzard == true) {
				EngiesChaosModVariables.MapVariables.get(world).blizzard = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @s weather engies_chaos:blizzard");
						}
					}
					if (entityiterator instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.DARKNESS);
				}
			}
		}
	}
}