/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.engiegames.reallaboutengie.block.entity.MetalTableBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestWarpedBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestSpruceBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestOakBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestMangroveBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestJungleBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestDarkOakBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestCrimsonBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestCherryBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestBirchBlockEntity;
import net.engiegames.reallaboutengie.block.entity.MetalChestAcaciaBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestWarpedBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestSpruceBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestOakBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestMangroveBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestJungleBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestDarkOakBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestCrimsonBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestCherryBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestBirchBlockEntity;
import net.engiegames.reallaboutengie.block.entity.AntimatterMetalChestAcaciaBlockEntity;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class AllaboutengieModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<BlockEntityType<MetalTableBlockEntity>> METAL_TABLE = register("metal_table", AllaboutengieModBlocks.METAL_TABLE, MetalTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestBlockEntity>> METAL_CHEST = register("metal_chest", AllaboutengieModBlocks.METAL_CHEST, MetalChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestOakBlockEntity>> METAL_CHEST_OAK = register("metal_chest_oak", AllaboutengieModBlocks.METAL_CHEST_OAK, MetalChestOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestDarkOakBlockEntity>> METAL_CHEST_DARK_OAK = register("metal_chest_dark_oak", AllaboutengieModBlocks.METAL_CHEST_DARK_OAK, MetalChestDarkOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestSpruceBlockEntity>> METAL_CHEST_SPRUCE = register("metal_chest_spruce", AllaboutengieModBlocks.METAL_CHEST_SPRUCE, MetalChestSpruceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestAcaciaBlockEntity>> METAL_CHEST_ACACIA = register("metal_chest_acacia", AllaboutengieModBlocks.METAL_CHEST_ACACIA, MetalChestAcaciaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestBirchBlockEntity>> METAL_CHEST_BIRCH = register("metal_chest_birch", AllaboutengieModBlocks.METAL_CHEST_BIRCH, MetalChestBirchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestWarpedBlockEntity>> METAL_CHEST_WARPED = register("metal_chest_warped", AllaboutengieModBlocks.METAL_CHEST_WARPED, MetalChestWarpedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestCrimsonBlockEntity>> METAL_CHEST_CRIMSON = register("metal_chest_crimson", AllaboutengieModBlocks.METAL_CHEST_CRIMSON, MetalChestCrimsonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestJungleBlockEntity>> METAL_CHEST_JUNGLE = register("metal_chest_jungle", AllaboutengieModBlocks.METAL_CHEST_JUNGLE, MetalChestJungleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestBlockEntity>> ANTIMATTER_METAL_CHEST = register("antimatter_metal_chest", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST, AntimatterMetalChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestOakBlockEntity>> ANTIMATTER_METAL_CHEST_OAK = register("antimatter_metal_chest_oak", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_OAK,
			AntimatterMetalChestOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestDarkOakBlockEntity>> ANTIMATTER_METAL_CHEST_DARK_OAK = register("antimatter_metal_chest_dark_oak", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_DARK_OAK,
			AntimatterMetalChestDarkOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestSpruceBlockEntity>> ANTIMATTER_METAL_CHEST_SPRUCE = register("antimatter_metal_chest_spruce", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_SPRUCE,
			AntimatterMetalChestSpruceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestAcaciaBlockEntity>> ANTIMATTER_METAL_CHEST_ACACIA = register("antimatter_metal_chest_acacia", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_ACACIA,
			AntimatterMetalChestAcaciaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestBirchBlockEntity>> ANTIMATTER_METAL_CHEST_BIRCH = register("antimatter_metal_chest_birch", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_BIRCH,
			AntimatterMetalChestBirchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestWarpedBlockEntity>> ANTIMATTER_METAL_CHEST_WARPED = register("antimatter_metal_chest_warped", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_WARPED,
			AntimatterMetalChestWarpedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestCrimsonBlockEntity>> ANTIMATTER_METAL_CHEST_CRIMSON = register("antimatter_metal_chest_crimson", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_CRIMSON,
			AntimatterMetalChestCrimsonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestJungleBlockEntity>> ANTIMATTER_METAL_CHEST_JUNGLE = register("antimatter_metal_chest_jungle", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_JUNGLE,
			AntimatterMetalChestJungleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestMangroveBlockEntity>> METAL_CHEST_MANGROVE = register("metal_chest_mangrove", AllaboutengieModBlocks.METAL_CHEST_MANGROVE, MetalChestMangroveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestMangroveBlockEntity>> ANTIMATTER_METAL_CHEST_MANGROVE = register("antimatter_metal_chest_mangrove", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_MANGROVE,
			AntimatterMetalChestMangroveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MetalChestCherryBlockEntity>> METAL_CHEST_CHERRY = register("metal_chest_cherry", AllaboutengieModBlocks.METAL_CHEST_CHERRY, MetalChestCherryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<AntimatterMetalChestCherryBlockEntity>> ANTIMATTER_METAL_CHEST_CHERRY = register("antimatter_metal_chest_cherry", AllaboutengieModBlocks.ANTIMATTER_METAL_CHEST_CHERRY,
			AntimatterMetalChestCherryBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}