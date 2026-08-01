package engiegames.engieschaos.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DarkMatterAngryEngieBlockBlock extends Block {
	public DarkMatterAngryEngieBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).sound(SoundType.METAL).strength(6f, 45f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}