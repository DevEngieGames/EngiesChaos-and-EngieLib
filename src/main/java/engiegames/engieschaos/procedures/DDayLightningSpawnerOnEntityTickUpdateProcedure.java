package engiegames.engieschaos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModGameRules;

public class DDayLightningSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999, 255, false, false));
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y - 1), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y - 1), z, _ent.getYRot(), _ent.getXRot());
			}
		} else {
			if (!entity.level.isClientSide())
				entity.discard();
			if (EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "playsound allaboutengie:customlightning weather @a ~ ~ ~ 0.25 0.75");
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, (float) 0.5, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, (float) 0.75);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, (float) 0.75, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (world.getLevelData().isThundering()
					&& !(EngiesChaosModVariables.MapVariables.get(world).ddaystart == true || EngiesChaosModVariables.MapVariables.get(world).sddaystart == true || EngiesChaosModVariables.MapVariables.get(world).thestart == true)) {
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true) {
					if (Math.random() < 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, 1, false);
							}
						}
					} else if (Math.random() >= 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, 1, false);
							}
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.HEAVY_LIGHTNING) == true && world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.EXTREME_LIGHTNING) == true) {
					if (Math.random() < 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, 1, false);
							}
						}
					} else if (Math.random() >= 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, 1, false);
							}
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning")), SoundSource.AMBIENT, (float) 0.25, 1, false);
							}
						}
					} else if (Math.random() >= 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("engies_chaos:customlightning2")), SoundSource.AMBIENT, (float) 0.25, 1, false);
							}
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}