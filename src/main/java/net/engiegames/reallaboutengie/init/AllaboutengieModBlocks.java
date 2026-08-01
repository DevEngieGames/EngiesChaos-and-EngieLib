/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.level.NoteBlockEvent;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.Block;

import net.engiegames.reallaboutengie.block.UnobtainiumOreBlock;
import net.engiegames.reallaboutengie.block.TheEndCoinBlockBlock;
import net.engiegames.reallaboutengie.block.ThanksForPlayingBlock;
import net.engiegames.reallaboutengie.block.TextboxyeahBlock;
import net.engiegames.reallaboutengie.block.SuperDoomsDayCoinBlockBlock;
import net.engiegames.reallaboutengie.block.RoughianEngieGamesCoinBlockBlock;
import net.engiegames.reallaboutengie.block.OutragedEngieBlockBlock;
import net.engiegames.reallaboutengie.block.OldEngieOreBlock;
import net.engiegames.reallaboutengie.block.OldDeepslateEngieOreBlock;
import net.engiegames.reallaboutengie.block.MonstrosityEngieBlockBlock;
import net.engiegames.reallaboutengie.block.MindscapeCoinBlockBlock;
import net.engiegames.reallaboutengie.block.MetalTableBlock;
import net.engiegames.reallaboutengie.block.MetalChestWarpedBlock;
import net.engiegames.reallaboutengie.block.MetalChestSpruceBlock;
import net.engiegames.reallaboutengie.block.MetalChestOakBlock;
import net.engiegames.reallaboutengie.block.MetalChestMangroveBlock;
import net.engiegames.reallaboutengie.block.MetalChestJungleBlock;
import net.engiegames.reallaboutengie.block.MetalChestDarkOakBlock;
import net.engiegames.reallaboutengie.block.MetalChestCrimsonBlock;
import net.engiegames.reallaboutengie.block.MetalChestCherryBlock;
import net.engiegames.reallaboutengie.block.MetalChestBlock;
import net.engiegames.reallaboutengie.block.MetalChestBirchBlock;
import net.engiegames.reallaboutengie.block.MetalChestAcaciaBlock;
import net.engiegames.reallaboutengie.block.EnragedEngieBlockBlock;
import net.engiegames.reallaboutengie.block.EngieOreBlock;
import net.engiegames.reallaboutengie.block.EngieGamesCoinBlockBlock;
import net.engiegames.reallaboutengie.block.EngieCoinBlockBlock;
import net.engiegames.reallaboutengie.block.EngieBlockBlock;
import net.engiegames.reallaboutengie.block.EngiBlockBlock;
import net.engiegames.reallaboutengie.block.DoomsDayCoinBlockBlock;
import net.engiegames.reallaboutengie.block.DeepslateUnobtainiumOreBlock;
import net.engiegames.reallaboutengie.block.DeepslateEngieOreBlock;
import net.engiegames.reallaboutengie.block.DeepslateAntimatterEngieOreBlock;
import net.engiegames.reallaboutengie.block.CyberbloodBlockBlock;
import net.engiegames.reallaboutengie.block.CyberOreBlock;
import net.engiegames.reallaboutengie.block.CyberBlockBlock;
import net.engiegames.reallaboutengie.block.CosmicEngieGamesCoinBlockBlock;
import net.engiegames.reallaboutengie.block.ChallengeModeTrophySoloBlock;
import net.engiegames.reallaboutengie.block.ChallengeModeTrophyMultiplayerBlock;
import net.engiegames.reallaboutengie.block.BloodOreBlock;
import net.engiegames.reallaboutengie.block.BloodBlockBlock;
import net.engiegames.reallaboutengie.block.BiblicallyAccurateBlockBlock;
import net.engiegames.reallaboutengie.block.AnyTypeOfWoodHelpBlock;
import net.engiegames.reallaboutengie.block.AntimatterTheEndCoinBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterSuperDoomsDayCoinBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterOutragedEngieBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterMonstrosityEngieBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestWarpedBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestSpruceBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestOakBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestMangroveBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestJungleBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestDarkOakBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestCrimsonBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestCherryBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestBirchBlock;
import net.engiegames.reallaboutengie.block.AntimatterMetalChestAcaciaBlock;
import net.engiegames.reallaboutengie.block.AntimatterEnragedEngieBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterEngieOreBlock;
import net.engiegames.reallaboutengie.block.AntimatterEngieGamesCoinBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterEngieCoinBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterEngieBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterDoomsDayCoinBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterBiblicallyAccurateBlockBlock;
import net.engiegames.reallaboutengie.block.AntimatterAngryEngieBlockBlock;
import net.engiegames.reallaboutengie.block.AngryEngieBlockBlock;
import net.engiegames.reallaboutengie.block.AngelHattedPresentBlock;
import net.engiegames.reallaboutengie.AllaboutengieMod;

@Mod.EventBusSubscriber
public class AllaboutengieModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AllaboutengieMod.MODID);
	public static final RegistryObject<Block> ENGIE_BLOCK = REGISTRY.register("engie_block", EngieBlockBlock::new);
	public static final RegistryObject<Block> ANGRY_ENGIE_BLOCK = REGISTRY.register("angry_engie_block", AngryEngieBlockBlock::new);
	public static final RegistryObject<Block> ENRAGED_ENGIE_BLOCK = REGISTRY.register("enraged_engie_block", EnragedEngieBlockBlock::new);
	public static final RegistryObject<Block> ENGIE_ORE = REGISTRY.register("engie_ore", EngieOreBlock::new);
	public static final RegistryObject<Block> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", DeepslateEngieOreBlock::new);
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
	public static final RegistryObject<Block> CHALLENGE_MODE_TROPHY_SOLO = REGISTRY.register("challenge_mode_trophy_solo", ChallengeModeTrophySoloBlock::new);
	public static final RegistryObject<Block> CHALLENGE_MODE_TROPHY_MULTIPLAYER = REGISTRY.register("challenge_mode_trophy_multiplayer", ChallengeModeTrophyMultiplayerBlock::new);
	public static final RegistryObject<Block> ANY_TYPE_OF_WOOD_HELP = REGISTRY.register("any_type_of_wood_help", AnyTypeOfWoodHelpBlock::new);
	public static final RegistryObject<Block> ANTIMATTER_ENGIE_ORE = REGISTRY.register("antimatter_engie_ore", AntimatterEngieOreBlock::new);
	public static final RegistryObject<Block> DEEPSLATE_ANTIMATTER_ENGIE_ORE = REGISTRY.register("deepslate_antimatter_engie_ore", DeepslateAntimatterEngieOreBlock::new);
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
	public static final RegistryObject<Block> ROUGHIAN_ENGIE_GAMES_COIN_BLOCK = REGISTRY.register("roughian_engie_games_coin_block", RoughianEngieGamesCoinBlockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@SubscribeEvent
	public static void onNoteBlockPlay(NoteBlockEvent.Play event) {
		Block below = event.getLevel().getBlockState(event.getPos().below()).getBlock();
		if (below == AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.DEEPSLATE_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.OLD_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.OLD_DEEPSLATE_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.THANKS_FOR_PLAYING.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANGEL_HATTED_PRESENT.get()) {
			event.setInstrument(NoteBlockInstrument.BASS);
		} else if (below == AllaboutengieModBlocks.CYBER_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.BLOOD_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.UNOBTAINIUM_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.DEEPSLATE_UNOBTAINIUM_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.TEXTBOXYEAH.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.MONSTROSITY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.CHALLENGE_MODE_TROPHY_SOLO.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.CHALLENGE_MODE_TROPHY_MULTIPLAYER.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANTIMATTER_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.DEEPSLATE_ANTIMATTER_ENGIE_ORE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == AllaboutengieModBlocks.ANTIMATTER_MONSTROSITY_ENGIE_BLOCK.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		}
	}
}