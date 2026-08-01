package engiegames.engies_chaos.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DeepslateUnobtainiumOreBlock extends Block {
	public DeepslateUnobtainiumOreBlock() {
		super(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS, MaterialColor.COLOR_BLACK).sound(SoundType.DEEPSLATE).strength(7f, 1200f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}