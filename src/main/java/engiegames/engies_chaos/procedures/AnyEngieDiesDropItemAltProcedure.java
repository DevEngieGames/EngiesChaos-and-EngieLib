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
		if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/sharkos")))) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/mad_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity6
									&& _livingEntity6.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity6.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
						&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity12
									&& _livingEntity12.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity12.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/angry_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity18
									&& _livingEntity18.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity18.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel
						&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity24
									&& _livingEntity24.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity24.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/enraged_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity30
									&& _livingEntity30.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity30.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
						&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity36
									&& _livingEntity36.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity36.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/outraged_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity42
									&& _livingEntity42.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity42.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr45 && _plr45.level instanceof ServerLevel
						&& _plr45.getAdvancements().getOrStartProgress(_plr45.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity48
									&& _livingEntity48.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity48.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile_biblically")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity54
									&& _livingEntity54.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity54.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr57 && _plr57.level instanceof ServerLevel
						&& _plr57.getAdvancements().getOrStartProgress(_plr57.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity60
									&& _livingEntity60.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity60.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/monstrosity_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity66
									&& _livingEntity66.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity66.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr69 && _plr69.level instanceof ServerLevel
						&& _plr69.getAdvancements().getOrStartProgress(_plr69.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity72
									&& _livingEntity72.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity72.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile_engie")))) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity78
									&& _livingEntity78.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity78.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof ServerPlayer _plr81 && _plr81.level instanceof ServerLevel
						&& _plr81.getAdvancements().getOrStartProgress(_plr81.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
							100)) < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livingEntity84
									&& _livingEntity84.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity84.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)
									/ 4) {
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