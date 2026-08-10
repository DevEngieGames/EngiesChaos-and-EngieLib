package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.init.EngiesChaosModBlocks;
import engiegames.engies_chaos.init.EngiesChaosModAttributes;

public class CoinDropping1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.TRUE_THROWBACK_TOGGLE) == false) {
			if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
				if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
					if ((entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
							&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
								100)) < (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity4.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0) / 4) {
							if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
								if (world instanceof Level _lvl6 && _lvl6.isDay()) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (!(world instanceof Level _lvl26 && _lvl26.isDay())) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) >= 5) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == -1) {
						if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
							if (world instanceof Level _lvl147 && _lvl147.isDay()) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_TESSERACT_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_TESSERACT_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (!(world instanceof Level _lvl167 && _lvl167.isDay())) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
									100)) < (entity instanceof LivingEntity _livingEntity188 && _livingEntity188.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity188.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0) / 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) <= 1) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 2) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 3) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 4) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) >= 5) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) <= 1) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 2) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 3) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 4) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 5) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) >= 6) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 30 && world.dimensionType().moonPhase(world.dayTime()) == 4) {
							if (world instanceof Level _lvl410 && _lvl410.isDay()) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_TESSERACT_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_TESSERACT_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 29 && world.dimensionType().moonPhase(world.dayTime()) == 4) {
							if (!(world instanceof Level _lvl431 && _lvl431.isDay())) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
									100)) < (entity instanceof LivingEntity _livingEntity452 && _livingEntity452.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
											? _livingEntity452.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
											: 0) / 4) {
								if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 28) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) <= 1) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 2) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 3) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 4) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) >= 5) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 27) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) <= 1) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) == 2) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) == 3) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) >= 4) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 26) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) <= 1) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) == 2) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) >= 3) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 25) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 3)) <= 1) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 3)) >= 2) {
										if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 24) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 13) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 5) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) >= 6) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 12) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 5) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 11) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) == 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 5)) >= 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 10) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) >= 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 9) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 4)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 3)) >= 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 8) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false) {
				if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
					if ((entity instanceof ServerPlayer _plr1172 && _plr1172.level instanceof ServerLevel
							&& _plr1172.getAdvancements().getOrStartProgress(_plr1172.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) == true) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
								100)) < (entity instanceof LivingEntity _livingEntity1174 && _livingEntity1174.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity1174.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0) / 4) {
							if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
								if (world instanceof Level _lvl1176 && _lvl1176.isDay()) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ROUGHIAN_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
								if (!(world instanceof Level _lvl1196 && _lvl1196.isDay())) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DARK_MATTER_COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) >= 5) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (world.dimensionType().moonPhase(world.dayTime()) == 4) {
							if (world instanceof Level _lvl1317 && _lvl1317.isDay()) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_TESSERACT_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_TESSERACT_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
							if (!(world instanceof Level _lvl1337 && _lvl1337.isDay())) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.COSMIC_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
					if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
								100)) < (entity instanceof LivingEntity _livingEntity1358 && _livingEntity1358.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
										? _livingEntity1358.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
										: 0) / 4) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) <= 1) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_GAMES_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 2) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_ENGIE_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 3) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_THE_END_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) == 4) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 6)) >= 5) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ANTIMATTER_DOOMS_DAY_COIN_BLOCK.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) <= 1) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_GAMES_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 2) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.MINDSCAPE_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MINDSCAPE_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 3) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.ENGIE_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 4) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.THE_END_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) == 5) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.SUPER_DOOMS_DAY_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 7)) >= 6) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) < 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) == 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModBlocks.DOOMS_DAY_COIN_BLOCK.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) > 50) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}