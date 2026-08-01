/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import engiegames.engies_chaos.block.entity.OutragedEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.OutragedEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.MonstrosityEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.MonstrosityEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.MetalTableBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestWarpedBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestSpruceBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestOakBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestMangroveBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestJungleBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestDarkOakBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestCrimsonBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestCherryBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestBirchBlockEntity;
import engiegames.engies_chaos.block.entity.MetalChestAcaciaBlockEntity;
import engiegames.engies_chaos.block.entity.MadEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.MadEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.EnragedEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.EnragedEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.EngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.EngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterOutragedEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterOutragedEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMonstrosityEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMonstrosityEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestWarpedBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestSpruceBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestOakBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestMangroveBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestJungleBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestDarkOakBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestCrimsonBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestCherryBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestBirchBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMetalChestAcaciaBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMadEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterMadEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterEnragedEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterEnragedEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterBiblicallyAccurateEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterBiblicallyAccurateEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterAngryEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.DarkMatterAngryEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingOutragedEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingMonstrosityEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingMadEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingEnragedEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterOutragedEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterMonstrosityEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterMadEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterEnragedEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterBiblicallyAccurateEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingDarkMatterAngryEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingBiblicallyAccurateEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterOutragedEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterMonstrosityEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterMadEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterEnragedEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterBiblicallyAccurateEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAntimatterAngryEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BuddingAngryEngieBlockBlockEntity;
import engiegames.engies_chaos.block.entity.BiblicallyAccurateEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.BiblicallyAccurateEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterOutragedEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterOutragedEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMonstrosityEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMonstrosityEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestWarpedBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestSpruceBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestOakBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestMangroveBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestJungleBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestDarkOakBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestCrimsonBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestCherryBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestBirchBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMetalChestAcaciaBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMadEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterMadEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterEnragedEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterEnragedEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterBiblicallyAccurateEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterBiblicallyAccurateEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterAngryEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AntimatterAngryEngieCrystalBlockEntity;
import engiegames.engies_chaos.block.entity.AngryEngieCrystalFullBlockEntity;
import engiegames.engies_chaos.block.entity.AngryEngieCrystalBlockEntity;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EngiesChaosModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, EngiesChaosMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalTableBlockEntity>> METAL_TABLE = register("metal_table", EngiesChaosModBlocks.METAL_TABLE, MetalTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestBlockEntity>> METAL_CHEST = register("metal_chest", EngiesChaosModBlocks.METAL_CHEST, MetalChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestOakBlockEntity>> METAL_CHEST_OAK = register("metal_chest_oak", EngiesChaosModBlocks.METAL_CHEST_OAK, MetalChestOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestDarkOakBlockEntity>> METAL_CHEST_DARK_OAK = register("metal_chest_dark_oak", EngiesChaosModBlocks.METAL_CHEST_DARK_OAK, MetalChestDarkOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestSpruceBlockEntity>> METAL_CHEST_SPRUCE = register("metal_chest_spruce", EngiesChaosModBlocks.METAL_CHEST_SPRUCE, MetalChestSpruceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestAcaciaBlockEntity>> METAL_CHEST_ACACIA = register("metal_chest_acacia", EngiesChaosModBlocks.METAL_CHEST_ACACIA, MetalChestAcaciaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestBirchBlockEntity>> METAL_CHEST_BIRCH = register("metal_chest_birch", EngiesChaosModBlocks.METAL_CHEST_BIRCH, MetalChestBirchBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestWarpedBlockEntity>> METAL_CHEST_WARPED = register("metal_chest_warped", EngiesChaosModBlocks.METAL_CHEST_WARPED, MetalChestWarpedBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestCrimsonBlockEntity>> METAL_CHEST_CRIMSON = register("metal_chest_crimson", EngiesChaosModBlocks.METAL_CHEST_CRIMSON, MetalChestCrimsonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestJungleBlockEntity>> METAL_CHEST_JUNGLE = register("metal_chest_jungle", EngiesChaosModBlocks.METAL_CHEST_JUNGLE, MetalChestJungleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestBlockEntity>> ANTIMATTER_METAL_CHEST = register("antimatter_metal_chest", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST,
			AntimatterMetalChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestOakBlockEntity>> ANTIMATTER_METAL_CHEST_OAK = register("antimatter_metal_chest_oak", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_OAK,
			AntimatterMetalChestOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestDarkOakBlockEntity>> ANTIMATTER_METAL_CHEST_DARK_OAK = register("antimatter_metal_chest_dark_oak", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_DARK_OAK,
			AntimatterMetalChestDarkOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestSpruceBlockEntity>> ANTIMATTER_METAL_CHEST_SPRUCE = register("antimatter_metal_chest_spruce", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_SPRUCE,
			AntimatterMetalChestSpruceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestAcaciaBlockEntity>> ANTIMATTER_METAL_CHEST_ACACIA = register("antimatter_metal_chest_acacia", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_ACACIA,
			AntimatterMetalChestAcaciaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestBirchBlockEntity>> ANTIMATTER_METAL_CHEST_BIRCH = register("antimatter_metal_chest_birch", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_BIRCH,
			AntimatterMetalChestBirchBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestWarpedBlockEntity>> ANTIMATTER_METAL_CHEST_WARPED = register("antimatter_metal_chest_warped", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_WARPED,
			AntimatterMetalChestWarpedBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestCrimsonBlockEntity>> ANTIMATTER_METAL_CHEST_CRIMSON = register("antimatter_metal_chest_crimson", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_CRIMSON,
			AntimatterMetalChestCrimsonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestJungleBlockEntity>> ANTIMATTER_METAL_CHEST_JUNGLE = register("antimatter_metal_chest_jungle", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_JUNGLE,
			AntimatterMetalChestJungleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestMangroveBlockEntity>> METAL_CHEST_MANGROVE = register("metal_chest_mangrove", EngiesChaosModBlocks.METAL_CHEST_MANGROVE, MetalChestMangroveBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestMangroveBlockEntity>> ANTIMATTER_METAL_CHEST_MANGROVE = register("antimatter_metal_chest_mangrove", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_MANGROVE,
			AntimatterMetalChestMangroveBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalChestCherryBlockEntity>> METAL_CHEST_CHERRY = register("metal_chest_cherry", EngiesChaosModBlocks.METAL_CHEST_CHERRY, MetalChestCherryBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMetalChestCherryBlockEntity>> ANTIMATTER_METAL_CHEST_CHERRY = register("antimatter_metal_chest_cherry", EngiesChaosModBlocks.ANTIMATTER_METAL_CHEST_CHERRY,
			AntimatterMetalChestCherryBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAngryEngieBlockBlockEntity>> BUDDING_ANGRY_ENGIE_BLOCK = register("budding_angry_engie_block", EngiesChaosModBlocks.BUDDING_ANGRY_ENGIE_BLOCK,
			BuddingAngryEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AngryEngieCrystalBlockEntity>> ANGRY_ENGIE_CRYSTAL = register("angry_engie_crystal", EngiesChaosModBlocks.ANGRY_ENGIE_CRYSTAL, AngryEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingEnragedEngieBlockBlockEntity>> BUDDING_ENRAGED_ENGIE_BLOCK = register("budding_enraged_engie_block", EngiesChaosModBlocks.BUDDING_ENRAGED_ENGIE_BLOCK,
			BuddingEnragedEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EnragedEngieCrystalBlockEntity>> ENRAGED_ENGIE_CRYSTAL = register("enraged_engie_crystal", EngiesChaosModBlocks.ENRAGED_ENGIE_CRYSTAL, EnragedEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingOutragedEngieBlockBlockEntity>> BUDDING_OUTRAGED_ENGIE_BLOCK = register("budding_outraged_engie_block", EngiesChaosModBlocks.BUDDING_OUTRAGED_ENGIE_BLOCK,
			BuddingOutragedEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OutragedEngieCrystalBlockEntity>> OUTRAGED_ENGIE_CRYSTAL = register("outraged_engie_crystal", EngiesChaosModBlocks.OUTRAGED_ENGIE_CRYSTAL,
			OutragedEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingBiblicallyAccurateEngieBlockBlockEntity>> BUDDING_BIBLICALLY_ACCURATE_ENGIE_BLOCK = register("budding_biblically_accurate_engie_block",
			EngiesChaosModBlocks.BUDDING_BIBLICALLY_ACCURATE_ENGIE_BLOCK, BuddingBiblicallyAccurateEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BiblicallyAccurateEngieCrystalBlockEntity>> BIBLICALLY_ACCURATE_ENGIE_CRYSTAL = register("biblically_accurate_engie_crystal",
			EngiesChaosModBlocks.BIBLICALLY_ACCURATE_ENGIE_CRYSTAL, BiblicallyAccurateEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingMonstrosityEngieBlockBlockEntity>> BUDDING_MONSTROSITY_ENGIE_BLOCK = register("budding_monstrosity_engie_block", EngiesChaosModBlocks.BUDDING_MONSTROSITY_ENGIE_BLOCK,
			BuddingMonstrosityEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MonstrosityEngieCrystalBlockEntity>> MONSTROSITY_ENGIE_CRYSTAL = register("monstrosity_engie_crystal", EngiesChaosModBlocks.MONSTROSITY_ENGIE_CRYSTAL,
			MonstrosityEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AngryEngieCrystalFullBlockEntity>> ANGRY_ENGIE_CRYSTAL_FULL = register("angry_engie_crystal_full", EngiesChaosModBlocks.ANGRY_ENGIE_CRYSTAL_FULL,
			AngryEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EnragedEngieCrystalFullBlockEntity>> ENRAGED_ENGIE_CRYSTAL_FULL = register("enraged_engie_crystal_full", EngiesChaosModBlocks.ENRAGED_ENGIE_CRYSTAL_FULL,
			EnragedEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OutragedEngieCrystalFullBlockEntity>> OUTRAGED_ENGIE_CRYSTAL_FULL = register("outraged_engie_crystal_full", EngiesChaosModBlocks.OUTRAGED_ENGIE_CRYSTAL_FULL,
			OutragedEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BiblicallyAccurateEngieCrystalFullBlockEntity>> BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL = register("biblically_accurate_engie_crystal_full",
			EngiesChaosModBlocks.BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL, BiblicallyAccurateEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MonstrosityEngieCrystalFullBlockEntity>> MONSTROSITY_ENGIE_CRYSTAL_FULL = register("monstrosity_engie_crystal_full", EngiesChaosModBlocks.MONSTROSITY_ENGIE_CRYSTAL_FULL,
			MonstrosityEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterAngryEngieBlockBlockEntity>> BUDDING_ANTIMATTER_ANGRY_ENGIE_BLOCK = register("budding_antimatter_angry_engie_block",
			EngiesChaosModBlocks.BUDDING_ANTIMATTER_ANGRY_ENGIE_BLOCK, BuddingAntimatterAngryEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterAngryEngieCrystalBlockEntity>> ANTIMATTER_ANGRY_ENGIE_CRYSTAL = register("antimatter_angry_engie_crystal", EngiesChaosModBlocks.ANTIMATTER_ANGRY_ENGIE_CRYSTAL,
			AntimatterAngryEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterAngryEngieCrystalFullBlockEntity>> ANTIMATTER_ANGRY_ENGIE_CRYSTAL_FULL = register("antimatter_angry_engie_crystal_full",
			EngiesChaosModBlocks.ANTIMATTER_ANGRY_ENGIE_CRYSTAL_FULL, AntimatterAngryEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterEnragedEngieBlockBlockEntity>> BUDDING_ANTIMATTER_ENRAGED_ENGIE_BLOCK = register("budding_antimatter_enraged_engie_block",
			EngiesChaosModBlocks.BUDDING_ANTIMATTER_ENRAGED_ENGIE_BLOCK, BuddingAntimatterEnragedEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterEnragedEngieCrystalBlockEntity>> ANTIMATTER_ENRAGED_ENGIE_CRYSTAL = register("antimatter_enraged_engie_crystal",
			EngiesChaosModBlocks.ANTIMATTER_ENRAGED_ENGIE_CRYSTAL, AntimatterEnragedEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterEnragedEngieCrystalFullBlockEntity>> ANTIMATTER_ENRAGED_ENGIE_CRYSTAL_FULL = register("antimatter_enraged_engie_crystal_full",
			EngiesChaosModBlocks.ANTIMATTER_ENRAGED_ENGIE_CRYSTAL_FULL, AntimatterEnragedEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterOutragedEngieBlockBlockEntity>> BUDDING_ANTIMATTER_OUTRAGED_ENGIE_BLOCK = register("budding_antimatter_outraged_engie_block",
			EngiesChaosModBlocks.BUDDING_ANTIMATTER_OUTRAGED_ENGIE_BLOCK, BuddingAntimatterOutragedEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterOutragedEngieCrystalBlockEntity>> ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL = register("antimatter_outraged_engie_crystal",
			EngiesChaosModBlocks.ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL, AntimatterOutragedEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterOutragedEngieCrystalFullBlockEntity>> ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL_FULL = register("antimatter_outraged_engie_crystal_full",
			EngiesChaosModBlocks.ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL_FULL, AntimatterOutragedEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterBiblicallyAccurateEngieBlockBlockEntity>> BUDDING_ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK = register("budding_antimatter_biblically_accurate_engie_block",
			EngiesChaosModBlocks.BUDDING_ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK, BuddingAntimatterBiblicallyAccurateEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterBiblicallyAccurateEngieCrystalBlockEntity>> ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL = register("antimatter_biblically_accurate_engie_crystal",
			EngiesChaosModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL, AntimatterBiblicallyAccurateEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterBiblicallyAccurateEngieCrystalFullBlockEntity>> ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL = register("antimatter_biblically_accurate_engie_crystal_full",
			EngiesChaosModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL, AntimatterBiblicallyAccurateEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterMonstrosityEngieBlockBlockEntity>> BUDDING_ANTIMATTER_MONSTROSITY_ENGIE_BLOCK = register("budding_antimatter_monstrosity_engie_block",
			EngiesChaosModBlocks.BUDDING_ANTIMATTER_MONSTROSITY_ENGIE_BLOCK, BuddingAntimatterMonstrosityEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMonstrosityEngieCrystalBlockEntity>> ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL = register("antimatter_monstrosity_engie_crystal",
			EngiesChaosModBlocks.ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL, AntimatterMonstrosityEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMonstrosityEngieCrystalFullBlockEntity>> ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL = register("antimatter_monstrosity_engie_crystal_full",
			EngiesChaosModBlocks.ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL, AntimatterMonstrosityEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingMadEngieBlockBlockEntity>> BUDDING_MAD_ENGIE_BLOCK = register("budding_mad_engie_block", EngiesChaosModBlocks.BUDDING_MAD_ENGIE_BLOCK,
			BuddingMadEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MadEngieCrystalBlockEntity>> MAD_ENGIE_CRYSTAL = register("mad_engie_crystal", EngiesChaosModBlocks.MAD_ENGIE_CRYSTAL, MadEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MadEngieCrystalFullBlockEntity>> MAD_ENGIE_CRYSTAL_FULL = register("mad_engie_crystal_full", EngiesChaosModBlocks.MAD_ENGIE_CRYSTAL_FULL, MadEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterMadEngieBlockBlockEntity>> BUDDING_ANTIMATTER_MAD_ENGIE_BLOCK = register("budding_antimatter_mad_engie_block",
			EngiesChaosModBlocks.BUDDING_ANTIMATTER_MAD_ENGIE_BLOCK, BuddingAntimatterMadEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMadEngieCrystalBlockEntity>> ANTIMATTER_MAD_ENGIE_CRYSTAL = register("antimatter_mad_engie_crystal", EngiesChaosModBlocks.ANTIMATTER_MAD_ENGIE_CRYSTAL,
			AntimatterMadEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterMadEngieCrystalFullBlockEntity>> ANTIMATTER_MAD_ENGIE_CRYSTAL_FULL = register("antimatter_mad_engie_crystal_full",
			EngiesChaosModBlocks.ANTIMATTER_MAD_ENGIE_CRYSTAL_FULL, AntimatterMadEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingEngieBlockBlockEntity>> BUDDING_ENGIE_BLOCK = register("budding_engie_block", EngiesChaosModBlocks.BUDDING_ENGIE_BLOCK, BuddingEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EngieCrystalBlockEntity>> ENGIE_CRYSTAL = register("engie_crystal", EngiesChaosModBlocks.ENGIE_CRYSTAL, EngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EngieCrystalFullBlockEntity>> ENGIE_CRYSTAL_FULL = register("engie_crystal_full", EngiesChaosModBlocks.ENGIE_CRYSTAL_FULL, EngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingAntimatterEngieBlockBlockEntity>> BUDDING_ANTIMATTER_ENGIE_BLOCK = register("budding_antimatter_engie_block", EngiesChaosModBlocks.BUDDING_ANTIMATTER_ENGIE_BLOCK,
			BuddingAntimatterEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterEngieCrystalBlockEntity>> ANTIMATTER_ENGIE_CRYSTAL = register("antimatter_engie_crystal", EngiesChaosModBlocks.ANTIMATTER_ENGIE_CRYSTAL,
			AntimatterEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AntimatterEngieCrystalFullBlockEntity>> ANTIMATTER_ENGIE_CRYSTAL_FULL = register("antimatter_engie_crystal_full", EngiesChaosModBlocks.ANTIMATTER_ENGIE_CRYSTAL_FULL,
			AntimatterEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestBlockEntity>> DARK_MATTER_METAL_CHEST = register("dark_matter_metal_chest", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST,
			DarkMatterMetalChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestOakBlockEntity>> DARK_MATTER_METAL_CHEST_OAK = register("dark_matter_metal_chest_oak", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_OAK,
			DarkMatterMetalChestOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestDarkOakBlockEntity>> DARK_MATTER_METAL_CHEST_DARK_OAK = register("dark_matter_metal_chest_dark_oak", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_DARK_OAK,
			DarkMatterMetalChestDarkOakBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestSpruceBlockEntity>> DARK_MATTER_METAL_CHEST_SPRUCE = register("dark_matter_metal_chest_spruce", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_SPRUCE,
			DarkMatterMetalChestSpruceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestAcaciaBlockEntity>> DARK_MATTER_METAL_CHEST_ACACIA = register("dark_matter_metal_chest_acacia", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_ACACIA,
			DarkMatterMetalChestAcaciaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestBirchBlockEntity>> DARK_MATTER_METAL_CHEST_BIRCH = register("dark_matter_metal_chest_birch", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_BIRCH,
			DarkMatterMetalChestBirchBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestWarpedBlockEntity>> DARK_MATTER_METAL_CHEST_WARPED = register("dark_matter_metal_chest_warped", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_WARPED,
			DarkMatterMetalChestWarpedBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestCrimsonBlockEntity>> DARK_MATTER_METAL_CHEST_CRIMSON = register("dark_matter_metal_chest_crimson", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_CRIMSON,
			DarkMatterMetalChestCrimsonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestJungleBlockEntity>> DARK_MATTER_METAL_CHEST_JUNGLE = register("dark_matter_metal_chest_jungle", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_JUNGLE,
			DarkMatterMetalChestJungleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestMangroveBlockEntity>> DARK_MATTER_METAL_CHEST_MANGROVE = register("dark_matter_metal_chest_mangrove",
			EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_MANGROVE, DarkMatterMetalChestMangroveBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMetalChestCherryBlockEntity>> DARK_MATTER_METAL_CHEST_CHERRY = register("dark_matter_metal_chest_cherry", EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_CHERRY,
			DarkMatterMetalChestCherryBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterMadEngieBlockBlockEntity>> BUDDING_DARK_MATTER_MAD_ENGIE_BLOCK = register("budding_dark_matter_mad_engie_block",
			EngiesChaosModBlocks.BUDDING_DARK_MATTER_MAD_ENGIE_BLOCK, BuddingDarkMatterMadEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMadEngieCrystalBlockEntity>> DARK_MATTER_MAD_ENGIE_CRYSTAL = register("dark_matter_mad_engie_crystal", EngiesChaosModBlocks.DARK_MATTER_MAD_ENGIE_CRYSTAL,
			DarkMatterMadEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMadEngieCrystalFullBlockEntity>> DARK_MATTER_MAD_ENGIE_CRYSTAL_FULL = register("dark_matter_mad_engie_crystal_full",
			EngiesChaosModBlocks.DARK_MATTER_MAD_ENGIE_CRYSTAL_FULL, DarkMatterMadEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterAngryEngieBlockBlockEntity>> BUDDING_DARK_MATTER_ANGRY_ENGIE_BLOCK = register("budding_dark_matter_angry_engie_block",
			EngiesChaosModBlocks.BUDDING_DARK_MATTER_ANGRY_ENGIE_BLOCK, BuddingDarkMatterAngryEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterAngryEngieCrystalBlockEntity>> DARK_MATTER_ANGRY_ENGIE_CRYSTAL = register("dark_matter_angry_engie_crystal", EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_CRYSTAL,
			DarkMatterAngryEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterAngryEngieCrystalFullBlockEntity>> DARK_MATTER_ANGRY_ENGIE_CRYSTAL_FULL = register("dark_matter_angry_engie_crystal_full",
			EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_CRYSTAL_FULL, DarkMatterAngryEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterEnragedEngieBlockBlockEntity>> BUDDING_DARK_MATTER_ENRAGED_ENGIE_BLOCK = register("budding_dark_matter_enraged_engie_block",
			EngiesChaosModBlocks.BUDDING_DARK_MATTER_ENRAGED_ENGIE_BLOCK, BuddingDarkMatterEnragedEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterEnragedEngieCrystalBlockEntity>> DARK_MATTER_ENRAGED_ENGIE_CRYSTAL = register("dark_matter_enraged_engie_crystal",
			EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_CRYSTAL, DarkMatterEnragedEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterEnragedEngieCrystalFullBlockEntity>> DARK_MATTER_ENRAGED_ENGIE_CRYSTAL_FULL = register("dark_matter_enraged_engie_crystal_full",
			EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_CRYSTAL_FULL, DarkMatterEnragedEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterOutragedEngieBlockBlockEntity>> BUDDING_DARK_MATTER_OUTRAGED_ENGIE_BLOCK = register("budding_dark_matter_outraged_engie_block",
			EngiesChaosModBlocks.BUDDING_DARK_MATTER_OUTRAGED_ENGIE_BLOCK, BuddingDarkMatterOutragedEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterOutragedEngieCrystalBlockEntity>> DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL = register("dark_matter_outraged_engie_crystal",
			EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL, DarkMatterOutragedEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterOutragedEngieCrystalFullBlockEntity>> DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL_FULL = register("dark_matter_outraged_engie_crystal_full",
			EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL_FULL, DarkMatterOutragedEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterBiblicallyAccurateEngieBlockBlockEntity>> BUDDING_DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK = register(
			"budding_dark_matter_biblically_accurate_engie_block", EngiesChaosModBlocks.BUDDING_DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK, BuddingDarkMatterBiblicallyAccurateEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterBiblicallyAccurateEngieCrystalBlockEntity>> DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL = register("dark_matter_biblically_accurate_engie_crystal",
			EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL, DarkMatterBiblicallyAccurateEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterBiblicallyAccurateEngieCrystalFullBlockEntity>> DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL = register("dark_matter_biblically_accurate_engie_crystal_full",
			EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL, DarkMatterBiblicallyAccurateEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterMonstrosityEngieBlockBlockEntity>> BUDDING_DARK_MATTER_MONSTROSITY_ENGIE_BLOCK = register("budding_dark_matter_monstrosity_engie_block",
			EngiesChaosModBlocks.BUDDING_DARK_MATTER_MONSTROSITY_ENGIE_BLOCK, BuddingDarkMatterMonstrosityEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMonstrosityEngieCrystalBlockEntity>> DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL = register("dark_matter_monstrosity_engie_crystal",
			EngiesChaosModBlocks.DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL, DarkMatterMonstrosityEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterMonstrosityEngieCrystalFullBlockEntity>> DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL = register("dark_matter_monstrosity_engie_crystal_full",
			EngiesChaosModBlocks.DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL, DarkMatterMonstrosityEngieCrystalFullBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BuddingDarkMatterEngieBlockBlockEntity>> BUDDING_DARK_MATTER_ENGIE_BLOCK = register("budding_dark_matter_engie_block", EngiesChaosModBlocks.BUDDING_DARK_MATTER_ENGIE_BLOCK,
			BuddingDarkMatterEngieBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterEngieCrystalBlockEntity>> DARK_MATTER_ENGIE_CRYSTAL = register("dark_matter_engie_crystal", EngiesChaosModBlocks.DARK_MATTER_ENGIE_CRYSTAL,
			DarkMatterEngieCrystalBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkMatterEngieCrystalFullBlockEntity>> DARK_MATTER_ENGIE_CRYSTAL_FULL = register("dark_matter_engie_crystal_full", EngiesChaosModBlocks.DARK_MATTER_ENGIE_CRYSTAL_FULL,
			DarkMatterEngieCrystalFullBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_DARK_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_SPRUCE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_ACACIA.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_BIRCH.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_WARPED.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_CRIMSON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_JUNGLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_DARK_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_SPRUCE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_ACACIA.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_BIRCH.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_WARPED.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_CRIMSON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_JUNGLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_MANGROVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_MANGROVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_CHEST_CHERRY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_METAL_CHEST_CHERRY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANGRY_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANGRY_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ENRAGED_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENRAGED_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_OUTRAGED_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OUTRAGED_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_BIBLICALLY_ACCURATE_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BIBLICALLY_ACCURATE_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_MONSTROSITY_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MONSTROSITY_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANGRY_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENRAGED_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OUTRAGED_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MONSTROSITY_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_ANGRY_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_ANGRY_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_ANGRY_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_ENRAGED_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_ENRAGED_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_ENRAGED_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_MONSTROSITY_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_MAD_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MAD_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MAD_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_MAD_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_MAD_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_MAD_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_ANTIMATTER_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTIMATTER_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_DARK_OAK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_SPRUCE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_ACACIA.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_BIRCH.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_WARPED.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_CRIMSON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_JUNGLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_MANGROVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_METAL_CHEST_CHERRY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_MAD_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_MAD_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_MAD_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_ANGRY_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_ANGRY_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_ANGRY_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_ENRAGED_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_ENRAGED_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_ENRAGED_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_MONSTROSITY_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BUDDING_DARK_MATTER_ENGIE_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_ENGIE_CRYSTAL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_MATTER_ENGIE_CRYSTAL_FULL.get(), SidedInvWrapper::new);
	}
}