/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engieschaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.entity.YellowLightningEntity;
import engiegames.engieschaos.entity.XEngieSharkoEntity;
import engiegames.engieschaos.entity.XEngieGamesEntity;
import engiegames.engieschaos.entity.WormholeSharkoEntity;
import engiegames.engieschaos.entity.WormholeEngieEntity;
import engiegames.engieschaos.entity.UncommonSharkoEntity;
import engiegames.engieschaos.entity.UncommonEngieEntity;
import engiegames.engieschaos.entity.TigerSharkoEntity;
import engiegames.engieschaos.entity.ThrowbackSharkoEntity;
import engiegames.engieschaos.entity.ThrowbackMadEngieEntity;
import engiegames.engieschaos.entity.ThrowbackEnragedEngieEntity;
import engiegames.engieschaos.entity.ThrowbackEngiEntity;
import engiegames.engieschaos.entity.ThrowbackCreatorEntity;
import engiegames.engieschaos.entity.ThrowbackAngryEngieEntity;
import engiegames.engieschaos.entity.ThrowbackAngryCreatorEntity;
import engiegames.engieschaos.entity.TheRealEngieGamesHalloweenEntity;
import engiegames.engieschaos.entity.TheRealEngieGamesEntity;
import engiegames.engieschaos.entity.TheEndHostileEntity;
import engiegames.engieschaos.entity.TheEndEntity;
import engiegames.engieschaos.entity.SuperDoomsDayHostileEntity;
import engiegames.engieschaos.entity.SuperDoomsDayEntity;
import engiegames.engieschaos.entity.SharkoEntity;
import engiegames.engieschaos.entity.ShadowSharkEngieEntity;
import engiegames.engieschaos.entity.ShadowSharkEngieBlindEntity;
import engiegames.engieschaos.entity.ScorchedEntity;
import engiegames.engieschaos.entity.RoughianTheRealEngieGamesEntity;
import engiegames.engieschaos.entity.RiftBallEntity;
import engiegames.engieschaos.entity.RareSharkoEntity;
import engiegames.engieschaos.entity.RareEngieSharkoEntity;
import engiegames.engieschaos.entity.RareEngieEntity;
import engiegames.engieschaos.entity.QuizzetEntity;
import engiegames.engieschaos.entity.PureInsanityEntity;
import engiegames.engieschaos.entity.PunisherEntity;
import engiegames.engieschaos.entity.ProtogenEntity;
import engiegames.engieschaos.entity.OutragedDeathSharkoEntity;
import engiegames.engieschaos.entity.OMENEntity;
import engiegames.engieschaos.entity.NormalEntity;
import engiegames.engieschaos.entity.NightmareOutragedEngieEntity;
import engiegames.engieschaos.entity.NightmareMonstrosityEngieEntity;
import engiegames.engieschaos.entity.NightmareMadEngieEntity;
import engiegames.engieschaos.entity.NightmareHostileBiblicallyAccurateEngieEntity;
import engiegames.engieschaos.entity.NightmareEnragedEngieEntity;
import engiegames.engieschaos.entity.NightmareEngieEntity;
import engiegames.engieschaos.entity.NightmareAngryEngieEntity;
import engiegames.engieschaos.entity.MythicSharkoEntity;
import engiegames.engieschaos.entity.MythicEngieEntity;
import engiegames.engieschaos.entity.MonstrosityEngieEntity;
import engiegames.engieschaos.entity.MonstrosityDeathSharkoEntity;
import engiegames.engieschaos.entity.MindscapeEngieEntity;
import engiegames.engieschaos.entity.MadEngieOldRiftedEntity;
import engiegames.engieschaos.entity.MadEngieEntity;
import engiegames.engieschaos.entity.MOABEntity;
import engiegames.engieschaos.entity.LegendarySharkoEntity;
import engiegames.engieschaos.entity.LegendaryEngieEntity;
import engiegames.engieschaos.entity.InsanityOutragedEngieEntity;
import engiegames.engieschaos.entity.InsanityMonstrosityEngieEntity;
import engiegames.engieschaos.entity.InsanityMadEngieEntity;
import engiegames.engieschaos.entity.InsanityHostileBiblicallyAccurateEngieEntity;
import engiegames.engieschaos.entity.InsanityEntity;
import engiegames.engieschaos.entity.InsanityEnragedEngieEntity;
import engiegames.engieschaos.entity.InsanityEngieEntity;
import engiegames.engieschaos.entity.InsanityAngryEngieEntity;
import engiegames.engieschaos.entity.HsotileEngieEntity;
import engiegames.engieschaos.entity.HostileBiblicallyAccurateEngieEntity;
import engiegames.engieschaos.entity.HeWhoGamesHostileEntity;
import engiegames.engieschaos.entity.HeWhoGamesEntity;
import engiegames.engieschaos.entity.GlitchSharkoEntity;
import engiegames.engieschaos.entity.ExoticSharkoEntity;
import engiegames.engieschaos.entity.ExoticEngieEntity;
import engiegames.engieschaos.entity.EpicSharkoEntity;
import engiegames.engieschaos.entity.EpicEngieEntity;
import engiegames.engieschaos.entity.EnragedTNTEntity;
import engiegames.engieschaos.entity.EnragedTNT9Entity;
import engiegames.engieschaos.entity.EnragedTNT8Entity;
import engiegames.engieschaos.entity.EnragedTNT7Entity;
import engiegames.engieschaos.entity.EnragedTNT6Entity;
import engiegames.engieschaos.entity.EnragedTNT5Entity;
import engiegames.engieschaos.entity.EnragedTNT4Entity;
import engiegames.engieschaos.entity.EnragedTNT3Entity;
import engiegames.engieschaos.entity.EnragedTNT2Entity;
import engiegames.engieschaos.entity.EnragedSpeedEntity;
import engiegames.engieschaos.entity.EnragedSpeed9Entity;
import engiegames.engieschaos.entity.EnragedSpeed8Entity;
import engiegames.engieschaos.entity.EnragedSpeed7Entity;
import engiegames.engieschaos.entity.EnragedSpeed6Entity;
import engiegames.engieschaos.entity.EnragedSpeed5Entity;
import engiegames.engieschaos.entity.EnragedSpeed4Entity;
import engiegames.engieschaos.entity.EnragedSpeed3Entity;
import engiegames.engieschaos.entity.EnragedSpeed2Entity;
import engiegames.engieschaos.entity.EnragedNormalEntity;
import engiegames.engieschaos.entity.EnragedNormal9Entity;
import engiegames.engieschaos.entity.EnragedNormal8Entity;
import engiegames.engieschaos.entity.EnragedNormal7Entity;
import engiegames.engieschaos.entity.EnragedNormal6Entity;
import engiegames.engieschaos.entity.EnragedNormal5Entity;
import engiegames.engieschaos.entity.EnragedNormal4Entity;
import engiegames.engieschaos.entity.EnragedNormal3Entity;
import engiegames.engieschaos.entity.EnragedNormal2Entity;
import engiegames.engieschaos.entity.EnragedEngieOldRiftedEntity;
import engiegames.engieschaos.entity.EnragedEngieEntity;
import engiegames.engieschaos.entity.EnragedDeathSharkoEntity;
import engiegames.engieschaos.entity.EngieSharkoEntity;
import engiegames.engieschaos.entity.EngiePocOutragedEngieEntity;
import engiegames.engieschaos.entity.EngiePocMonstrosityEngieEntity;
import engiegames.engieschaos.entity.EngiePocMadEngieEntity;
import engiegames.engieschaos.entity.EngiePocHostileBiblicallyAccurateEngieEntity;
import engiegames.engieschaos.entity.EngiePocEnragedEngieEntity;
import engiegames.engieschaos.entity.EngiePocEngieEntity;
import engiegames.engieschaos.entity.EngiePocAngryEngieEntity;
import engiegames.engieschaos.entity.EngieGamesEntity;
import engiegames.engieschaos.entity.EngieGamesDetectiveEntity;
import engiegames.engieschaos.entity.EngiEntity;
import engiegames.engieschaos.entity.DoomsDayHostileEntity;
import engiegames.engieschaos.entity.DoomsDayEntity;
import engiegames.engieschaos.entity.DistortedEntity;
import engiegames.engieschaos.entity.DDaySpikeEntity;
import engiegames.engieschaos.entity.DDayLightningSpawnerEntity;
import engiegames.engieschaos.entity.DDayAvalancheEntity;
import engiegames.engieschaos.entity.DDAYRiftEntity;
import engiegames.engieschaos.entity.CosmicTheRealEngieGamesEntity;
import engiegames.engieschaos.entity.CosmicDeathSharkoEntity;
import engiegames.engieschaos.entity.CommonEngieEntity;
import engiegames.engieschaos.entity.ClippedbyengieEntity;
import engiegames.engieschaos.entity.BlueBurstEntity;
import engiegames.engieschaos.entity.BloodyEngieRiftedEntity;
import engiegames.engieschaos.entity.BiblicallyDeathSharkoEntity;
import engiegames.engieschaos.entity.BiblicallyAccurateEngieEntity;
import engiegames.engieschaos.entity.AprilFoolsTigerSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsRareSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsRareEngieSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsMythicSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsLegendarySharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsExoticSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsEngieSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsAlbinoSharkoEntity;
import engiegames.engieschaos.entity.AngryEngieOldRiftedEntity;
import engiegames.engieschaos.entity.AngryEngieEntity;
import engiegames.engieschaos.entity.AngryDeathSharkoEntity;
import engiegames.engieschaos.entity.AngryCreatorRiftedEntity;
import engiegames.engieschaos.entity.AngryCreatorEntity;
import engiegames.engieschaos.entity.AlienSharkoEntity;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngiesChaosModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EngiesChaosMod.MODID);
	public static final RegistryObject<EntityType<EngiEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<AngryCreatorEntity>> OUTRAGED_ENGIE = register("outraged_engie",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuizzetEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal2Entity>> ENRAGED_NORMAL_2 = register("enraged_normal_2",
			EntityType.Builder.<EnragedNormal2Entity>of(EnragedNormal2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal3Entity>> ENRAGED_NORMAL_3 = register("enraged_normal_3",
			EntityType.Builder.<EnragedNormal3Entity>of(EnragedNormal3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal4Entity>> ENRAGED_NORMAL_4 = register("enraged_normal_4",
			EntityType.Builder.<EnragedNormal4Entity>of(EnragedNormal4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal5Entity>> ENRAGED_NORMAL_5 = register("enraged_normal_5",
			EntityType.Builder.<EnragedNormal5Entity>of(EnragedNormal5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal6Entity>> ENRAGED_NORMAL_6 = register("enraged_normal_6",
			EntityType.Builder.<EnragedNormal6Entity>of(EnragedNormal6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal7Entity>> ENRAGED_NORMAL_7 = register("enraged_normal_7",
			EntityType.Builder.<EnragedNormal7Entity>of(EnragedNormal7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal8Entity>> ENRAGED_NORMAL_8 = register("enraged_normal_8",
			EntityType.Builder.<EnragedNormal8Entity>of(EnragedNormal8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal9Entity>> ENRAGED_NORMAL_9 = register("enraged_normal_9",
			EntityType.Builder.<EnragedNormal9Entity>of(EnragedNormal9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNTEntity>> ENRAGED_TNT = register("enraged_tnt",
			EntityType.Builder.<EnragedTNTEntity>of(EnragedTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNTEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT2Entity>> ENRAGED_TNT_2 = register("enraged_tnt_2",
			EntityType.Builder.<EnragedTNT2Entity>of(EnragedTNT2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT3Entity>> ENRAGED_TNT_3 = register("enraged_tnt_3",
			EntityType.Builder.<EnragedTNT3Entity>of(EnragedTNT3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT4Entity>> ENRAGED_TNT_4 = register("enraged_tnt_4",
			EntityType.Builder.<EnragedTNT4Entity>of(EnragedTNT4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT5Entity>> ENRAGED_TNT_5 = register("enraged_tnt_5",
			EntityType.Builder.<EnragedTNT5Entity>of(EnragedTNT5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT6Entity>> ENRAGED_TNT_6 = register("enraged_tnt_6",
			EntityType.Builder.<EnragedTNT6Entity>of(EnragedTNT6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT7Entity>> ENRAGED_TNT_7 = register("enraged_tnt_7",
			EntityType.Builder.<EnragedTNT7Entity>of(EnragedTNT7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT8Entity>> ENRAGED_TNT_8 = register("enraged_tnt_8",
			EntityType.Builder.<EnragedTNT8Entity>of(EnragedTNT8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT9Entity>> ENRAGED_TNT_9 = register("enraged_tnt_9",
			EntityType.Builder.<EnragedTNT9Entity>of(EnragedTNT9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed2Entity>> ENRAGED_SPEED_2 = register("enraged_speed_2",
			EntityType.Builder.<EnragedSpeed2Entity>of(EnragedSpeed2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed3Entity>> ENRAGED_SPEED_3 = register("enraged_speed_3",
			EntityType.Builder.<EnragedSpeed3Entity>of(EnragedSpeed3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed4Entity>> ENRAGED_SPEED_4 = register("enraged_speed_4",
			EntityType.Builder.<EnragedSpeed4Entity>of(EnragedSpeed4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed5Entity>> ENRAGED_SPEED_5 = register("enraged_speed_5",
			EntityType.Builder.<EnragedSpeed5Entity>of(EnragedSpeed5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed6Entity>> ENRAGED_SPEED_6 = register("enraged_speed_6",
			EntityType.Builder.<EnragedSpeed6Entity>of(EnragedSpeed6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed7Entity>> ENRAGED_SPEED_7 = register("enraged_speed_7",
			EntityType.Builder.<EnragedSpeed7Entity>of(EnragedSpeed7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed8Entity>> ENRAGED_SPEED_8 = register("enraged_speed_8",
			EntityType.Builder.<EnragedSpeed8Entity>of(EnragedSpeed8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed9Entity>> ENRAGED_SPEED_9 = register("enraged_speed_9",
			EntityType.Builder.<EnragedSpeed9Entity>of(EnragedSpeed9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendaryEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BiblicallyAccurateEngieEntity>> BIBLICALLY_ACCURATE_ENGIE = register("biblically_accurate_engie",
			EntityType.Builder.<BiblicallyAccurateEngieEntity>of(BiblicallyAccurateEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<MonstrosityEngieEntity>> MONSTROSITY_ENGIE = register("monstrosity_engie", EntityType.Builder.<MonstrosityEngieEntity>of(MonstrosityEngieEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<HeWhoGamesEntity>> HE_WHO_GAMES = register("he_who_games", EntityType.Builder.<HeWhoGamesEntity>of(HeWhoGamesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeWhoGamesEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<HeWhoGamesHostileEntity>> HE_WHO_GAMES_HOSTILE = register("he_who_games_hostile", EntityType.Builder.<HeWhoGamesHostileEntity>of(HeWhoGamesHostileEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeWhoGamesHostileEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityEntity>> INSANITY = register("insanity",
			EntityType.Builder.<InsanityEntity>of(InsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsanityEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<YellowLightningEntity>> YELLOW_LIGHTNING = register("yellow_lightning", EntityType.Builder.<YellowLightningEntity>of(YellowLightningEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YellowLightningEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<BlueBurstEntity>> BLUE_BURST = register("blue_burst",
			EntityType.Builder.<BlueBurstEntity>of(BlueBurstEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueBurstEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<NormalEntity>> NORMAL = register("normal",
			EntityType.Builder.<NormalEntity>of(NormalEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NormalEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<MOABEntity>> MOAB = register("moab",
			EntityType.Builder.<MOABEntity>of(MOABEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MOABEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PureInsanityEntity>> PURE_INSANITY = register("pure_insanity",
			EntityType.Builder.<PureInsanityEntity>of(PureInsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PureInsanityEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DoomsDayEntity>> DOOMS_DAY = register("dooms_day",
			EntityType.Builder.<DoomsDayEntity>of(DoomsDayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoomsDayEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SuperDoomsDayEntity>> SUPER_DOOMS_DAY = register("super_dooms_day",
			EntityType.Builder.<SuperDoomsDayEntity>of(SuperDoomsDayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuperDoomsDayEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DoomsDayHostileEntity>> DOOMS_DAY_HOSTILE = register("dooms_day_hostile",
			EntityType.Builder.<DoomsDayHostileEntity>of(DoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DoomsDayHostileEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SuperDoomsDayHostileEntity>> SUPER_DOOMS_DAY_HOSTILE = register("super_dooms_day_hostile",
			EntityType.Builder.<SuperDoomsDayHostileEntity>of(SuperDoomsDayHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SuperDoomsDayHostileEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<TheEndEntity>> THE_END = register("the_end",
			EntityType.Builder.<TheEndEntity>of(TheEndEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheEndEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<TheEndHostileEntity>> THE_END_HOSTILE = register("the_end_hostile",
			EntityType.Builder.<TheEndHostileEntity>of(TheEndHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheEndHostileEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesDetectiveEntity>> ENGIE_GAMES_DETECTIVE = register("engie_games_detective",
			EntityType.Builder.<EngieGamesDetectiveEntity>of(EngieGamesDetectiveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesDetectiveEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngieGamesEntity>> ENGIE_GAMES = register("engie_games",
			EntityType.Builder.<EngieGamesEntity>of(EngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DDayLightningSpawnerEntity>> D_DAY_LIGHTNING_SPAWNER = register("d_day_lightning_spawner", EntityType.Builder.<DDayLightningSpawnerEntity>of(DDayLightningSpawnerEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DDayLightningSpawnerEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<DDAYRiftEntity>> DDAY_RIFT = register("dday_rift",
			EntityType.Builder.<DDAYRiftEntity>of(DDAYRiftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DDAYRiftEntity::new).fireImmune().sized(4f, 0.1f));
	public static final RegistryObject<EntityType<EnragedEngieOldRiftedEntity>> ENRAGED_ENGIE_OLD_RIFTED = register("enraged_engie_old_rifted",
			EntityType.Builder.<EnragedEngieOldRiftedEntity>of(EnragedEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EnragedEngieOldRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MadEngieOldRiftedEntity>> MAD_ENGIE_OLD_RIFTED = register("mad_engie_old_rifted",
			EntityType.Builder.<MadEngieOldRiftedEntity>of(MadEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieOldRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryEngieOldRiftedEntity>> ANGRY_ENGIE_OLD_RIFTED = register("angry_engie_old_rifted",
			EntityType.Builder.<AngryEngieOldRiftedEntity>of(AngryEngieOldRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieOldRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryCreatorRiftedEntity>> ANGRY_CREATOR_RIFTED = register("angry_creator_rifted",
			EntityType.Builder.<AngryCreatorRiftedEntity>of(AngryCreatorRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BloodyEngieRiftedEntity>> BLOODY_ENGIE_RIFTED = register("bloody_engie_rifted",
			EntityType.Builder.<BloodyEngieRiftedEntity>of(BloodyEngieRiftedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodyEngieRiftedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MindscapeEngieEntity>> MINDSCAPE_ENGIE = register("mindscape_engie", EntityType.Builder.<MindscapeEngieEntity>of(MindscapeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MindscapeEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DistortedEntity>> DISTORTED = register("distorted", EntityType.Builder.<DistortedEntity>of(DistortedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(500)
			.setUpdateInterval(3).setCustomClientFactory(DistortedEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<TheRealEngieGamesEntity>> THE_REAL_ENGIE_GAMES = register("the_real_engie_games",
			EntityType.Builder.<TheRealEngieGamesEntity>of(TheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheRealEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ScorchedEntity>> SCORCHED = register("scorched",
			EntityType.Builder.<ScorchedEntity>of(ScorchedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScorchedEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ThrowbackSharkoEntity>> THROWBACK_SHARKO = register("throwback_sharko",
			EntityType.Builder.<ThrowbackSharkoEntity>of(ThrowbackSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<WormholeEngieEntity>> WORMHOLE_ENGIE = register("wormhole_engie", EntityType.Builder.<WormholeEngieEntity>of(WormholeEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(WormholeEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<RoughianTheRealEngieGamesEntity>> ROUGHIAN_THE_REAL_ENGIE_GAMES = register("roughian_the_real_engie_games",
			EntityType.Builder.<RoughianTheRealEngieGamesEntity>of(RoughianTheRealEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RoughianTheRealEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<CosmicTheRealEngieGamesEntity>> COSMIC_THE_REAL_ENGIE_GAMES = register("cosmic_the_real_engie_games",
			EntityType.Builder.<CosmicTheRealEngieGamesEntity>of(CosmicTheRealEngieGamesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CosmicTheRealEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ThrowbackMadEngieEntity>> THROWBACK_MAD_ENGIE = register("throwback_mad_engie",
			EntityType.Builder.<ThrowbackMadEngieEntity>of(ThrowbackMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackMadEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackAngryEngieEntity>> THROWBACK_ANGRY_ENGIE = register("throwback_angry_engie",
			EntityType.Builder.<ThrowbackAngryEngieEntity>of(ThrowbackAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackAngryEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackEnragedEngieEntity>> THROWBACK_ENRAGED_ENGIE = register("throwback_enraged_engie",
			EntityType.Builder.<ThrowbackEnragedEngieEntity>of(ThrowbackEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ThrowbackEnragedEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackAngryCreatorEntity>> THROWBACK_ANGRY_CREATOR = register("throwback_angry_creator",
			EntityType.Builder.<ThrowbackAngryCreatorEntity>of(ThrowbackAngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ThrowbackAngryCreatorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackEngiEntity>> THROWBACK_ENGI = register("throwback_engi",
			EntityType.Builder.<ThrowbackEngiEntity>of(ThrowbackEngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackEngiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThrowbackCreatorEntity>> THROWBACK_CREATOR = register("throwback_creator",
			EntityType.Builder.<ThrowbackCreatorEntity>of(ThrowbackCreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThrowbackCreatorEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<HostileBiblicallyAccurateEngieEntity>> HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("hostile_biblically_accurate_engie",
			EntityType.Builder.<HostileBiblicallyAccurateEngieEntity>of(HostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<PunisherEntity>> PUNISHER = register("punisher", EntityType.Builder.<PunisherEntity>of(PunisherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024)
			.setUpdateInterval(3).setCustomClientFactory(PunisherEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<TheRealEngieGamesHalloweenEntity>> THE_REAL_ENGIE_GAMES_HALLOWEEN = register("the_real_engie_games_halloween",
			EntityType.Builder.<TheRealEngieGamesHalloweenEntity>of(TheRealEngieGamesHalloweenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(TheRealEngieGamesHalloweenEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ShadowSharkEngieEntity>> SHADOW_SHARK_ENGIE = register("shadow_shark_engie", EntityType.Builder.<ShadowSharkEngieEntity>of(ShadowSharkEngieEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowSharkEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ShadowSharkEngieBlindEntity>> SHADOW_SHARK_ENGIE_BLIND = register("shadow_shark_engie_blind", EntityType.Builder.<ShadowSharkEngieBlindEntity>of(ShadowSharkEngieBlindEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowSharkEngieBlindEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<ClippedbyengieEntity>> CLIPPEDBYENGIE = register("clippedbyengie",
			EntityType.Builder.<ClippedbyengieEntity>of(ClippedbyengieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClippedbyengieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareEnragedEngieEntity>> NIGHTMARE_ENRAGED_ENGIE = register("nightmare_enraged_engie",
			EntityType.Builder.<NightmareEnragedEngieEntity>of(NightmareEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareMadEngieEntity>> NIGHTMARE_MAD_ENGIE = register("nightmare_mad_engie",
			EntityType.Builder.<NightmareMadEngieEntity>of(NightmareMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NightmareMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareAngryEngieEntity>> NIGHTMARE_ANGRY_ENGIE = register("nightmare_angry_engie",
			EntityType.Builder.<NightmareAngryEngieEntity>of(NightmareAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareOutragedEngieEntity>> NIGHTMARE_OUTRAGED_ENGIE = register("nightmare_outraged_engie",
			EntityType.Builder.<NightmareOutragedEngieEntity>of(NightmareOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareMonstrosityEngieEntity>> NIGHTMARE_MONSTROSITY_ENGIE = register("nightmare_monstrosity_engie",
			EntityType.Builder.<NightmareMonstrosityEngieEntity>of(NightmareMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareHostileBiblicallyAccurateEngieEntity>> NIGHTMARE_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("nightmare_hostile_biblically_accurate_engie",
			EntityType.Builder.<NightmareHostileBiblicallyAccurateEngieEntity>of(NightmareHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(NightmareHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityMadEngieEntity>> INSANITY_MAD_ENGIE = register("insanity_mad_engie",
			EntityType.Builder.<InsanityMadEngieEntity>of(InsanityMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(InsanityMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityAngryEngieEntity>> INSANITY_ANGRY_ENGIE = register("insanity_angry_engie",
			EntityType.Builder.<InsanityAngryEngieEntity>of(InsanityAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(InsanityAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityEnragedEngieEntity>> INSANITY_ENRAGED_ENGIE = register("insanity_enraged_engie",
			EntityType.Builder.<InsanityEnragedEngieEntity>of(InsanityEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityOutragedEngieEntity>> INSANITY_OUTRAGED_ENGIE = register("insanity_outraged_engie",
			EntityType.Builder.<InsanityOutragedEngieEntity>of(InsanityOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityMonstrosityEngieEntity>> INSANITY_MONSTROSITY_ENGIE = register("insanity_monstrosity_engie",
			EntityType.Builder.<InsanityMonstrosityEngieEntity>of(InsanityMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareEngieEntity>> NIGHTMARE_ENGIE = register("nightmare_engie",
			EntityType.Builder.<NightmareEngieEntity>of(NightmareEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NightmareEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityEngieEntity>> INSANITY_ENGIE = register("insanity_engie",
			EntityType.Builder.<InsanityEngieEntity>of(InsanityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(InsanityEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<InsanityHostileBiblicallyAccurateEngieEntity>> INSANITY_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("insanity_hostile_biblically_accurate_engie",
			EntityType.Builder.<InsanityHostileBiblicallyAccurateEngieEntity>of(InsanityHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3)
					.setCustomClientFactory(InsanityHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<HsotileEngieEntity>> HOSTILE_ENGIE = register("hostile_engie",
			EntityType.Builder.<HsotileEngieEntity>of(HsotileEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HsotileEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoEntity>> EPIC_SHARKO = register("epic_sharko",
			EntityType.Builder.<EpicSharkoEntity>of(EpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareEngieSharkoEntity>> RARE_ENGIE_SHARKO = register("rare_engie_sharko",
			EntityType.Builder.<RareEngieSharkoEntity>of(RareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<TigerSharkoEntity>> TIGER_SHARKO = register("tiger_sharko",
			EntityType.Builder.<TigerSharkoEntity>of(TigerSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlienSharkoEntity>> ALIEN_SHARKO = register("alien_sharko",
			EntityType.Builder.<AlienSharkoEntity>of(AlienSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlienSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AngryDeathSharkoEntity>> ANGRY_DEATH_SHARKO = register("angry_death_sharko",
			EntityType.Builder.<AngryDeathSharkoEntity>of(AngryDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EnragedDeathSharkoEntity>> ENRAGED_DEATH_SHARKO = register("enraged_death_sharko",
			EntityType.Builder.<EnragedDeathSharkoEntity>of(EnragedDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<OutragedDeathSharkoEntity>> OUTRAGED_DEATH_SHARKO = register("outraged_death_sharko",
			EntityType.Builder.<OutragedDeathSharkoEntity>of(OutragedDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OutragedDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<BiblicallyDeathSharkoEntity>> BIBLICALLY_DEATH_SHARKO = register("biblically_death_sharko",
			EntityType.Builder.<BiblicallyDeathSharkoEntity>of(BiblicallyDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BiblicallyDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MonstrosityDeathSharkoEntity>> MONSTROSITY_DEATH_SHARKO = register("monstrosity_death_sharko",
			EntityType.Builder.<MonstrosityDeathSharkoEntity>of(MonstrosityDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MonstrosityDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<CosmicDeathSharkoEntity>> COSMIC_DEATH_SHARKO = register("cosmic_death_sharko",
			EntityType.Builder.<CosmicDeathSharkoEntity>of(CosmicDeathSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmicDeathSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<OMENEntity>> OMEN = register("omen",
			EntityType.Builder.<OMENEntity>of(OMENEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OMENEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<DDaySpikeEntity>> D_DAY_SPIKE = register("d_day_spike", EntityType.Builder.<DDaySpikeEntity>of(DDaySpikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(DDaySpikeEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<DDayAvalancheEntity>> D_DAY_AVALANCHE = register("d_day_avalanche", EntityType.Builder.<DDayAvalancheEntity>of(DDayAvalancheEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DDayAvalancheEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<AprilFoolsSharkoEntity>> APRIL_FOOLS_SHARKO = register("april_fools_sharko",
			EntityType.Builder.<AprilFoolsSharkoEntity>of(AprilFoolsSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AprilFoolsSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsAlbinoSharkoEntity>> APRIL_FOOLS_ALBINO_SHARKO = register("april_fools_albino_sharko",
			EntityType.Builder.<AprilFoolsAlbinoSharkoEntity>of(AprilFoolsAlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsAlbinoSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsRareSharkoEntity>> APRIL_FOOLS_RARE_SHARKO = register("april_fools_rare_sharko",
			EntityType.Builder.<AprilFoolsRareSharkoEntity>of(AprilFoolsRareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsRareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsLegendarySharkoEntity>> APRIL_FOOLS_LEGENDARY_SHARKO = register("april_fools_legendary_sharko",
			EntityType.Builder.<AprilFoolsLegendarySharkoEntity>of(AprilFoolsLegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsLegendarySharkoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AprilFoolsMythicSharkoEntity>> APRIL_FOOLS_MYTHIC_SHARKO = register("april_fools_mythic_sharko",
			EntityType.Builder.<AprilFoolsMythicSharkoEntity>of(AprilFoolsMythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsMythicSharkoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AprilFoolsExoticSharkoEntity>> APRIL_FOOLS_EXOTIC_SHARKO = register("april_fools_exotic_sharko",
			EntityType.Builder.<AprilFoolsExoticSharkoEntity>of(AprilFoolsExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsEngieSharkoEntity>> APRIL_FOOLS_ENGIE_SHARKO = register("april_fools_engie_sharko",
			EntityType.Builder.<AprilFoolsEngieSharkoEntity>of(AprilFoolsEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsRareEngieSharkoEntity>> APRIL_FOOLS_RARE_ENGIE_SHARKO = register("april_fools_rare_engie_sharko",
			EntityType.Builder.<AprilFoolsRareEngieSharkoEntity>of(AprilFoolsRareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsRareEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AprilFoolsTigerSharkoEntity>> APRIL_FOOLS_TIGER_SHARKO = register("april_fools_tiger_sharko",
			EntityType.Builder.<AprilFoolsTigerSharkoEntity>of(AprilFoolsTigerSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AprilFoolsTigerSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<UncommonSharkoEntity>> UNCOMMON_SHARKO = register("uncommon_sharko",
			EntityType.Builder.<UncommonSharkoEntity>of(UncommonSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<XEngieGamesEntity>> X_ENGIE_GAMES = register("x_engie_games",
			EntityType.Builder.<XEngieGamesEntity>of(XEngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(XEngieGamesEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<RiftBallEntity>> RIFT_BALL = register("rift_ball",
			EntityType.Builder.<RiftBallEntity>of(RiftBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RiftBallEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<WormholeSharkoEntity>> WORMHOLE_SHARKO = register("wormhole_sharko", EntityType.Builder.<WormholeSharkoEntity>of(WormholeSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WormholeSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<GlitchSharkoEntity>> GLITCH_SHARKO = register("glitch_sharko", EntityType.Builder.<GlitchSharkoEntity>of(GlitchSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlitchSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<XEngieSharkoEntity>> X_ENGIE_SHARKO = register("x_engie_sharko", EntityType.Builder.<XEngieSharkoEntity>of(XEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XEngieSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngiePocMadEngieEntity>> ENGIE_POC_MAD_ENGIE = register("engie_poc_mad_engie",
			EntityType.Builder.<EngiePocMadEngieEntity>of(EngiePocMadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(EngiePocMadEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocAngryEngieEntity>> ENGIE_POC_ANGRY_ENGIE = register("engie_poc_angry_engie",
			EntityType.Builder.<EngiePocAngryEngieEntity>of(EngiePocAngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(EngiePocAngryEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocEnragedEngieEntity>> ENGIE_POC_ENRAGED_ENGIE = register("engie_poc_enraged_engie",
			EntityType.Builder.<EngiePocEnragedEngieEntity>of(EngiePocEnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocEnragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocOutragedEngieEntity>> ENGIE_POC_OUTRAGED_ENGIE = register("engie_poc_outraged_engie",
			EntityType.Builder.<EngiePocOutragedEngieEntity>of(EngiePocOutragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocOutragedEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocMonstrosityEngieEntity>> ENGIE_POC_MONSTROSITY_ENGIE = register("engie_poc_monstrosity_engie",
			EntityType.Builder.<EngiePocMonstrosityEngieEntity>of(EngiePocMonstrosityEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocMonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocHostileBiblicallyAccurateEngieEntity>> ENGIE_POC_HOSTILE_BIBLICALLY_ACCURATE_ENGIE = register("engie_poc_hostile_biblically_accurate_engie",
			EntityType.Builder.<EngiePocHostileBiblicallyAccurateEngieEntity>of(EngiePocHostileBiblicallyAccurateEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)
					.setCustomClientFactory(EngiePocHostileBiblicallyAccurateEngieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<EngiePocEngieEntity>> ENGIE_POC_ENGIE = register("engie_poc_engie",
			EntityType.Builder.<EngiePocEngieEntity>of(EngiePocEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(192).setUpdateInterval(3).setCustomClientFactory(EngiePocEngieEntity::new)

					.sized(0.6f, 1.9f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EngiEntity.init();
			MadEngieEntity.init();
			AngryEngieEntity.init();
			EnragedEngieEntity.init();
			AngryCreatorEntity.init();
			SharkoEntity.init();
			ProtogenEntity.init();
			QuizzetEntity.init();
			EnragedNormalEntity.init();
			EnragedNormal2Entity.init();
			EnragedNormal3Entity.init();
			EnragedNormal4Entity.init();
			EnragedNormal5Entity.init();
			EnragedNormal6Entity.init();
			EnragedNormal7Entity.init();
			EnragedNormal8Entity.init();
			EnragedNormal9Entity.init();
			EnragedTNTEntity.init();
			EnragedTNT2Entity.init();
			EnragedTNT3Entity.init();
			EnragedTNT4Entity.init();
			EnragedTNT5Entity.init();
			EnragedTNT6Entity.init();
			EnragedTNT7Entity.init();
			EnragedTNT8Entity.init();
			EnragedTNT9Entity.init();
			EnragedSpeedEntity.init();
			EnragedSpeed2Entity.init();
			EnragedSpeed3Entity.init();
			EnragedSpeed4Entity.init();
			EnragedSpeed5Entity.init();
			EnragedSpeed6Entity.init();
			EnragedSpeed7Entity.init();
			EnragedSpeed8Entity.init();
			EnragedSpeed9Entity.init();
			CommonEngieEntity.init();
			UncommonEngieEntity.init();
			RareEngieEntity.init();
			EpicEngieEntity.init();
			LegendaryEngieEntity.init();
			MythicEngieEntity.init();
			ExoticEngieEntity.init();
			BiblicallyAccurateEngieEntity.init();
			MonstrosityEngieEntity.init();
			HeWhoGamesEntity.init();
			HeWhoGamesHostileEntity.init();
			InsanityEntity.init();
			YellowLightningEntity.init();
			BlueBurstEntity.init();
			NormalEntity.init();
			MOABEntity.init();
			PureInsanityEntity.init();
			DoomsDayEntity.init();
			SuperDoomsDayEntity.init();
			DoomsDayHostileEntity.init();
			SuperDoomsDayHostileEntity.init();
			TheEndEntity.init();
			TheEndHostileEntity.init();
			EngieGamesDetectiveEntity.init();
			EngieGamesEntity.init();
			DDayLightningSpawnerEntity.init();
			DDAYRiftEntity.init();
			EnragedEngieOldRiftedEntity.init();
			MadEngieOldRiftedEntity.init();
			AngryEngieOldRiftedEntity.init();
			AngryCreatorRiftedEntity.init();
			BloodyEngieRiftedEntity.init();
			MindscapeEngieEntity.init();
			DistortedEntity.init();
			TheRealEngieGamesEntity.init();
			ScorchedEntity.init();
			ThrowbackSharkoEntity.init();
			WormholeEngieEntity.init();
			RoughianTheRealEngieGamesEntity.init();
			CosmicTheRealEngieGamesEntity.init();
			ThrowbackMadEngieEntity.init();
			ThrowbackAngryEngieEntity.init();
			ThrowbackEnragedEngieEntity.init();
			ThrowbackAngryCreatorEntity.init();
			ThrowbackEngiEntity.init();
			ThrowbackCreatorEntity.init();
			HostileBiblicallyAccurateEngieEntity.init();
			PunisherEntity.init();
			TheRealEngieGamesHalloweenEntity.init();
			ShadowSharkEngieEntity.init();
			ShadowSharkEngieBlindEntity.init();
			ClippedbyengieEntity.init();
			NightmareEnragedEngieEntity.init();
			NightmareMadEngieEntity.init();
			NightmareAngryEngieEntity.init();
			NightmareOutragedEngieEntity.init();
			NightmareMonstrosityEngieEntity.init();
			NightmareHostileBiblicallyAccurateEngieEntity.init();
			InsanityMadEngieEntity.init();
			InsanityAngryEngieEntity.init();
			InsanityEnragedEngieEntity.init();
			InsanityOutragedEngieEntity.init();
			InsanityMonstrosityEngieEntity.init();
			NightmareEngieEntity.init();
			InsanityEngieEntity.init();
			InsanityHostileBiblicallyAccurateEngieEntity.init();
			HsotileEngieEntity.init();
			RareSharkoEntity.init();
			EpicSharkoEntity.init();
			LegendarySharkoEntity.init();
			MythicSharkoEntity.init();
			ExoticSharkoEntity.init();
			EngieSharkoEntity.init();
			RareEngieSharkoEntity.init();
			TigerSharkoEntity.init();
			AlienSharkoEntity.init();
			AngryDeathSharkoEntity.init();
			EnragedDeathSharkoEntity.init();
			OutragedDeathSharkoEntity.init();
			BiblicallyDeathSharkoEntity.init();
			MonstrosityDeathSharkoEntity.init();
			CosmicDeathSharkoEntity.init();
			OMENEntity.init();
			DDaySpikeEntity.init();
			DDayAvalancheEntity.init();
			AprilFoolsSharkoEntity.init();
			AprilFoolsAlbinoSharkoEntity.init();
			AprilFoolsRareSharkoEntity.init();
			AprilFoolsLegendarySharkoEntity.init();
			AprilFoolsMythicSharkoEntity.init();
			AprilFoolsExoticSharkoEntity.init();
			AprilFoolsEngieSharkoEntity.init();
			AprilFoolsRareEngieSharkoEntity.init();
			AprilFoolsTigerSharkoEntity.init();
			UncommonSharkoEntity.init();
			XEngieGamesEntity.init();
			RiftBallEntity.init();
			WormholeSharkoEntity.init();
			GlitchSharkoEntity.init();
			XEngieSharkoEntity.init();
			EngiePocMadEngieEntity.init();
			EngiePocAngryEngieEntity.init();
			EngiePocEnragedEngieEntity.init();
			EngiePocOutragedEngieEntity.init();
			EngiePocMonstrosityEngieEntity.init();
			EngiePocHostileBiblicallyAccurateEngieEntity.init();
			EngiePocEngieEntity.init();
		});
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