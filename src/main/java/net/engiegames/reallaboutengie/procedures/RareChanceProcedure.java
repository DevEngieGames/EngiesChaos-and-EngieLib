package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;
import net.engiegames.reallaboutengie.init.AllaboutengieModGameRules;
import net.engiegames.reallaboutengie.init.AllaboutengieModEnchantments;
import net.engiegames.reallaboutengie.init.AllaboutengieModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RareChanceProcedure {
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
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("allaboutengie:techno/pickaxes")))
					&& (sourceentity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).playerkilledmobswithoutpickaxeonlycount == 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl8 && _lvl8.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity11.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity16.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity21.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity26.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity31.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity36.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity41.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity46 && _livingEntity46.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity46.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15));
						for (int index0 = 0; index0 < 15; index0++) {
							if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
								if (world instanceof Level _lvl59 && _lvl59.isDay()) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity62 && _livingEntity62.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity62.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
								if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity67 && _livingEntity67.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity67.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity72 && _livingEntity72.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity72.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity77 && _livingEntity77.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity77.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity82 && _livingEntity82.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity82.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() >= 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity87 && _livingEntity87.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity87.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() >= 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity92 && _livingEntity92.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity92.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() < 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity97 && _livingEntity97.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity97.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					} else {
						for (int index1 = 0; index1 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index1++) {
							if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
								if (world instanceof Level _lvl104 && _lvl104.isDay()) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity107 && _livingEntity107.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity107.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
								if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity112 && _livingEntity112.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity112.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity117 && _livingEntity117.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity117.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity122 && _livingEntity122.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity122.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity127 && _livingEntity127.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity127.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() >= 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity132 && _livingEntity132.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity132.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() >= 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity137 && _livingEntity137.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity137.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() < 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity142 && _livingEntity142.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity142.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl151 && _lvl151.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity154 && _livingEntity154.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity154.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity159 && _livingEntity159.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity159.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity164 && _livingEntity164.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity164.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity169 && _livingEntity169.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity169.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity174 && _livingEntity174.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity174.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity179 && _livingEntity179.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity179.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity184 && _livingEntity184.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity184.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity189 && _livingEntity189.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity189.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					for (int index2 = 0; index2 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index2++) {
						if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
							if (world instanceof Level _lvl196 && _lvl196.isDay()) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity199 && _livingEntity199.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity199.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
							if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity204 && _livingEntity204.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity204.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity209 && _livingEntity209.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity209.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity214 && _livingEntity214.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity214.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity219 && _livingEntity219.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity219.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() >= 0.5) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity224 && _livingEntity224.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity224.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else {
								if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity229 && _livingEntity229.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity229.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() < 0.5) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity234 && _livingEntity234.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity234.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl243 && _lvl243.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity246 && _livingEntity246.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity246.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity251 && _livingEntity251.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity251.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity256 && _livingEntity256.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity256.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity261 && _livingEntity261.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity261.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity266 && _livingEntity266.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity266.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity271 && _livingEntity271.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity271.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity276 && _livingEntity276.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity276.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity281 && _livingEntity281.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity281.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					for (int index3 = 0; index3 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index3++) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if (world instanceof ServerLevel _level)
								_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
										(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15));
							for (int index4 = 0; index4 < 15; index4++) {
								if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
									if (world instanceof Level _lvl296 && _lvl296.isDay()) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
										if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity299 && _livingEntity299.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity299.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
									if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
									if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity304 && _livingEntity304.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity304.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity309 && _livingEntity309.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity309.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity314 && _livingEntity314.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity314.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity319 && _livingEntity319.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity319.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() >= 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity324 && _livingEntity324.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity324.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() >= 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity329 && _livingEntity329.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity329.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() < 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity334 && _livingEntity334.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity334.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() < 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							}
						} else {
							for (int index5 = 0; index5 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index5++) {
								if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
									if (world instanceof Level _lvl341 && _lvl341.isDay()) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
										if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity344 && _livingEntity344.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity344.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
									if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
									if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity349 && _livingEntity349.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity349.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity354 && _livingEntity354.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity354.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity359 && _livingEntity359.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity359.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity364 && _livingEntity364.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity364.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() >= 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity369 && _livingEntity369.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity369.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() >= 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity374 && _livingEntity374.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity374.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() < 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity379 && _livingEntity379.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity379.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() < 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							}
						}
					}
				} else {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl384 && _lvl384.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity387 && _livingEntity387.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity387.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity392 && _livingEntity392.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity392.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity397 && _livingEntity397.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity397.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity402 && _livingEntity402.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity402.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity407 && _livingEntity407.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity407.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity412 && _livingEntity412.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity412.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity417 && _livingEntity417.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity417.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity422 && _livingEntity422.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity422.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			} else {
				if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl431 && _lvl431.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity434 && _livingEntity434.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity434.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity439 && _livingEntity439.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity439.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity444 && _livingEntity444.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity444.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity449 && _livingEntity449.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity449.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity454 && _livingEntity454.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity454.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity459 && _livingEntity459.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity459.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity464 && _livingEntity464.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity464.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity469 && _livingEntity469.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity469.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
									(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15));
						for (int index6 = 0; index6 < 15; index6++) {
							if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
								if (world instanceof Level _lvl482 && _lvl482.isDay()) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity485 && _livingEntity485.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity485.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
								if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity490 && _livingEntity490.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity490.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity495 && _livingEntity495.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity495.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity500 && _livingEntity500.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity500.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity505 && _livingEntity505.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity505.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() >= 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity510 && _livingEntity510.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity510.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() >= 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity515 && _livingEntity515.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity515.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() < 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity520 && _livingEntity520.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity520.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					} else {
						for (int index7 = 0; index7 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index7++) {
							if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
								if (world instanceof Level _lvl527 && _lvl527.isDay()) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity530 && _livingEntity530.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity530.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
								if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity535 && _livingEntity535.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity535.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity540 && _livingEntity540.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity540.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity545 && _livingEntity545.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity545.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity550 && _livingEntity550.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity550.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() >= 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity555 && _livingEntity555.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity555.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() >= 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity560 && _livingEntity560.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity560.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() < 0.5) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity565 && _livingEntity565.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity565.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				} else if (!(EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl574 && _lvl574.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity577 && _livingEntity577.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity577.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity582 && _livingEntity582.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity582.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity587 && _livingEntity587.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity587.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity592 && _livingEntity592.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity592.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity597 && _livingEntity597.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity597.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity602 && _livingEntity602.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity602.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity607 && _livingEntity607.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity607.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity612 && _livingEntity612.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity612.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					for (int index8 = 0; index8 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index8++) {
						if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
							if (world instanceof Level _lvl619 && _lvl619.isDay()) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
								if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity622 && _livingEntity622.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity622.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
							if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity627 && _livingEntity627.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity627.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity632 && _livingEntity632.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity632.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity637 && _livingEntity637.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity637.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity642 && _livingEntity642.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity642.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() >= 0.5) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity647 && _livingEntity647.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity647.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else {
								if (Math.random() >= 0.5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity652 && _livingEntity652.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity652.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() < 0.5) {
									if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity657 && _livingEntity657.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity657.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
											: 0)) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl666 && _lvl666.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity669 && _livingEntity669.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity669.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity674 && _livingEntity674.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity674.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity679 && _livingEntity679.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity679.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity684 && _livingEntity684.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity684.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity689 && _livingEntity689.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity689.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity694 && _livingEntity694.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity694.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity699 && _livingEntity699.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity699.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity704 && _livingEntity704.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity704.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					for (int index9 = 0; index9 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index9++) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if (world instanceof ServerLevel _level)
								_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
										(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()) - 15));
							for (int index10 = 0; index10 < 15; index10++) {
								if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
									if (world instanceof Level _lvl719 && _lvl719.isDay()) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
										if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity722 && _livingEntity722.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity722.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
									if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
									if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity727 && _livingEntity727.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity727.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity732 && _livingEntity732.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity732.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity737 && _livingEntity737.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity737.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity742 && _livingEntity742.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity742.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() >= 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity747 && _livingEntity747.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity747.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() >= 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity752 && _livingEntity752.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity752.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() < 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity757 && _livingEntity757.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity757.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() < 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							}
						} else {
							for (int index11 = 0; index11 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get()); index11++) {
								if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
									if (world instanceof Level _lvl764 && _lvl764.isDay()) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
										if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity767 && _livingEntity767.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity767.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
									if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
									if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity772 && _livingEntity772.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity772.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity777 && _livingEntity777.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity777.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity782 && _livingEntity782.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity782.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity787 && _livingEntity787.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity787.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() >= 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity792 && _livingEntity792.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity792.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() >= 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
								if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity797 && _livingEntity797.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
												? _livingEntity797.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
												: 0)) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										} else {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
									if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
										if (Math.random() < 0.5) {
											if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity802 && _livingEntity802.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
													? _livingEntity802.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
													: 0)) {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
											}
										}
									} else {
										if (Math.random() < 0.5) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							}
						}
					}
				} else {
					if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
						if (world instanceof Level _lvl807 && _lvl807.isDay()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity810 && _livingEntity810.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity810.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
						if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity815 && _livingEntity815.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity815.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity820 && _livingEntity820.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity820.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity825 && _livingEntity825.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity825.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity830 && _livingEntity830.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity830.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() >= 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity835 && _livingEntity835.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity835.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() >= 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
					if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity840 && _livingEntity840.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
									? _livingEntity840.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
									: 0)) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
						if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.random() < 0.5) {
								if (Math.random() <= (sourceentity instanceof LivingEntity _livingEntity845 && _livingEntity845.getAttributes().hasAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity845.getAttribute(AllaboutengieModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getValue()
										: 0)) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			}
		} else if (!(sourceentity instanceof Player)) {
			if (world.dimensionType().moonPhase(world.dayTime()) == 4 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty == 28) {
				if (world instanceof Level _lvl851 && _lvl851.isDay()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_TESSERACT.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (Math.random() <= 0.05 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 13) {
					if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() <= 0.15 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 12) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.MINDSCAPE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 11) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 8) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 9) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() >= 0.5) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
					if (Math.random() >= 0.5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() <= 0.05) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && Math.random() <= 0.25 && AllaboutengieModVariables.MapVariables.get(world).MobDifficulty >= 10) {
				if (AllaboutengieModVariables.MapVariables.get(world).antimatterdropcheck == true) {
					if (Math.random() < 0.5) {
						if (Math.random() <= 0.05) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}