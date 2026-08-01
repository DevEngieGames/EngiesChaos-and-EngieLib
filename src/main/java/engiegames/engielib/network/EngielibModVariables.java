package engiegames.engielib.network;

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

import engiegames.engielib.EngielibMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngielibModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		EngielibMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		EngielibMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
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
			clone.EngiesChaosDamageDebug = original.EngiesChaosDamageDebug;
			clone.playerjoinid = original.playerjoinid;
			clone.playeraddedtototalplayers = original.playeraddedtototalplayers;
			clone.homeX = original.homeX;
			clone.homeY = original.homeY;
			clone.homeZ = original.homeZ;
			if (!event.isWasDeath()) {
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					EngielibMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					EngielibMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					EngielibMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "engielib_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				EngielibMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
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
		public static final String DATA_NAME = "engielib_mapvars";
		public boolean stoptimecheckduetospecial = false;
		public double timebeforespecial = 0;
		public boolean onlyrunonce = false;
		public boolean endgamelootstart = false;
		public double doomsdaytimer = 720.0;
		public boolean doomsdaystart = false;
		public boolean doomsdaynighttimeblock = false;
		public boolean lightningcooldown = false;
		public boolean riftcooldown = false;
		public boolean missilecooldown = false;
		public boolean avalanchecooldown = false;
		public boolean spikecooldown = false;
		public double darknesssretry = 0;
		public double missileretry = 0;
		public double riftretry = 0;
		public double lightningretry = 0;
		public boolean DoomsDay = false;
		public boolean SuperDoomsDay = false;
		public boolean TheEnd = false;
		public boolean EngiesWrath = false;
		public boolean ddaysummoned = false;
		public boolean darknessapplied = false;
		public double totalplayersjoinedworld = 0;
		public double playerscantries = 0;
		public boolean playerscanfound = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			stoptimecheckduetospecial = nbt.getBoolean("stoptimecheckduetospecial");
			timebeforespecial = nbt.getDouble("timebeforespecial");
			onlyrunonce = nbt.getBoolean("onlyrunonce");
			endgamelootstart = nbt.getBoolean("endgamelootstart");
			doomsdaytimer = nbt.getDouble("doomsdaytimer");
			doomsdaystart = nbt.getBoolean("doomsdaystart");
			doomsdaynighttimeblock = nbt.getBoolean("doomsdaynighttimeblock");
			lightningcooldown = nbt.getBoolean("lightningcooldown");
			riftcooldown = nbt.getBoolean("riftcooldown");
			missilecooldown = nbt.getBoolean("missilecooldown");
			avalanchecooldown = nbt.getBoolean("avalanchecooldown");
			spikecooldown = nbt.getBoolean("spikecooldown");
			darknesssretry = nbt.getDouble("darknesssretry");
			missileretry = nbt.getDouble("missileretry");
			riftretry = nbt.getDouble("riftretry");
			lightningretry = nbt.getDouble("lightningretry");
			DoomsDay = nbt.getBoolean("DoomsDay");
			SuperDoomsDay = nbt.getBoolean("SuperDoomsDay");
			TheEnd = nbt.getBoolean("TheEnd");
			EngiesWrath = nbt.getBoolean("EngiesWrath");
			ddaysummoned = nbt.getBoolean("ddaysummoned");
			darknessapplied = nbt.getBoolean("darknessapplied");
			totalplayersjoinedworld = nbt.getDouble("totalplayersjoinedworld");
			playerscantries = nbt.getDouble("playerscantries");
			playerscanfound = nbt.getBoolean("playerscanfound");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("stoptimecheckduetospecial", stoptimecheckduetospecial);
			nbt.putDouble("timebeforespecial", timebeforespecial);
			nbt.putBoolean("onlyrunonce", onlyrunonce);
			nbt.putBoolean("endgamelootstart", endgamelootstart);
			nbt.putDouble("doomsdaytimer", doomsdaytimer);
			nbt.putBoolean("doomsdaystart", doomsdaystart);
			nbt.putBoolean("doomsdaynighttimeblock", doomsdaynighttimeblock);
			nbt.putBoolean("lightningcooldown", lightningcooldown);
			nbt.putBoolean("riftcooldown", riftcooldown);
			nbt.putBoolean("missilecooldown", missilecooldown);
			nbt.putBoolean("avalanchecooldown", avalanchecooldown);
			nbt.putBoolean("spikecooldown", spikecooldown);
			nbt.putDouble("darknesssretry", darknesssretry);
			nbt.putDouble("missileretry", missileretry);
			nbt.putDouble("riftretry", riftretry);
			nbt.putDouble("lightningretry", lightningretry);
			nbt.putBoolean("DoomsDay", DoomsDay);
			nbt.putBoolean("SuperDoomsDay", SuperDoomsDay);
			nbt.putBoolean("TheEnd", TheEnd);
			nbt.putBoolean("EngiesWrath", EngiesWrath);
			nbt.putBoolean("ddaysummoned", ddaysummoned);
			nbt.putBoolean("darknessapplied", darknessapplied);
			nbt.putDouble("totalplayersjoinedworld", totalplayersjoinedworld);
			nbt.putDouble("playerscantries", playerscantries);
			nbt.putBoolean("playerscanfound", playerscanfound);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				EngielibMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
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
				event.addCapability(new ResourceLocation("engielib", "player_variables"), new PlayerVariablesProvider());
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
		public boolean EngiesChaosDamageDebug = false;
		public double playerjoinid = 0;
		public boolean playeraddedtototalplayers = false;
		public double homeX = 0;
		public double homeY = -100.0;
		public double homeZ = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				EngielibMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("EngiesChaosDamageDebug", EngiesChaosDamageDebug);
			nbt.putDouble("playerjoinid", playerjoinid);
			nbt.putBoolean("playeraddedtototalplayers", playeraddedtototalplayers);
			nbt.putDouble("homeX", homeX);
			nbt.putDouble("homeY", homeY);
			nbt.putDouble("homeZ", homeZ);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			EngiesChaosDamageDebug = nbt.getBoolean("EngiesChaosDamageDebug");
			playerjoinid = nbt.getDouble("playerjoinid");
			playeraddedtototalplayers = nbt.getBoolean("playeraddedtototalplayers");
			homeX = nbt.getDouble("homeX");
			homeY = nbt.getDouble("homeY");
			homeZ = nbt.getDouble("homeZ");
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
					variables.EngiesChaosDamageDebug = message.data.EngiesChaosDamageDebug;
					variables.playerjoinid = message.data.playerjoinid;
					variables.playeraddedtototalplayers = message.data.playeraddedtototalplayers;
					variables.homeX = message.data.homeX;
					variables.homeY = message.data.homeY;
					variables.homeZ = message.data.homeZ;
				}
			});
			context.setPacketHandled(true);
		}
	}
}