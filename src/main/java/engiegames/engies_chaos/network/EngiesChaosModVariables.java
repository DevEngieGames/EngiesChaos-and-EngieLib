package engiegames.engies_chaos.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngiesChaosModVariables {
	public static boolean decembercodeblock = true;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		EngiesChaosMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.RiftX = original.RiftX;
			clone.RiftY = original.RiftY;
			clone.RiftZ = original.RiftZ;
			clone.MonstrosityEngieKillCount = original.MonstrosityEngieKillCount;
			clone.PureInsanityKillCount = original.PureInsanityKillCount;
			clone.dashleftclickcount = original.dashleftclickcount;
			clone.AngryEngieKillCount = original.AngryEngieKillCount;
			clone.browniescount = original.browniescount;
			clone.cheeseballcount = original.cheeseballcount;
			clone.EnragedEngieKillCount = original.EnragedEngieKillCount;
			clone.InsanityKillCount = original.InsanityKillCount;
			clone.MadEngieKillCount = original.MadEngieKillCount;
			clone.OutragedEngieKillCount = original.OutragedEngieKillCount;
			clone.PlayerX = original.PlayerX;
			clone.PlayerY = original.PlayerY;
			clone.PlayerZ = original.PlayerZ;
			clone.pageNumber = original.pageNumber;
			clone.TrueHardcoreLifeCount = original.TrueHardcoreLifeCount;
			clone.HHGLookX = original.HHGLookX;
			clone.HHGLookY = original.HHGLookY;
			clone.HHGLookZ = original.HHGLookZ;
			clone.difficultyoverlaytoggle = original.difficultyoverlaytoggle;
			clone.doublejumpcount = original.doublejumpcount;
			clone.engiegameshallowscythestatclock = original.engiegameshallowscythestatclock;
			clone.TrueHardcoreMaxLifeCount = original.TrueHardcoreMaxLifeCount;
			clone.TrueHardcoreLifeChangeAmount = original.TrueHardcoreLifeChangeAmount;
			clone.CountUntilBaseDrop = original.CountUntilBaseDrop;
			clone.lightningflashnum = original.lightningflashnum;
			clone.PlayerDeathX = original.PlayerDeathX;
			clone.PlayerDeathY = original.PlayerDeathY;
			clone.PlayerDeathZ = original.PlayerDeathZ;
			clone.riftspawnoneentity = original.riftspawnoneentity;
			clone.DoomsdayAlive = original.DoomsdayAlive;
			clone.BlockDeathAliveCOunt = original.BlockDeathAliveCOunt;
			clone.coderedeemblock = original.coderedeemblock;
			clone.GoodLuck = original.GoodLuck;
			clone.healthreductiondday = original.healthreductiondday;
			clone.playerready = original.playerready;
			clone.SharkoRetryState = original.SharkoRetryState;
			clone.timeoverlaytoggle = original.timeoverlaytoggle;
			clone.crucifixsavedentity = original.crucifixsavedentity;
			clone.WelcomeBackToggle = original.WelcomeBackToggle;
			clone.MaxPercentGiveOptionToDoHardestMobDiff = original.MaxPercentGiveOptionToDoHardestMobDiff;
			clone.playerstunnedmobs = original.playerstunnedmobs;
			clone.DoomsdayTrackToggle = original.DoomsdayTrackToggle;
			clone.DoomsdayRiskTrackToggle = original.DoomsdayRiskTrackToggle;
			clone.sharkolayingstate = original.sharkolayingstate;
			clone.recipebookantimattercraftstoggle = original.recipebookantimattercraftstoggle;
			clone.dashtoggle = original.dashtoggle;
			clone.SharkoLayCD = original.SharkoLayCD;
			clone.SharkoSleepCD = original.SharkoSleepCD;
			clone.SharkoLayOnSideCD = original.SharkoLayOnSideCD;
			clone.SharkoSitCD = original.SharkoSitCD;
			clone.playerattackbackstabblock = original.playerattackbackstabblock;
			clone.entityabletodespawn = original.entityabletodespawn;
			clone.BlindShadowSharkEngieAttack = original.BlindShadowSharkEngieAttack;
			clone.playerstunned = original.playerstunned;
			clone.playerdebugmode = original.playerdebugmode;
			clone.playerhasimmunity = original.playerhasimmunity;
			clone.truehardcorelifesobtained = original.truehardcorelifesobtained;
			clone.boyoaprilfoolslaycheck = original.boyoaprilfoolslaycheck;
			clone.PlayerHasEngieGamesSwordAdvancement = original.PlayerHasEngieGamesSwordAdvancement;
			clone.PlayerHasAntimatterEngieGamesSwordAdvancement = original.PlayerHasAntimatterEngieGamesSwordAdvancement;
			clone.PlayerHas101PercentAdvancement = original.PlayerHas101PercentAdvancement;
			clone.crucifixbypass = original.crucifixbypass;
			clone.hphudtoggle = original.hphudtoggle;
			clone.HostileBiblicallyKillCount = original.HostileBiblicallyKillCount;
			clone.HostileEngieKillCount = original.HostileEngieKillCount;
			clone.madplushesobtained = original.madplushesobtained;
			clone.angryplushesobtained = original.angryplushesobtained;
			clone.enragedplushesobtained = original.enragedplushesobtained;
			clone.outragedplushesobtained = original.outragedplushesobtained;
			clone.biblicallyplushesobtained = original.biblicallyplushesobtained;
			clone.monstrosityplushesobtained = original.monstrosityplushesobtained;
			clone.hostileplushesobtained = original.hostileplushesobtained;
			clone.insanityplushesobtained = original.insanityplushesobtained;
			clone.playercountedtoplayercount = original.playercountedtoplayercount;
			clone.diffadvancement1 = original.diffadvancement1;
			clone.diffadvancement2 = original.diffadvancement2;
			clone.diffadvancement3 = original.diffadvancement3;
			clone.diffadvancement4 = original.diffadvancement4;
			clone.diffadvancement5 = original.diffadvancement5;
			clone.diffadvancement6 = original.diffadvancement6;
			clone.diffadvancement7 = original.diffadvancement7;
			clone.diffadvancement8 = original.diffadvancement8;
			clone.diffadvancement9 = original.diffadvancement9;
			clone.diffadvancement10 = original.diffadvancement10;
			clone.diffadvancement11 = original.diffadvancement11;
			clone.diffadvancement12 = original.diffadvancement12;
			clone.diffadvancement13 = original.diffadvancement13;
			clone.diffadvancement14 = original.diffadvancement14;
			clone.diffadvancement15 = original.diffadvancement15;
			clone.diffadvancement16 = original.diffadvancement16;
			clone.diffadvancement17 = original.diffadvancement17;
			clone.diffadvancement18 = original.diffadvancement18;
			clone.diffadvancement19 = original.diffadvancement19;
			clone.diffadvancement20 = original.diffadvancement20;
			clone.diffadvancement21 = original.diffadvancement21;
			clone.diffadvancement22 = original.diffadvancement22;
			clone.diffadvancement23 = original.diffadvancement23;
			clone.diffadvancement24 = original.diffadvancement24;
			clone.diffadvancement25 = original.diffadvancement25;
			clone.diffadvancement26 = original.diffadvancement26;
			clone.diffadvancement27 = original.diffadvancement27;
			clone.diffadvancement28 = original.diffadvancement28;
			clone.diffadvancement29 = original.diffadvancement29;
			clone.diffadvancement30 = original.diffadvancement30;
			clone.diffadvancement31 = original.diffadvancement31;
			clone.diffadvancement32 = original.diffadvancement32;
			clone.ddayplayeraddedtodeadcount = original.ddayplayeraddedtodeadcount;
			clone.doublejumping = original.doublejumping;
			clone.CrucifixMainHandDurabilityPercentage = original.CrucifixMainHandDurabilityPercentage;
			clone.CrucifixOffHandDurabilityPercentage = original.CrucifixOffHandDurabilityPercentage;
			clone.pickaxeonly = original.pickaxeonly;
			if (!event.isWasDeath()) {
				clone.firstplay = original.firstplay;
				clone.RespawnNormInstantHealth = original.RespawnNormInstantHealth;
				clone.RespawnTrueHardcoreGraceStart = original.RespawnTrueHardcoreGraceStart;
				clone.missileyellowlightningscale = original.missileyellowlightningscale;
				clone.missileblueburstscale = original.missileblueburstscale;
				clone.missilenormalscale = original.missilenormalscale;
				clone.missilemoabscale = original.missilemoabscale;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "engies_chaos_worldvars";
		public boolean yeah = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			yeah = nbt.getBoolean("yeah");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("yeah", yeah);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "engies_chaos_mapvars";
		public double getdamage = 0;
		public double MobDifficulty = 0;
		public double SharkoKilledByPlayersCount = 0;
		public double playersaidyestotrymaxdiff = 0;
		public double playerobtainedbigcount = 0;
		public double playerobtainedlargecount = 0;
		public double playerobtainedhugecount = 0;
		public double playerobtainedenormouscount = 0;
		public double playerobtainedgiganticcount = 0;
		public double playerobtainedmassivecount = 0;
		public double playerobtainedbiblicallycount = 0;
		public double playerobtainedmonstrositycount = 0;
		public double playerobtaineddoomsdaycount = 0;
		public double playerobtainedsuperdoomsdaycount = 0;
		public double playerobtainedtheendcount = 0;
		public double playerobtainedengiecount = 0;
		public double playerobtainedmindscapecount = 0;
		public double playerobtainedantimatterregularcount = 0;
		public double playerobtainedantimatterbigcount = 0;
		public double playerobtainedantimatterlargecount = 0;
		public double playerobtainedantimatterhugecount = 0;
		public double playerobtainedantimatterenormouscount = 0;
		public double playerobtainedantimattergiganticcount = 0;
		public double playerobtainedantimattermassivecount = 0;
		public double playerobtainedantimatterbiblicallycount = 0;
		public double playerobtainedantimattermonstrositycount = 0;
		public double playerobtainedantimatterdoomsdaycount = 0;
		public double playerobtainedantimattersuperdoomsdaycount = 0;
		public double playerobtainedantimattertheendcount = 0;
		public double playerobtainedantimatterengiecount = 0;
		public double playerobtainedengiegamesswordcount = 0;
		public double playerobtainedantimatterengiegamessword = 0;
		public double playerobtainedantimatterminicount = 0;
		public double challengeplayerreadyupcount = 0.0;
		public double nightmare = 0.0;
		public double Risk = 0.0;
		public double timebeforespecial = 0.0;
		public double numberofdoomsdays = 0;
		public double numberofsuperdoomsdays = 0;
		public double numberoftheend = 0;
		public double numberofdistorted = 0;
		public double numberofengiegames = 0;
		public double numberofcosmicengiegames = 0;
		public double numberofroughianengiegames = 0;
		public double numberofmindscapetradeable = 0.0;
		public double FunFactNumber = 0;
		public double playerobtainedcosmicswordcount = 0;
		public double playerobtainedcollectorshallowscythe = 0;
		public double playerobtainedhallowscythecount = 0;
		public double MobDiffBeforeChallenge = 0;
		public double RX = 0;
		public double RY = 0;
		public double RZ = 0;
		public double darknessretrycooldown = 0.0;
		public double missilecooldown = 0.0;
		public double lightningcooldown = 0.0;
		public double riftcooldown = 0.0;
		public double ddaydialoguenum = 0.0;
		public double doomsdaychance = 0.01;
		public double stunmobsradiusnum = 100.0;
		public double spikecooldown = 0;
		public double avalanchecooldown = 0;
		public double apocdayonestart = 0;
		public double TimeUntilNight = 0.0;
		public double DialogueCooldownStart = 0.0;
		public double doomsdaymaxtime = 0;
		public double superdoomsdaymaxtime = 0;
		public double theendmaxtime = 0;
		public double engieswrathmaxtime = 1525.0;
		public double ddayprophnumb = 0;
		public double spikecooldownamount = 0;
		public boolean Birthday = false;
		public boolean birthdaystart = false;
		public boolean BYEBYE = false;
		public boolean ChallengeToggle = false;
		public boolean checkboxbothmarked = false;
		public boolean checkboxbothnomarked = false;
		public boolean DayCooldownToggle = false;
		public boolean DoomsdayEeriePlayOnce = false;
		public boolean DoomsdayStart = false;
		public boolean GOODBYE = false;
		public boolean hewhowatches = false;
		public boolean HHGkilledtoggle = false;
		public boolean itemswap1 = false;
		public boolean itemswap2 = false;
		public boolean madlads = false;
		public boolean multiplayertrophyobtained = false;
		public boolean OHBOY = true;
		public boolean OHNO = false;
		public boolean seasonautumn = false;
		public boolean seasonspring = false;
		public boolean seasonsummer = false;
		public boolean seasonwinter = false;
		public boolean SuperDoomsdayStart = false;
		public boolean TheEndStart = false;
		public boolean timecheckstop = false;
		public boolean antimatterdropcheck = false;
		public boolean detectedothermodesenabledthrowback = false;
		public boolean graceperiodbeforeplushangryagain = false;
		public boolean riskcooldown = true;
		public boolean CosmicEngieGamesSpawnLock = true;
		public boolean CosmicEngieGamesDespawnLock = true;
		public boolean FallingTreeInstalled = false;
		public boolean VeinMinerInstalled = false;
		public boolean ShowObjectiveOverlay = false;
		public boolean solotrophyobtained = false;
		public boolean difficultytoggle = true;
		public boolean EngiesWrathStart = false;
		public boolean truehardcoreenabledonworld = false;
		public boolean specialhealth = false;
		public boolean playlightningsound = false;
		public boolean playriftsound = false;
		public boolean playlightningsound2 = false;
		public boolean playlightningcornersound = false;
		public boolean ddayscornerlightning = false;
		public boolean playlightningsound3 = false;
		public boolean playlightningsound4 = false;
		public boolean DDAYCleanup = false;
		public boolean playlightningsound5 = false;
		public boolean playmissilespawnsound = false;
		public boolean playmissileexplosionsound = false;
		public boolean shadowsharkdevspawn = false;
		public boolean DayCheck = false;
		public boolean NightCheck = false;
		public boolean churchbellsnorm = false;
		public boolean churchbellsewrath = false;
		public boolean ddaymainsongplay = false;
		public boolean ddaydialogue = false;
		public boolean ddayaltsongplay = false;
		public boolean ddayavalanche = false;
		public boolean ddayawardadvancement1 = false;
		public boolean ddayawardadvancement2 = false;
		public boolean ddayhappened = false;
		public boolean sddayhappened = false;
		public boolean theendhappened = false;
		public boolean ewrathhappened = false;
		public boolean stopeeriesound = false;
		public boolean ddayprophshow = false;
		public boolean firstplayofaltsoundtrack = false;
		public boolean doomsdayprophwait = false;
		public boolean despawnspike = false;
		public boolean despawnava = false;
		public double DDayAvalancheAmount = 0;
		public double DDaySpikeAmount = 0;
		public double DDayMissileAmount = 0;
		public double DDayRiftAmount = 0;
		public double engiepocgraceperiod = 0.0;
		public boolean rangraceperiodcount = true;
		public boolean EngiePocSpawnedHelper = false;
		public boolean heavylightningenabled = false;
		public boolean extremelightningenabled = false;
		public boolean extremeddaylightningenabled = false;
		public double heavylightningcd = 0;
		public double extremelightningcd = 0;
		public double riskcooldownnumb = 0;
		public double DDayRiftedEntityCount = 0.0;
		public double wormholesharkorandnum = 0;
		public double glitchsharkorandnum = 0;
		public double xengiesharkorandnum = 0;
		public boolean wormholesharkoabletospawn = false;
		public boolean glitchsharkoabletospawn = false;
		public boolean xengiesharkoabletospawn = false;
		public double timerforextremelyraresharko = 0;
		public boolean engiepoctruehardest = false;
		public double engiepoctruehardest20mincount = 0;
		public double engiepoctruehardesttimemult = 0;
		public boolean doomssentdebug1 = false;
		public boolean doomssentdebug2 = false;
		public double ddaytimerminutes = 0;
		public double ddaytimerseconds = 0;
		public double sddaytimerminutes = 0;
		public double sddaytimerseconds = 0;
		public double theendtimerminutes = 0;
		public double theendtimerseconds = 0;
		public double ewrathtimerminutes = 0;
		public double ewrathtimerseconds = 0;
		public double timeticks = 0;
		public double engiepoctime = 18000.0;
		public double totalplayersinworld = 0;
		public double ddayplayeralivecount = 0;
		public double ddayplayerdeadcount = 0;
		public boolean TraderDoomsdaySpawnLock = false;
		public boolean TraderSuperDoomsdaySpawnLock = false;
		public boolean TraderTheEndSpawnLock = false;
		public boolean TraderEngieSpawnLock = false;
		public boolean TraderMindscapeEngieSpawnLock = false;
		public boolean TraderEngieGamesSpawnLock = false;
		public boolean TraderCosmicEngieGamesSpawnLock = false;
		public boolean TraderRoughianEngieGamesSpawnLock = false;
		public double ticktimerentitycheck = 0;
		public double ddayprophnormhordenumb = 0;
		public double ddayprophnightmarehordenumb = 0;
		public double ddayprophinsanityhordenumb = 0;
		public double ddayprophengiepochordenumb = 0;
		public String userids = "";
		public double hordecooldown = 0;
		public double previoustime = 0;
		public double forecastdialogue = 0;
		public boolean hordespawnstoggle = false;
		public double tradertimercounttick = 0;
		public boolean traderneedcount = false;
		public double random25minutetimer = 0;
		public boolean mobbasehpmulttoggle = false;
		public boolean engiestruewrath = false;
		public boolean resetpickaxeonlycount = false;
		public boolean ddayoncleanup = false;
		public boolean ddaystoptimer = true;
		public double doomsdaycleanuptimer = 0;
		public boolean DoomsdayNightTime = false;
		public boolean DoomsdayDialogueDelay = true;
		public double DoomsdayDialogueDelayTimer = 0;
		public double DoomsdayNightTimeDelayTimer = 0;
		public double DoomsdayHalf = 1.0;
		public double DoomsdayDialogueTimer = 0;
		public double ProphecyShowTimer = 0;
		public double ProphecyDisasterRevealTimer = 0;
		public double ProphecyTimerTotal = 0;
		public boolean prophallowticking = false;
		public boolean DoomsdayFullStart = false;
		public double TimeBeforeNextDialogue = 0;
		public double TimeBeforeDialogueDisappear = 0;
		public double DialogueDisappearTimer = 0;
		public double dialogueamount = 0;
		public boolean pausedialogue = false;
		public boolean StartDoomsdayBeginning = false;
		public boolean DoomsdayEerie = false;
		public double DoomsdayTeleportTime = 0;
		public boolean DoomsdayTeleportedPlayers = false;
		public boolean SuperDoomsdayNightTime = false;
		public boolean SuperDoomsdayDialogueDelay = true;
		public double SuperDoomsdayDialogueDelayTimer = 0;
		public double SuperDoomsdayNightTimeDelayTimer = 0;
		public double SuperDoomsdayDialogueTimer = 0;
		public boolean SuperDoomsdayFullStart = false;
		public double SuperDoomsdayTimeBeforeNextDialogue = 0;
		public double SuperDoomsdayTimeBeforeDialogueDisappear = 0;
		public double SuperDoomsdayDialogueDisappearTimer = 0;
		public boolean StartSuperDoomsdayBeginning = false;
		public boolean SuperDoomsdayEerie = false;
		public double SuperDoomsdayTeleportTime = 0;
		public boolean SuperDoomsdayTeleportedPlayers = false;
		public boolean TheEndNightTime = false;
		public boolean TheEndDialogueDelay = true;
		public double TheEndDialogueDelayTimer = 0;
		public double TheEndNightTimeDelayTimer = 0;
		public double TheEndDialogueTimer = 0;
		public boolean TheEndFullStart = false;
		public double TheEndTimeBeforeNextDialogue = 0;
		public double TheEndTimeBeforeDialogueDisappear = 0;
		public double TheEndDialogueDisappearTimer = 0;
		public boolean StartTheEndBeginning = false;
		public boolean TheEndEerie = false;
		public double TheEndTeleportTime = 0;
		public boolean TheEndTeleportedPlayers = false;
		public boolean EngiesWrathNightTime = false;
		public boolean EngiesWrathDialogueDelay = true;
		public double EngiesWrathDialogueDelayTimer = 0;
		public double EngiesWrathNightTimeDelayTimer = 0;
		public double EngiesWrathDialogueTimer = 0;
		public boolean EngiesWrathFullStart = false;
		public double EngiesWrathTimeBeforeNextDialogue = 0;
		public double EngiesWrathTimeBeforeDialogueDisappear = 0;
		public double EngiesWrathDialogueDisappearTimer = 0;
		public boolean StartEngiesWrathBeginning = false;
		public boolean EngiesWrathEerie = false;
		public double EngiesWrathTeleportTime = 0;
		public boolean EngiesWrathTeleportedPlayers = false;
		public double numb = 0;
		public boolean spawnedfinaldisasters = false;
		public boolean ranfirstcleanup = false;
		public boolean ransecondcleanup = false;
		public boolean stopdialogue = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			getdamage = nbt.getDouble("getdamage");
			MobDifficulty = nbt.getDouble("MobDifficulty");
			SharkoKilledByPlayersCount = nbt.getDouble("SharkoKilledByPlayersCount");
			playersaidyestotrymaxdiff = nbt.getDouble("playersaidyestotrymaxdiff");
			playerobtainedbigcount = nbt.getDouble("playerobtainedbigcount");
			playerobtainedlargecount = nbt.getDouble("playerobtainedlargecount");
			playerobtainedhugecount = nbt.getDouble("playerobtainedhugecount");
			playerobtainedenormouscount = nbt.getDouble("playerobtainedenormouscount");
			playerobtainedgiganticcount = nbt.getDouble("playerobtainedgiganticcount");
			playerobtainedmassivecount = nbt.getDouble("playerobtainedmassivecount");
			playerobtainedbiblicallycount = nbt.getDouble("playerobtainedbiblicallycount");
			playerobtainedmonstrositycount = nbt.getDouble("playerobtainedmonstrositycount");
			playerobtaineddoomsdaycount = nbt.getDouble("playerobtaineddoomsdaycount");
			playerobtainedsuperdoomsdaycount = nbt.getDouble("playerobtainedsuperdoomsdaycount");
			playerobtainedtheendcount = nbt.getDouble("playerobtainedtheendcount");
			playerobtainedengiecount = nbt.getDouble("playerobtainedengiecount");
			playerobtainedmindscapecount = nbt.getDouble("playerobtainedmindscapecount");
			playerobtainedantimatterregularcount = nbt.getDouble("playerobtainedantimatterregularcount");
			playerobtainedantimatterbigcount = nbt.getDouble("playerobtainedantimatterbigcount");
			playerobtainedantimatterlargecount = nbt.getDouble("playerobtainedantimatterlargecount");
			playerobtainedantimatterhugecount = nbt.getDouble("playerobtainedantimatterhugecount");
			playerobtainedantimatterenormouscount = nbt.getDouble("playerobtainedantimatterenormouscount");
			playerobtainedantimattergiganticcount = nbt.getDouble("playerobtainedantimattergiganticcount");
			playerobtainedantimattermassivecount = nbt.getDouble("playerobtainedantimattermassivecount");
			playerobtainedantimatterbiblicallycount = nbt.getDouble("playerobtainedantimatterbiblicallycount");
			playerobtainedantimattermonstrositycount = nbt.getDouble("playerobtainedantimattermonstrositycount");
			playerobtainedantimatterdoomsdaycount = nbt.getDouble("playerobtainedantimatterdoomsdaycount");
			playerobtainedantimattersuperdoomsdaycount = nbt.getDouble("playerobtainedantimattersuperdoomsdaycount");
			playerobtainedantimattertheendcount = nbt.getDouble("playerobtainedantimattertheendcount");
			playerobtainedantimatterengiecount = nbt.getDouble("playerobtainedantimatterengiecount");
			playerobtainedengiegamesswordcount = nbt.getDouble("playerobtainedengiegamesswordcount");
			playerobtainedantimatterengiegamessword = nbt.getDouble("playerobtainedantimatterengiegamessword");
			playerobtainedantimatterminicount = nbt.getDouble("playerobtainedantimatterminicount");
			challengeplayerreadyupcount = nbt.getDouble("challengeplayerreadyupcount");
			nightmare = nbt.getDouble("nightmare");
			Risk = nbt.getDouble("Risk");
			timebeforespecial = nbt.getDouble("timebeforespecial");
			numberofdoomsdays = nbt.getDouble("numberofdoomsdays");
			numberofsuperdoomsdays = nbt.getDouble("numberofsuperdoomsdays");
			numberoftheend = nbt.getDouble("numberoftheend");
			numberofdistorted = nbt.getDouble("numberofdistorted");
			numberofengiegames = nbt.getDouble("numberofengiegames");
			numberofcosmicengiegames = nbt.getDouble("numberofcosmicengiegames");
			numberofroughianengiegames = nbt.getDouble("numberofroughianengiegames");
			numberofmindscapetradeable = nbt.getDouble("numberofmindscapetradeable");
			FunFactNumber = nbt.getDouble("FunFactNumber");
			playerobtainedcosmicswordcount = nbt.getDouble("playerobtainedcosmicswordcount");
			playerobtainedcollectorshallowscythe = nbt.getDouble("playerobtainedcollectorshallowscythe");
			playerobtainedhallowscythecount = nbt.getDouble("playerobtainedhallowscythecount");
			MobDiffBeforeChallenge = nbt.getDouble("MobDiffBeforeChallenge");
			RX = nbt.getDouble("RX");
			RY = nbt.getDouble("RY");
			RZ = nbt.getDouble("RZ");
			darknessretrycooldown = nbt.getDouble("darknessretrycooldown");
			missilecooldown = nbt.getDouble("missilecooldown");
			lightningcooldown = nbt.getDouble("lightningcooldown");
			riftcooldown = nbt.getDouble("riftcooldown");
			ddaydialoguenum = nbt.getDouble("ddaydialoguenum");
			doomsdaychance = nbt.getDouble("doomsdaychance");
			stunmobsradiusnum = nbt.getDouble("stunmobsradiusnum");
			spikecooldown = nbt.getDouble("spikecooldown");
			avalanchecooldown = nbt.getDouble("avalanchecooldown");
			apocdayonestart = nbt.getDouble("apocdayonestart");
			TimeUntilNight = nbt.getDouble("TimeUntilNight");
			DialogueCooldownStart = nbt.getDouble("DialogueCooldownStart");
			doomsdaymaxtime = nbt.getDouble("doomsdaymaxtime");
			superdoomsdaymaxtime = nbt.getDouble("superdoomsdaymaxtime");
			theendmaxtime = nbt.getDouble("theendmaxtime");
			engieswrathmaxtime = nbt.getDouble("engieswrathmaxtime");
			ddayprophnumb = nbt.getDouble("ddayprophnumb");
			spikecooldownamount = nbt.getDouble("spikecooldownamount");
			Birthday = nbt.getBoolean("Birthday");
			birthdaystart = nbt.getBoolean("birthdaystart");
			BYEBYE = nbt.getBoolean("BYEBYE");
			ChallengeToggle = nbt.getBoolean("ChallengeToggle");
			checkboxbothmarked = nbt.getBoolean("checkboxbothmarked");
			checkboxbothnomarked = nbt.getBoolean("checkboxbothnomarked");
			DayCooldownToggle = nbt.getBoolean("DayCooldownToggle");
			DoomsdayEeriePlayOnce = nbt.getBoolean("DoomsdayEeriePlayOnce");
			DoomsdayStart = nbt.getBoolean("DoomsdayStart");
			GOODBYE = nbt.getBoolean("GOODBYE");
			hewhowatches = nbt.getBoolean("hewhowatches");
			HHGkilledtoggle = nbt.getBoolean("HHGkilledtoggle");
			itemswap1 = nbt.getBoolean("itemswap1");
			itemswap2 = nbt.getBoolean("itemswap2");
			madlads = nbt.getBoolean("madlads");
			multiplayertrophyobtained = nbt.getBoolean("multiplayertrophyobtained");
			OHBOY = nbt.getBoolean("OHBOY");
			OHNO = nbt.getBoolean("OHNO");
			seasonautumn = nbt.getBoolean("seasonautumn");
			seasonspring = nbt.getBoolean("seasonspring");
			seasonsummer = nbt.getBoolean("seasonsummer");
			seasonwinter = nbt.getBoolean("seasonwinter");
			SuperDoomsdayStart = nbt.getBoolean("SuperDoomsdayStart");
			TheEndStart = nbt.getBoolean("TheEndStart");
			timecheckstop = nbt.getBoolean("timecheckstop");
			antimatterdropcheck = nbt.getBoolean("antimatterdropcheck");
			detectedothermodesenabledthrowback = nbt.getBoolean("detectedothermodesenabledthrowback");
			graceperiodbeforeplushangryagain = nbt.getBoolean("graceperiodbeforeplushangryagain");
			riskcooldown = nbt.getBoolean("riskcooldown");
			CosmicEngieGamesSpawnLock = nbt.getBoolean("CosmicEngieGamesSpawnLock");
			CosmicEngieGamesDespawnLock = nbt.getBoolean("CosmicEngieGamesDespawnLock");
			FallingTreeInstalled = nbt.getBoolean("FallingTreeInstalled");
			VeinMinerInstalled = nbt.getBoolean("VeinMinerInstalled");
			ShowObjectiveOverlay = nbt.getBoolean("ShowObjectiveOverlay");
			solotrophyobtained = nbt.getBoolean("solotrophyobtained");
			difficultytoggle = nbt.getBoolean("difficultytoggle");
			EngiesWrathStart = nbt.getBoolean("EngiesWrathStart");
			truehardcoreenabledonworld = nbt.getBoolean("truehardcoreenabledonworld");
			specialhealth = nbt.getBoolean("specialhealth");
			playlightningsound = nbt.getBoolean("playlightningsound");
			playriftsound = nbt.getBoolean("playriftsound");
			playlightningsound2 = nbt.getBoolean("playlightningsound2");
			playlightningcornersound = nbt.getBoolean("playlightningcornersound");
			ddayscornerlightning = nbt.getBoolean("ddayscornerlightning");
			playlightningsound3 = nbt.getBoolean("playlightningsound3");
			playlightningsound4 = nbt.getBoolean("playlightningsound4");
			DDAYCleanup = nbt.getBoolean("DDAYCleanup");
			playlightningsound5 = nbt.getBoolean("playlightningsound5");
			playmissilespawnsound = nbt.getBoolean("playmissilespawnsound");
			playmissileexplosionsound = nbt.getBoolean("playmissileexplosionsound");
			shadowsharkdevspawn = nbt.getBoolean("shadowsharkdevspawn");
			DayCheck = nbt.getBoolean("DayCheck");
			NightCheck = nbt.getBoolean("NightCheck");
			churchbellsnorm = nbt.getBoolean("churchbellsnorm");
			churchbellsewrath = nbt.getBoolean("churchbellsewrath");
			ddaymainsongplay = nbt.getBoolean("ddaymainsongplay");
			ddaydialogue = nbt.getBoolean("ddaydialogue");
			ddayaltsongplay = nbt.getBoolean("ddayaltsongplay");
			ddayavalanche = nbt.getBoolean("ddayavalanche");
			ddayawardadvancement1 = nbt.getBoolean("ddayawardadvancement1");
			ddayawardadvancement2 = nbt.getBoolean("ddayawardadvancement2");
			ddayhappened = nbt.getBoolean("ddayhappened");
			sddayhappened = nbt.getBoolean("sddayhappened");
			theendhappened = nbt.getBoolean("theendhappened");
			ewrathhappened = nbt.getBoolean("ewrathhappened");
			stopeeriesound = nbt.getBoolean("stopeeriesound");
			ddayprophshow = nbt.getBoolean("ddayprophshow");
			firstplayofaltsoundtrack = nbt.getBoolean("firstplayofaltsoundtrack");
			doomsdayprophwait = nbt.getBoolean("doomsdayprophwait");
			despawnspike = nbt.getBoolean("despawnspike");
			despawnava = nbt.getBoolean("despawnava");
			DDayAvalancheAmount = nbt.getDouble("DDayAvalancheAmount");
			DDaySpikeAmount = nbt.getDouble("DDaySpikeAmount");
			DDayMissileAmount = nbt.getDouble("DDayMissileAmount");
			DDayRiftAmount = nbt.getDouble("DDayRiftAmount");
			engiepocgraceperiod = nbt.getDouble("engiepocgraceperiod");
			rangraceperiodcount = nbt.getBoolean("rangraceperiodcount");
			EngiePocSpawnedHelper = nbt.getBoolean("EngiePocSpawnedHelper");
			heavylightningenabled = nbt.getBoolean("heavylightningenabled");
			extremelightningenabled = nbt.getBoolean("extremelightningenabled");
			extremeddaylightningenabled = nbt.getBoolean("extremeddaylightningenabled");
			heavylightningcd = nbt.getDouble("heavylightningcd");
			extremelightningcd = nbt.getDouble("extremelightningcd");
			riskcooldownnumb = nbt.getDouble("riskcooldownnumb");
			DDayRiftedEntityCount = nbt.getDouble("DDayRiftedEntityCount");
			wormholesharkorandnum = nbt.getDouble("wormholesharkorandnum");
			glitchsharkorandnum = nbt.getDouble("glitchsharkorandnum");
			xengiesharkorandnum = nbt.getDouble("xengiesharkorandnum");
			wormholesharkoabletospawn = nbt.getBoolean("wormholesharkoabletospawn");
			glitchsharkoabletospawn = nbt.getBoolean("glitchsharkoabletospawn");
			xengiesharkoabletospawn = nbt.getBoolean("xengiesharkoabletospawn");
			timerforextremelyraresharko = nbt.getDouble("timerforextremelyraresharko");
			engiepoctruehardest = nbt.getBoolean("engiepoctruehardest");
			engiepoctruehardest20mincount = nbt.getDouble("engiepoctruehardest20mincount");
			engiepoctruehardesttimemult = nbt.getDouble("engiepoctruehardesttimemult");
			doomssentdebug1 = nbt.getBoolean("doomssentdebug1");
			doomssentdebug2 = nbt.getBoolean("doomssentdebug2");
			ddaytimerminutes = nbt.getDouble("ddaytimerminutes");
			ddaytimerseconds = nbt.getDouble("ddaytimerseconds");
			sddaytimerminutes = nbt.getDouble("sddaytimerminutes");
			sddaytimerseconds = nbt.getDouble("sddaytimerseconds");
			theendtimerminutes = nbt.getDouble("theendtimerminutes");
			theendtimerseconds = nbt.getDouble("theendtimerseconds");
			ewrathtimerminutes = nbt.getDouble("ewrathtimerminutes");
			ewrathtimerseconds = nbt.getDouble("ewrathtimerseconds");
			timeticks = nbt.getDouble("timeticks");
			engiepoctime = nbt.getDouble("engiepoctime");
			totalplayersinworld = nbt.getDouble("totalplayersinworld");
			ddayplayeralivecount = nbt.getDouble("ddayplayeralivecount");
			ddayplayerdeadcount = nbt.getDouble("ddayplayerdeadcount");
			TraderDoomsdaySpawnLock = nbt.getBoolean("TraderDoomsdaySpawnLock");
			TraderSuperDoomsdaySpawnLock = nbt.getBoolean("TraderSuperDoomsdaySpawnLock");
			TraderTheEndSpawnLock = nbt.getBoolean("TraderTheEndSpawnLock");
			TraderEngieSpawnLock = nbt.getBoolean("TraderEngieSpawnLock");
			TraderMindscapeEngieSpawnLock = nbt.getBoolean("TraderMindscapeEngieSpawnLock");
			TraderEngieGamesSpawnLock = nbt.getBoolean("TraderEngieGamesSpawnLock");
			TraderCosmicEngieGamesSpawnLock = nbt.getBoolean("TraderCosmicEngieGamesSpawnLock");
			TraderRoughianEngieGamesSpawnLock = nbt.getBoolean("TraderRoughianEngieGamesSpawnLock");
			ticktimerentitycheck = nbt.getDouble("ticktimerentitycheck");
			ddayprophnormhordenumb = nbt.getDouble("ddayprophnormhordenumb");
			ddayprophnightmarehordenumb = nbt.getDouble("ddayprophnightmarehordenumb");
			ddayprophinsanityhordenumb = nbt.getDouble("ddayprophinsanityhordenumb");
			ddayprophengiepochordenumb = nbt.getDouble("ddayprophengiepochordenumb");
			userids = nbt.getString("userids");
			hordecooldown = nbt.getDouble("hordecooldown");
			previoustime = nbt.getDouble("previoustime");
			forecastdialogue = nbt.getDouble("forecastdialogue");
			hordespawnstoggle = nbt.getBoolean("hordespawnstoggle");
			tradertimercounttick = nbt.getDouble("tradertimercounttick");
			traderneedcount = nbt.getBoolean("traderneedcount");
			random25minutetimer = nbt.getDouble("random25minutetimer");
			mobbasehpmulttoggle = nbt.getBoolean("mobbasehpmulttoggle");
			engiestruewrath = nbt.getBoolean("engiestruewrath");
			resetpickaxeonlycount = nbt.getBoolean("resetpickaxeonlycount");
			ddayoncleanup = nbt.getBoolean("ddayoncleanup");
			ddaystoptimer = nbt.getBoolean("ddaystoptimer");
			doomsdaycleanuptimer = nbt.getDouble("doomsdaycleanuptimer");
			DoomsdayNightTime = nbt.getBoolean("DoomsdayNightTime");
			DoomsdayDialogueDelay = nbt.getBoolean("DoomsdayDialogueDelay");
			DoomsdayDialogueDelayTimer = nbt.getDouble("DoomsdayDialogueDelayTimer");
			DoomsdayNightTimeDelayTimer = nbt.getDouble("DoomsdayNightTimeDelayTimer");
			DoomsdayHalf = nbt.getDouble("DoomsdayHalf");
			DoomsdayDialogueTimer = nbt.getDouble("DoomsdayDialogueTimer");
			ProphecyShowTimer = nbt.getDouble("ProphecyShowTimer");
			ProphecyDisasterRevealTimer = nbt.getDouble("ProphecyDisasterRevealTimer");
			ProphecyTimerTotal = nbt.getDouble("ProphecyTimerTotal");
			prophallowticking = nbt.getBoolean("prophallowticking");
			DoomsdayFullStart = nbt.getBoolean("DoomsdayFullStart");
			TimeBeforeNextDialogue = nbt.getDouble("TimeBeforeNextDialogue");
			TimeBeforeDialogueDisappear = nbt.getDouble("TimeBeforeDialogueDisappear");
			DialogueDisappearTimer = nbt.getDouble("DialogueDisappearTimer");
			dialogueamount = nbt.getDouble("dialogueamount");
			pausedialogue = nbt.getBoolean("pausedialogue");
			StartDoomsdayBeginning = nbt.getBoolean("StartDoomsdayBeginning");
			DoomsdayEerie = nbt.getBoolean("DoomsdayEerie");
			DoomsdayTeleportTime = nbt.getDouble("DoomsdayTeleportTime");
			DoomsdayTeleportedPlayers = nbt.getBoolean("DoomsdayTeleportedPlayers");
			SuperDoomsdayNightTime = nbt.getBoolean("SuperDoomsdayNightTime");
			SuperDoomsdayDialogueDelay = nbt.getBoolean("SuperDoomsdayDialogueDelay");
			SuperDoomsdayDialogueDelayTimer = nbt.getDouble("SuperDoomsdayDialogueDelayTimer");
			SuperDoomsdayNightTimeDelayTimer = nbt.getDouble("SuperDoomsdayNightTimeDelayTimer");
			SuperDoomsdayDialogueTimer = nbt.getDouble("SuperDoomsdayDialogueTimer");
			SuperDoomsdayFullStart = nbt.getBoolean("SuperDoomsdayFullStart");
			SuperDoomsdayTimeBeforeNextDialogue = nbt.getDouble("SuperDoomsdayTimeBeforeNextDialogue");
			SuperDoomsdayTimeBeforeDialogueDisappear = nbt.getDouble("SuperDoomsdayTimeBeforeDialogueDisappear");
			SuperDoomsdayDialogueDisappearTimer = nbt.getDouble("SuperDoomsdayDialogueDisappearTimer");
			StartSuperDoomsdayBeginning = nbt.getBoolean("StartSuperDoomsdayBeginning");
			SuperDoomsdayEerie = nbt.getBoolean("SuperDoomsdayEerie");
			SuperDoomsdayTeleportTime = nbt.getDouble("SuperDoomsdayTeleportTime");
			SuperDoomsdayTeleportedPlayers = nbt.getBoolean("SuperDoomsdayTeleportedPlayers");
			TheEndNightTime = nbt.getBoolean("TheEndNightTime");
			TheEndDialogueDelay = nbt.getBoolean("TheEndDialogueDelay");
			TheEndDialogueDelayTimer = nbt.getDouble("TheEndDialogueDelayTimer");
			TheEndNightTimeDelayTimer = nbt.getDouble("TheEndNightTimeDelayTimer");
			TheEndDialogueTimer = nbt.getDouble("TheEndDialogueTimer");
			TheEndFullStart = nbt.getBoolean("TheEndFullStart");
			TheEndTimeBeforeNextDialogue = nbt.getDouble("TheEndTimeBeforeNextDialogue");
			TheEndTimeBeforeDialogueDisappear = nbt.getDouble("TheEndTimeBeforeDialogueDisappear");
			TheEndDialogueDisappearTimer = nbt.getDouble("TheEndDialogueDisappearTimer");
			StartTheEndBeginning = nbt.getBoolean("StartTheEndBeginning");
			TheEndEerie = nbt.getBoolean("TheEndEerie");
			TheEndTeleportTime = nbt.getDouble("TheEndTeleportTime");
			TheEndTeleportedPlayers = nbt.getBoolean("TheEndTeleportedPlayers");
			EngiesWrathNightTime = nbt.getBoolean("EngiesWrathNightTime");
			EngiesWrathDialogueDelay = nbt.getBoolean("EngiesWrathDialogueDelay");
			EngiesWrathDialogueDelayTimer = nbt.getDouble("EngiesWrathDialogueDelayTimer");
			EngiesWrathNightTimeDelayTimer = nbt.getDouble("EngiesWrathNightTimeDelayTimer");
			EngiesWrathDialogueTimer = nbt.getDouble("EngiesWrathDialogueTimer");
			EngiesWrathFullStart = nbt.getBoolean("EngiesWrathFullStart");
			EngiesWrathTimeBeforeNextDialogue = nbt.getDouble("EngiesWrathTimeBeforeNextDialogue");
			EngiesWrathTimeBeforeDialogueDisappear = nbt.getDouble("EngiesWrathTimeBeforeDialogueDisappear");
			EngiesWrathDialogueDisappearTimer = nbt.getDouble("EngiesWrathDialogueDisappearTimer");
			StartEngiesWrathBeginning = nbt.getBoolean("StartEngiesWrathBeginning");
			EngiesWrathEerie = nbt.getBoolean("EngiesWrathEerie");
			EngiesWrathTeleportTime = nbt.getDouble("EngiesWrathTeleportTime");
			EngiesWrathTeleportedPlayers = nbt.getBoolean("EngiesWrathTeleportedPlayers");
			numb = nbt.getDouble("numb");
			spawnedfinaldisasters = nbt.getBoolean("spawnedfinaldisasters");
			ranfirstcleanup = nbt.getBoolean("ranfirstcleanup");
			ransecondcleanup = nbt.getBoolean("ransecondcleanup");
			stopdialogue = nbt.getBoolean("stopdialogue");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("getdamage", getdamage);
			nbt.putDouble("MobDifficulty", MobDifficulty);
			nbt.putDouble("SharkoKilledByPlayersCount", SharkoKilledByPlayersCount);
			nbt.putDouble("playersaidyestotrymaxdiff", playersaidyestotrymaxdiff);
			nbt.putDouble("playerobtainedbigcount", playerobtainedbigcount);
			nbt.putDouble("playerobtainedlargecount", playerobtainedlargecount);
			nbt.putDouble("playerobtainedhugecount", playerobtainedhugecount);
			nbt.putDouble("playerobtainedenormouscount", playerobtainedenormouscount);
			nbt.putDouble("playerobtainedgiganticcount", playerobtainedgiganticcount);
			nbt.putDouble("playerobtainedmassivecount", playerobtainedmassivecount);
			nbt.putDouble("playerobtainedbiblicallycount", playerobtainedbiblicallycount);
			nbt.putDouble("playerobtainedmonstrositycount", playerobtainedmonstrositycount);
			nbt.putDouble("playerobtaineddoomsdaycount", playerobtaineddoomsdaycount);
			nbt.putDouble("playerobtainedsuperdoomsdaycount", playerobtainedsuperdoomsdaycount);
			nbt.putDouble("playerobtainedtheendcount", playerobtainedtheendcount);
			nbt.putDouble("playerobtainedengiecount", playerobtainedengiecount);
			nbt.putDouble("playerobtainedmindscapecount", playerobtainedmindscapecount);
			nbt.putDouble("playerobtainedantimatterregularcount", playerobtainedantimatterregularcount);
			nbt.putDouble("playerobtainedantimatterbigcount", playerobtainedantimatterbigcount);
			nbt.putDouble("playerobtainedantimatterlargecount", playerobtainedantimatterlargecount);
			nbt.putDouble("playerobtainedantimatterhugecount", playerobtainedantimatterhugecount);
			nbt.putDouble("playerobtainedantimatterenormouscount", playerobtainedantimatterenormouscount);
			nbt.putDouble("playerobtainedantimattergiganticcount", playerobtainedantimattergiganticcount);
			nbt.putDouble("playerobtainedantimattermassivecount", playerobtainedantimattermassivecount);
			nbt.putDouble("playerobtainedantimatterbiblicallycount", playerobtainedantimatterbiblicallycount);
			nbt.putDouble("playerobtainedantimattermonstrositycount", playerobtainedantimattermonstrositycount);
			nbt.putDouble("playerobtainedantimatterdoomsdaycount", playerobtainedantimatterdoomsdaycount);
			nbt.putDouble("playerobtainedantimattersuperdoomsdaycount", playerobtainedantimattersuperdoomsdaycount);
			nbt.putDouble("playerobtainedantimattertheendcount", playerobtainedantimattertheendcount);
			nbt.putDouble("playerobtainedantimatterengiecount", playerobtainedantimatterengiecount);
			nbt.putDouble("playerobtainedengiegamesswordcount", playerobtainedengiegamesswordcount);
			nbt.putDouble("playerobtainedantimatterengiegamessword", playerobtainedantimatterengiegamessword);
			nbt.putDouble("playerobtainedantimatterminicount", playerobtainedantimatterminicount);
			nbt.putDouble("challengeplayerreadyupcount", challengeplayerreadyupcount);
			nbt.putDouble("nightmare", nightmare);
			nbt.putDouble("Risk", Risk);
			nbt.putDouble("timebeforespecial", timebeforespecial);
			nbt.putDouble("numberofdoomsdays", numberofdoomsdays);
			nbt.putDouble("numberofsuperdoomsdays", numberofsuperdoomsdays);
			nbt.putDouble("numberoftheend", numberoftheend);
			nbt.putDouble("numberofdistorted", numberofdistorted);
			nbt.putDouble("numberofengiegames", numberofengiegames);
			nbt.putDouble("numberofcosmicengiegames", numberofcosmicengiegames);
			nbt.putDouble("numberofroughianengiegames", numberofroughianengiegames);
			nbt.putDouble("numberofmindscapetradeable", numberofmindscapetradeable);
			nbt.putDouble("FunFactNumber", FunFactNumber);
			nbt.putDouble("playerobtainedcosmicswordcount", playerobtainedcosmicswordcount);
			nbt.putDouble("playerobtainedcollectorshallowscythe", playerobtainedcollectorshallowscythe);
			nbt.putDouble("playerobtainedhallowscythecount", playerobtainedhallowscythecount);
			nbt.putDouble("MobDiffBeforeChallenge", MobDiffBeforeChallenge);
			nbt.putDouble("RX", RX);
			nbt.putDouble("RY", RY);
			nbt.putDouble("RZ", RZ);
			nbt.putDouble("darknessretrycooldown", darknessretrycooldown);
			nbt.putDouble("missilecooldown", missilecooldown);
			nbt.putDouble("lightningcooldown", lightningcooldown);
			nbt.putDouble("riftcooldown", riftcooldown);
			nbt.putDouble("ddaydialoguenum", ddaydialoguenum);
			nbt.putDouble("doomsdaychance", doomsdaychance);
			nbt.putDouble("stunmobsradiusnum", stunmobsradiusnum);
			nbt.putDouble("spikecooldown", spikecooldown);
			nbt.putDouble("avalanchecooldown", avalanchecooldown);
			nbt.putDouble("apocdayonestart", apocdayonestart);
			nbt.putDouble("TimeUntilNight", TimeUntilNight);
			nbt.putDouble("DialogueCooldownStart", DialogueCooldownStart);
			nbt.putDouble("doomsdaymaxtime", doomsdaymaxtime);
			nbt.putDouble("superdoomsdaymaxtime", superdoomsdaymaxtime);
			nbt.putDouble("theendmaxtime", theendmaxtime);
			nbt.putDouble("engieswrathmaxtime", engieswrathmaxtime);
			nbt.putDouble("ddayprophnumb", ddayprophnumb);
			nbt.putDouble("spikecooldownamount", spikecooldownamount);
			nbt.putBoolean("Birthday", Birthday);
			nbt.putBoolean("birthdaystart", birthdaystart);
			nbt.putBoolean("BYEBYE", BYEBYE);
			nbt.putBoolean("ChallengeToggle", ChallengeToggle);
			nbt.putBoolean("checkboxbothmarked", checkboxbothmarked);
			nbt.putBoolean("checkboxbothnomarked", checkboxbothnomarked);
			nbt.putBoolean("DayCooldownToggle", DayCooldownToggle);
			nbt.putBoolean("DoomsdayEeriePlayOnce", DoomsdayEeriePlayOnce);
			nbt.putBoolean("DoomsdayStart", DoomsdayStart);
			nbt.putBoolean("GOODBYE", GOODBYE);
			nbt.putBoolean("hewhowatches", hewhowatches);
			nbt.putBoolean("HHGkilledtoggle", HHGkilledtoggle);
			nbt.putBoolean("itemswap1", itemswap1);
			nbt.putBoolean("itemswap2", itemswap2);
			nbt.putBoolean("madlads", madlads);
			nbt.putBoolean("multiplayertrophyobtained", multiplayertrophyobtained);
			nbt.putBoolean("OHBOY", OHBOY);
			nbt.putBoolean("OHNO", OHNO);
			nbt.putBoolean("seasonautumn", seasonautumn);
			nbt.putBoolean("seasonspring", seasonspring);
			nbt.putBoolean("seasonsummer", seasonsummer);
			nbt.putBoolean("seasonwinter", seasonwinter);
			nbt.putBoolean("SuperDoomsdayStart", SuperDoomsdayStart);
			nbt.putBoolean("TheEndStart", TheEndStart);
			nbt.putBoolean("timecheckstop", timecheckstop);
			nbt.putBoolean("antimatterdropcheck", antimatterdropcheck);
			nbt.putBoolean("detectedothermodesenabledthrowback", detectedothermodesenabledthrowback);
			nbt.putBoolean("graceperiodbeforeplushangryagain", graceperiodbeforeplushangryagain);
			nbt.putBoolean("riskcooldown", riskcooldown);
			nbt.putBoolean("CosmicEngieGamesSpawnLock", CosmicEngieGamesSpawnLock);
			nbt.putBoolean("CosmicEngieGamesDespawnLock", CosmicEngieGamesDespawnLock);
			nbt.putBoolean("FallingTreeInstalled", FallingTreeInstalled);
			nbt.putBoolean("VeinMinerInstalled", VeinMinerInstalled);
			nbt.putBoolean("ShowObjectiveOverlay", ShowObjectiveOverlay);
			nbt.putBoolean("solotrophyobtained", solotrophyobtained);
			nbt.putBoolean("difficultytoggle", difficultytoggle);
			nbt.putBoolean("EngiesWrathStart", EngiesWrathStart);
			nbt.putBoolean("truehardcoreenabledonworld", truehardcoreenabledonworld);
			nbt.putBoolean("specialhealth", specialhealth);
			nbt.putBoolean("playlightningsound", playlightningsound);
			nbt.putBoolean("playriftsound", playriftsound);
			nbt.putBoolean("playlightningsound2", playlightningsound2);
			nbt.putBoolean("playlightningcornersound", playlightningcornersound);
			nbt.putBoolean("ddayscornerlightning", ddayscornerlightning);
			nbt.putBoolean("playlightningsound3", playlightningsound3);
			nbt.putBoolean("playlightningsound4", playlightningsound4);
			nbt.putBoolean("DDAYCleanup", DDAYCleanup);
			nbt.putBoolean("playlightningsound5", playlightningsound5);
			nbt.putBoolean("playmissilespawnsound", playmissilespawnsound);
			nbt.putBoolean("playmissileexplosionsound", playmissileexplosionsound);
			nbt.putBoolean("shadowsharkdevspawn", shadowsharkdevspawn);
			nbt.putBoolean("DayCheck", DayCheck);
			nbt.putBoolean("NightCheck", NightCheck);
			nbt.putBoolean("churchbellsnorm", churchbellsnorm);
			nbt.putBoolean("churchbellsewrath", churchbellsewrath);
			nbt.putBoolean("ddaymainsongplay", ddaymainsongplay);
			nbt.putBoolean("ddaydialogue", ddaydialogue);
			nbt.putBoolean("ddayaltsongplay", ddayaltsongplay);
			nbt.putBoolean("ddayavalanche", ddayavalanche);
			nbt.putBoolean("ddayawardadvancement1", ddayawardadvancement1);
			nbt.putBoolean("ddayawardadvancement2", ddayawardadvancement2);
			nbt.putBoolean("ddayhappened", ddayhappened);
			nbt.putBoolean("sddayhappened", sddayhappened);
			nbt.putBoolean("theendhappened", theendhappened);
			nbt.putBoolean("ewrathhappened", ewrathhappened);
			nbt.putBoolean("stopeeriesound", stopeeriesound);
			nbt.putBoolean("ddayprophshow", ddayprophshow);
			nbt.putBoolean("firstplayofaltsoundtrack", firstplayofaltsoundtrack);
			nbt.putBoolean("doomsdayprophwait", doomsdayprophwait);
			nbt.putBoolean("despawnspike", despawnspike);
			nbt.putBoolean("despawnava", despawnava);
			nbt.putDouble("DDayAvalancheAmount", DDayAvalancheAmount);
			nbt.putDouble("DDaySpikeAmount", DDaySpikeAmount);
			nbt.putDouble("DDayMissileAmount", DDayMissileAmount);
			nbt.putDouble("DDayRiftAmount", DDayRiftAmount);
			nbt.putDouble("engiepocgraceperiod", engiepocgraceperiod);
			nbt.putBoolean("rangraceperiodcount", rangraceperiodcount);
			nbt.putBoolean("EngiePocSpawnedHelper", EngiePocSpawnedHelper);
			nbt.putBoolean("heavylightningenabled", heavylightningenabled);
			nbt.putBoolean("extremelightningenabled", extremelightningenabled);
			nbt.putBoolean("extremeddaylightningenabled", extremeddaylightningenabled);
			nbt.putDouble("heavylightningcd", heavylightningcd);
			nbt.putDouble("extremelightningcd", extremelightningcd);
			nbt.putDouble("riskcooldownnumb", riskcooldownnumb);
			nbt.putDouble("DDayRiftedEntityCount", DDayRiftedEntityCount);
			nbt.putDouble("wormholesharkorandnum", wormholesharkorandnum);
			nbt.putDouble("glitchsharkorandnum", glitchsharkorandnum);
			nbt.putDouble("xengiesharkorandnum", xengiesharkorandnum);
			nbt.putBoolean("wormholesharkoabletospawn", wormholesharkoabletospawn);
			nbt.putBoolean("glitchsharkoabletospawn", glitchsharkoabletospawn);
			nbt.putBoolean("xengiesharkoabletospawn", xengiesharkoabletospawn);
			nbt.putDouble("timerforextremelyraresharko", timerforextremelyraresharko);
			nbt.putBoolean("engiepoctruehardest", engiepoctruehardest);
			nbt.putDouble("engiepoctruehardest20mincount", engiepoctruehardest20mincount);
			nbt.putDouble("engiepoctruehardesttimemult", engiepoctruehardesttimemult);
			nbt.putBoolean("doomssentdebug1", doomssentdebug1);
			nbt.putBoolean("doomssentdebug2", doomssentdebug2);
			nbt.putDouble("ddaytimerminutes", ddaytimerminutes);
			nbt.putDouble("ddaytimerseconds", ddaytimerseconds);
			nbt.putDouble("sddaytimerminutes", sddaytimerminutes);
			nbt.putDouble("sddaytimerseconds", sddaytimerseconds);
			nbt.putDouble("theendtimerminutes", theendtimerminutes);
			nbt.putDouble("theendtimerseconds", theendtimerseconds);
			nbt.putDouble("ewrathtimerminutes", ewrathtimerminutes);
			nbt.putDouble("ewrathtimerseconds", ewrathtimerseconds);
			nbt.putDouble("timeticks", timeticks);
			nbt.putDouble("engiepoctime", engiepoctime);
			nbt.putDouble("totalplayersinworld", totalplayersinworld);
			nbt.putDouble("ddayplayeralivecount", ddayplayeralivecount);
			nbt.putDouble("ddayplayerdeadcount", ddayplayerdeadcount);
			nbt.putBoolean("TraderDoomsdaySpawnLock", TraderDoomsdaySpawnLock);
			nbt.putBoolean("TraderSuperDoomsdaySpawnLock", TraderSuperDoomsdaySpawnLock);
			nbt.putBoolean("TraderTheEndSpawnLock", TraderTheEndSpawnLock);
			nbt.putBoolean("TraderEngieSpawnLock", TraderEngieSpawnLock);
			nbt.putBoolean("TraderMindscapeEngieSpawnLock", TraderMindscapeEngieSpawnLock);
			nbt.putBoolean("TraderEngieGamesSpawnLock", TraderEngieGamesSpawnLock);
			nbt.putBoolean("TraderCosmicEngieGamesSpawnLock", TraderCosmicEngieGamesSpawnLock);
			nbt.putBoolean("TraderRoughianEngieGamesSpawnLock", TraderRoughianEngieGamesSpawnLock);
			nbt.putDouble("ticktimerentitycheck", ticktimerentitycheck);
			nbt.putDouble("ddayprophnormhordenumb", ddayprophnormhordenumb);
			nbt.putDouble("ddayprophnightmarehordenumb", ddayprophnightmarehordenumb);
			nbt.putDouble("ddayprophinsanityhordenumb", ddayprophinsanityhordenumb);
			nbt.putDouble("ddayprophengiepochordenumb", ddayprophengiepochordenumb);
			nbt.putString("userids", userids);
			nbt.putDouble("hordecooldown", hordecooldown);
			nbt.putDouble("previoustime", previoustime);
			nbt.putDouble("forecastdialogue", forecastdialogue);
			nbt.putBoolean("hordespawnstoggle", hordespawnstoggle);
			nbt.putDouble("tradertimercounttick", tradertimercounttick);
			nbt.putBoolean("traderneedcount", traderneedcount);
			nbt.putDouble("random25minutetimer", random25minutetimer);
			nbt.putBoolean("mobbasehpmulttoggle", mobbasehpmulttoggle);
			nbt.putBoolean("engiestruewrath", engiestruewrath);
			nbt.putBoolean("resetpickaxeonlycount", resetpickaxeonlycount);
			nbt.putBoolean("ddayoncleanup", ddayoncleanup);
			nbt.putBoolean("ddaystoptimer", ddaystoptimer);
			nbt.putDouble("doomsdaycleanuptimer", doomsdaycleanuptimer);
			nbt.putBoolean("DoomsdayNightTime", DoomsdayNightTime);
			nbt.putBoolean("DoomsdayDialogueDelay", DoomsdayDialogueDelay);
			nbt.putDouble("DoomsdayDialogueDelayTimer", DoomsdayDialogueDelayTimer);
			nbt.putDouble("DoomsdayNightTimeDelayTimer", DoomsdayNightTimeDelayTimer);
			nbt.putDouble("DoomsdayHalf", DoomsdayHalf);
			nbt.putDouble("DoomsdayDialogueTimer", DoomsdayDialogueTimer);
			nbt.putDouble("ProphecyShowTimer", ProphecyShowTimer);
			nbt.putDouble("ProphecyDisasterRevealTimer", ProphecyDisasterRevealTimer);
			nbt.putDouble("ProphecyTimerTotal", ProphecyTimerTotal);
			nbt.putBoolean("prophallowticking", prophallowticking);
			nbt.putBoolean("DoomsdayFullStart", DoomsdayFullStart);
			nbt.putDouble("TimeBeforeNextDialogue", TimeBeforeNextDialogue);
			nbt.putDouble("TimeBeforeDialogueDisappear", TimeBeforeDialogueDisappear);
			nbt.putDouble("DialogueDisappearTimer", DialogueDisappearTimer);
			nbt.putDouble("dialogueamount", dialogueamount);
			nbt.putBoolean("pausedialogue", pausedialogue);
			nbt.putBoolean("StartDoomsdayBeginning", StartDoomsdayBeginning);
			nbt.putBoolean("DoomsdayEerie", DoomsdayEerie);
			nbt.putDouble("DoomsdayTeleportTime", DoomsdayTeleportTime);
			nbt.putBoolean("DoomsdayTeleportedPlayers", DoomsdayTeleportedPlayers);
			nbt.putBoolean("SuperDoomsdayNightTime", SuperDoomsdayNightTime);
			nbt.putBoolean("SuperDoomsdayDialogueDelay", SuperDoomsdayDialogueDelay);
			nbt.putDouble("SuperDoomsdayDialogueDelayTimer", SuperDoomsdayDialogueDelayTimer);
			nbt.putDouble("SuperDoomsdayNightTimeDelayTimer", SuperDoomsdayNightTimeDelayTimer);
			nbt.putDouble("SuperDoomsdayDialogueTimer", SuperDoomsdayDialogueTimer);
			nbt.putBoolean("SuperDoomsdayFullStart", SuperDoomsdayFullStart);
			nbt.putDouble("SuperDoomsdayTimeBeforeNextDialogue", SuperDoomsdayTimeBeforeNextDialogue);
			nbt.putDouble("SuperDoomsdayTimeBeforeDialogueDisappear", SuperDoomsdayTimeBeforeDialogueDisappear);
			nbt.putDouble("SuperDoomsdayDialogueDisappearTimer", SuperDoomsdayDialogueDisappearTimer);
			nbt.putBoolean("StartSuperDoomsdayBeginning", StartSuperDoomsdayBeginning);
			nbt.putBoolean("SuperDoomsdayEerie", SuperDoomsdayEerie);
			nbt.putDouble("SuperDoomsdayTeleportTime", SuperDoomsdayTeleportTime);
			nbt.putBoolean("SuperDoomsdayTeleportedPlayers", SuperDoomsdayTeleportedPlayers);
			nbt.putBoolean("TheEndNightTime", TheEndNightTime);
			nbt.putBoolean("TheEndDialogueDelay", TheEndDialogueDelay);
			nbt.putDouble("TheEndDialogueDelayTimer", TheEndDialogueDelayTimer);
			nbt.putDouble("TheEndNightTimeDelayTimer", TheEndNightTimeDelayTimer);
			nbt.putDouble("TheEndDialogueTimer", TheEndDialogueTimer);
			nbt.putBoolean("TheEndFullStart", TheEndFullStart);
			nbt.putDouble("TheEndTimeBeforeNextDialogue", TheEndTimeBeforeNextDialogue);
			nbt.putDouble("TheEndTimeBeforeDialogueDisappear", TheEndTimeBeforeDialogueDisappear);
			nbt.putDouble("TheEndDialogueDisappearTimer", TheEndDialogueDisappearTimer);
			nbt.putBoolean("StartTheEndBeginning", StartTheEndBeginning);
			nbt.putBoolean("TheEndEerie", TheEndEerie);
			nbt.putDouble("TheEndTeleportTime", TheEndTeleportTime);
			nbt.putBoolean("TheEndTeleportedPlayers", TheEndTeleportedPlayers);
			nbt.putBoolean("EngiesWrathNightTime", EngiesWrathNightTime);
			nbt.putBoolean("EngiesWrathDialogueDelay", EngiesWrathDialogueDelay);
			nbt.putDouble("EngiesWrathDialogueDelayTimer", EngiesWrathDialogueDelayTimer);
			nbt.putDouble("EngiesWrathNightTimeDelayTimer", EngiesWrathNightTimeDelayTimer);
			nbt.putDouble("EngiesWrathDialogueTimer", EngiesWrathDialogueTimer);
			nbt.putBoolean("EngiesWrathFullStart", EngiesWrathFullStart);
			nbt.putDouble("EngiesWrathTimeBeforeNextDialogue", EngiesWrathTimeBeforeNextDialogue);
			nbt.putDouble("EngiesWrathTimeBeforeDialogueDisappear", EngiesWrathTimeBeforeDialogueDisappear);
			nbt.putDouble("EngiesWrathDialogueDisappearTimer", EngiesWrathDialogueDisappearTimer);
			nbt.putBoolean("StartEngiesWrathBeginning", StartEngiesWrathBeginning);
			nbt.putBoolean("EngiesWrathEerie", EngiesWrathEerie);
			nbt.putDouble("EngiesWrathTeleportTime", EngiesWrathTeleportTime);
			nbt.putBoolean("EngiesWrathTeleportedPlayers", EngiesWrathTeleportedPlayers);
			nbt.putDouble("numb", numb);
			nbt.putBoolean("spawnedfinaldisasters", spawnedfinaldisasters);
			nbt.putBoolean("ranfirstcleanup", ranfirstcleanup);
			nbt.putBoolean("ransecondcleanup", ransecondcleanup);
			nbt.putBoolean("stopdialogue", stopdialogue);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("engies_chaos", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double RiftX = 0;
		public double RiftY = 0;
		public double RiftZ = 0;
		public double MonstrosityEngieKillCount = 0;
		public double PureInsanityKillCount = 0;
		public double dashleftclickcount = 0;
		public double AngryEngieKillCount = 0.0;
		public double browniescount = 0.0;
		public double cheeseballcount = 0.0;
		public double EnragedEngieKillCount = 0.0;
		public double InsanityKillCount = 0.0;
		public double MadEngieKillCount = 0.0;
		public double OutragedEngieKillCount = 0.0;
		public double PlayerX = 0.0;
		public double PlayerY = 0.0;
		public double PlayerZ = 0.0;
		public double pageNumber = 1.0;
		public double TrueHardcoreLifeCount = 10.0;
		public double HHGLookX = 525.0;
		public double HHGLookY = 525.0;
		public double HHGLookZ = 525.0;
		public double difficultyoverlaytoggle = 3.0;
		public double doublejumpcount = 1.0;
		public double engiegameshallowscythestatclock = 0;
		public double TrueHardcoreMaxLifeCount = 0;
		public double TrueHardcoreLifeChangeAmount = 0;
		public double CountUntilBaseDrop = 0;
		public double lightningflashnum = 0.0;
		public double PlayerDeathX = 0;
		public double PlayerDeathY = 0;
		public double PlayerDeathZ = 0;
		public boolean riftspawnoneentity = false;
		public boolean DoomsdayAlive = false;
		public boolean firstplay = false;
		public boolean RespawnNormInstantHealth = false;
		public boolean RespawnTrueHardcoreGraceStart = false;
		public boolean BlockDeathAliveCOunt = false;
		public boolean coderedeemblock = false;
		public boolean GoodLuck = false;
		public boolean healthreductiondday = false;
		public boolean playerready = false;
		public boolean SharkoRetryState = false;
		public boolean timeoverlaytoggle = false;
		public boolean crucifixsavedentity = false;
		public boolean WelcomeBackToggle = false;
		public boolean MaxPercentGiveOptionToDoHardestMobDiff = false;
		public boolean playerstunnedmobs = false;
		public boolean DoomsdayTrackToggle = false;
		public boolean DoomsdayRiskTrackToggle = false;
		public boolean sharkolayingstate = false;
		public boolean recipebookantimattercraftstoggle = false;
		public boolean dashtoggle = false;
		public boolean SharkoLayCD = true;
		public boolean SharkoSleepCD = true;
		public boolean SharkoLayOnSideCD = true;
		public boolean SharkoSitCD = true;
		public boolean playerattackbackstabblock = true;
		public boolean entityabletodespawn = true;
		public boolean BlindShadowSharkEngieAttack = false;
		public boolean playerstunned = false;
		public boolean playerdebugmode = false;
		public boolean playerhasimmunity = false;
		public boolean truehardcorelifesobtained = false;
		public boolean boyoaprilfoolslaycheck = false;
		public boolean PlayerHasEngieGamesSwordAdvancement = false;
		public boolean PlayerHasAntimatterEngieGamesSwordAdvancement = false;
		public boolean PlayerHas101PercentAdvancement = false;
		public boolean crucifixbypass = false;
		public double missileyellowlightningscale = 1.0;
		public double missileblueburstscale = 1.0;
		public double missilenormalscale = 1.0;
		public double missilemoabscale = 1.0;
		public boolean hphudtoggle = true;
		public double HostileBiblicallyKillCount = 0;
		public double HostileEngieKillCount = 0;
		public boolean madplushesobtained = false;
		public boolean angryplushesobtained = false;
		public boolean enragedplushesobtained = false;
		public boolean outragedplushesobtained = false;
		public boolean biblicallyplushesobtained = false;
		public boolean monstrosityplushesobtained = false;
		public boolean hostileplushesobtained = false;
		public boolean insanityplushesobtained = false;
		public boolean playercountedtoplayercount = false;
		public boolean diffadvancement1 = false;
		public boolean diffadvancement2 = false;
		public boolean diffadvancement3 = false;
		public boolean diffadvancement4 = false;
		public boolean diffadvancement5 = false;
		public boolean diffadvancement6 = false;
		public boolean diffadvancement7 = false;
		public boolean diffadvancement8 = false;
		public boolean diffadvancement9 = false;
		public boolean diffadvancement10 = false;
		public boolean diffadvancement11 = false;
		public boolean diffadvancement12 = false;
		public boolean diffadvancement13 = false;
		public boolean diffadvancement14 = false;
		public boolean diffadvancement15 = false;
		public boolean diffadvancement16 = false;
		public boolean diffadvancement17 = false;
		public boolean diffadvancement18 = false;
		public boolean diffadvancement19 = false;
		public boolean diffadvancement20 = false;
		public boolean diffadvancement21 = false;
		public boolean diffadvancement22 = false;
		public boolean diffadvancement23 = false;
		public boolean diffadvancement24 = false;
		public boolean diffadvancement25 = false;
		public boolean diffadvancement26 = false;
		public boolean diffadvancement27 = false;
		public boolean diffadvancement28 = false;
		public boolean diffadvancement29 = false;
		public boolean diffadvancement30 = false;
		public boolean diffadvancement31 = false;
		public boolean diffadvancement32 = false;
		public boolean ddayplayeraddedtodeadcount = false;
		public boolean doublejumping = false;
		public double CrucifixMainHandDurabilityPercentage = 0;
		public double CrucifixOffHandDurabilityPercentage = 0;
		public double pickaxeonly = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("RiftX", RiftX);
			nbt.putDouble("RiftY", RiftY);
			nbt.putDouble("RiftZ", RiftZ);
			nbt.putDouble("MonstrosityEngieKillCount", MonstrosityEngieKillCount);
			nbt.putDouble("PureInsanityKillCount", PureInsanityKillCount);
			nbt.putDouble("dashleftclickcount", dashleftclickcount);
			nbt.putDouble("AngryEngieKillCount", AngryEngieKillCount);
			nbt.putDouble("browniescount", browniescount);
			nbt.putDouble("cheeseballcount", cheeseballcount);
			nbt.putDouble("EnragedEngieKillCount", EnragedEngieKillCount);
			nbt.putDouble("InsanityKillCount", InsanityKillCount);
			nbt.putDouble("MadEngieKillCount", MadEngieKillCount);
			nbt.putDouble("OutragedEngieKillCount", OutragedEngieKillCount);
			nbt.putDouble("PlayerX", PlayerX);
			nbt.putDouble("PlayerY", PlayerY);
			nbt.putDouble("PlayerZ", PlayerZ);
			nbt.putDouble("pageNumber", pageNumber);
			nbt.putDouble("TrueHardcoreLifeCount", TrueHardcoreLifeCount);
			nbt.putDouble("HHGLookX", HHGLookX);
			nbt.putDouble("HHGLookY", HHGLookY);
			nbt.putDouble("HHGLookZ", HHGLookZ);
			nbt.putDouble("difficultyoverlaytoggle", difficultyoverlaytoggle);
			nbt.putDouble("doublejumpcount", doublejumpcount);
			nbt.putDouble("engiegameshallowscythestatclock", engiegameshallowscythestatclock);
			nbt.putDouble("TrueHardcoreMaxLifeCount", TrueHardcoreMaxLifeCount);
			nbt.putDouble("TrueHardcoreLifeChangeAmount", TrueHardcoreLifeChangeAmount);
			nbt.putDouble("CountUntilBaseDrop", CountUntilBaseDrop);
			nbt.putDouble("lightningflashnum", lightningflashnum);
			nbt.putDouble("PlayerDeathX", PlayerDeathX);
			nbt.putDouble("PlayerDeathY", PlayerDeathY);
			nbt.putDouble("PlayerDeathZ", PlayerDeathZ);
			nbt.putBoolean("riftspawnoneentity", riftspawnoneentity);
			nbt.putBoolean("DoomsdayAlive", DoomsdayAlive);
			nbt.putBoolean("firstplay", firstplay);
			nbt.putBoolean("RespawnNormInstantHealth", RespawnNormInstantHealth);
			nbt.putBoolean("RespawnTrueHardcoreGraceStart", RespawnTrueHardcoreGraceStart);
			nbt.putBoolean("BlockDeathAliveCOunt", BlockDeathAliveCOunt);
			nbt.putBoolean("coderedeemblock", coderedeemblock);
			nbt.putBoolean("GoodLuck", GoodLuck);
			nbt.putBoolean("healthreductiondday", healthreductiondday);
			nbt.putBoolean("playerready", playerready);
			nbt.putBoolean("SharkoRetryState", SharkoRetryState);
			nbt.putBoolean("timeoverlaytoggle", timeoverlaytoggle);
			nbt.putBoolean("crucifixsavedentity", crucifixsavedentity);
			nbt.putBoolean("WelcomeBackToggle", WelcomeBackToggle);
			nbt.putBoolean("MaxPercentGiveOptionToDoHardestMobDiff", MaxPercentGiveOptionToDoHardestMobDiff);
			nbt.putBoolean("playerstunnedmobs", playerstunnedmobs);
			nbt.putBoolean("DoomsdayTrackToggle", DoomsdayTrackToggle);
			nbt.putBoolean("DoomsdayRiskTrackToggle", DoomsdayRiskTrackToggle);
			nbt.putBoolean("sharkolayingstate", sharkolayingstate);
			nbt.putBoolean("recipebookantimattercraftstoggle", recipebookantimattercraftstoggle);
			nbt.putBoolean("dashtoggle", dashtoggle);
			nbt.putBoolean("SharkoLayCD", SharkoLayCD);
			nbt.putBoolean("SharkoSleepCD", SharkoSleepCD);
			nbt.putBoolean("SharkoLayOnSideCD", SharkoLayOnSideCD);
			nbt.putBoolean("SharkoSitCD", SharkoSitCD);
			nbt.putBoolean("playerattackbackstabblock", playerattackbackstabblock);
			nbt.putBoolean("entityabletodespawn", entityabletodespawn);
			nbt.putBoolean("BlindShadowSharkEngieAttack", BlindShadowSharkEngieAttack);
			nbt.putBoolean("playerstunned", playerstunned);
			nbt.putBoolean("playerdebugmode", playerdebugmode);
			nbt.putBoolean("playerhasimmunity", playerhasimmunity);
			nbt.putBoolean("truehardcorelifesobtained", truehardcorelifesobtained);
			nbt.putBoolean("boyoaprilfoolslaycheck", boyoaprilfoolslaycheck);
			nbt.putBoolean("PlayerHasEngieGamesSwordAdvancement", PlayerHasEngieGamesSwordAdvancement);
			nbt.putBoolean("PlayerHasAntimatterEngieGamesSwordAdvancement", PlayerHasAntimatterEngieGamesSwordAdvancement);
			nbt.putBoolean("PlayerHas101PercentAdvancement", PlayerHas101PercentAdvancement);
			nbt.putBoolean("crucifixbypass", crucifixbypass);
			nbt.putDouble("missileyellowlightningscale", missileyellowlightningscale);
			nbt.putDouble("missileblueburstscale", missileblueburstscale);
			nbt.putDouble("missilenormalscale", missilenormalscale);
			nbt.putDouble("missilemoabscale", missilemoabscale);
			nbt.putBoolean("hphudtoggle", hphudtoggle);
			nbt.putDouble("HostileBiblicallyKillCount", HostileBiblicallyKillCount);
			nbt.putDouble("HostileEngieKillCount", HostileEngieKillCount);
			nbt.putBoolean("madplushesobtained", madplushesobtained);
			nbt.putBoolean("angryplushesobtained", angryplushesobtained);
			nbt.putBoolean("enragedplushesobtained", enragedplushesobtained);
			nbt.putBoolean("outragedplushesobtained", outragedplushesobtained);
			nbt.putBoolean("biblicallyplushesobtained", biblicallyplushesobtained);
			nbt.putBoolean("monstrosityplushesobtained", monstrosityplushesobtained);
			nbt.putBoolean("hostileplushesobtained", hostileplushesobtained);
			nbt.putBoolean("insanityplushesobtained", insanityplushesobtained);
			nbt.putBoolean("playercountedtoplayercount", playercountedtoplayercount);
			nbt.putBoolean("diffadvancement1", diffadvancement1);
			nbt.putBoolean("diffadvancement2", diffadvancement2);
			nbt.putBoolean("diffadvancement3", diffadvancement3);
			nbt.putBoolean("diffadvancement4", diffadvancement4);
			nbt.putBoolean("diffadvancement5", diffadvancement5);
			nbt.putBoolean("diffadvancement6", diffadvancement6);
			nbt.putBoolean("diffadvancement7", diffadvancement7);
			nbt.putBoolean("diffadvancement8", diffadvancement8);
			nbt.putBoolean("diffadvancement9", diffadvancement9);
			nbt.putBoolean("diffadvancement10", diffadvancement10);
			nbt.putBoolean("diffadvancement11", diffadvancement11);
			nbt.putBoolean("diffadvancement12", diffadvancement12);
			nbt.putBoolean("diffadvancement13", diffadvancement13);
			nbt.putBoolean("diffadvancement14", diffadvancement14);
			nbt.putBoolean("diffadvancement15", diffadvancement15);
			nbt.putBoolean("diffadvancement16", diffadvancement16);
			nbt.putBoolean("diffadvancement17", diffadvancement17);
			nbt.putBoolean("diffadvancement18", diffadvancement18);
			nbt.putBoolean("diffadvancement19", diffadvancement19);
			nbt.putBoolean("diffadvancement20", diffadvancement20);
			nbt.putBoolean("diffadvancement21", diffadvancement21);
			nbt.putBoolean("diffadvancement22", diffadvancement22);
			nbt.putBoolean("diffadvancement23", diffadvancement23);
			nbt.putBoolean("diffadvancement24", diffadvancement24);
			nbt.putBoolean("diffadvancement25", diffadvancement25);
			nbt.putBoolean("diffadvancement26", diffadvancement26);
			nbt.putBoolean("diffadvancement27", diffadvancement27);
			nbt.putBoolean("diffadvancement28", diffadvancement28);
			nbt.putBoolean("diffadvancement29", diffadvancement29);
			nbt.putBoolean("diffadvancement30", diffadvancement30);
			nbt.putBoolean("diffadvancement31", diffadvancement31);
			nbt.putBoolean("diffadvancement32", diffadvancement32);
			nbt.putBoolean("ddayplayeraddedtodeadcount", ddayplayeraddedtodeadcount);
			nbt.putBoolean("doublejumping", doublejumping);
			nbt.putDouble("CrucifixMainHandDurabilityPercentage", CrucifixMainHandDurabilityPercentage);
			nbt.putDouble("CrucifixOffHandDurabilityPercentage", CrucifixOffHandDurabilityPercentage);
			nbt.putDouble("pickaxeonly", pickaxeonly);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			RiftX = nbt.getDouble("RiftX");
			RiftY = nbt.getDouble("RiftY");
			RiftZ = nbt.getDouble("RiftZ");
			MonstrosityEngieKillCount = nbt.getDouble("MonstrosityEngieKillCount");
			PureInsanityKillCount = nbt.getDouble("PureInsanityKillCount");
			dashleftclickcount = nbt.getDouble("dashleftclickcount");
			AngryEngieKillCount = nbt.getDouble("AngryEngieKillCount");
			browniescount = nbt.getDouble("browniescount");
			cheeseballcount = nbt.getDouble("cheeseballcount");
			EnragedEngieKillCount = nbt.getDouble("EnragedEngieKillCount");
			InsanityKillCount = nbt.getDouble("InsanityKillCount");
			MadEngieKillCount = nbt.getDouble("MadEngieKillCount");
			OutragedEngieKillCount = nbt.getDouble("OutragedEngieKillCount");
			PlayerX = nbt.getDouble("PlayerX");
			PlayerY = nbt.getDouble("PlayerY");
			PlayerZ = nbt.getDouble("PlayerZ");
			pageNumber = nbt.getDouble("pageNumber");
			TrueHardcoreLifeCount = nbt.getDouble("TrueHardcoreLifeCount");
			HHGLookX = nbt.getDouble("HHGLookX");
			HHGLookY = nbt.getDouble("HHGLookY");
			HHGLookZ = nbt.getDouble("HHGLookZ");
			difficultyoverlaytoggle = nbt.getDouble("difficultyoverlaytoggle");
			doublejumpcount = nbt.getDouble("doublejumpcount");
			engiegameshallowscythestatclock = nbt.getDouble("engiegameshallowscythestatclock");
			TrueHardcoreMaxLifeCount = nbt.getDouble("TrueHardcoreMaxLifeCount");
			TrueHardcoreLifeChangeAmount = nbt.getDouble("TrueHardcoreLifeChangeAmount");
			CountUntilBaseDrop = nbt.getDouble("CountUntilBaseDrop");
			lightningflashnum = nbt.getDouble("lightningflashnum");
			PlayerDeathX = nbt.getDouble("PlayerDeathX");
			PlayerDeathY = nbt.getDouble("PlayerDeathY");
			PlayerDeathZ = nbt.getDouble("PlayerDeathZ");
			riftspawnoneentity = nbt.getBoolean("riftspawnoneentity");
			DoomsdayAlive = nbt.getBoolean("DoomsdayAlive");
			firstplay = nbt.getBoolean("firstplay");
			RespawnNormInstantHealth = nbt.getBoolean("RespawnNormInstantHealth");
			RespawnTrueHardcoreGraceStart = nbt.getBoolean("RespawnTrueHardcoreGraceStart");
			BlockDeathAliveCOunt = nbt.getBoolean("BlockDeathAliveCOunt");
			coderedeemblock = nbt.getBoolean("coderedeemblock");
			GoodLuck = nbt.getBoolean("GoodLuck");
			healthreductiondday = nbt.getBoolean("healthreductiondday");
			playerready = nbt.getBoolean("playerready");
			SharkoRetryState = nbt.getBoolean("SharkoRetryState");
			timeoverlaytoggle = nbt.getBoolean("timeoverlaytoggle");
			crucifixsavedentity = nbt.getBoolean("crucifixsavedentity");
			WelcomeBackToggle = nbt.getBoolean("WelcomeBackToggle");
			MaxPercentGiveOptionToDoHardestMobDiff = nbt.getBoolean("MaxPercentGiveOptionToDoHardestMobDiff");
			playerstunnedmobs = nbt.getBoolean("playerstunnedmobs");
			DoomsdayTrackToggle = nbt.getBoolean("DoomsdayTrackToggle");
			DoomsdayRiskTrackToggle = nbt.getBoolean("DoomsdayRiskTrackToggle");
			sharkolayingstate = nbt.getBoolean("sharkolayingstate");
			recipebookantimattercraftstoggle = nbt.getBoolean("recipebookantimattercraftstoggle");
			dashtoggle = nbt.getBoolean("dashtoggle");
			SharkoLayCD = nbt.getBoolean("SharkoLayCD");
			SharkoSleepCD = nbt.getBoolean("SharkoSleepCD");
			SharkoLayOnSideCD = nbt.getBoolean("SharkoLayOnSideCD");
			SharkoSitCD = nbt.getBoolean("SharkoSitCD");
			playerattackbackstabblock = nbt.getBoolean("playerattackbackstabblock");
			entityabletodespawn = nbt.getBoolean("entityabletodespawn");
			BlindShadowSharkEngieAttack = nbt.getBoolean("BlindShadowSharkEngieAttack");
			playerstunned = nbt.getBoolean("playerstunned");
			playerdebugmode = nbt.getBoolean("playerdebugmode");
			playerhasimmunity = nbt.getBoolean("playerhasimmunity");
			truehardcorelifesobtained = nbt.getBoolean("truehardcorelifesobtained");
			boyoaprilfoolslaycheck = nbt.getBoolean("boyoaprilfoolslaycheck");
			PlayerHasEngieGamesSwordAdvancement = nbt.getBoolean("PlayerHasEngieGamesSwordAdvancement");
			PlayerHasAntimatterEngieGamesSwordAdvancement = nbt.getBoolean("PlayerHasAntimatterEngieGamesSwordAdvancement");
			PlayerHas101PercentAdvancement = nbt.getBoolean("PlayerHas101PercentAdvancement");
			crucifixbypass = nbt.getBoolean("crucifixbypass");
			missileyellowlightningscale = nbt.getDouble("missileyellowlightningscale");
			missileblueburstscale = nbt.getDouble("missileblueburstscale");
			missilenormalscale = nbt.getDouble("missilenormalscale");
			missilemoabscale = nbt.getDouble("missilemoabscale");
			hphudtoggle = nbt.getBoolean("hphudtoggle");
			HostileBiblicallyKillCount = nbt.getDouble("HostileBiblicallyKillCount");
			HostileEngieKillCount = nbt.getDouble("HostileEngieKillCount");
			madplushesobtained = nbt.getBoolean("madplushesobtained");
			angryplushesobtained = nbt.getBoolean("angryplushesobtained");
			enragedplushesobtained = nbt.getBoolean("enragedplushesobtained");
			outragedplushesobtained = nbt.getBoolean("outragedplushesobtained");
			biblicallyplushesobtained = nbt.getBoolean("biblicallyplushesobtained");
			monstrosityplushesobtained = nbt.getBoolean("monstrosityplushesobtained");
			hostileplushesobtained = nbt.getBoolean("hostileplushesobtained");
			insanityplushesobtained = nbt.getBoolean("insanityplushesobtained");
			playercountedtoplayercount = nbt.getBoolean("playercountedtoplayercount");
			diffadvancement1 = nbt.getBoolean("diffadvancement1");
			diffadvancement2 = nbt.getBoolean("diffadvancement2");
			diffadvancement3 = nbt.getBoolean("diffadvancement3");
			diffadvancement4 = nbt.getBoolean("diffadvancement4");
			diffadvancement5 = nbt.getBoolean("diffadvancement5");
			diffadvancement6 = nbt.getBoolean("diffadvancement6");
			diffadvancement7 = nbt.getBoolean("diffadvancement7");
			diffadvancement8 = nbt.getBoolean("diffadvancement8");
			diffadvancement9 = nbt.getBoolean("diffadvancement9");
			diffadvancement10 = nbt.getBoolean("diffadvancement10");
			diffadvancement11 = nbt.getBoolean("diffadvancement11");
			diffadvancement12 = nbt.getBoolean("diffadvancement12");
			diffadvancement13 = nbt.getBoolean("diffadvancement13");
			diffadvancement14 = nbt.getBoolean("diffadvancement14");
			diffadvancement15 = nbt.getBoolean("diffadvancement15");
			diffadvancement16 = nbt.getBoolean("diffadvancement16");
			diffadvancement17 = nbt.getBoolean("diffadvancement17");
			diffadvancement18 = nbt.getBoolean("diffadvancement18");
			diffadvancement19 = nbt.getBoolean("diffadvancement19");
			diffadvancement20 = nbt.getBoolean("diffadvancement20");
			diffadvancement21 = nbt.getBoolean("diffadvancement21");
			diffadvancement22 = nbt.getBoolean("diffadvancement22");
			diffadvancement23 = nbt.getBoolean("diffadvancement23");
			diffadvancement24 = nbt.getBoolean("diffadvancement24");
			diffadvancement25 = nbt.getBoolean("diffadvancement25");
			diffadvancement26 = nbt.getBoolean("diffadvancement26");
			diffadvancement27 = nbt.getBoolean("diffadvancement27");
			diffadvancement28 = nbt.getBoolean("diffadvancement28");
			diffadvancement29 = nbt.getBoolean("diffadvancement29");
			diffadvancement30 = nbt.getBoolean("diffadvancement30");
			diffadvancement31 = nbt.getBoolean("diffadvancement31");
			diffadvancement32 = nbt.getBoolean("diffadvancement32");
			ddayplayeraddedtodeadcount = nbt.getBoolean("ddayplayeraddedtodeadcount");
			doublejumping = nbt.getBoolean("doublejumping");
			CrucifixMainHandDurabilityPercentage = nbt.getDouble("CrucifixMainHandDurabilityPercentage");
			CrucifixOffHandDurabilityPercentage = nbt.getDouble("CrucifixOffHandDurabilityPercentage");
			pickaxeonly = nbt.getDouble("pickaxeonly");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.RiftX = message.data.RiftX;
					variables.RiftY = message.data.RiftY;
					variables.RiftZ = message.data.RiftZ;
					variables.MonstrosityEngieKillCount = message.data.MonstrosityEngieKillCount;
					variables.PureInsanityKillCount = message.data.PureInsanityKillCount;
					variables.dashleftclickcount = message.data.dashleftclickcount;
					variables.AngryEngieKillCount = message.data.AngryEngieKillCount;
					variables.browniescount = message.data.browniescount;
					variables.cheeseballcount = message.data.cheeseballcount;
					variables.EnragedEngieKillCount = message.data.EnragedEngieKillCount;
					variables.InsanityKillCount = message.data.InsanityKillCount;
					variables.MadEngieKillCount = message.data.MadEngieKillCount;
					variables.OutragedEngieKillCount = message.data.OutragedEngieKillCount;
					variables.PlayerX = message.data.PlayerX;
					variables.PlayerY = message.data.PlayerY;
					variables.PlayerZ = message.data.PlayerZ;
					variables.pageNumber = message.data.pageNumber;
					variables.TrueHardcoreLifeCount = message.data.TrueHardcoreLifeCount;
					variables.HHGLookX = message.data.HHGLookX;
					variables.HHGLookY = message.data.HHGLookY;
					variables.HHGLookZ = message.data.HHGLookZ;
					variables.difficultyoverlaytoggle = message.data.difficultyoverlaytoggle;
					variables.doublejumpcount = message.data.doublejumpcount;
					variables.engiegameshallowscythestatclock = message.data.engiegameshallowscythestatclock;
					variables.TrueHardcoreMaxLifeCount = message.data.TrueHardcoreMaxLifeCount;
					variables.TrueHardcoreLifeChangeAmount = message.data.TrueHardcoreLifeChangeAmount;
					variables.CountUntilBaseDrop = message.data.CountUntilBaseDrop;
					variables.lightningflashnum = message.data.lightningflashnum;
					variables.PlayerDeathX = message.data.PlayerDeathX;
					variables.PlayerDeathY = message.data.PlayerDeathY;
					variables.PlayerDeathZ = message.data.PlayerDeathZ;
					variables.riftspawnoneentity = message.data.riftspawnoneentity;
					variables.DoomsdayAlive = message.data.DoomsdayAlive;
					variables.firstplay = message.data.firstplay;
					variables.RespawnNormInstantHealth = message.data.RespawnNormInstantHealth;
					variables.RespawnTrueHardcoreGraceStart = message.data.RespawnTrueHardcoreGraceStart;
					variables.BlockDeathAliveCOunt = message.data.BlockDeathAliveCOunt;
					variables.coderedeemblock = message.data.coderedeemblock;
					variables.GoodLuck = message.data.GoodLuck;
					variables.healthreductiondday = message.data.healthreductiondday;
					variables.playerready = message.data.playerready;
					variables.SharkoRetryState = message.data.SharkoRetryState;
					variables.timeoverlaytoggle = message.data.timeoverlaytoggle;
					variables.crucifixsavedentity = message.data.crucifixsavedentity;
					variables.WelcomeBackToggle = message.data.WelcomeBackToggle;
					variables.MaxPercentGiveOptionToDoHardestMobDiff = message.data.MaxPercentGiveOptionToDoHardestMobDiff;
					variables.playerstunnedmobs = message.data.playerstunnedmobs;
					variables.DoomsdayTrackToggle = message.data.DoomsdayTrackToggle;
					variables.DoomsdayRiskTrackToggle = message.data.DoomsdayRiskTrackToggle;
					variables.sharkolayingstate = message.data.sharkolayingstate;
					variables.recipebookantimattercraftstoggle = message.data.recipebookantimattercraftstoggle;
					variables.dashtoggle = message.data.dashtoggle;
					variables.SharkoLayCD = message.data.SharkoLayCD;
					variables.SharkoSleepCD = message.data.SharkoSleepCD;
					variables.SharkoLayOnSideCD = message.data.SharkoLayOnSideCD;
					variables.SharkoSitCD = message.data.SharkoSitCD;
					variables.playerattackbackstabblock = message.data.playerattackbackstabblock;
					variables.entityabletodespawn = message.data.entityabletodespawn;
					variables.BlindShadowSharkEngieAttack = message.data.BlindShadowSharkEngieAttack;
					variables.playerstunned = message.data.playerstunned;
					variables.playerdebugmode = message.data.playerdebugmode;
					variables.playerhasimmunity = message.data.playerhasimmunity;
					variables.truehardcorelifesobtained = message.data.truehardcorelifesobtained;
					variables.boyoaprilfoolslaycheck = message.data.boyoaprilfoolslaycheck;
					variables.PlayerHasEngieGamesSwordAdvancement = message.data.PlayerHasEngieGamesSwordAdvancement;
					variables.PlayerHasAntimatterEngieGamesSwordAdvancement = message.data.PlayerHasAntimatterEngieGamesSwordAdvancement;
					variables.PlayerHas101PercentAdvancement = message.data.PlayerHas101PercentAdvancement;
					variables.crucifixbypass = message.data.crucifixbypass;
					variables.missileyellowlightningscale = message.data.missileyellowlightningscale;
					variables.missileblueburstscale = message.data.missileblueburstscale;
					variables.missilenormalscale = message.data.missilenormalscale;
					variables.missilemoabscale = message.data.missilemoabscale;
					variables.hphudtoggle = message.data.hphudtoggle;
					variables.HostileBiblicallyKillCount = message.data.HostileBiblicallyKillCount;
					variables.HostileEngieKillCount = message.data.HostileEngieKillCount;
					variables.madplushesobtained = message.data.madplushesobtained;
					variables.angryplushesobtained = message.data.angryplushesobtained;
					variables.enragedplushesobtained = message.data.enragedplushesobtained;
					variables.outragedplushesobtained = message.data.outragedplushesobtained;
					variables.biblicallyplushesobtained = message.data.biblicallyplushesobtained;
					variables.monstrosityplushesobtained = message.data.monstrosityplushesobtained;
					variables.hostileplushesobtained = message.data.hostileplushesobtained;
					variables.insanityplushesobtained = message.data.insanityplushesobtained;
					variables.playercountedtoplayercount = message.data.playercountedtoplayercount;
					variables.diffadvancement1 = message.data.diffadvancement1;
					variables.diffadvancement2 = message.data.diffadvancement2;
					variables.diffadvancement3 = message.data.diffadvancement3;
					variables.diffadvancement4 = message.data.diffadvancement4;
					variables.diffadvancement5 = message.data.diffadvancement5;
					variables.diffadvancement6 = message.data.diffadvancement6;
					variables.diffadvancement7 = message.data.diffadvancement7;
					variables.diffadvancement8 = message.data.diffadvancement8;
					variables.diffadvancement9 = message.data.diffadvancement9;
					variables.diffadvancement10 = message.data.diffadvancement10;
					variables.diffadvancement11 = message.data.diffadvancement11;
					variables.diffadvancement12 = message.data.diffadvancement12;
					variables.diffadvancement13 = message.data.diffadvancement13;
					variables.diffadvancement14 = message.data.diffadvancement14;
					variables.diffadvancement15 = message.data.diffadvancement15;
					variables.diffadvancement16 = message.data.diffadvancement16;
					variables.diffadvancement17 = message.data.diffadvancement17;
					variables.diffadvancement18 = message.data.diffadvancement18;
					variables.diffadvancement19 = message.data.diffadvancement19;
					variables.diffadvancement20 = message.data.diffadvancement20;
					variables.diffadvancement21 = message.data.diffadvancement21;
					variables.diffadvancement22 = message.data.diffadvancement22;
					variables.diffadvancement23 = message.data.diffadvancement23;
					variables.diffadvancement24 = message.data.diffadvancement24;
					variables.diffadvancement25 = message.data.diffadvancement25;
					variables.diffadvancement26 = message.data.diffadvancement26;
					variables.diffadvancement27 = message.data.diffadvancement27;
					variables.diffadvancement28 = message.data.diffadvancement28;
					variables.diffadvancement29 = message.data.diffadvancement29;
					variables.diffadvancement30 = message.data.diffadvancement30;
					variables.diffadvancement31 = message.data.diffadvancement31;
					variables.diffadvancement32 = message.data.diffadvancement32;
					variables.ddayplayeraddedtodeadcount = message.data.ddayplayeraddedtodeadcount;
					variables.doublejumping = message.data.doublejumping;
					variables.CrucifixMainHandDurabilityPercentage = message.data.CrucifixMainHandDurabilityPercentage;
					variables.CrucifixOffHandDurabilityPercentage = message.data.CrucifixOffHandDurabilityPercentage;
					variables.pickaxeonly = message.data.pickaxeonly;
				}
			});
			context.setPacketHandled(true);
		}
	}
}