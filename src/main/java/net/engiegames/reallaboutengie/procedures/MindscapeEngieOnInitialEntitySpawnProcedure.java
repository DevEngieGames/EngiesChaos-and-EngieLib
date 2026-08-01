package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;
import net.engiegames.reallaboutengie.init.AllaboutengieModBlocks;
import net.engiegames.reallaboutengie.entity.MindscapeEngieEntity;

public class MindscapeEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(MindscapeEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(250 / 2d), e -> true).isEmpty()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (!(!world.getEntitiesOfClass(MindscapeEngieEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(250 / 2d), e -> true).isEmpty())) {
			if (Math.random() > 0.1) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				if (Math.random() <= 0.15 && Math.random() > 0.05) {
					entity.getPersistentData().putBoolean("mindscapecandespawn", false);
					entity.getPersistentData().putBoolean("CanDespawn", true);
					AllaboutengieModVariables.MapVariables.get(world).numberofmindscapetradeable = AllaboutengieModVariables.MapVariables.get(world).numberofmindscapetradeable + 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (Math.random() > 0.15) {
					entity.getPersistentData().putBoolean("mindscapecandespawn", true);
				}
				if (Mth.nextDouble(RandomSource.create(), 1, 30) == 1) {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() > 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 2) {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() > 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 3) {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() > 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 4) {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() > 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 5) {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() > 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 6) {
					if (Math.random() <= 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() > 0.5) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.MONSTROSITY_ENGIE_BLOCK.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 7) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ITEMS_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 8) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.MOBS_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 9) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXTRAS_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 10) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKOS_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 11) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.DIMENSIONS_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 12) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ZOMBIES_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 13) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALL_ABOUT_ENGIE_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 14) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_PLAQUE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) == 15) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.BYE_BYE_THERE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 30) >= 16) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}