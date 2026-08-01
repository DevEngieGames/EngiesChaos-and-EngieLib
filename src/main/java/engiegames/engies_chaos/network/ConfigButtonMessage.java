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
import net.minecraft.core.BlockPos;

import engiegames.engies_chaos.procedures.DifficultyToggleOnProcedure;
import engiegames.engies_chaos.procedures.DifficultyToggleOffProcedure;
import engiegames.engies_chaos.procedures.ConfigRaiseDiff1Procedure;
import engiegames.engies_chaos.procedures.ConfigLowerDiff1Procedure;
import engiegames.engies_chaos.procedures.ConfigGoToGearGiverProcedure;
import engiegames.engies_chaos.procedures.ConfigGoToCodeRedemptionsProcedure;
import engiegames.engies_chaos.procedures.ConfigButton9Procedure;
import engiegames.engies_chaos.procedures.ConfigButton8Procedure;
import engiegames.engies_chaos.procedures.ConfigButton7Procedure;
import engiegames.engies_chaos.procedures.ConfigButton6Procedure;
import engiegames.engies_chaos.procedures.ConfigButton5Procedure;
import engiegames.engies_chaos.procedures.ConfigButton4Procedure;
import engiegames.engies_chaos.procedures.ConfigButton3Procedure;
import engiegames.engies_chaos.procedures.ConfigButton2Procedure;
import engiegames.engies_chaos.procedures.ConfigButton1Procedure;
import engiegames.engies_chaos.procedures.ConfigButton11Procedure;
import engiegames.engies_chaos.procedures.ConfigButton10Procedure;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ConfigButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ConfigButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, "config_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ConfigButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ConfigButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ConfigButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<ConfigButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ConfigButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ConfigButton1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			ConfigButton2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			ConfigButton3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			ConfigButton4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			ConfigButton5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			ConfigButton10Procedure.execute(entity);
		}
		if (buttonID == 6) {

			DifficultyToggleOffProcedure.execute(world);
		}
		if (buttonID == 7) {

			DifficultyToggleOnProcedure.execute(world);
		}
		if (buttonID == 8) {

			ConfigGoToCodeRedemptionsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ConfigGoToGearGiverProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			ConfigRaiseDiff1Procedure.execute(world);
		}
		if (buttonID == 11) {

			ConfigLowerDiff1Procedure.execute(world);
		}
		if (buttonID == 12) {

			ConfigButton11Procedure.execute(entity);
		}
		if (buttonID == 13) {

			ConfigButton6Procedure.execute(entity);
		}
		if (buttonID == 14) {

			ConfigButton7Procedure.execute(entity);
		}
		if (buttonID == 15) {

			ConfigButton8Procedure.execute(entity);
		}
		if (buttonID == 16) {

			ConfigButton9Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(ConfigButtonMessage.TYPE, ConfigButtonMessage.STREAM_CODEC, ConfigButtonMessage::handleData);
	}
}