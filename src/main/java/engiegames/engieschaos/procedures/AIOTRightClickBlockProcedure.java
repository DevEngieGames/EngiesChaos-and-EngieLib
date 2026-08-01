package engiegames.engieschaos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AIOTRightClickBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PODZOL || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COARSE_DIRT) && !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHIELD)) {
				world.setBlock(new BlockPos(x, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.hoe.till")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.hoe.till")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if (!entity.isShiftKeyDown()) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PODZOL || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COARSE_DIRT) && !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHIELD)) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DIRT_PATH.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shovel.flatten")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shovel.flatten")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}
}