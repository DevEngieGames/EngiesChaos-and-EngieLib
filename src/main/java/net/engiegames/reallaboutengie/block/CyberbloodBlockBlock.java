package net.engiegames.reallaboutengie.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CyberbloodBlockBlock extends Block {
	public CyberbloodBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.METAL).strength(5f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}