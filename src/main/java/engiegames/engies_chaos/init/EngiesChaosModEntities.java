/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.entity.YellowLightningEntity;
import engiegames.engies_chaos.entity.XEngieSharkoEntity;
import engiegames.engies_chaos.entity.XEngieGamesEntity;
import engiegames.engies_chaos.entity.WormholeSharkoEntity;
import engiegames.engies_chaos.entity.WormholeEngieEntity;
import engiegames.engies_chaos.entity.UncommonSharkoEntity;
import engiegames.engies_chaos.entity.UncommonEngieEntity;
import engiegames.engies_chaos.entity.TigerSharkoEntity;
import engiegames.engies_chaos.entity.ThrowbackSharkoEntity;
import engiegames.engies_chaos.entity.ThrowbackMadEngieEntity;
import engiegames.engies_chaos.entity.ThrowbackEnragedEngieEntity;
import engiegames.engies_chaos.entity.ThrowbackEngiEntity;
import engiegames.engies_chaos.entity.ThrowbackCreatorEntity;
import engiegames.engies_chaos.entity.ThrowbackAngryEngieEntity;
import engiegames.engies_chaos.entity.ThrowbackAngryCreatorEntity;
import engiegames.engies_chaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engies_chaos.entity.TheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.TheEndHostileEntity;
import engiegames.engies_chaos.entity.TheEndEntity;
import engiegames.engies_chaos.entity.SuperDoomsDayHostileEntity;
import engiegames.engies_chaos.entity.SuperDoomsDayEntity;
import engiegames.engies_chaos.entity.SharkoEntity;
import engiegames.engies_chaos.entity.ShadowSharkEngieEntity;
import engiegames.engies_chaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engies_chaos.entity.ScorchedEntity;
import engiegames.engies_chaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.RiftBallEntity;
import engiegames.engies_chaos.entity.RareSharkoEntity;
import engiegames.engies_chaos.entity.RareEngieSharkoEntity;
import engiegames.engies_chaos.entity.RareEngieEntity;
import engiegames.engies_chaos.entity.QuizzetEntity;
import engiegames.engies_chaos.entity.PureInsanityEntity;
import engiegames.engies_chaos.entity.PunisherEntity;
import engiegames.engies_chaos.entity.ProtogenEntity;
import engiegames.engies_chaos.entity.OutragedDeathSharkoEntity;
import engiegames.engies_chaos.entity.OMENEntity;
import engiegames.engies_chaos.entity.NormalEntity;
import engiegames.engies_chaos.entity.NightmareOutragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.NightmareMadEngieEntity;
import engiegames.engies_chaos.entity.NightmareHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.NightmareEnragedEngieEntity;
import engiegames.engies_chaos.entity.NightmareEngieEntity;
import engiegames.engies_chaos.entity.NightmareAngryEngieEntity;
import engiegames.engies_chaos.entity.MythicSharkoEntity;
import engiegames.engies_chaos.entity.MythicEngieEntity;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;
import engiegames.engies_chaos.entity.MonstrosityDeathSharkoEntity;
import engiegames.engies_chaos.entity.MindscapeEngieEntity;
import engiegames.engies_chaos.entity.MadEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.MadEngieEntity;
import engiegames.engies_chaos.entity.MOABEntity;
import engiegames.engies_chaos.entity.LegendarySharkoEntity;
import engiegames.engies_chaos.entity.LegendaryEngieEntity;
import engiegames.engies_chaos.entity.InsanityOutragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.InsanityMadEngieEntity;
import engiegames.engies_chaos.entity.InsanityHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.InsanityEntity;
import engiegames.engies_chaos.entity.InsanityEnragedEngieEntity;
import engiegames.engies_chaos.entity.InsanityEngieEntity;
import engiegames.engies_chaos.entity.InsanityAngryEngieEntity;
import engiegames.engies_chaos.entity.HsotileEngieEntity;
import engiegames.engies_chaos.entity.HostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.HeWhoGamesHostileEntity;
import engiegames.engies_chaos.entity.HeWhoGamesEntity;
import engiegames.engies_chaos.entity.GlitchSharkoEntity;
import engiegames.engies_chaos.entity.ExoticSharkoEntity;
import engiegames.engies_chaos.entity.ExoticEngieEntity;
import engiegames.engies_chaos.entity.EpicSharkoEntity;
import engiegames.engies_chaos.entity.EpicEngieEntity;
import engiegames.engies_chaos.entity.EnragedTNTEntity;
import engiegames.engies_chaos.entity.EnragedTNT9Entity;
import engiegames.engies_chaos.entity.EnragedTNT8Entity;
import engiegames.engies_chaos.entity.EnragedTNT7Entity;
import engiegames.engies_chaos.entity.EnragedTNT6Entity;
import engiegames.engies_chaos.entity.EnragedTNT5Entity;
import engiegames.engies_chaos.entity.EnragedTNT4Entity;
import engiegames.engies_chaos.entity.EnragedTNT3Entity;
import engiegames.engies_chaos.entity.EnragedTNT2Entity;
import engiegames.engies_chaos.entity.EnragedSpeedEntity;
import engiegames.engies_chaos.entity.EnragedSpeed9Entity;
import engiegames.engies_chaos.entity.EnragedSpeed8Entity;
import engiegames.engies_chaos.entity.EnragedSpeed7Entity;
import engiegames.engies_chaos.entity.EnragedSpeed6Entity;
import engiegames.engies_chaos.entity.EnragedSpeed5Entity;
import engiegames.engies_chaos.entity.EnragedSpeed4Entity;
import engiegames.engies_chaos.entity.EnragedSpeed3Entity;
import engiegames.engies_chaos.entity.EnragedSpeed2Entity;
import engiegames.engies_chaos.entity.EnragedNormalEntity;
import engiegames.engies_chaos.entity.EnragedNormal9Entity;
import engiegames.engies_chaos.entity.EnragedNormal8Entity;
import engiegames.engies_chaos.entity.EnragedNormal7Entity;
import engiegames.engies_chaos.entity.EnragedNormal6Entity;
import engiegames.engies_chaos.entity.EnragedNormal5Entity;
import engiegames.engies_chaos.entity.EnragedNormal4Entity;
import engiegames.engies_chaos.entity.EnragedNormal3Entity;
import engiegames.engies_chaos.entity.EnragedNormal2Entity;
import engiegames.engies_chaos.entity.EnragedEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.EnragedEngieEntity;
import engiegames.engies_chaos.entity.EnragedDeathSharkoEntity;
import engiegames.engies_chaos.entity.EngieSharkoEntity;
import engiegames.engies_chaos.entity.EngiePocOutragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMonstrosityEngieEntity;
import engiegames.engies_chaos.entity.EngiePocMadEngieEntity;
import engiegames.engies_chaos.entity.EngiePocHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEnragedEngieEntity;
import engiegames.engies_chaos.entity.EngiePocEngieEntity;
import engiegames.engies_chaos.entity.EngiePocAngryEngieEntity;
import engiegames.engies_chaos.entity.EngieGamesEntity;
import engiegames.engies_chaos.entity.EngieGamesDetectiveEntity;
import engiegames.engies_chaos.entity.EngiEntity;
import engiegames.engies_chaos.entity.DoomsDayHostileEntity;
import engiegames.engies_chaos.entity.DoomsDayEntity;
import engiegames.engies_chaos.entity.DistortedEntity;
import engiegames.engies_chaos.entity.DDaySpikeEntity;
import engiegames.engies_chaos.entity.DDayLightningSpawnerEntity;
import engiegames.engies_chaos.entity.DDayAvalancheEntity;
import engiegames.engies_chaos.entity.DDAYRiftEntity;
import engiegames.engies_chaos.entity.CosmicTheRealEngieGamesEntity;
import engiegames.engies_chaos.entity.CosmicDeathSharkoEntity;
import engiegames.engies_chaos.entity.CommonEngieEntity;
import engiegames.engies_chaos.entity.ClippedbyengieEntity;
import engiegames.engies_chaos.entity.BlueBurstEntity;
import engiegames.engies_chaos.entity.BloodyEngieRiftedEntity;
import engiegames.engies_chaos.entity.BiblicallyDeathSharkoEntity;
import engiegames.engies_chaos.entity.BiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.entity.AprilFoolsTigerSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsRareSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsRareEngieSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsMythicSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsLegendarySharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsExoticSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsEngieSharkoEntity;
import engiegames.engies_chaos.entity.AprilFoolsAlbinoSharkoEntity;
import engiegames.engies_chaos.entity.AngryEngieOldRiftedEntity;
import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.entity.AngryDeathSharkoEntity;
import engiegames.engies_chaos.entity.AngryCreatorRiftedEntity;
import engiegames.engies_chaos.entity.AngryCreatorEntity;
import engiegames.engies_chaos.entity.AlienSharkoEntity;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EngiesChaosModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, EngiesChaosMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<EngiEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryCreatorEntity>> OUTRAGED_ENGIE = register("outraged_engie",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal2Entity>> ENRAGED_NORMAL_2 = register("enraged_normal_2",
			EntityType.Builder.<EnragedNormal2Entity>of(EnragedNormal2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal3Entity>> ENRAGED_NORMAL_3 = register("enraged_normal_3",
			EntityType.Builder.<EnragedNormal3Entity>of(EnragedNormal3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal4Entity>> ENRAGED_NORMAL_4 = register("enraged_normal_4",
			EntityType.Builder.<EnragedNormal4Entity>of(EnragedNormal4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal5Entity>> ENRAGED_NORMAL_5 = register("enraged_normal_5",
			EntityType.Builder.<EnragedNormal5Entity>of(EnragedNormal5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal6Entity>> ENRAGED_NORMAL_6 = register("enraged_normal_6",
			EntityType.Builder.<EnragedNormal6Entity>of(EnragedNormal6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal7Entity>> ENRAGED_NORMAL_7 = register("enraged_normal_7",
			EntityType.Builder.<EnragedNormal7Entity>of(EnragedNormal7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal8Entity>> ENRAGED_NORMAL_8 = register("enraged_normal_8",
			EntityType.Builder.<EnragedNormal8Entity>of(EnragedNormal8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedNormal9Entity>> ENRAGED_NORMAL_9 = register("enraged_normal_9",
			EntityType.Builder.<EnragedNormal9Entity>of(EnragedNormal9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNTEntity>> ENRAGED_TNT = register("enraged_tnt",
			EntityType.Builder.<EnragedTNTEntity>of(EnragedTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT2Entity>> ENRAGED_TNT_2 = register("enraged_tnt_2",
			EntityType.Builder.<EnragedTNT2Entity>of(EnragedTNT2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT3Entity>> ENRAGED_TNT_3 = register("enraged_tnt_3",
			EntityType.Builder.<EnragedTNT3Entity>of(EnragedTNT3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT4Entity>> ENRAGED_TNT_4 = register("enraged_tnt_4",
			EntityType.Builder.<EnragedTNT4Entity>of(EnragedTNT4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT5Entity>> ENRAGED_TNT_5 = register("enraged_tnt_5",
			EntityType.Builder.<EnragedTNT5Entity>of(EnragedTNT5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT6Entity>> ENRAGED_TNT_6 = register("enraged_tnt_6",
			EntityType.Builder.<EnragedTNT6Entity>of(EnragedTNT6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT7Entity>> ENRAGED_TNT_7 = register("enraged_tnt_7",
			EntityType.Builder.<EnragedTNT7Entity>of(EnragedTNT7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT8Entity>> ENRAGED_TNT_8 = register("enraged_tnt_8",
			EntityType.Builder.<EnragedTNT8Entity>of(EnragedTNT8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedTNT9Entity>> ENRAGED_TNT_9 = register("enraged_tnt_9",
			EntityType.Builder.<EnragedTNT9Entity>of(EnragedTNT9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed2Entity>> ENRAGED_SPEED_2 = register("enraged_speed_2",
			EntityType.Builder.<EnragedSpeed2Entity>of(EnragedSpeed2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed3Entity>> ENRAGED_SPEED_3 = register("enraged_speed_3",
			EntityType.Builder.<EnragedSpeed3Entity>of(EnragedSpeed3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed4Entity>> ENRAGED_SPEED_4 = register("enraged_speed_4",
			EntityType.Builder.<EnragedSpeed4Entity>of(EnragedSpeed4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed5Entity>> ENRAGED_SPEED_5 = register("enraged_speed_5",
			EntityType.Builder.<EnragedSpeed5Entity>of(EnragedSpeed5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed6Entity>> ENRAGED_SPEED_6 = register("enraged_speed_6",
			EntityType.Builder.<EnragedSpeed6Entity>of(EnragedSpeed6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed7Entity>> ENRAGED_SPEED_7 = register("enraged_speed_7",
			EntityType.Builder.<EnragedSpeed7Entity>of(EnragedSpeed7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed8Entity>> ENRAGED_SPEED_8 = register("enraged_speed_8",
			EntityType.Builder.<EnragedSpeed8Entity>of(EnragedSpeed8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedSpeed9Entity>> ENRAGED_SPEED_9 = register("enraged_speed_9",
			EntityType.Builder.<EnragedSpeed9Entity>of(EnragedSpeed9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BiblicallyAccurateEngieEntity>> BIBLICALLY_ACCURATE_ENGIE = register("biblically_accurate_engie",
			EntityType.Builder.<BiblicallyAccurateEngieEntity>of(BiblicallyAccurateEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonstrosityEngieEntity>> MONSTROSITY_ENGIE = register("monstrosity_engie",
			EntityType.Builder.<MonstrosityEngieEntity>of(MonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeWhoGamesEntity>> HE_WHO_GAMES = register("he_who_games",
			EntityType.Builder.<HeWhoGamesEntity>of(HeWhoGamesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<HeWhoGamesHostileEntity>> HE_WHO_GAMES_HOSTILE = register("he_who_games_hostile",
			EntityType.Builder.<HeWhoGamesHostileEntity>of(HeWhoGamesHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityEntity>> INSANITY = register("insanity",
			EntityType.Builder.<InsanityEntity>of(InsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<YellowLightningEntity>> YELLOW_LIGHTNING = register("yellow_lightning",
			EntityType.Builder.<YellowLightningEntity>of(YellowLightningEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueBurstEntity>> BLUE_BURST = register("blue_burst",
			EntityType.Builder.<BlueBurstEntity>of(BlueBurstEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<NormalEntity>> NORMAL = register("normal",
			EntityType.Builder.<NormalEntity>of(NormalEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MOABEntity>> MOAB = register("moab",
			EntityType.Builder.<MOABEntity>of(MOABEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PureInsanityEntity>> PURE_INSANITY = register("pure_insanity",
			EntityType.Builder.<PureInsanityEntity>of(PureInsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<DoomsDayEntity>> DOOMS_DAY = register("dooms_day",
			EntityType.Builder.<DoomsDayEntity>of(DoomsDayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SuperDoomsDayEntity>> SUPER_DOOMS_DAY = register("super_dooms_day",
			EntityType.Builder.<SuperDoomsDayEntity>of(SuperDoomsDayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<DoomsDayHostileEntity>> DOOMS_DAY_HOSTILE = register("dooms_day_hostile",
			EntityType.Builder.<DoomsDayHostileEntity>of(DoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SuperDoomsDayHostileEntity>> SUPER_DOOMS_DAY_HOSTILE = register("super_dooms_day_hostile",
			EntityType.Builder.<SuperDoomsDayHostileEntity>of(SuperDoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheEndEntity>> THE_END = register("the_end",
			EntityType.Builder.<TheEndEntity>of(TheEndEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheEndHostileEntity>> THE_END_HOSTILE = register("the_end_hostile",
			EntityType.Builder.<TheEndHostileEntity>of(TheEndHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieGamesDetectiveEntity>> ENGIE_GAMES_DETECTIVE = register("engie_games_detective",
			EntityType.Builder.<EngieGamesDetectiveEntity>of(EngieGamesDetectiveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieGamesEntity>> ENGIE_GAMES = register("engie_games",
			EntityType.Builder.<EngieGamesEntity>of(EngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<DDayLightningSpawnerEntity>> D_DAY_LIGHTNING_SPAWNER = register("d_day_lightning_spawner",
			EntityType.Builder.<DDayLightningSpawnerEntity>of(DDayLightningSpawnerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<DDAYRiftEntity>> DDAY_RIFT = register("dday_rift",
			EntityType.Builder.<DDAYRiftEntity>of(DDAYRiftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(4f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedEngieOldRiftedEntity>> ENRAGED_ENGIE_OLD_RIFTED = register("enraged_engie_old_rifted",
			EntityType.Builder.<EnragedEngieOldRiftedEntity>of(EnragedEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<MadEngieOldRiftedEntity>> MAD_ENGIE_OLD_RIFTED = register("mad_engie_old_rifted",
			EntityType.Builder.<MadEngieOldRiftedEntity>of(MadEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryEngieOldRiftedEntity>> ANGRY_ENGIE_OLD_RIFTED = register("angry_engie_old_rifted",
			EntityType.Builder.<AngryEngieOldRiftedEntity>of(AngryEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryCreatorRiftedEntity>> ANGRY_CREATOR_RIFTED = register("angry_creator_rifted",
			EntityType.Builder.<AngryCreatorRiftedEntity>of(AngryCreatorRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<BloodyEngieRiftedEntity>> BLOODY_ENGIE_RIFTED = register("bloody_engie_rifted",
			EntityType.Builder.<BloodyEngieRiftedEntity>of(BloodyEngieRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<MindscapeEngieEntity>> MINDSCAPE_ENGIE = register("mindscape_engie",
			EntityType.Builder.<MindscapeEngieEntity>of(MindscapeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<DistortedEntity>> DISTORTED = register("distorted",
			EntityType.Builder.<DistortedEntity>of(DistortedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(500).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheRealEngieGamesEntity>> THE_REAL_ENGIE_GAMES = register("the_real_engie_games",
			EntityType.Builder.<TheRealEngieGamesEntity>of(TheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ScorchedEntity>> SCORCHED = register("scorched",
			EntityType.Builder.<ScorchedEntity>of(ScorchedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackSharkoEntity>> THROWBACK_SHARKO = register("throwback_sharko",
			EntityType.Builder.<ThrowbackSharkoEntity>of(ThrowbackSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<WormholeEngieEntity>> WORMHOLE_ENGIE = register("wormhole_engie",
			EntityType.Builder.<WormholeEngieEntity>of(WormholeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RoughianTheRealEngieGamesEntity>> ROUGHIAN_THE_REAL_ENGIE_GAMES = register("roughian_the_real_engie_games",
			EntityType.Builder.<RoughianTheRealEngieGamesEntity>of(RoughianTheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CosmicTheRealEngieGamesEntity>> COSMIC_THE_REAL_ENGIE_GAMES = register("cosmic_the_real_engie_games",
			EntityType.Builder.<CosmicTheRealEngieGamesEntity>of(CosmicTheRealEngieGamesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackMadEngieEntity>> THROWBACK_MAD_ENGIE = register("throwback_mad_engie",
			EntityType.Builder.<ThrowbackMadEngieEntity>of(ThrowbackMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackAngryEngieEntity>> THROWBACK_ANGRY_ENGIE = register("throwback_angry_engie",
			EntityType.Builder.<ThrowbackAngryEngieEntity>of(ThrowbackAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackEnragedEngieEntity>> THROWBACK_ENRAGED_ENGIE = register("throwback_enraged_engie",
			EntityType.Builder.<ThrowbackEnragedEngieEntity>of(ThrowbackEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackAngryCreatorEntity>> THROWBACK_ANGRY_CREATOR = register("throwback_angry_creator",
			EntityType.Builder.<ThrowbackAngryCreatorEntity>of(ThrowbackAngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackEngiEntity>> THROWBACK_ENGI = register("throwback_engi",
			EntityType.Builder.<ThrowbackEngiEntity>of(ThrowbackEngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThrowbackCreatorEntity>> THROWBACK_CREATOR = register("throwback_creator",
			EntityType.Builder.<ThrowbackCreatorEntity>of(ThrowbackCreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<HostileBiblicallyAccurateEngieEntity>> HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("hostile_biblically_accurate_engie",
			EntityType.Builder.<HostileBiblicallyAccurateEngieEntity>of(HostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PunisherEntity>> PUNISHER = register("punisher",
			EntityType.Builder.<PunisherEntity>of(PunisherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TheRealEngieGamesHalloweenEntity>> THE_REAL_ENGIE_GAMES_HALLOWEEN = register("the_real_engie_games_halloween",
			EntityType.Builder.<TheRealEngieGamesHalloweenEntity>of(TheRealEngieGamesHalloweenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowSharkEngieEntity>> SHADOW_SHARK_ENGIE = register("shadow_shark_engie",
			EntityType.Builder.<ShadowSharkEngieEntity>of(ShadowSharkEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShadowSharkEngieBlindEntity>> SHADOW_SHARK_ENGIE_BLIND = register("shadow_shark_engie_blind",
			EntityType.Builder.<ShadowSharkEngieBlindEntity>of(ShadowSharkEngieBlindEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ClippedbyengieEntity>> CLIPPEDBYENGIE = register("clippedbyengie",
			EntityType.Builder.<ClippedbyengieEntity>of(ClippedbyengieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareEnragedEngieEntity>> NIGHTMARE_ENRAGED_ENGIE = register("nightmare_enraged_engie",
			EntityType.Builder.<NightmareEnragedEngieEntity>of(NightmareEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareMadEngieEntity>> NIGHTMARE_MAD_ENGIE = register("nightmare_mad_engie",
			EntityType.Builder.<NightmareMadEngieEntity>of(NightmareMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareAngryEngieEntity>> NIGHTMARE_ANGRY_ENGIE = register("nightmare_angry_engie",
			EntityType.Builder.<NightmareAngryEngieEntity>of(NightmareAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareOutragedEngieEntity>> NIGHTMARE_OUTRAGED_ENGIE = register("nightmare_outraged_engie",
			EntityType.Builder.<NightmareOutragedEngieEntity>of(NightmareOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareMonstrosityEngieEntity>> NIGHTMARE_MONSTROSITY_ENGIE = register("nightmare_monstrosity_engie",
			EntityType.Builder.<NightmareMonstrosityEngieEntity>of(NightmareMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareHostileBiblicallyAccurateEngieEntity>> NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("nightmare_hostile_biblically_accurate_engie",
			EntityType.Builder.<NightmareHostileBiblicallyAccurateEngieEntity>of(NightmareHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityMadEngieEntity>> INSANITY_MAD_ENGIE = register("insanity_mad_engie",
			EntityType.Builder.<InsanityMadEngieEntity>of(InsanityMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityAngryEngieEntity>> INSANITY_ANGRY_ENGIE = register("insanity_angry_engie",
			EntityType.Builder.<InsanityAngryEngieEntity>of(InsanityAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityEnragedEngieEntity>> INSANITY_ENRAGED_ENGIE = register("insanity_enraged_engie",
			EntityType.Builder.<InsanityEnragedEngieEntity>of(InsanityEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityOutragedEngieEntity>> INSANITY_OUTRAGED_ENGIE = register("insanity_outraged_engie",
			EntityType.Builder.<InsanityOutragedEngieEntity>of(InsanityOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityMonstrosityEngieEntity>> INSANITY_MONSTROSITY_ENGIE = register("insanity_monstrosity_engie",
			EntityType.Builder.<InsanityMonstrosityEngieEntity>of(InsanityMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareEngieEntity>> NIGHTMARE_ENGIE = register("nightmare_engie",
			EntityType.Builder.<NightmareEngieEntity>of(NightmareEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityEngieEntity>> INSANITY_ENGIE = register("insanity_engie",
			EntityType.Builder.<InsanityEngieEntity>of(InsanityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<InsanityHostileBiblicallyAccurateEngieEntity>> INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("insanity_hostile_biblically_accurate_engie",
			EntityType.Builder.<InsanityHostileBiblicallyAccurateEngieEntity>of(InsanityHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<HsotileEngieEntity>> HOSTILE_ENGIE = register("hostile_engie",
			EntityType.Builder.<HsotileEngieEntity>of(HsotileEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EpicSharkoEntity>> EPIC_SHARKO = register("epic_sharko",
			EntityType.Builder.<EpicSharkoEntity>of(EpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RareEngieSharkoEntity>> RARE_ENGIE_SHARKO = register("rare_engie_sharko",
			EntityType.Builder.<RareEngieSharkoEntity>of(RareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<TigerSharkoEntity>> TIGER_SHARKO = register("tiger_sharko",
			EntityType.Builder.<TigerSharkoEntity>of(TigerSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AlienSharkoEntity>> ALIEN_SHARKO = register("alien_sharko",
			EntityType.Builder.<AlienSharkoEntity>of(AlienSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngryDeathSharkoEntity>> ANGRY_DEATH_SHARKO = register("angry_death_sharko",
			EntityType.Builder.<AngryDeathSharkoEntity>of(AngryDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnragedDeathSharkoEntity>> ENRAGED_DEATH_SHARKO = register("enraged_death_sharko",
			EntityType.Builder.<EnragedDeathSharkoEntity>of(EnragedDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<OutragedDeathSharkoEntity>> OUTRAGED_DEATH_SHARKO = register("outraged_death_sharko",
			EntityType.Builder.<OutragedDeathSharkoEntity>of(OutragedDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BiblicallyDeathSharkoEntity>> BIBLICALLY_DEATH_SHARKO = register("biblically_death_sharko",
			EntityType.Builder.<BiblicallyDeathSharkoEntity>of(BiblicallyDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MonstrosityDeathSharkoEntity>> MONSTROSITY_DEATH_SHARKO = register("monstrosity_death_sharko",
			EntityType.Builder.<MonstrosityDeathSharkoEntity>of(MonstrosityDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CosmicDeathSharkoEntity>> COSMIC_DEATH_SHARKO = register("cosmic_death_sharko",
			EntityType.Builder.<CosmicDeathSharkoEntity>of(CosmicDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<OMENEntity>> OMEN = register("omen",
			EntityType.Builder.<OMENEntity>of(OMENEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<DDaySpikeEntity>> D_DAY_SPIKE = register("d_day_spike",
			EntityType.Builder.<DDaySpikeEntity>of(DDaySpikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.5f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DDayAvalancheEntity>> D_DAY_AVALANCHE = register("d_day_avalanche",
			EntityType.Builder.<DDayAvalancheEntity>of(DDayAvalancheEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsSharkoEntity>> APRIL_FOOLS_SHARKO = register("april_fools_sharko",
			EntityType.Builder.<AprilFoolsSharkoEntity>of(AprilFoolsSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsAlbinoSharkoEntity>> APRIL_FOOLS_ALBINO_SHARKO = register("april_fools_albino_sharko",
			EntityType.Builder.<AprilFoolsAlbinoSharkoEntity>of(AprilFoolsAlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsRareSharkoEntity>> APRIL_FOOLS_RARE_SHARKO = register("april_fools_rare_sharko",
			EntityType.Builder.<AprilFoolsRareSharkoEntity>of(AprilFoolsRareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsLegendarySharkoEntity>> APRIL_FOOLS_LEGENDARY_SHARKO = register("april_fools_legendary_sharko",
			EntityType.Builder.<AprilFoolsLegendarySharkoEntity>of(AprilFoolsLegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsMythicSharkoEntity>> APRIL_FOOLS_MYTHIC_SHARKO = register("april_fools_mythic_sharko",
			EntityType.Builder.<AprilFoolsMythicSharkoEntity>of(AprilFoolsMythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsExoticSharkoEntity>> APRIL_FOOLS_EXOTIC_SHARKO = register("april_fools_exotic_sharko",
			EntityType.Builder.<AprilFoolsExoticSharkoEntity>of(AprilFoolsExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsEngieSharkoEntity>> APRIL_FOOLS_ENGIE_SHARKO = register("april_fools_engie_sharko",
			EntityType.Builder.<AprilFoolsEngieSharkoEntity>of(AprilFoolsEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsRareEngieSharkoEntity>> APRIL_FOOLS_RARE_ENGIE_SHARKO = register("april_fools_rare_engie_sharko",
			EntityType.Builder.<AprilFoolsRareEngieSharkoEntity>of(AprilFoolsRareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<AprilFoolsTigerSharkoEntity>> APRIL_FOOLS_TIGER_SHARKO = register("april_fools_tiger_sharko",
			EntityType.Builder.<AprilFoolsTigerSharkoEntity>of(AprilFoolsTigerSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<UncommonSharkoEntity>> UNCOMMON_SHARKO = register("uncommon_sharko",
			EntityType.Builder.<UncommonSharkoEntity>of(UncommonSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<XEngieGamesEntity>> X_ENGIE_GAMES = register("x_engie_games",
			EntityType.Builder.<XEngieGamesEntity>of(XEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RiftBallEntity>> RIFT_BALL = register("rift_ball",
			EntityType.Builder.<RiftBallEntity>of(RiftBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<WormholeSharkoEntity>> WORMHOLE_SHARKO = register("wormhole_sharko",
			EntityType.Builder.<WormholeSharkoEntity>of(WormholeSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<GlitchSharkoEntity>> GLITCH_SHARKO = register("glitch_sharko",
			EntityType.Builder.<GlitchSharkoEntity>of(GlitchSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<XEngieSharkoEntity>> X_ENGIE_SHARKO = register("x_engie_sharko",
			EntityType.Builder.<XEngieSharkoEntity>of(XEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.7f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocMadEngieEntity>> ENGIE_POC_MAD_ENGIE = register("engie_poc_mad_engie",
			EntityType.Builder.<EngiePocMadEngieEntity>of(EngiePocMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocAngryEngieEntity>> ENGIE_POC_ANGRY_ENGIE = register("engie_poc_angry_engie",
			EntityType.Builder.<EngiePocAngryEngieEntity>of(EngiePocAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocEnragedEngieEntity>> ENGIE_POC_ENRAGED_ENGIE = register("engie_poc_enraged_engie",
			EntityType.Builder.<EngiePocEnragedEngieEntity>of(EngiePocEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocOutragedEngieEntity>> ENGIE_POC_OUTRAGED_ENGIE = register("engie_poc_outraged_engie",
			EntityType.Builder.<EngiePocOutragedEngieEntity>of(EngiePocOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocMonstrosityEngieEntity>> ENGIE_POC_MONSTROSITY_ENGIE = register("engie_poc_monstrosity_engie",
			EntityType.Builder.<EngiePocMonstrosityEngieEntity>of(EngiePocMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocHostileBiblicallyAccurateEngieEntity>> ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("engie_poc_hostile_biblically_accurate_engie",
			EntityType.Builder.<EngiePocHostileBiblicallyAccurateEngieEntity>of(EngiePocHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<EngiePocEngieEntity>> ENGIE_POC_ENGIE = register("engie_poc_engie",
			EntityType.Builder.<EngiePocEngieEntity>of(EngiePocEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)

					.sized(0.6f, 1.9f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		EngiEntity.init(event);
		MadEngieEntity.init(event);
		AngryEngieEntity.init(event);
		EnragedEngieEntity.init(event);
		AngryCreatorEntity.init(event);
		SharkoEntity.init(event);
		ProtogenEntity.init(event);
		QuizzetEntity.init(event);
		EnragedNormalEntity.init(event);
		EnragedNormal2Entity.init(event);
		EnragedNormal3Entity.init(event);
		EnragedNormal4Entity.init(event);
		EnragedNormal5Entity.init(event);
		EnragedNormal6Entity.init(event);
		EnragedNormal7Entity.init(event);
		EnragedNormal8Entity.init(event);
		EnragedNormal9Entity.init(event);
		EnragedTNTEntity.init(event);
		EnragedTNT2Entity.init(event);
		EnragedTNT3Entity.init(event);
		EnragedTNT4Entity.init(event);
		EnragedTNT5Entity.init(event);
		EnragedTNT6Entity.init(event);
		EnragedTNT7Entity.init(event);
		EnragedTNT8Entity.init(event);
		EnragedTNT9Entity.init(event);
		EnragedSpeedEntity.init(event);
		EnragedSpeed2Entity.init(event);
		EnragedSpeed3Entity.init(event);
		EnragedSpeed4Entity.init(event);
		EnragedSpeed5Entity.init(event);
		EnragedSpeed6Entity.init(event);
		EnragedSpeed7Entity.init(event);
		EnragedSpeed8Entity.init(event);
		EnragedSpeed9Entity.init(event);
		CommonEngieEntity.init(event);
		UncommonEngieEntity.init(event);
		RareEngieEntity.init(event);
		EpicEngieEntity.init(event);
		LegendaryEngieEntity.init(event);
		MythicEngieEntity.init(event);
		ExoticEngieEntity.init(event);
		BiblicallyAccurateEngieEntity.init(event);
		MonstrosityEngieEntity.init(event);
		HeWhoGamesEntity.init(event);
		HeWhoGamesHostileEntity.init(event);
		InsanityEntity.init(event);
		YellowLightningEntity.init(event);
		BlueBurstEntity.init(event);
		NormalEntity.init(event);
		MOABEntity.init(event);
		PureInsanityEntity.init(event);
		DoomsDayEntity.init(event);
		SuperDoomsDayEntity.init(event);
		DoomsDayHostileEntity.init(event);
		SuperDoomsDayHostileEntity.init(event);
		TheEndEntity.init(event);
		TheEndHostileEntity.init(event);
		EngieGamesDetectiveEntity.init(event);
		EngieGamesEntity.init(event);
		DDayLightningSpawnerEntity.init(event);
		DDAYRiftEntity.init(event);
		EnragedEngieOldRiftedEntity.init(event);
		MadEngieOldRiftedEntity.init(event);
		AngryEngieOldRiftedEntity.init(event);
		AngryCreatorRiftedEntity.init(event);
		BloodyEngieRiftedEntity.init(event);
		MindscapeEngieEntity.init(event);
		DistortedEntity.init(event);
		TheRealEngieGamesEntity.init(event);
		ScorchedEntity.init(event);
		ThrowbackSharkoEntity.init(event);
		WormholeEngieEntity.init(event);
		RoughianTheRealEngieGamesEntity.init(event);
		CosmicTheRealEngieGamesEntity.init(event);
		ThrowbackMadEngieEntity.init(event);
		ThrowbackAngryEngieEntity.init(event);
		ThrowbackEnragedEngieEntity.init(event);
		ThrowbackAngryCreatorEntity.init(event);
		ThrowbackEngiEntity.init(event);
		ThrowbackCreatorEntity.init(event);
		HostileBiblicallyAccurateEngieEntity.init(event);
		PunisherEntity.init(event);
		TheRealEngieGamesHalloweenEntity.init(event);
		ShadowSharkEngieEntity.init(event);
		ShadowSharkEngieBlindEntity.init(event);
		ClippedbyengieEntity.init(event);
		NightmareEnragedEngieEntity.init(event);
		NightmareMadEngieEntity.init(event);
		NightmareAngryEngieEntity.init(event);
		NightmareOutragedEngieEntity.init(event);
		NightmareMonstrosityEngieEntity.init(event);
		NightmareHostileBiblicallyAccurateEngieEntity.init(event);
		InsanityMadEngieEntity.init(event);
		InsanityAngryEngieEntity.init(event);
		InsanityEnragedEngieEntity.init(event);
		InsanityOutragedEngieEntity.init(event);
		InsanityMonstrosityEngieEntity.init(event);
		NightmareEngieEntity.init(event);
		InsanityEngieEntity.init(event);
		InsanityHostileBiblicallyAccurateEngieEntity.init(event);
		HsotileEngieEntity.init(event);
		RareSharkoEntity.init(event);
		EpicSharkoEntity.init(event);
		LegendarySharkoEntity.init(event);
		MythicSharkoEntity.init(event);
		ExoticSharkoEntity.init(event);
		EngieSharkoEntity.init(event);
		RareEngieSharkoEntity.init(event);
		TigerSharkoEntity.init(event);
		AlienSharkoEntity.init(event);
		AngryDeathSharkoEntity.init(event);
		EnragedDeathSharkoEntity.init(event);
		OutragedDeathSharkoEntity.init(event);
		BiblicallyDeathSharkoEntity.init(event);
		MonstrosityDeathSharkoEntity.init(event);
		CosmicDeathSharkoEntity.init(event);
		OMENEntity.init(event);
		DDaySpikeEntity.init(event);
		DDayAvalancheEntity.init(event);
		AprilFoolsSharkoEntity.init(event);
		AprilFoolsAlbinoSharkoEntity.init(event);
		AprilFoolsRareSharkoEntity.init(event);
		AprilFoolsLegendarySharkoEntity.init(event);
		AprilFoolsMythicSharkoEntity.init(event);
		AprilFoolsExoticSharkoEntity.init(event);
		AprilFoolsEngieSharkoEntity.init(event);
		AprilFoolsRareEngieSharkoEntity.init(event);
		AprilFoolsTigerSharkoEntity.init(event);
		UncommonSharkoEntity.init(event);
		XEngieGamesEntity.init(event);
		RiftBallEntity.init(event);
		WormholeSharkoEntity.init(event);
		GlitchSharkoEntity.init(event);
		XEngieSharkoEntity.init(event);
		EngiePocMadEngieEntity.init(event);
		EngiePocAngryEngieEntity.init(event);
		EngiePocEnragedEngieEntity.init(event);
		EngiePocOutragedEngieEntity.init(event);
		EngiePocMonstrosityEngieEntity.init(event);
		EngiePocHostileBiblicallyAccurateEngieEntity.init(event);
		EngiePocEngieEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENGIE.get(), EngiEntity.createAttributes().build());
		event.put(MAD_ENGIE.get(), MadEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE.get(), AngryEngieEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE.get(), EnragedEngieEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE.get(), AngryCreatorEntity.createAttributes().build());
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(QUIZZET.get(), QuizzetEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL_2.get(), EnragedNormal2Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_3.get(), EnragedNormal3Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_4.get(), EnragedNormal4Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_5.get(), EnragedNormal5Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_6.get(), EnragedNormal6Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_7.get(), EnragedNormal7Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_8.get(), EnragedNormal8Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_9.get(), EnragedNormal9Entity.createAttributes().build());
		event.put(ENRAGED_TNT.get(), EnragedTNTEntity.createAttributes().build());
		event.put(ENRAGED_TNT_2.get(), EnragedTNT2Entity.createAttributes().build());
		event.put(ENRAGED_TNT_3.get(), EnragedTNT3Entity.createAttributes().build());
		event.put(ENRAGED_TNT_4.get(), EnragedTNT4Entity.createAttributes().build());
		event.put(ENRAGED_TNT_5.get(), EnragedTNT5Entity.createAttributes().build());
		event.put(ENRAGED_TNT_6.get(), EnragedTNT6Entity.createAttributes().build());
		event.put(ENRAGED_TNT_7.get(), EnragedTNT7Entity.createAttributes().build());
		event.put(ENRAGED_TNT_8.get(), EnragedTNT8Entity.createAttributes().build());
		event.put(ENRAGED_TNT_9.get(), EnragedTNT9Entity.createAttributes().build());
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(ENRAGED_SPEED_2.get(), EnragedSpeed2Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_3.get(), EnragedSpeed3Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_4.get(), EnragedSpeed4Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_5.get(), EnragedSpeed5Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_6.get(), EnragedSpeed6Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_7.get(), EnragedSpeed7Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_8.get(), EnragedSpeed8Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_9.get(), EnragedSpeed9Entity.createAttributes().build());
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
		event.put(BIBLICALLY_ACCURATE_ENGIE.get(), BiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE.get(), MonstrosityEngieEntity.createAttributes().build());
		event.put(HE_WHO_GAMES.get(), HeWhoGamesEntity.createAttributes().build());
		event.put(HE_WHO_GAMES_HOSTILE.get(), HeWhoGamesHostileEntity.createAttributes().build());
		event.put(INSANITY.get(), InsanityEntity.createAttributes().build());
		event.put(YELLOW_LIGHTNING.get(), YellowLightningEntity.createAttributes().build());
		event.put(BLUE_BURST.get(), BlueBurstEntity.createAttributes().build());
		event.put(NORMAL.get(), NormalEntity.createAttributes().build());
		event.put(MOAB.get(), MOABEntity.createAttributes().build());
		event.put(PURE_INSANITY.get(), PureInsanityEntity.createAttributes().build());
		event.put(DOOMS_DAY.get(), DoomsDayEntity.createAttributes().build());
		event.put(SUPER_DOOMS_DAY.get(), SuperDoomsDayEntity.createAttributes().build());
		event.put(DOOMS_DAY_HOSTILE.get(), DoomsDayHostileEntity.createAttributes().build());
		event.put(SUPER_DOOMS_DAY_HOSTILE.get(), SuperDoomsDayHostileEntity.createAttributes().build());
		event.put(THE_END.get(), TheEndEntity.createAttributes().build());
		event.put(THE_END_HOSTILE.get(), TheEndHostileEntity.createAttributes().build());
		event.put(ENGIE_GAMES_DETECTIVE.get(), EngieGamesDetectiveEntity.createAttributes().build());
		event.put(ENGIE_GAMES.get(), EngieGamesEntity.createAttributes().build());
		event.put(D_DAY_LIGHTNING_SPAWNER.get(), DDayLightningSpawnerEntity.createAttributes().build());
		event.put(DDAY_RIFT.get(), DDAYRiftEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_OLD_RIFTED.get(), EnragedEngieOldRiftedEntity.createAttributes().build());
		event.put(MAD_ENGIE_OLD_RIFTED.get(), MadEngieOldRiftedEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_OLD_RIFTED.get(), AngryEngieOldRiftedEntity.createAttributes().build());
		event.put(ANGRY_CREATOR_RIFTED.get(), AngryCreatorRiftedEntity.createAttributes().build());
		event.put(BLOODY_ENGIE_RIFTED.get(), BloodyEngieRiftedEntity.createAttributes().build());
		event.put(MINDSCAPE_ENGIE.get(), MindscapeEngieEntity.createAttributes().build());
		event.put(DISTORTED.get(), DistortedEntity.createAttributes().build());
		event.put(THE_REAL_ENGIE_GAMES.get(), TheRealEngieGamesEntity.createAttributes().build());
		event.put(SCORCHED.get(), ScorchedEntity.createAttributes().build());
		event.put(THROWBACK_SHARKO.get(), ThrowbackSharkoEntity.createAttributes().build());
		event.put(WORMHOLE_ENGIE.get(), WormholeEngieEntity.createAttributes().build());
		event.put(ROUGHIAN_THE_REAL_ENGIE_GAMES.get(), RoughianTheRealEngieGamesEntity.createAttributes().build());
		event.put(COSMIC_THE_REAL_ENGIE_GAMES.get(), CosmicTheRealEngieGamesEntity.createAttributes().build());
		event.put(THROWBACK_MAD_ENGIE.get(), ThrowbackMadEngieEntity.createAttributes().build());
		event.put(THROWBACK_ANGRY_ENGIE.get(), ThrowbackAngryEngieEntity.createAttributes().build());
		event.put(THROWBACK_ENRAGED_ENGIE.get(), ThrowbackEnragedEngieEntity.createAttributes().build());
		event.put(THROWBACK_ANGRY_CREATOR.get(), ThrowbackAngryCreatorEntity.createAttributes().build());
		event.put(THROWBACK_ENGI.get(), ThrowbackEngiEntity.createAttributes().build());
		event.put(THROWBACK_CREATOR.get(), ThrowbackCreatorEntity.createAttributes().build());
		event.put(HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), HostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(PUNISHER.get(), PunisherEntity.createAttributes().build());
		event.put(THE_REAL_ENGIE_GAMES_HALLOWEEN.get(), TheRealEngieGamesHalloweenEntity.createAttributes().build());
		event.put(SHADOW_SHARK_ENGIE.get(), ShadowSharkEngieEntity.createAttributes().build());
		event.put(SHADOW_SHARK_ENGIE_BLIND.get(), ShadowSharkEngieBlindEntity.createAttributes().build());
		event.put(CLIPPEDBYENGIE.get(), ClippedbyengieEntity.createAttributes().build());
		event.put(NIGHTMARE_ENRAGED_ENGIE.get(), NightmareEnragedEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_MAD_ENGIE.get(), NightmareMadEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_ANGRY_ENGIE.get(), NightmareAngryEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_OUTRAGED_ENGIE.get(), NightmareOutragedEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_MONSTROSITY_ENGIE.get(), NightmareMonstrosityEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), NightmareHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(INSANITY_MAD_ENGIE.get(), InsanityMadEngieEntity.createAttributes().build());
		event.put(INSANITY_ANGRY_ENGIE.get(), InsanityAngryEngieEntity.createAttributes().build());
		event.put(INSANITY_ENRAGED_ENGIE.get(), InsanityEnragedEngieEntity.createAttributes().build());
		event.put(INSANITY_OUTRAGED_ENGIE.get(), InsanityOutragedEngieEntity.createAttributes().build());
		event.put(INSANITY_MONSTROSITY_ENGIE.get(), InsanityMonstrosityEngieEntity.createAttributes().build());
		event.put(NIGHTMARE_ENGIE.get(), NightmareEngieEntity.createAttributes().build());
		event.put(INSANITY_ENGIE.get(), InsanityEngieEntity.createAttributes().build());
		event.put(INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), InsanityHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(HOSTILE_ENGIE.get(), HsotileEngieEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(EPIC_SHARKO.get(), EpicSharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO.get(), RareEngieSharkoEntity.createAttributes().build());
		event.put(TIGER_SHARKO.get(), TigerSharkoEntity.createAttributes().build());
		event.put(ALIEN_SHARKO.get(), AlienSharkoEntity.createAttributes().build());
		event.put(ANGRY_DEATH_SHARKO.get(), AngryDeathSharkoEntity.createAttributes().build());
		event.put(ENRAGED_DEATH_SHARKO.get(), EnragedDeathSharkoEntity.createAttributes().build());
		event.put(OUTRAGED_DEATH_SHARKO.get(), OutragedDeathSharkoEntity.createAttributes().build());
		event.put(BIBLICALLY_DEATH_SHARKO.get(), BiblicallyDeathSharkoEntity.createAttributes().build());
		event.put(MONSTROSITY_DEATH_SHARKO.get(), MonstrosityDeathSharkoEntity.createAttributes().build());
		event.put(COSMIC_DEATH_SHARKO.get(), CosmicDeathSharkoEntity.createAttributes().build());
		event.put(OMEN.get(), OMENEntity.createAttributes().build());
		event.put(D_DAY_SPIKE.get(), DDaySpikeEntity.createAttributes().build());
		event.put(D_DAY_AVALANCHE.get(), DDayAvalancheEntity.createAttributes().build());
		event.put(APRIL_FOOLS_SHARKO.get(), AprilFoolsSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_ALBINO_SHARKO.get(), AprilFoolsAlbinoSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_RARE_SHARKO.get(), AprilFoolsRareSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_LEGENDARY_SHARKO.get(), AprilFoolsLegendarySharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_MYTHIC_SHARKO.get(), AprilFoolsMythicSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_EXOTIC_SHARKO.get(), AprilFoolsExoticSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_ENGIE_SHARKO.get(), AprilFoolsEngieSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_RARE_ENGIE_SHARKO.get(), AprilFoolsRareEngieSharkoEntity.createAttributes().build());
		event.put(APRIL_FOOLS_TIGER_SHARKO.get(), AprilFoolsTigerSharkoEntity.createAttributes().build());
		event.put(UNCOMMON_SHARKO.get(), UncommonSharkoEntity.createAttributes().build());
		event.put(X_ENGIE_GAMES.get(), XEngieGamesEntity.createAttributes().build());
		event.put(RIFT_BALL.get(), RiftBallEntity.createAttributes().build());
		event.put(WORMHOLE_SHARKO.get(), WormholeSharkoEntity.createAttributes().build());
		event.put(GLITCH_SHARKO.get(), GlitchSharkoEntity.createAttributes().build());
		event.put(X_ENGIE_SHARKO.get(), XEngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_POC_MAD_ENGIE.get(), EngiePocMadEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_ANGRY_ENGIE.get(), EngiePocAngryEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_ENRAGED_ENGIE.get(), EngiePocEnragedEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_OUTRAGED_ENGIE.get(), EngiePocOutragedEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_MONSTROSITY_ENGIE.get(), EngiePocMonstrosityEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE.get(), EngiePocHostileBiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(ENGIE_POC_ENGIE.get(), EngiePocEngieEntity.createAttributes().build());
	}
}