package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.ArrayList;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;

public class DDayLightningSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999, 255, false, false));
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), z, _ent.getYRot(), _ent.getXRot());
			}
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("engies_chaos:ddaylightningstrikeable")))
				&& (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true)) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == true) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							double _setval = 0.25;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.lightningflashnum = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
									("execute as @a[distance=..12.5] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " minecraft:lightning_bolt"));
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == false) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							double _setval = 0.25;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.lightningflashnum = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					for (int index0 = 0; index0 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index0++) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)), y, z + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
							entityToSpawn.setVisualOnly(true);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
									("execute as @a[distance=..12.5] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 40, 100)) + " minecraft:lightning_bolt"));
						}
					}
				}
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == true) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							double _setval = 0.25;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.lightningflashnum = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..6.25] engies_chaos:stunned 5 0 true");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
									("execute as @a[distance=..6.25] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 30, 100)) + " minecraft:lightning_bolt"));
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == false) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						{
							double _setval = 0.25;
							entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.lightningflashnum = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					EngiesChaosModVariables.MapVariables.get(world).playlightningsound2 = true;
					EngiesChaosModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					for (int index1 = 0; index1 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 4)); index1++) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.round(Mth.nextDouble(RandomSource.create(), -5, 5)), y, z + Math.round(Mth.nextDouble(RandomSource.create(), -5, 5)))));
							entityToSpawn.setVisualOnly(true);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..6.25] engies_chaos:stunned 5 0 true");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
									("execute as @a[distance=..6.25] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 30, 100)) + " minecraft:lightning_bolt"));
						}
					}
				}
			}
		} else if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) && EngiesChaosModVariables.MapVariables.get(world).engieswrathstart == true) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..25] engies_chaos:stunned 5 0 true");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
								("execute as @a[distance=..25] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 50, 100)) + " minecraft:lightning_bolt"));
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).ddayscornerlightning == false) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound3 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				for (int index2 = 0; index2 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 5, 10)); index2++) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.round(Mth.nextDouble(RandomSource.create(), -8, 8)), y, z + Math.round(Mth.nextDouble(RandomSource.create(), -8, 8)))));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..25] engies_chaos:stunned 5 0 true");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
								("execute as @a[distance=..25] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 50, 100)) + " minecraft:lightning_bolt"));
					}
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("engies_chaos:ddaylightningstrikeable")))) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound5 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				for (int index3 = 0; index3 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index3++) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)), y, z + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
								("execute as @a[distance=..12.5] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " minecraft:lightning_bolt"));
					}
				}
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == false && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				for (int index4 = 0; index4 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 2, 4)); index4++) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.round(Mth.nextDouble(RandomSource.create(), -5, 5)), y, z + Math.round(Mth.nextDouble(RandomSource.create(), -5, 5)))));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..6.25] engies_chaos:stunned 5 0 true");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
								("execute as @a[distance=..6.25] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 35, 100)) + " minecraft:lightning_bolt"));
					}
				}
			} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == false && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == false) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					{
						double _setval = 0.25;
						entityiterator.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.lightningflashnum = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).playlightningsound4 = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				for (int index5 = 0; index5 < (int) Math.round(Mth.nextDouble(RandomSource.create(), 3, 6)); index5++) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)), y, z + Math.round(Mth.nextDouble(RandomSource.create(), -6, 6)))));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a[distance=..12.5] engies_chaos:stunned 5 0 true");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
								("execute as @a[distance=..12.5] run damage @s " + Math.round(Mth.nextDouble(RandomSource.create(), 45, 100)) + " minecraft:lightning_bolt"));
					}
				}
			}
		} else {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}