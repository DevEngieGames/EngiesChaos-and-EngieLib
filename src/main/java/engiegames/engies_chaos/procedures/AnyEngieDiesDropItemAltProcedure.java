package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModAttributes;

@Mod.EventBusSubscriber
public class AnyEngieDiesDropItemAltProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:sharkos")))) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity5.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
						&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity10.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity15.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel
						&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity20.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity25.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
						&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity30.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity35 && _livingEntity35.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity35.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
						&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity40.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity45 && _livingEntity45.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity45.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr48 && _plr48.level instanceof ServerLevel
						&& _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity50.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity55 && _livingEntity55.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity55.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr58 && _plr58.level instanceof ServerLevel
						&& _plr58.getAdvancements().getOrStartProgress(_plr58.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity60.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/hostile_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity65 && _livingEntity65.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity65.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr68 && _plr68.level instanceof ServerLevel
						&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < (entity instanceof LivingEntity _livingEntity70 && _livingEntity70.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity70.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
									: 0) / 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}