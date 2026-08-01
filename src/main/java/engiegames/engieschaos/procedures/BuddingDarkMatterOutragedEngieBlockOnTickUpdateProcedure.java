package engiegames.engieschaos.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import engiegames.engieschaos.init.EngiesChaosModBlocks;

public class BuddingDarkMatterOutragedEngieBlockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String timerName = "";
		BlockState crystal = Blocks.AIR.defaultBlockState();
		double randomNumber = 0;
		double delayTime = 0;
		if (!world.isClientSide()) {
			timerName = "GrowthTimer";
			delayTime = 1200;
			crystal = EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL.get().defaultBlockState();
		}
		if (!world.isClientSide()) {
			if (getBlockNBTNumber(world, new BlockPos(x, y, z), timerName) < delayTime) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble(timerName, (getBlockNBTNumber(world, new BlockPos(x, y, z), timerName) + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (Math.random() <= 0.1666666667) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y + 1, z), crystal, 3);
						{
							Direction _dir = Direction.UP;
							BlockPos _pos = new BlockPos(x, y + 1, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				} else if (Math.random() >= 0.1666666667 + 0.1666666667 && Math.random() < 0.1666666667 + 0.1666666667 + 0.1666666667) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y - 1, z), crystal, 3);
						{
							Direction _dir = Direction.DOWN;
							BlockPos _pos = new BlockPos(x, y - 1, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				} else if (Math.random() >= 0.1666666667 + 0.1666666667 + 0.1666666667 && Math.random() < 0.1666666667 + 0.1666666667 + 0.1666666667 + 0.1666666667) {
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z - 1), crystal, 3);
						{
							Direction _dir = Direction.NORTH;
							BlockPos _pos = new BlockPos(x, y, z - 1);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				} else if (Math.random() >= 0.1666666667 + 0.1666666667 + 0.1666666667 + 0.1666666667 && Math.random() < 0.1666666667 + 0.1666666667 + 0.1666666667 + 0.1666666667 + 0.1666666667) {
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y, z + 1), crystal, 3);
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = new BlockPos(x, y, z + 1);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				} else if (Math.random() >= 0.1666666667 + 0.1666666667 + 0.1666666667 + 0.1666666667 + 0.1666666667 && Math.random() < 1) {
					if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x - 1, y, z), crystal, 3);
						{
							Direction _dir = Direction.WEST;
							BlockPos _pos = new BlockPos(x - 1, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				} else if (Math.random() == 1 && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x + 1, y, z), crystal, 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = new BlockPos(x + 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble(timerName, 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}
}