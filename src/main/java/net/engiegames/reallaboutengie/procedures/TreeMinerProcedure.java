package net.engiegames.reallaboutengie.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TreeMinerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("allaboutengie:treeminer/compatible")))) {
			{
				BlockPos _pos = new BlockPos(x + 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			TreeMinerProcedure.execute(world, x + 1, y, z, entity);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("allaboutengie:treeminer/compatible")))) {
			{
				BlockPos _pos = new BlockPos(x - 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			TreeMinerProcedure.execute(world, x - 1, y, z, entity);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("allaboutengie:treeminer/compatible")))) {
			{
				BlockPos _pos = new BlockPos(x, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			TreeMinerProcedure.execute(world, x, y + 1, z, entity);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("allaboutengie:treeminer/compatible")))) {
			{
				BlockPos _pos = new BlockPos(x, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			TreeMinerProcedure.execute(world, x, y - 1, z, entity);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("allaboutengie:treeminer/compatible")))) {
			{
				BlockPos _pos = new BlockPos(x, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			TreeMinerProcedure.execute(world, x, y, z + 1, entity);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("allaboutengie:treeminer/compatible")))) {
			{
				BlockPos _pos = new BlockPos(x, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			TreeMinerProcedure.execute(world, x, y, z - 1, entity);
		}
	}
}