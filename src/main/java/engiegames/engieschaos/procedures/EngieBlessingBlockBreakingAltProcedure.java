package engiegames.engieschaos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModItems;
import engiegames.engieschaos.init.EngiesChaosModEnchantments;
import engiegames.engieschaos.init.EngiesChaosModBlocks;
import engiegames.engieschaos.init.EngiesChaosModAttributes;

public class EngieBlessingBlockBreakingAltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.ENGIE_ORE.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()) {
			if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.random() <= (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
						? _livingEntity4.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
						: 0)) {
					if (Math.random() <= 0.5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() >= 0.5) {
						if ((world.getBlockState(new BlockPos(x, x, z))).getBlock() == EngiesChaosModBlocks.ENGIE_ORE.get()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.DELETED_MOD_ELEMENT.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.DELETED_MOD_ELEMENT.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
					if (Math.random() <= 0.5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() >= 0.5) {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.ENGIE_ORE.get()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModBlocks.ENGIE_ORE.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			} else {
				if (Math.random() <= 0.5) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() >= 0.5) {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.ENGIE_ORE.get()) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModBlocks.ENGIE_ORE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
					&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(
							new ExperienceOrb(_level, (x + 0.5), (y + 0.5), (z + 0.5), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(
							new ExperienceOrb(_level, (x + 0.5), (y + 0.5), (z + 0.5), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
									* (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)));
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.UNOBTAINIUM_ORE.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.DEEPSLATE_UNOBTAINIUM_ORE.get()) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
					&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(
							new ExperienceOrb(_level, (x + 0.5), (y + 0.5), (z + 0.5), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())));
			} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
					&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (world instanceof ServerLevel _level)
					_level.addFreshEntity(
							new ExperienceOrb(_level, (x + 0.5), (y + 0.5), (z + 0.5), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
									* (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)));
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COAL_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.COAL));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.IRON_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
			if (Math.random() <= 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.RAW_IRON));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.IRON_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GOLD_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
			if (Math.random() <= 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.RAW_GOLD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.GOLD_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIAMOND_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.DIAMOND));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.EMERALD_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.EMERALD));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.CYBER_ORE.get()) {
			if (Math.random() <= 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModBlocks.CYBER_ORE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == EngiesChaosModBlocks.BLOOD_ORE.get()) {
			if (Math.random() <= 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModBlocks.BLOOD_ORE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COPPER_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
			if (Math.random() <= 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.COPPER_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.RAW_COPPER));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ANCIENT_DEBRIS) {
			if (Math.random() <= 0.1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.NETHERITE_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.1 && Math.random() <= 0.6) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.NETHERITE_SCRAP));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() > 0.6) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Blocks.ANCIENT_DEBRIS));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.REDSTONE_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
			if (Math.random() <= 0.25) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.REDSTONE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LAPIS_ORE || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
			if (Math.random() <= 0.25) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(Items.LAPIS_LAZULI));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}