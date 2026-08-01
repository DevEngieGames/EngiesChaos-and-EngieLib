package engiegames.engies_chaos.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import engiegames.engies_chaos.procedures.OpenConfigProcedure;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record OpenREAAEConfigMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<OpenREAAEConfigMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, "key_open_reaae_config"));
	public static final StreamCodec<RegistryFriendlyByteBuf, OpenREAAEConfigMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, OpenREAAEConfigMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new OpenREAAEConfigMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<OpenREAAEConfigMessage> type() {
		return TYPE;
	}

	public static void handleData(final OpenREAAEConfigMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			OpenConfigProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(OpenREAAEConfigMessage.TYPE, OpenREAAEConfigMessage.STREAM_CODEC, OpenREAAEConfigMessage::handleData);
	}
}