/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engieschaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.NoteBlockEvent;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.Block;

import engiegames.engieschaos.block.UnobtainiumOreBlock;
import engiegames.engieschaos.block.TheEndCoinBlockBlock;
import engiegames.engieschaos.block.ThanksForPlayingOldBlock;
import engiegames.engieschaos.block.ThanksForPlayingBlock;
import engiegames.engieschaos.block.TextboxyeahBlock;
import engiegames.engieschaos.block.SuperDoomsDayCoinBlockBlock;
import engiegames.engieschaos.block.ScarletBlock;
import engiegames.engieschaos.block.RoughianEngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.PhantomAndNutterButterBlock;
import engiegames.engieschaos.block.OutragedEngieCrystalFullBlock;
import engiegames.engieschaos.block.OutragedEngieCrystalBlock;
import engiegames.engieschaos.block.OutragedEngieBlockBlock;
import engiegames.engieschaos.block.OldEngieOreBlock;
import engiegames.engieschaos.block.OldDeepslateEngieOreBlock;
import engiegames.engieschaos.block.MonstrosityEngieCrystalFullBlock;
import engiegames.engieschaos.block.MonstrosityEngieCrystalBlock;
import engiegames.engieschaos.block.MonstrosityEngieBlockBlock;
import engiegames.engieschaos.block.MindscapeCoinBlockBlock;
import engiegames.engieschaos.block.MetalTableBlock;
import engiegames.engieschaos.block.MetalChestWarpedBlock;
import engiegames.engieschaos.block.MetalChestSpruceBlock;
import engiegames.engieschaos.block.MetalChestOakBlock;
import engiegames.engieschaos.block.MetalChestMangroveBlock;
import engiegames.engieschaos.block.MetalChestJungleBlock;
import engiegames.engieschaos.block.MetalChestDarkOakBlock;
import engiegames.engieschaos.block.MetalChestCrimsonBlock;
import engiegames.engieschaos.block.MetalChestCherryBlock;
import engiegames.engieschaos.block.MetalChestBlock;
import engiegames.engieschaos.block.MetalChestBirchBlock;
import engiegames.engieschaos.block.MetalChestAcaciaBlock;
import engiegames.engieschaos.block.MadEngieOreBlock;
import engiegames.engieschaos.block.MadEngieCrystalFullBlock;
import engiegames.engieschaos.block.MadEngieCrystalBlock;
import engiegames.engieschaos.block.MadEngieBlockBlock;
import engiegames.engieschaos.block.EnragedEngieCrystalFullBlock;
import engiegames.engieschaos.block.EnragedEngieCrystalBlock;
import engiegames.engieschaos.block.EnragedEngieBlockBlock;
import engiegames.engieschaos.block.EngieOreBlock;
import engiegames.engieschaos.block.EngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.EngieCrystalFullBlock;
import engiegames.engieschaos.block.EngieCrystalBlock;
import engiegames.engieschaos.block.EngieCoinBlockBlock;
import engiegames.engieschaos.block.EngieBlockBlock;
import engiegames.engieschaos.block.EngiBlockBlock;
import engiegames.engieschaos.block.DoomsDayCoinBlockBlock;
import engiegames.engieschaos.block.DeepslateUnobtainiumOreBlock;
import engiegames.engieschaos.block.DeepslateMadEngieOreBlock;
import engiegames.engieschaos.block.DeepslateEngieOreBlock;
import engiegames.engieschaos.block.DarkMatterTheEndCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterSuperDoomsDayCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterRoughianEngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterOutragedEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterOutragedEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterOutragedEngieBlockBlock;
import engiegames.engieschaos.block.DarkMatterMonstrosityEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterMonstrosityEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterMonstrosityEngieBlockBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestWarpedBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestSpruceBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestOakBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestMangroveBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestJungleBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestDarkOakBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestCrimsonBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestCherryBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestBirchBlock;
import engiegames.engieschaos.block.DarkMatterMetalChestAcaciaBlock;
import engiegames.engieschaos.block.DarkMatterMadEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterMadEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterMadEngieBlockBlock;
import engiegames.engieschaos.block.DarkMatterEnragedEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterEnragedEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterEnragedEngieBlockBlock;
import engiegames.engieschaos.block.DarkMatterEngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterEngieCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterEngieBlockBlock;
import engiegames.engieschaos.block.DarkMatterDoomsDayCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterCosmicEngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.DarkMatterBiblicallyAccurateEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterBiblicallyAccurateEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterBiblicallyAccurateBlockBlock;
import engiegames.engieschaos.block.DarkMatterAngryEngieCrystalFullBlock;
import engiegames.engieschaos.block.DarkMatterAngryEngieCrystalBlock;
import engiegames.engieschaos.block.DarkMatterAngryEngieBlockBlock;
import engiegames.engieschaos.block.CyberbloodBlockBlock;
import engiegames.engieschaos.block.CyberOreBlock;
import engiegames.engieschaos.block.CyberBlockBlock;
import engiegames.engieschaos.block.CosmicEngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.CeasarBlock;
import engiegames.engieschaos.block.BuddingOutragedEngieBlockBlock;
import engiegames.engieschaos.block.BuddingMonstrosityEngieBlockBlock;
import engiegames.engieschaos.block.BuddingMadEngieBlockBlock;
import engiegames.engieschaos.block.BuddingEnragedEngieBlockBlock;
import engiegames.engieschaos.block.BuddingEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterOutragedEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterMonstrosityEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterMadEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterEnragedEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterBiblicallyAccurateEngieBlockBlock;
import engiegames.engieschaos.block.BuddingDarkMatterAngryEngieBlockBlock;
import engiegames.engieschaos.block.BuddingBiblicallyAccurateEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterOutragedEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterMonstrosityEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterMadEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterEnragedEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterBiblicallyAccurateEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAntimatterAngryEngieBlockBlock;
import engiegames.engieschaos.block.BuddingAngryEngieBlockBlock;
import engiegames.engieschaos.block.BloodOreBlock;
import engiegames.engieschaos.block.BloodBlockBlock;
import engiegames.engieschaos.block.BiblicallyAccurateEngieCrystalFullBlock;
import engiegames.engieschaos.block.BiblicallyAccurateEngieCrystalBlock;
import engiegames.engieschaos.block.BiblicallyAccurateBlockBlock;
import engiegames.engieschaos.block.AnyTypeOfWoodHelpBlock;
import engiegames.engieschaos.block.AntimatterTheEndCoinBlockBlock;
import engiegames.engieschaos.block.AntimatterSuperDoomsDayCoinBlockBlock;
import engiegames.engieschaos.block.AntimatterOutragedEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterOutragedEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterOutragedEngieBlockBlock;
import engiegames.engieschaos.block.AntimatterOreBlock;
import engiegames.engieschaos.block.AntimatterMonstrosityEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterMonstrosityEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterMonstrosityEngieBlockBlock;
import engiegames.engieschaos.block.AntimatterMetalChestWarpedBlock;
import engiegames.engieschaos.block.AntimatterMetalChestSpruceBlock;
import engiegames.engieschaos.block.AntimatterMetalChestOakBlock;
import engiegames.engieschaos.block.AntimatterMetalChestMangroveBlock;
import engiegames.engieschaos.block.AntimatterMetalChestJungleBlock;
import engiegames.engieschaos.block.AntimatterMetalChestDarkOakBlock;
import engiegames.engieschaos.block.AntimatterMetalChestCrimsonBlock;
import engiegames.engieschaos.block.AntimatterMetalChestCherryBlock;
import engiegames.engieschaos.block.AntimatterMetalChestBlock;
import engiegames.engieschaos.block.AntimatterMetalChestBirchBlock;
import engiegames.engieschaos.block.AntimatterMetalChestAcaciaBlock;
import engiegames.engieschaos.block.AntimatterMadEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterMadEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterMadEngieBlockBlock;
import engiegames.engieschaos.block.AntimatterEnragedEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterEnragedEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterEnragedEngieBlockBlock;
import engiegames.engieschaos.block.AntimatterEngieGamesCoinBlockBlock;
import engiegames.engieschaos.block.AntimatterEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterEngieCoinBlockBlock;
import engiegames.engieschaos.block.AntimatterEngieBlockBlock;
import engiegames.engieschaos.block.AntimatterDoomsDayCoinBlockBlock;
import engiegames.engieschaos.block.AntimatterBiblicallyAccurateEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterBiblicallyAccurateEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterBiblicallyAccurateBlockBlock;
import engiegames.engieschaos.block.AntimatterAngryEngieCrystalFullBlock;
import engiegames.engieschaos.block.AntimatterAngryEngieCrystalBlock;
import engiegames.engieschaos.block.AntimatterAngryEngieBlockBlock;
import engiegames.engieschaos.block.AngryEngieCrystalFullBlock;
import engiegames.engieschaos.block.AngryEngieCrystalBlock;
import engiegames.engieschaos.block.AngryEngieBlockBlock;
import engiegames.engieschaos.block.AngelHattedPresentBlock;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class EngiesChaosModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EngiesChaosMod.MODID);
	public static final RegistryObject<Block> ENGIE_BLOCK = REGISTRY.register("engie_block", EngieBlockBlock::new);
	public static final RegistryObject<Block> ANGRY_ENGIE_BLOCK = REGISTRY.register("angry_engie_block", AngryEngieBlockBlock::new);
	public static final RegistryObject<Block> ENRAGED_ENGIE_BLOCK = REGISTRY.register("enraged_engie_block", EnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> METAL_TABLE = REGISTRY.register("metal_table", MetalTableBlock::new);
	public static final RegistryObject<Block> OLD_ENGIE_ORE = REGISTRY.register("old_engie_ore", OldEngieOreBlock::new);
	public static final RegistryObject<Block> OLD_DEEPSLATE_ENGIE_ORE = REGISTRY.register("old_deepslate_engie_ore", OldDeepslateEngieOreBlock::new);
	public static final RegistryObject<Block> THANKS_FOR_PLAYING = REGISTRY.register("thanks_for_playing", ThanksForPlayingBlock::new);
	public static final RegistryObject<Block> METAL_CHEST = REGISTRY.register("metal_chest", MetalChestBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_OAK = REGISTRY.register("metal_chest_oak", MetalChestOakBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_DARK_OAK = REGISTRY.register("metal_chest_dark_oak", MetalChestDarkOakBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_SPRUCE = REGISTRY.register("metal_chest_spruce", MetalChestSpruceBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_ACACIA = REGISTRY.register("metal_chest_acacia", MetalChestAcaciaBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_BIRCH = REGISTRY.register("metal_chest_birch", MetalChestBirchBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_WARPED = REGISTRY.register("metal_chest_warped", MetalChestWarpedBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_CRIMSON = REGISTRY.register("metal_chest_crimson", MetalChestCrimsonBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_JUNGLE = REGISTRY.register("metal_chest_jungle", MetalChestJungleBlock::new);
	public static final RegistryObject<Block> OUTRAGED_ENGIE_BLOCK = REGISTRY.register("outraged_engie_block", OutragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ANGEL_HATTED_PRESENT = REGISTRY.register("angel_hatted_present", AngelHattedPresentBlock::new);
	public static final RegistryObject<Block> CYBER_ORE = REGISTRY.register("cyber_ore", CyberOreBlock::new);
	public static final RegistryObject<Block> BLOOD_ORE = REGISTRY.register("blood_ore", BloodOreBlock::new);
	public static final RegistryObject<Block> UNOBTAINIUM_ORE = REGISTRY.register("unobtainium_ore", UnobtainiumOreBlock::new);
	public static final RegistryObject<Block> DEEPSLATE_UNOBTAINIUM_ORE = REGISTRY.register("deepslate_unobtainium_ore", DeepslateUnobtainiumOreBlock::new);
	public static final RegistryObject<Block> CYBER_BLOCK = REGISTRY.register("cyber_block", CyberBlockBlock::new);
	public static final RegistryObject<Block> BLOOD_BLOCK = REGISTRY.register("blood_block", BloodBlockBlock::new);
	public static final RegistryObject<Block> CYBERBLOOD_BLOCK = REGISTRY.register("cyberblood_block", CyberbloodBlockBlock::new);
	public static final RegistryObject<Block> TEXTBOXYEAH = REGISTRY.register("textboxyeah", TextboxyeahBlock::new);
	public static final RegistryObject<Block> BIBLICALLY_ACCURATE_BLOCK = REGISTRY.register("biblically_accurate_block", BiblicallyAccurateBlockBlock::new);
	public static final RegistryObject<Block> MONSTROSITY_ENGIE_BLOCK = REGISTRY.register("monstrosity_engie_block", MonstrosityEngieBlockBlock::new);
	public static final RegistryObject<Block> ANY_TYPE_OF_WOOD_HELP = REGISTRY.register("any_type_of_wood_help", AnyTypeOfWoodHelpBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENGIE_BLOCK = REGISTRY.register("antimatter_engie_block", AntimatterEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ANGRY_ENGIE_BLOCK = REGISTRY.register("antimatter_angry_engie_block", AntimatterAngryEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENRAGED_ENGIE_BLOCK = REGISTRY.register("antimatter_enraged_engie_block", AntimatterEnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_OUTRAGED_ENGIE_BLOCK = REGISTRY.register("antimatter_outraged_engie_block", AntimatterOutragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK = REGISTRY.register("antimatter_biblically_accurate_block", AntimatterBiblicallyAccurateBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_MONSTROSITY_ENGIE_BLOCK = REGISTRY.register("antimatter_monstrosity_engie_block", AntimatterMonstrosityEngieBlockBlock::new);
	public static final RegistryObject<Block> ENGI_BLOCK = REGISTRY.register("engi_block", EngiBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST = REGISTRY.register("antimatter_metal_chest", AntimatterMetalChestBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_OAK = REGISTRY.register("antimatter_metal_chest_oak", AntimatterMetalChestOakBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_DARK_OAK = REGISTRY.register("antimatter_metal_chest_dark_oak", AntimatterMetalChestDarkOakBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_SPRUCE = REGISTRY.register("antimatter_metal_chest_spruce", AntimatterMetalChestSpruceBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_ACACIA = REGISTRY.register("antimatter_metal_chest_acacia", AntimatterMetalChestAcaciaBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_BIRCH = REGISTRY.register("antimatter_metal_chest_birch", AntimatterMetalChestBirchBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_WARPED = REGISTRY.register("antimatter_metal_chest_warped", AntimatterMetalChestWarpedBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_CRIMSON = REGISTRY.register("antimatter_metal_chest_crimson", AntimatterMetalChestCrimsonBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_JUNGLE = REGISTRY.register("antimatter_metal_chest_jungle", AntimatterMetalChestJungleBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_MANGROVE = REGISTRY.register("metal_chest_mangrove", MetalChestMangroveBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_MANGROVE = REGISTRY.register("antimatter_metal_chest_mangrove", AntimatterMetalChestMangroveBlock::new);
	public static final RegistryObject<Block> METAL_CHEST_CHERRY = REGISTRY.register("metal_chest_cherry", MetalChestCherryBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_METAL_CHEST_CHERRY = REGISTRY.register("antimatter_metal_chest_cherry", AntimatterMetalChestCherryBlock::new);
	public static final RegistryObject<Block> DOOMS_DAY_COIN_BLOCK = REGISTRY.register("dooms_day_coin_block", DoomsDayCoinBlockBlock::new);
	public static final RegistryObject<Block> SUPER_DOOMS_DAY_COIN_BLOCK = REGISTRY.register("super_dooms_day_coin_block", SuperDoomsDayCoinBlockBlock::new);
	public static final RegistryObject<Block> THE_END_COIN_BLOCK = REGISTRY.register("the_end_coin_block", TheEndCoinBlockBlock::new);
	public static final RegistryObject<Block> ENGIE_COIN_BLOCK = REGISTRY.register("engie_coin_block", EngieCoinBlockBlock::new);
	public static final RegistryObject<Block> MINDSCAPE_COIN_BLOCK = REGISTRY.register("mindscape_coin_block", MindscapeCoinBlockBlock::new);
	public static final RegistryObject<Block> ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("engie_games_coin_block", EngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_DOOMS_DAY_COIN_BLOCK = REGISTRY.register("antimatter_dooms_day_coin_block", AntimatterDoomsDayCoinBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_SUPER_DOOMS_DAY_COIN_BLOCK = REGISTRY.register("antimatter_super_dooms_day_coin_block", AntimatterSuperDoomsDayCoinBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_THE_END_COIN_BLOCK = REGISTRY.register("antimatter_the_end_coin_block", AntimatterTheEndCoinBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENGIE_COIN_BLOCK = REGISTRY.register("antimatter_engie_coin_block", AntimatterEngieCoinBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("antimatter_engie_games_coin_block", AntimatterEngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> COSMIC_ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("cosmic_engie_games_coin_block", CosmicEngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> ENGIE_GAMES_TESSERACT_BLOCK = REGISTRY.register("engie_games_tesseract_block", RoughianEngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> PHANTOM_AND_NUTTER_BUTTER = REGISTRY.register("phantom_and_nutter_butter", PhantomAndNutterButterBlock::new);
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_OLD = REGISTRY.register("thanks_for_playing_old", ThanksForPlayingOldBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ORE = REGISTRY.register("antimatter_ore", AntimatterOreBlock::new);
	public static final RegistryObject<Block> BUDDING_ANGRY_ENGIE_BLOCK = REGISTRY.register("budding_angry_engie_block", BuddingAngryEngieBlockBlock::new);
	public static final RegistryObject<Block> ANGRY_ENGIE_CRYSTAL = REGISTRY.register("angry_engie_crystal", AngryEngieCrystalBlock::new);
	public static final RegistryObject<Block> BUDDING_ENRAGED_ENGIE_BLOCK = REGISTRY.register("budding_enraged_engie_block", BuddingEnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ENRAGED_ENGIE_CRYSTAL = REGISTRY.register("enraged_engie_crystal", EnragedEngieCrystalBlock::new);
	public static final RegistryObject<Block> BUDDING_OUTRAGED_ENGIE_BLOCK = REGISTRY.register("budding_outraged_engie_block", BuddingOutragedEngieBlockBlock::new);
	public static final RegistryObject<Block> OUTRAGED_ENGIE_CRYSTAL = REGISTRY.register("outraged_engie_crystal", OutragedEngieCrystalBlock::new);
	public static final RegistryObject<Block> BUDDING_BIBLICALLY_ACCURATE_ENGIE_BLOCK = REGISTRY.register("budding_biblically_accurate_engie_block", BuddingBiblicallyAccurateEngieBlockBlock::new);
	public static final RegistryObject<Block> BIBLICALLY_ACCURATE_ENGIE_CRYSTAL = REGISTRY.register("biblically_accurate_engie_crystal", BiblicallyAccurateEngieCrystalBlock::new);
	public static final RegistryObject<Block> BUDDING_MONSTROSITY_ENGIE_BLOCK = REGISTRY.register("budding_monstrosity_engie_block", BuddingMonstrosityEngieBlockBlock::new);
	public static final RegistryObject<Block> MONSTROSITY_ENGIE_CRYSTAL = REGISTRY.register("monstrosity_engie_crystal", MonstrosityEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANGRY_ENGIE_CRYSTAL_FULL = REGISTRY.register("angry_engie_crystal_full", AngryEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> ENRAGED_ENGIE_CRYSTAL_FULL = REGISTRY.register("enraged_engie_crystal_full", EnragedEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> OUTRAGED_ENGIE_CRYSTAL_FULL = REGISTRY.register("outraged_engie_crystal_full", OutragedEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL = REGISTRY.register("biblically_accurate_engie_crystal_full", BiblicallyAccurateEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> MONSTROSITY_ENGIE_CRYSTAL_FULL = REGISTRY.register("monstrosity_engie_crystal_full", MonstrosityEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_ANGRY_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_angry_engie_block", BuddingAntimatterAngryEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ANGRY_ENGIE_CRYSTAL = REGISTRY.register("antimatter_angry_engie_crystal", AntimatterAngryEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ANGRY_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_angry_engie_crystal_full", AntimatterAngryEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_ENRAGED_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_enraged_engie_block", BuddingAntimatterEnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENRAGED_ENGIE_CRYSTAL = REGISTRY.register("antimatter_enraged_engie_crystal", AntimatterEnragedEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENRAGED_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_enraged_engie_crystal_full", AntimatterEnragedEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_OUTRAGED_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_outraged_engie_block", BuddingAntimatterOutragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL = REGISTRY.register("antimatter_outraged_engie_crystal", AntimatterOutragedEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_OUTRAGED_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_outraged_engie_crystal_full", AntimatterOutragedEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_biblically_accurate_engie_block", BuddingAntimatterBiblicallyAccurateEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL = REGISTRY.register("antimatter_biblically_accurate_engie_crystal", AntimatterBiblicallyAccurateEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_biblically_accurate_engie_crystal_full", AntimatterBiblicallyAccurateEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_MONSTROSITY_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_monstrosity_engie_block", BuddingAntimatterMonstrosityEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL = REGISTRY.register("antimatter_monstrosity_engie_crystal", AntimatterMonstrosityEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_monstrosity_engie_crystal_full", AntimatterMonstrosityEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENGIE_BLOCK = REGISTRY.register("dark_matter_engie_block", DarkMatterEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ANGRY_ENGIE_BLOCK = REGISTRY.register("dark_matter_angry_engie_block", DarkMatterAngryEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENRAGED_ENGIE_BLOCK = REGISTRY.register("dark_matter_enraged_engie_block", DarkMatterEnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_OUTRAGED_ENGIE_BLOCK = REGISTRY.register("dark_matter_outraged_engie_block", DarkMatterOutragedEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK = REGISTRY.register("dark_matter_biblically_accurate_block", DarkMatterBiblicallyAccurateBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_MONSTROSITY_ENGIE_BLOCK = REGISTRY.register("dark_matter_monstrosity_engie_block", DarkMatterMonstrosityEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_DOOMS_DAY_COIN_BLOCK = REGISTRY.register("dark_matter_dooms_day_coin_block", DarkMatterDoomsDayCoinBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_SUPER_DOOMS_DAY_COIN_BLOCK = REGISTRY.register("dark_matter_super_dooms_day_coin_block", DarkMatterSuperDoomsDayCoinBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_THE_END_COIN_BLOCK = REGISTRY.register("dark_matter_the_end_coin_block", DarkMatterTheEndCoinBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENGIE_COIN_BLOCK = REGISTRY.register("dark_matter_engie_coin_block", DarkMatterEngieCoinBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("dark_matter_engie_games_coin_block", DarkMatterEngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_COSMIC_ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("dark_matter_cosmic_engie_games_coin_block", DarkMatterCosmicEngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ROUGHIAN_ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("dark_matter_roughian_engie_games_coin_block", DarkMatterRoughianEngieGamesCoinBlockBlock::new);
	public static final RegistryObject<Block> SCARLET = REGISTRY.register("scarlet", ScarletBlock::new);
	public static final RegistryObject<Block> MAD_ENGIE_BLOCK = REGISTRY.register("mad_engie_block", MadEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_MAD_ENGIE_BLOCK = REGISTRY.register("antimatter_mad_engie_block", AntimatterMadEngieBlockBlock::new);
	public static final RegistryObject<Block> MAD_ENGIE_ORE = REGISTRY.register("mad_engie_ore", MadEngieOreBlock::new);
	public static final RegistryObject<Block> DEEPSLATE_MAD_ENGIE_ORE = REGISTRY.register("deepslate_mad_engie_ore", DeepslateMadEngieOreBlock::new);
	public static final RegistryObject<Block> BUDDING_MAD_ENGIE_BLOCK = REGISTRY.register("budding_mad_engie_block", BuddingMadEngieBlockBlock::new);
	public static final RegistryObject<Block> MAD_ENGIE_CRYSTAL = REGISTRY.register("mad_engie_crystal", MadEngieCrystalBlock::new);
	public static final RegistryObject<Block> MAD_ENGIE_CRYSTAL_FULL = REGISTRY.register("mad_engie_crystal_full", MadEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_MAD_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_mad_engie_block", BuddingAntimatterMadEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_MAD_ENGIE_CRYSTAL = REGISTRY.register("antimatter_mad_engie_crystal", AntimatterMadEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_MAD_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_mad_engie_crystal_full", AntimatterMadEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_MAD_ENGIE_BLOCK = REGISTRY.register("dark_matter_mad_engie_block", DarkMatterMadEngieBlockBlock::new);
	public static final RegistryObject<Block> BUDDING_ENGIE_BLOCK = REGISTRY.register("budding_engie_block", BuddingEngieBlockBlock::new);
	public static final RegistryObject<Block> ENGIE_CRYSTAL = REGISTRY.register("engie_crystal", EngieCrystalBlock::new);
	public static final RegistryObject<Block> ENGIE_CRYSTAL_FULL = REGISTRY.register("engie_crystal_full", EngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_ANTIMATTER_ENGIE_BLOCK = REGISTRY.register("budding_antimatter_engie_block", BuddingAntimatterEngieBlockBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENGIE_CRYSTAL = REGISTRY.register("antimatter_engie_crystal", AntimatterEngieCrystalBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENGIE_CRYSTAL_FULL = REGISTRY.register("antimatter_engie_crystal_full", AntimatterEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> ENGIE_ORE = REGISTRY.register("engie_ore", EngieOreBlock::new);
	public static final RegistryObject<Block> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", DeepslateEngieOreBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST = REGISTRY.register("dark_matter_metal_chest", DarkMatterMetalChestBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_OAK = REGISTRY.register("dark_matter_metal_chest_oak", DarkMatterMetalChestOakBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_DARK_OAK = REGISTRY.register("dark_matter_metal_chest_dark_oak", DarkMatterMetalChestDarkOakBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_SPRUCE = REGISTRY.register("dark_matter_metal_chest_spruce", DarkMatterMetalChestSpruceBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_ACACIA = REGISTRY.register("dark_matter_metal_chest_acacia", DarkMatterMetalChestAcaciaBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_BIRCH = REGISTRY.register("dark_matter_metal_chest_birch", DarkMatterMetalChestBirchBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_WARPED = REGISTRY.register("dark_matter_metal_chest_warped", DarkMatterMetalChestWarpedBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_CRIMSON = REGISTRY.register("dark_matter_metal_chest_crimson", DarkMatterMetalChestCrimsonBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_JUNGLE = REGISTRY.register("dark_matter_metal_chest_jungle", DarkMatterMetalChestJungleBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_MANGROVE = REGISTRY.register("dark_matter_metal_chest_mangrove", DarkMatterMetalChestMangroveBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_METAL_CHEST_CHERRY = REGISTRY.register("dark_matter_metal_chest_cherry", DarkMatterMetalChestCherryBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_MAD_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_mad_engie_block", BuddingDarkMatterMadEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_MAD_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_mad_engie_crystal", DarkMatterMadEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_MAD_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_mad_engie_crystal_full", DarkMatterMadEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_ANGRY_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_angry_engie_block", BuddingDarkMatterAngryEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ANGRY_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_angry_engie_crystal", DarkMatterAngryEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ANGRY_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_angry_engie_crystal_full", DarkMatterAngryEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_ENRAGED_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_enraged_engie_block", BuddingDarkMatterEnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENRAGED_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_enraged_engie_crystal", DarkMatterEnragedEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENRAGED_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_enraged_engie_crystal_full", DarkMatterEnragedEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_OUTRAGED_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_outraged_engie_block", BuddingDarkMatterOutragedEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_outraged_engie_crystal", DarkMatterOutragedEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_OUTRAGED_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_outraged_engie_crystal_full", DarkMatterOutragedEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_biblically_accurate_engie_block", BuddingDarkMatterBiblicallyAccurateEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_biblically_accurate_engie_crystal", DarkMatterBiblicallyAccurateEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_biblically_accurate_engie_crystal_full", DarkMatterBiblicallyAccurateEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_MONSTROSITY_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_monstrosity_engie_block", BuddingDarkMatterMonstrosityEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_monstrosity_engie_crystal", DarkMatterMonstrosityEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_MONSTROSITY_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_monstrosity_engie_crystal_full", DarkMatterMonstrosityEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> BUDDING_DARK_MATTER_ENGIE_BLOCK = REGISTRY.register("budding_dark_matter_engie_block", BuddingDarkMatterEngieBlockBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENGIE_CRYSTAL = REGISTRY.register("dark_matter_engie_crystal", DarkMatterEngieCrystalBlock::new);
	public static final RegistryObject<Block> DARK_MATTER_ENGIE_CRYSTAL_FULL = REGISTRY.register("dark_matter_engie_crystal_full", DarkMatterEngieCrystalFullBlock::new);
	public static final RegistryObject<Block> CEASAR = REGISTRY.register("ceasar", CeasarBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@SubscribeEvent
	public static void onNoteBlockPlay(NoteBlockEvent.Play event) {
		Block below = event.getLevel().getBlockState(event.getPos().below()).getBlock();
		if (below == EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.OLD_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.OLD_DEEPSLATE_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.THANKS_FOR_PLAYING.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ANGEL_HATTED_PRESENT.get()) {
			event.setInstrument(NoteBlockInstrument.BASS);
		} else if (below == EngiesChaosModBlocks.CYBER_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.BLOOD_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.UNOBTAINIUM_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DEEPSLATE_UNOBTAINIUM_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.TEXTBOXYEAH.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.MONSTROSITY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ANTIMATTER_MONSTROSITY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.THANKS_FOR_PLAYING_OLD.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DARK_MATTER_MONSTROSITY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.MAD_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DEEPSLATE_MAD_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == EngiesChaosModBlocks.DEEPSLATE_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		}
	}
}