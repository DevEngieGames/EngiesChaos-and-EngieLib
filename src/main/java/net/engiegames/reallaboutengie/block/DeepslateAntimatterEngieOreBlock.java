package net.engiegames.reallaboutengie.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DeepslateAntimatterEngieOreBlock extends Block {
	public DeepslateAntimatterEngieOreBlock() {
		super(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.DEEPSLATE).strength(4.5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}