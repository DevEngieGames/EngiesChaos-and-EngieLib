package engiegames.engielib.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;

import java.util.function.Supplier;

import engiegames.engielib.EngielibMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EngielibModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, EngielibMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		EngielibMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
		EngielibMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.EngiesChaosDamageDebug = original.EngiesChaosDamageDebug;
			clone.playerjoinid = original.playerjoinid;
			clone.playeraddedtototalplayers = original.playeraddedtototalplayers;
			clone.homeX = original.homeX;
			clone.homeY = original.homeY;
			clone.homeZ = original.homeZ;
			if (!event.isWasDeath()) {
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "engielib_worldvars";

		public static WorldVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			WorldVariables data = new WorldVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof ServerLevel level)
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldVariables::new, WorldVariables::load), DATA_NAME);
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

		public static MapVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			MapVariables data = new MapVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
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
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
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
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(new SavedData.Factory<>(MapVariables::new, MapVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngielibMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public boolean EngiesChaosDamageDebug = false;
		public double playerjoinid = 0;
		public boolean playeraddedtototalplayers = false;
		public double homeX = 0;
		public double homeY = -100.0;
		public double homeZ = 0;

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("EngiesChaosDamageDebug", EngiesChaosDamageDebug);
			nbt.putDouble("playerjoinid", playerjoinid);
			nbt.putBoolean("playeraddedtototalplayers", playeraddedtototalplayers);
			nbt.putDouble("homeX", homeX);
			nbt.putDouble("homeY", homeY);
			nbt.putDouble("homeZ", homeZ);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			EngiesChaosDamageDebug = nbt.getBoolean("EngiesChaosDamageDebug");
			playerjoinid = nbt.getDouble("playerjoinid");
			playeraddedtototalplayers = nbt.getBoolean("playeraddedtototalplayers");
			homeX = nbt.getDouble("homeX");
			homeY = nbt.getDouble("homeY");
			homeZ = nbt.getDouble("homeZ");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngielibMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}