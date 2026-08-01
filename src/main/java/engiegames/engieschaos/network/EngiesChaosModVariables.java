package engiegames.engieschaos.network;

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

import engiegames.engieschaos.EngiesChaosMod;

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
			clone.RX = original.RX;
			clone.RY = original.RY;
			clone.RZ = original.RZ;
			clone.TrueHardcoreMaxLifeCount = original.TrueHardcoreMaxLifeCount;
			clone.TrueHardcoreLifeChangeAmount = original.TrueHardcoreLifeChangeAmount;
			clone.CountUntilBaseDrop = original.CountUntilBaseDrop;
			clone.lightningflashnum = original.lightningflashnum;
			clone.PlayerDeathX = original.PlayerDeathX;
			clone.PlayerDeathY = original.PlayerDeathY;
			clone.PlayerDeathZ = original.PlayerDeathZ;
			clone.riftspawnoneentity = original.riftspawnoneentity;
			clone.BlockDeathAliveCOunt = original.BlockDeathAliveCOunt;
			clone.coderedeemblock = original.coderedeemblock;
			clone.detecstart = original.detecstart;
			clone.GoodLuck = original.GoodLuck;
			clone.healthreductiondday = original.healthreductiondday;
			clone.playerready = original.playerready;
			clone.SharkoRetryState = original.SharkoRetryState;
			clone.timeoverlaytoggle = original.timeoverlaytoggle;
			clone.crucifixsavedentity = original.crucifixsavedentity;
			clone.WelcomeBackToggle = original.WelcomeBackToggle;
			clone.MaxPercentGiveOptionToDoHardestMobDiff = original.MaxPercentGiveOptionToDoHardestMobDiff;
			clone.playerstunnedmobs = original.playerstunnedmobs;
			clone.playerstunoffcooldown = original.playerstunoffcooldown;
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
			if (!event.isWasDeath()) {
				clone.playeroverhealhp = original.playeroverhealhp;
				clone.DoomsdayAlive = original.DoomsdayAlive;
				clone.firstplay = original.firstplay;
				clone.RespawnNormInstantHealth = original.RespawnNormInstantHealth;
				clone.RespawnTrueHardcoreGraceStart = original.RespawnTrueHardcoreGraceStart;
				clone.playeralive = original.playeralive;
				clone.missileyellowlightningscale = original.missileyellowlightningscale;
				clone.missileblueburstscale = original.missileblueburstscale;
				clone.missilenormalscale = original.missilenormalscale;
				clone.missilemoabscale = original.missilemoabscale;
				clone.avascale = original.avascale;
				clone.riftballscale = original.riftballscale;
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
		public double PlayerWorldCount = 0;
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
		public double getdamage2 = 0;
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
		public double DoomsDayAliveCount = 0.0;
		public double DoomsdayDeathCount = 0.0;
		public double DoomsdayRiskFailCount = 0.0;
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
		public double playerkilledmobswithoutpickaxeonlycount = 0;
		public double doomsdaymainsongtimer = 0;
		public double doomsdaytimer = 720.0;
		public double darknessretrycooldown = 0.0;
		public double missilecooldown = 0.0;
		public double lightningcooldown = 0.0;
		public double riftcooldown = 0.0;
		public double ddaydialoguenum = 0.0;
		public double doomsdaychance = 0.01;
		public double superdoomsdaytimer = 840.0;
		public double theendtimer = 960.0;
		public double engieswrathtimer = 1200.0;
		public double stunmobsradiusnum = 100.0;
		public double spikecooldown = 0;
		public double avalanchecooldown = 0;
		public double doomsdayaltsongtimer = 100.0;
		public double apocdayonestart = 0;
		public double TimeUntilNight = 0.0;
		public double DialogueCooldownStart = 0.0;
		public double doomsdaymaxtime = 0;
		public double superdoomsdaymaxtime = 0;
		public double theendmaxtime = 0;
		public double engieswrathmaxtime = 1525.0;
		public double ddayprophnumb = 0;
		public double ddayprophtimerdisaster = 0;
		public double ddayprophnumbertotal = 0;
		public double ddayprophwaittime = 0;
		public double spikecooldownamount = 0;
		public boolean Birthday = false;
		public boolean birthdaystart = false;
		public boolean BYEBYE = false;
		public boolean ChallengeToggle = false;
		public boolean checkboxbothmarked = false;
		public boolean checkboxbothnomarked = false;
		public boolean darknesscooldown = false;
		public boolean DayCooldownToggle = false;
		public boolean ddaydialoguetimeblock = false;
		public boolean ddaystart = false;
		public boolean ddaytimenighttimerblock = false;
		public boolean DoomsdayEeriePlayOnce = false;
		public boolean doomsdaymainsongstart = false;
		public boolean DoomsDayStart = false;
		public boolean GOODBYE = false;
		public boolean hewhowatches = false;
		public boolean HHGkilledtoggle = false;
		public boolean itemswap1 = false;
		public boolean itemswap2 = false;
		public boolean lightningcooldowndday = false;
		public boolean madlads = false;
		public boolean multiplayertrophyobtained = false;
		public boolean OHBOY = false;
		public boolean OHNO = false;
		public boolean riskcheckedstart = false;
		public boolean sddaydialoguetimeblock = false;
		public boolean sddaystart = false;
		public boolean sddaytimenighttimerblock = false;
		public boolean SDDAYToggle = false;
		public boolean seasonautumn = false;
		public boolean seasonspring = false;
		public boolean seasonsummer = false;
		public boolean seasonwinter = false;
		public boolean SuperDoomsdayEeriePlayOnce = false;
		public boolean SuperDoomsDayStart = false;
		public boolean theenddialoguetimeblock = false;
		public boolean TheEndEeriePlayOnce = false;
		public boolean theendhalf1complete = false;
		public boolean TheEndStart = false;
		public boolean theendtimenighttimerblock = false;
		public boolean thestart = false;
		public boolean timecheckstop = false;
		public boolean waittildoomsday = false;
		public boolean waittilsdoomsday = false;
		public boolean antimatterdropcheck = false;
		public boolean detectedothermodesenabledthrowback = false;
		public boolean graceperiodbeforeplushangryagain = false;
		public boolean ddaywait = true;
		public boolean riskcooldown = true;
		public boolean sddaywait = true;
		public boolean theendwait = true;
		public boolean CosmicEngieGamesSpawnLock = true;
		public boolean CosmicEngieGamesDespawnLock = true;
		public boolean FallingTreeInstalled = false;
		public boolean VeinMinerInstalled = false;
		public boolean ShowObjectiveOverlay = false;
		public boolean solotrophyobtained = false;
		public boolean difficultytoggle = true;
		public boolean engieswrathstart = false;
		public boolean EngiesWrathStart = false;
		public boolean ewrathdialoguetimeblock = false;
		public boolean ewrathtimenighttimerblock = false;
		public boolean ewrathwait = true;
		public boolean waittiltheend = false;
		public boolean waittilewrath = false;
		public boolean EngiesWrathEeriePlayOnce = false;
		public boolean truehardcoreenabledonworld = false;
		public boolean specialhealth = false;
		public boolean playlightningsound = false;
		public boolean playriftsound = false;
		public boolean playlightningsound2 = false;
		public boolean playlightningcornersound = false;
		public boolean ddayscornerlightning = false;
		public boolean playriftsound2 = false;
		public boolean playlightningsound3 = false;
		public boolean playlightningsound4 = false;
		public boolean DDAYCleanup = false;
		public boolean playlightningsound5 = false;
		public boolean playmissilespawnsound = false;
		public boolean playmissilespawnsound2 = false;
		public boolean playmissileexplosionsound = false;
		public boolean playmissileexplosionsound2 = false;
		public boolean shadowsharkdevspawn = false;
		public boolean DayCheck = false;
		public boolean NightCheck = false;
		public boolean doomsdayaltsongstart = false;
		public boolean ddayhalf1 = true;
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
		public boolean waitforriftdespawn = false;
		public boolean waitformissiledespawn = false;
		public boolean waitforavalanchedespawn = false;
		public boolean waitforspikedespawn = false;
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

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			getdamage = nbt.getDouble("getdamage");
			MobDifficulty = nbt.getDouble("MobDifficulty");
			PlayerWorldCount = nbt.getDouble("PlayerWorldCount");
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
			getdamage2 = nbt.getDouble("getdamage2");
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
			DoomsDayAliveCount = nbt.getDouble("DoomsDayAliveCount");
			DoomsdayDeathCount = nbt.getDouble("DoomsdayDeathCount");
			DoomsdayRiskFailCount = nbt.getDouble("DoomsdayRiskFailCount");
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
			playerkilledmobswithoutpickaxeonlycount = nbt.getDouble("playerkilledmobswithoutpickaxeonlycount");
			doomsdaymainsongtimer = nbt.getDouble("doomsdaymainsongtimer");
			doomsdaytimer = nbt.getDouble("doomsdaytimer");
			darknessretrycooldown = nbt.getDouble("darknessretrycooldown");
			missilecooldown = nbt.getDouble("missilecooldown");
			lightningcooldown = nbt.getDouble("lightningcooldown");
			riftcooldown = nbt.getDouble("riftcooldown");
			ddaydialoguenum = nbt.getDouble("ddaydialoguenum");
			doomsdaychance = nbt.getDouble("doomsdaychance");
			superdoomsdaytimer = nbt.getDouble("superdoomsdaytimer");
			theendtimer = nbt.getDouble("theendtimer");
			engieswrathtimer = nbt.getDouble("engieswrathtimer");
			stunmobsradiusnum = nbt.getDouble("stunmobsradiusnum");
			spikecooldown = nbt.getDouble("spikecooldown");
			avalanchecooldown = nbt.getDouble("avalanchecooldown");
			doomsdayaltsongtimer = nbt.getDouble("doomsdayaltsongtimer");
			apocdayonestart = nbt.getDouble("apocdayonestart");
			TimeUntilNight = nbt.getDouble("TimeUntilNight");
			DialogueCooldownStart = nbt.getDouble("DialogueCooldownStart");
			doomsdaymaxtime = nbt.getDouble("doomsdaymaxtime");
			superdoomsdaymaxtime = nbt.getDouble("superdoomsdaymaxtime");
			theendmaxtime = nbt.getDouble("theendmaxtime");
			engieswrathmaxtime = nbt.getDouble("engieswrathmaxtime");
			ddayprophnumb = nbt.getDouble("ddayprophnumb");
			ddayprophtimerdisaster = nbt.getDouble("ddayprophtimerdisaster");
			ddayprophnumbertotal = nbt.getDouble("ddayprophnumbertotal");
			ddayprophwaittime = nbt.getDouble("ddayprophwaittime");
			spikecooldownamount = nbt.getDouble("spikecooldownamount");
			Birthday = nbt.getBoolean("Birthday");
			birthdaystart = nbt.getBoolean("birthdaystart");
			BYEBYE = nbt.getBoolean("BYEBYE");
			ChallengeToggle = nbt.getBoolean("ChallengeToggle");
			checkboxbothmarked = nbt.getBoolean("checkboxbothmarked");
			checkboxbothnomarked = nbt.getBoolean("checkboxbothnomarked");
			darknesscooldown = nbt.getBoolean("darknesscooldown");
			DayCooldownToggle = nbt.getBoolean("DayCooldownToggle");
			ddaydialoguetimeblock = nbt.getBoolean("ddaydialoguetimeblock");
			ddaystart = nbt.getBoolean("ddaystart");
			ddaytimenighttimerblock = nbt.getBoolean("ddaytimenighttimerblock");
			DoomsdayEeriePlayOnce = nbt.getBoolean("DoomsdayEeriePlayOnce");
			doomsdaymainsongstart = nbt.getBoolean("doomsdaymainsongstart");
			DoomsDayStart = nbt.getBoolean("DoomsDayStart");
			GOODBYE = nbt.getBoolean("GOODBYE");
			hewhowatches = nbt.getBoolean("hewhowatches");
			HHGkilledtoggle = nbt.getBoolean("HHGkilledtoggle");
			itemswap1 = nbt.getBoolean("itemswap1");
			itemswap2 = nbt.getBoolean("itemswap2");
			lightningcooldowndday = nbt.getBoolean("lightningcooldowndday");
			madlads = nbt.getBoolean("madlads");
			multiplayertrophyobtained = nbt.getBoolean("multiplayertrophyobtained");
			OHBOY = nbt.getBoolean("OHBOY");
			OHNO = nbt.getBoolean("OHNO");
			riskcheckedstart = nbt.getBoolean("riskcheckedstart");
			sddaydialoguetimeblock = nbt.getBoolean("sddaydialoguetimeblock");
			sddaystart = nbt.getBoolean("sddaystart");
			sddaytimenighttimerblock = nbt.getBoolean("sddaytimenighttimerblock");
			SDDAYToggle = nbt.getBoolean("SDDAYToggle");
			seasonautumn = nbt.getBoolean("seasonautumn");
			seasonspring = nbt.getBoolean("seasonspring");
			seasonsummer = nbt.getBoolean("seasonsummer");
			seasonwinter = nbt.getBoolean("seasonwinter");
			SuperDoomsdayEeriePlayOnce = nbt.getBoolean("SuperDoomsdayEeriePlayOnce");
			SuperDoomsDayStart = nbt.getBoolean("SuperDoomsDayStart");
			theenddialoguetimeblock = nbt.getBoolean("theenddialoguetimeblock");
			TheEndEeriePlayOnce = nbt.getBoolean("TheEndEeriePlayOnce");
			theendhalf1complete = nbt.getBoolean("theendhalf1complete");
			TheEndStart = nbt.getBoolean("TheEndStart");
			theendtimenighttimerblock = nbt.getBoolean("theendtimenighttimerblock");
			thestart = nbt.getBoolean("thestart");
			timecheckstop = nbt.getBoolean("timecheckstop");
			waittildoomsday = nbt.getBoolean("waittildoomsday");
			waittilsdoomsday = nbt.getBoolean("waittilsdoomsday");
			antimatterdropcheck = nbt.getBoolean("antimatterdropcheck");
			detectedothermodesenabledthrowback = nbt.getBoolean("detectedothermodesenabledthrowback");
			graceperiodbeforeplushangryagain = nbt.getBoolean("graceperiodbeforeplushangryagain");
			ddaywait = nbt.getBoolean("ddaywait");
			riskcooldown = nbt.getBoolean("riskcooldown");
			sddaywait = nbt.getBoolean("sddaywait");
			theendwait = nbt.getBoolean("theendwait");
			CosmicEngieGamesSpawnLock = nbt.getBoolean("CosmicEngieGamesSpawnLock");
			CosmicEngieGamesDespawnLock = nbt.getBoolean("CosmicEngieGamesDespawnLock");
			FallingTreeInstalled = nbt.getBoolean("FallingTreeInstalled");
			VeinMinerInstalled = nbt.getBoolean("VeinMinerInstalled");
			ShowObjectiveOverlay = nbt.getBoolean("ShowObjectiveOverlay");
			solotrophyobtained = nbt.getBoolean("solotrophyobtained");
			difficultytoggle = nbt.getBoolean("difficultytoggle");
			engieswrathstart = nbt.getBoolean("engieswrathstart");
			EngiesWrathStart = nbt.getBoolean("EngiesWrathStart");
			ewrathdialoguetimeblock = nbt.getBoolean("ewrathdialoguetimeblock");
			ewrathtimenighttimerblock = nbt.getBoolean("ewrathtimenighttimerblock");
			ewrathwait = nbt.getBoolean("ewrathwait");
			waittiltheend = nbt.getBoolean("waittiltheend");
			waittilewrath = nbt.getBoolean("waittilewrath");
			EngiesWrathEeriePlayOnce = nbt.getBoolean("EngiesWrathEeriePlayOnce");
			truehardcoreenabledonworld = nbt.getBoolean("truehardcoreenabledonworld");
			specialhealth = nbt.getBoolean("specialhealth");
			playlightningsound = nbt.getBoolean("playlightningsound");
			playriftsound = nbt.getBoolean("playriftsound");
			playlightningsound2 = nbt.getBoolean("playlightningsound2");
			playlightningcornersound = nbt.getBoolean("playlightningcornersound");
			ddayscornerlightning = nbt.getBoolean("ddayscornerlightning");
			playriftsound2 = nbt.getBoolean("playriftsound2");
			playlightningsound3 = nbt.getBoolean("playlightningsound3");
			playlightningsound4 = nbt.getBoolean("playlightningsound4");
			DDAYCleanup = nbt.getBoolean("DDAYCleanup");
			playlightningsound5 = nbt.getBoolean("playlightningsound5");
			playmissilespawnsound = nbt.getBoolean("playmissilespawnsound");
			playmissilespawnsound2 = nbt.getBoolean("playmissilespawnsound2");
			playmissileexplosionsound = nbt.getBoolean("playmissileexplosionsound");
			playmissileexplosionsound2 = nbt.getBoolean("playmissileexplosionsound2");
			shadowsharkdevspawn = nbt.getBoolean("shadowsharkdevspawn");
			DayCheck = nbt.getBoolean("DayCheck");
			NightCheck = nbt.getBoolean("NightCheck");
			doomsdayaltsongstart = nbt.getBoolean("doomsdayaltsongstart");
			ddayhalf1 = nbt.getBoolean("ddayhalf1");
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
			waitforriftdespawn = nbt.getBoolean("waitforriftdespawn");
			waitformissiledespawn = nbt.getBoolean("waitformissiledespawn");
			waitforavalanchedespawn = nbt.getBoolean("waitforavalanchedespawn");
			waitforspikedespawn = nbt.getBoolean("waitforspikedespawn");
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
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("getdamage", getdamage);
			nbt.putDouble("MobDifficulty", MobDifficulty);
			nbt.putDouble("PlayerWorldCount", PlayerWorldCount);
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
			nbt.putDouble("getdamage2", getdamage2);
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
			nbt.putDouble("DoomsDayAliveCount", DoomsDayAliveCount);
			nbt.putDouble("DoomsdayDeathCount", DoomsdayDeathCount);
			nbt.putDouble("DoomsdayRiskFailCount", DoomsdayRiskFailCount);
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
			nbt.putDouble("playerkilledmobswithoutpickaxeonlycount", playerkilledmobswithoutpickaxeonlycount);
			nbt.putDouble("doomsdaymainsongtimer", doomsdaymainsongtimer);
			nbt.putDouble("doomsdaytimer", doomsdaytimer);
			nbt.putDouble("darknessretrycooldown", darknessretrycooldown);
			nbt.putDouble("missilecooldown", missilecooldown);
			nbt.putDouble("lightningcooldown", lightningcooldown);
			nbt.putDouble("riftcooldown", riftcooldown);
			nbt.putDouble("ddaydialoguenum", ddaydialoguenum);
			nbt.putDouble("doomsdaychance", doomsdaychance);
			nbt.putDouble("superdoomsdaytimer", superdoomsdaytimer);
			nbt.putDouble("theendtimer", theendtimer);
			nbt.putDouble("engieswrathtimer", engieswrathtimer);
			nbt.putDouble("stunmobsradiusnum", stunmobsradiusnum);
			nbt.putDouble("spikecooldown", spikecooldown);
			nbt.putDouble("avalanchecooldown", avalanchecooldown);
			nbt.putDouble("doomsdayaltsongtimer", doomsdayaltsongtimer);
			nbt.putDouble("apocdayonestart", apocdayonestart);
			nbt.putDouble("TimeUntilNight", TimeUntilNight);
			nbt.putDouble("DialogueCooldownStart", DialogueCooldownStart);
			nbt.putDouble("doomsdaymaxtime", doomsdaymaxtime);
			nbt.putDouble("superdoomsdaymaxtime", superdoomsdaymaxtime);
			nbt.putDouble("theendmaxtime", theendmaxtime);
			nbt.putDouble("engieswrathmaxtime", engieswrathmaxtime);
			nbt.putDouble("ddayprophnumb", ddayprophnumb);
			nbt.putDouble("ddayprophtimerdisaster", ddayprophtimerdisaster);
			nbt.putDouble("ddayprophnumbertotal", ddayprophnumbertotal);
			nbt.putDouble("ddayprophwaittime", ddayprophwaittime);
			nbt.putDouble("spikecooldownamount", spikecooldownamount);
			nbt.putBoolean("Birthday", Birthday);
			nbt.putBoolean("birthdaystart", birthdaystart);
			nbt.putBoolean("BYEBYE", BYEBYE);
			nbt.putBoolean("ChallengeToggle", ChallengeToggle);
			nbt.putBoolean("checkboxbothmarked", checkboxbothmarked);
			nbt.putBoolean("checkboxbothnomarked", checkboxbothnomarked);
			nbt.putBoolean("darknesscooldown", darknesscooldown);
			nbt.putBoolean("DayCooldownToggle", DayCooldownToggle);
			nbt.putBoolean("ddaydialoguetimeblock", ddaydialoguetimeblock);
			nbt.putBoolean("ddaystart", ddaystart);
			nbt.putBoolean("ddaytimenighttimerblock", ddaytimenighttimerblock);
			nbt.putBoolean("DoomsdayEeriePlayOnce", DoomsdayEeriePlayOnce);
			nbt.putBoolean("doomsdaymainsongstart", doomsdaymainsongstart);
			nbt.putBoolean("DoomsDayStart", DoomsDayStart);
			nbt.putBoolean("GOODBYE", GOODBYE);
			nbt.putBoolean("hewhowatches", hewhowatches);
			nbt.putBoolean("HHGkilledtoggle", HHGkilledtoggle);
			nbt.putBoolean("itemswap1", itemswap1);
			nbt.putBoolean("itemswap2", itemswap2);
			nbt.putBoolean("lightningcooldowndday", lightningcooldowndday);
			nbt.putBoolean("madlads", madlads);
			nbt.putBoolean("multiplayertrophyobtained", multiplayertrophyobtained);
			nbt.putBoolean("OHBOY", OHBOY);
			nbt.putBoolean("OHNO", OHNO);
			nbt.putBoolean("riskcheckedstart", riskcheckedstart);
			nbt.putBoolean("sddaydialoguetimeblock", sddaydialoguetimeblock);
			nbt.putBoolean("sddaystart", sddaystart);
			nbt.putBoolean("sddaytimenighttimerblock", sddaytimenighttimerblock);
			nbt.putBoolean("SDDAYToggle", SDDAYToggle);
			nbt.putBoolean("seasonautumn", seasonautumn);
			nbt.putBoolean("seasonspring", seasonspring);
			nbt.putBoolean("seasonsummer", seasonsummer);
			nbt.putBoolean("seasonwinter", seasonwinter);
			nbt.putBoolean("SuperDoomsdayEeriePlayOnce", SuperDoomsdayEeriePlayOnce);
			nbt.putBoolean("SuperDoomsDayStart", SuperDoomsDayStart);
			nbt.putBoolean("theenddialoguetimeblock", theenddialoguetimeblock);
			nbt.putBoolean("TheEndEeriePlayOnce", TheEndEeriePlayOnce);
			nbt.putBoolean("theendhalf1complete", theendhalf1complete);
			nbt.putBoolean("TheEndStart", TheEndStart);
			nbt.putBoolean("theendtimenighttimerblock", theendtimenighttimerblock);
			nbt.putBoolean("thestart", thestart);
			nbt.putBoolean("timecheckstop", timecheckstop);
			nbt.putBoolean("waittildoomsday", waittildoomsday);
			nbt.putBoolean("waittilsdoomsday", waittilsdoomsday);
			nbt.putBoolean("antimatterdropcheck", antimatterdropcheck);
			nbt.putBoolean("detectedothermodesenabledthrowback", detectedothermodesenabledthrowback);
			nbt.putBoolean("graceperiodbeforeplushangryagain", graceperiodbeforeplushangryagain);
			nbt.putBoolean("ddaywait", ddaywait);
			nbt.putBoolean("riskcooldown", riskcooldown);
			nbt.putBoolean("sddaywait", sddaywait);
			nbt.putBoolean("theendwait", theendwait);
			nbt.putBoolean("CosmicEngieGamesSpawnLock", CosmicEngieGamesSpawnLock);
			nbt.putBoolean("CosmicEngieGamesDespawnLock", CosmicEngieGamesDespawnLock);
			nbt.putBoolean("FallingTreeInstalled", FallingTreeInstalled);
			nbt.putBoolean("VeinMinerInstalled", VeinMinerInstalled);
			nbt.putBoolean("ShowObjectiveOverlay", ShowObjectiveOverlay);
			nbt.putBoolean("solotrophyobtained", solotrophyobtained);
			nbt.putBoolean("difficultytoggle", difficultytoggle);
			nbt.putBoolean("engieswrathstart", engieswrathstart);
			nbt.putBoolean("EngiesWrathStart", EngiesWrathStart);
			nbt.putBoolean("ewrathdialoguetimeblock", ewrathdialoguetimeblock);
			nbt.putBoolean("ewrathtimenighttimerblock", ewrathtimenighttimerblock);
			nbt.putBoolean("ewrathwait", ewrathwait);
			nbt.putBoolean("waittiltheend", waittiltheend);
			nbt.putBoolean("waittilewrath", waittilewrath);
			nbt.putBoolean("EngiesWrathEeriePlayOnce", EngiesWrathEeriePlayOnce);
			nbt.putBoolean("truehardcoreenabledonworld", truehardcoreenabledonworld);
			nbt.putBoolean("specialhealth", specialhealth);
			nbt.putBoolean("playlightningsound", playlightningsound);
			nbt.putBoolean("playriftsound", playriftsound);
			nbt.putBoolean("playlightningsound2", playlightningsound2);
			nbt.putBoolean("playlightningcornersound", playlightningcornersound);
			nbt.putBoolean("ddayscornerlightning", ddayscornerlightning);
			nbt.putBoolean("playriftsound2", playriftsound2);
			nbt.putBoolean("playlightningsound3", playlightningsound3);
			nbt.putBoolean("playlightningsound4", playlightningsound4);
			nbt.putBoolean("DDAYCleanup", DDAYCleanup);
			nbt.putBoolean("playlightningsound5", playlightningsound5);
			nbt.putBoolean("playmissilespawnsound", playmissilespawnsound);
			nbt.putBoolean("playmissilespawnsound2", playmissilespawnsound2);
			nbt.putBoolean("playmissileexplosionsound", playmissileexplosionsound);
			nbt.putBoolean("playmissileexplosionsound2", playmissileexplosionsound2);
			nbt.putBoolean("shadowsharkdevspawn", shadowsharkdevspawn);
			nbt.putBoolean("DayCheck", DayCheck);
			nbt.putBoolean("NightCheck", NightCheck);
			nbt.putBoolean("doomsdayaltsongstart", doomsdayaltsongstart);
			nbt.putBoolean("ddayhalf1", ddayhalf1);
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
			nbt.putBoolean("waitforriftdespawn", waitforriftdespawn);
			nbt.putBoolean("waitformissiledespawn", waitformissiledespawn);
			nbt.putBoolean("waitforavalanchedespawn", waitforavalanchedespawn);
			nbt.putBoolean("waitforspikedespawn", waitforspikedespawn);
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
		public double playeroverhealhp = 0;
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
		public double RX = 0;
		public double RY = 0;
		public double RZ = 0;
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
		public boolean detecstart = false;
		public boolean GoodLuck = false;
		public boolean healthreductiondday = false;
		public boolean playerready = false;
		public boolean SharkoRetryState = false;
		public boolean timeoverlaytoggle = false;
		public boolean crucifixsavedentity = false;
		public boolean WelcomeBackToggle = false;
		public boolean MaxPercentGiveOptionToDoHardestMobDiff = false;
		public boolean playerstunnedmobs = false;
		public boolean playerstunoffcooldown = false;
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
		public boolean playeralive = true;
		public boolean boyoaprilfoolslaycheck = false;
		public boolean PlayerHasEngieGamesSwordAdvancement = false;
		public boolean PlayerHasAntimatterEngieGamesSwordAdvancement = false;
		public boolean PlayerHas101PercentAdvancement = false;
		public boolean crucifixbypass = false;
		public double missileyellowlightningscale = 1.0;
		public double missileblueburstscale = 1.0;
		public double missilenormalscale = 1.0;
		public double missilemoabscale = 1.0;
		public double avascale = 3.0;
		public double riftballscale = 3.0;
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

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				EngiesChaosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("playeroverhealhp", playeroverhealhp);
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
			nbt.putDouble("RX", RX);
			nbt.putDouble("RY", RY);
			nbt.putDouble("RZ", RZ);
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
			nbt.putBoolean("detecstart", detecstart);
			nbt.putBoolean("GoodLuck", GoodLuck);
			nbt.putBoolean("healthreductiondday", healthreductiondday);
			nbt.putBoolean("playerready", playerready);
			nbt.putBoolean("SharkoRetryState", SharkoRetryState);
			nbt.putBoolean("timeoverlaytoggle", timeoverlaytoggle);
			nbt.putBoolean("crucifixsavedentity", crucifixsavedentity);
			nbt.putBoolean("WelcomeBackToggle", WelcomeBackToggle);
			nbt.putBoolean("MaxPercentGiveOptionToDoHardestMobDiff", MaxPercentGiveOptionToDoHardestMobDiff);
			nbt.putBoolean("playerstunnedmobs", playerstunnedmobs);
			nbt.putBoolean("playerstunoffcooldown", playerstunoffcooldown);
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
			nbt.putBoolean("playeralive", playeralive);
			nbt.putBoolean("boyoaprilfoolslaycheck", boyoaprilfoolslaycheck);
			nbt.putBoolean("PlayerHasEngieGamesSwordAdvancement", PlayerHasEngieGamesSwordAdvancement);
			nbt.putBoolean("PlayerHasAntimatterEngieGamesSwordAdvancement", PlayerHasAntimatterEngieGamesSwordAdvancement);
			nbt.putBoolean("PlayerHas101PercentAdvancement", PlayerHas101PercentAdvancement);
			nbt.putBoolean("crucifixbypass", crucifixbypass);
			nbt.putDouble("missileyellowlightningscale", missileyellowlightningscale);
			nbt.putDouble("missileblueburstscale", missileblueburstscale);
			nbt.putDouble("missilenormalscale", missilenormalscale);
			nbt.putDouble("missilemoabscale", missilemoabscale);
			nbt.putDouble("avascale", avascale);
			nbt.putDouble("riftballscale", riftballscale);
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
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			playeroverhealhp = nbt.getDouble("playeroverhealhp");
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
			RX = nbt.getDouble("RX");
			RY = nbt.getDouble("RY");
			RZ = nbt.getDouble("RZ");
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
			detecstart = nbt.getBoolean("detecstart");
			GoodLuck = nbt.getBoolean("GoodLuck");
			healthreductiondday = nbt.getBoolean("healthreductiondday");
			playerready = nbt.getBoolean("playerready");
			SharkoRetryState = nbt.getBoolean("SharkoRetryState");
			timeoverlaytoggle = nbt.getBoolean("timeoverlaytoggle");
			crucifixsavedentity = nbt.getBoolean("crucifixsavedentity");
			WelcomeBackToggle = nbt.getBoolean("WelcomeBackToggle");
			MaxPercentGiveOptionToDoHardestMobDiff = nbt.getBoolean("MaxPercentGiveOptionToDoHardestMobDiff");
			playerstunnedmobs = nbt.getBoolean("playerstunnedmobs");
			playerstunoffcooldown = nbt.getBoolean("playerstunoffcooldown");
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
			playeralive = nbt.getBoolean("playeralive");
			boyoaprilfoolslaycheck = nbt.getBoolean("boyoaprilfoolslaycheck");
			PlayerHasEngieGamesSwordAdvancement = nbt.getBoolean("PlayerHasEngieGamesSwordAdvancement");
			PlayerHasAntimatterEngieGamesSwordAdvancement = nbt.getBoolean("PlayerHasAntimatterEngieGamesSwordAdvancement");
			PlayerHas101PercentAdvancement = nbt.getBoolean("PlayerHas101PercentAdvancement");
			crucifixbypass = nbt.getBoolean("crucifixbypass");
			missileyellowlightningscale = nbt.getDouble("missileyellowlightningscale");
			missileblueburstscale = nbt.getDouble("missileblueburstscale");
			missilenormalscale = nbt.getDouble("missilenormalscale");
			missilemoabscale = nbt.getDouble("missilemoabscale");
			avascale = nbt.getDouble("avascale");
			riftballscale = nbt.getDouble("riftballscale");
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
					variables.playeroverhealhp = message.data.playeroverhealhp;
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
					variables.RX = message.data.RX;
					variables.RY = message.data.RY;
					variables.RZ = message.data.RZ;
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
					variables.detecstart = message.data.detecstart;
					variables.GoodLuck = message.data.GoodLuck;
					variables.healthreductiondday = message.data.healthreductiondday;
					variables.playerready = message.data.playerready;
					variables.SharkoRetryState = message.data.SharkoRetryState;
					variables.timeoverlaytoggle = message.data.timeoverlaytoggle;
					variables.crucifixsavedentity = message.data.crucifixsavedentity;
					variables.WelcomeBackToggle = message.data.WelcomeBackToggle;
					variables.MaxPercentGiveOptionToDoHardestMobDiff = message.data.MaxPercentGiveOptionToDoHardestMobDiff;
					variables.playerstunnedmobs = message.data.playerstunnedmobs;
					variables.playerstunoffcooldown = message.data.playerstunoffcooldown;
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
					variables.playeralive = message.data.playeralive;
					variables.boyoaprilfoolslaycheck = message.data.boyoaprilfoolslaycheck;
					variables.PlayerHasEngieGamesSwordAdvancement = message.data.PlayerHasEngieGamesSwordAdvancement;
					variables.PlayerHasAntimatterEngieGamesSwordAdvancement = message.data.PlayerHasAntimatterEngieGamesSwordAdvancement;
					variables.PlayerHas101PercentAdvancement = message.data.PlayerHas101PercentAdvancement;
					variables.crucifixbypass = message.data.crucifixbypass;
					variables.missileyellowlightningscale = message.data.missileyellowlightningscale;
					variables.missileblueburstscale = message.data.missileblueburstscale;
					variables.missilenormalscale = message.data.missilenormalscale;
					variables.missilemoabscale = message.data.missilemoabscale;
					variables.avascale = message.data.avascale;
					variables.riftballscale = message.data.riftballscale;
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
				}
			});
			context.setPacketHandled(true);
		}
	}
}