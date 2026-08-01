package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModEntities;
import net.engiegames.reallaboutengie.entity.OutragedEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.OutragedEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.OutragedEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.MonstrosityEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.MonstrosityEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.MonstrosityEngieEntity;
import net.engiegames.reallaboutengie.entity.MonstrosityEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.MadEngieEntity;
import net.engiegames.reallaboutengie.entity.MadEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.HostileBiblicallyAccurateEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.HostileBiblicallyAccurateEngieEntity;
import net.engiegames.reallaboutengie.entity.HostileBiblicallyAccurateEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.EnragedEngieStyle3Entity;
import net.engiegames.reallaboutengie.entity.EnragedEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.EnragedEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.EnragedEngieEntity;
import net.engiegames.reallaboutengie.entity.EnragedEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieEntity;
import net.engiegames.reallaboutengie.entity.BiblicallyAccurateEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.AngryEngieStyle2Entity;
import net.engiegames.reallaboutengie.entity.AngryEngieHalloweenEntity;
import net.engiegames.reallaboutengie.entity.AngryEngieEntity;
import net.engiegames.reallaboutengie.entity.AngryEngieColdSeasonEntity;
import net.engiegames.reallaboutengie.entity.AngryCreatorEntity;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class ColdSeasonSpawningProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).seasonautumn == true || AllaboutengieModVariables.MapVariables.get(world).seasonwinter == true) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/hashalloweenvariant")))) {
				if (Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
					if (entity instanceof AngryEngieColdSeasonEntity || entity instanceof AngryEngieEntity || entity instanceof AngryEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryEngieHalloweenEntity(AllaboutengieModEntities.ANGRY_ENGIE_HALLOWEEN.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof EnragedEngieColdSeasonEntity || entity instanceof EnragedEngieEntity || entity instanceof EnragedEngieStyle2Entity || entity instanceof EnragedEngieStyle3Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EnragedEngieHalloweenEntity(AllaboutengieModEntities.ENRAGED_ENGIE_HALLOWEEN.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof OutragedEngieColdSeasonEntity || entity instanceof AngryCreatorEntity || entity instanceof OutragedEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new OutragedEngieHalloweenEntity(AllaboutengieModEntities.OUTRAGED_ENGIE_HALLOWEEN.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof MonstrosityEngieColdSeasonEntity || entity instanceof MonstrosityEngieEntity || entity instanceof MonstrosityEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MonstrosityEngieHalloweenEntity(AllaboutengieModEntities.MONSTROSITY_ENGIE_HALLOWEEN.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof BiblicallyAccurateEngieColdSeasonEntity || entity instanceof BiblicallyAccurateEngieEntity || entity instanceof BiblicallyAccurateEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new BiblicallyAccurateEngieHalloweenEntity(AllaboutengieModEntities.BIBLICALLY_ACCURATE_ENGIE_HALLOWEEN.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25)) {
					if (entity instanceof MadEngieEntity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MadEngieColdSeasonEntity(AllaboutengieModEntities.MAD_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof AngryEngieEntity || entity instanceof AngryEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AngryEngieColdSeasonEntity(AllaboutengieModEntities.ANGRY_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof EnragedEngieEntity || entity instanceof EnragedEngieStyle2Entity || entity instanceof EnragedEngieStyle3Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EnragedEngieColdSeasonEntity(AllaboutengieModEntities.ENRAGED_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof AngryCreatorEntity || entity instanceof OutragedEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new OutragedEngieColdSeasonEntity(AllaboutengieModEntities.OUTRAGED_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof MonstrosityEngieEntity || entity instanceof MonstrosityEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MonstrosityEngieColdSeasonEntity(AllaboutengieModEntities.MONSTROSITY_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof BiblicallyAccurateEngieEntity || entity instanceof BiblicallyAccurateEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new BiblicallyAccurateEngieColdSeasonEntity(AllaboutengieModEntities.BIBLICALLY_ACCURATE_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity instanceof HostileBiblicallyAccurateEngieEntity || entity instanceof HostileBiblicallyAccurateEngieStyle2Entity) {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HostileBiblicallyAccurateEngieColdSeasonEntity(AllaboutengieModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE_COLD_SEASON.get(), _level);
							entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else {
				if (entity instanceof MadEngieEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MadEngieColdSeasonEntity(AllaboutengieModEntities.MAD_ENGIE_COLD_SEASON.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (entity instanceof HostileBiblicallyAccurateEngieEntity || entity instanceof HostileBiblicallyAccurateEngieStyle2Entity) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new HostileBiblicallyAccurateEngieColdSeasonEntity(AllaboutengieModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE_COLD_SEASON.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).seasonautumn == false && AllaboutengieModVariables.MapVariables.get(world).seasonwinter == false) {
			if (entity instanceof MadEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MadEngieEntity(AllaboutengieModEntities.MAD_ENGIE.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof AngryEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (Math.random() <= 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryEngieEntity(AllaboutengieModEntities.ANGRY_ENGIE.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 1 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryEngieStyle2Entity(AllaboutengieModEntities.ANGRY_ENGIE_STYLE_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity instanceof EnragedEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (Math.random() <= 0.33) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedEngieEntity(AllaboutengieModEntities.ENRAGED_ENGIE.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 0.66 && Math.random() > 0.33) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedEngieStyle2Entity(AllaboutengieModEntities.ENRAGED_ENGIE_STYLE_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 1 && Math.random() > 0.66) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedEngieStyle3Entity(AllaboutengieModEntities.ENRAGED_ENGIE_STYLE_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity instanceof OutragedEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (Math.random() <= 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AngryCreatorEntity(AllaboutengieModEntities.OUTRAGED_ENGIE.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 1 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new OutragedEngieStyle2Entity(AllaboutengieModEntities.OUTRAGED_ENGIE_STYLE_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity instanceof MonstrosityEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (Math.random() <= 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MonstrosityEngieEntity(AllaboutengieModEntities.MONSTROSITY_ENGIE.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 1 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MonstrosityEngieStyle2Entity(AllaboutengieModEntities.MONSTROSITY_ENGIE_STYLE_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity instanceof BiblicallyAccurateEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (Math.random() <= 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BiblicallyAccurateEngieEntity(AllaboutengieModEntities.BIBLICALLY_ACCURATE_ENGIE.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 1 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BiblicallyAccurateEngieStyle2Entity(AllaboutengieModEntities.BIBLICALLY_ACCURATE_ENGIE_STYLE_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity instanceof HostileBiblicallyAccurateEngieColdSeasonEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (Math.random() <= 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new HostileBiblicallyAccurateEngieEntity(AllaboutengieModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() <= 1 && Math.random() > 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new HostileBiblicallyAccurateEngieStyle2Entity(AllaboutengieModEntities.HOSTILE_BIBLICALLY_ACCURATE_ENGIE_STYLE_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}