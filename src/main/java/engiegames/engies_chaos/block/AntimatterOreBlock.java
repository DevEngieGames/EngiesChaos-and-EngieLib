package engiegames.engies_chaos.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class AntimatterOreBlock extends Block {
	public AntimatterOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(10f, 100f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}