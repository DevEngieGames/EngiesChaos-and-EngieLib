package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;
import net.engiegames.reallaboutengie.init.AllaboutengieModEnchantments;
import net.engiegames.reallaboutengie.init.AllaboutengieModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AnyEngieDiesDropItemProcedure {
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
		if (sourceentity instanceof Player) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
							? _livingEntity2.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
							: 0)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
							? _livingEntity7.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
							: 0)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
							? _livingEntity12.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
							: 0)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
							? _livingEntity17.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
							: 0)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
							? _livingEntity22.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
							: 0)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
							? _livingEntity27.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
							: 0)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("allaboutengie:techno/pickaxes")))
					&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).playerkilledmobswithoutpickaxeonlycount == 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
						if (sourceentity instanceof Player _player)
							_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15);
						for (int index0 = 0; index0 < 15; index0++) {
							if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity43.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity48.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity53.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity58 && _livingEntity58.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity58.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity63 && _livingEntity63.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity63.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity68 && _livingEntity68.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity68.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					} else {
						for (int index1 = 0; index1 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index1++) {
							if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity75 && _livingEntity75.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity75.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity80 && _livingEntity80.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity80.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity85 && _livingEntity85.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity85.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity90 && _livingEntity90.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity90.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity95 && _livingEntity95.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity95.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity100 && _livingEntity100.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity100.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index2 = 0; index2 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index2++) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if (sourceentity instanceof Player _player)
								_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15);
							for (int index3 = 0; index3 < 15; index3++) {
								if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity116 && _livingEntity116.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity116.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity121 && _livingEntity121.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity121.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity126 && _livingEntity126.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity126.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity131 && _livingEntity131.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity131.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity136 && _livingEntity136.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity136.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity141 && _livingEntity141.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity141.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else {
							for (int index4 = 0; index4 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index4++) {
								if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity148 && _livingEntity148.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity148.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity153 && _livingEntity153.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity153.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity158 && _livingEntity158.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity158.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity163 && _livingEntity163.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity163.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity168 && _livingEntity168.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity168.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity173 && _livingEntity173.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity173.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index5 = 0; index5 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index5++) {
						if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity184 && _livingEntity184.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity184.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity189 && _livingEntity189.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity189.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity194 && _livingEntity194.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity194.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity199 && _livingEntity199.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity199.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity204 && _livingEntity204.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity204.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity209 && _livingEntity209.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity209.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			} else {
				if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
						if (sourceentity instanceof Player _player)
							_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15);
						for (int index6 = 0; index6 < 15; index6++) {
							if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity223 && _livingEntity223.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity223.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity228 && _livingEntity228.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity228.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity233 && _livingEntity233.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity233.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity238 && _livingEntity238.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity238.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity243 && _livingEntity243.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity243.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity248 && _livingEntity248.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity248.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					} else {
						for (int index7 = 0; index7 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index7++) {
							if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity255 && _livingEntity255.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity255.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity260 && _livingEntity260.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity260.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity265 && _livingEntity265.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity265.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity270 && _livingEntity270.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity270.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity275 && _livingEntity275.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity275.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity280 && _livingEntity280.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity280.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index8 = 0; index8 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index8++) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if (sourceentity instanceof Player _player)
								_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15);
							for (int index9 = 0; index9 < 15; index9++) {
								if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity296 && _livingEntity296.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity296.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity301 && _livingEntity301.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity301.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity306 && _livingEntity306.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity306.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity311 && _livingEntity311.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity311.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity316 && _livingEntity316.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity316.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity321 && _livingEntity321.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity321.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else {
							for (int index10 = 0; index10 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index10++) {
								if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity328 && _livingEntity328.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity328.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity333 && _livingEntity333.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity333.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity338 && _livingEntity338.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity338.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity343 && _livingEntity343.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity343.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity348 && _livingEntity348.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity348.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity353 && _livingEntity353.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity353.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
												entityToSpawn.setPickUpDelay(20);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
											entityToSpawn.setPickUpDelay(20);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index11 = 0; index11 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index11++) {
						if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity364 && _livingEntity364.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity364.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity369 && _livingEntity369.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity369.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity374 && _livingEntity374.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity374.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity379 && _livingEntity379.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity379.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity384 && _livingEntity384.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity384.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity389 && _livingEntity389.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity389.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(20);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(20);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			}
		} else if (sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblically")))) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.15) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.15) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.15) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.15) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.15) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.15) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (!(sourceentity instanceof Player || sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblically"))))) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/mad_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/angry_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/enraged_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/outraged_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblicallyhostile")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/monstrosity_engie")))) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(20);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}