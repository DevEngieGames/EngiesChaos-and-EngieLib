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

import engiegames.engies_chaos.procedures.GearGiverTesterProcedure;
import engiegames.engies_chaos.procedures.GearGiverStarterProcedure;
import engiegames.engies_chaos.procedures.GearGiverStarterBundleProcedure;
import engiegames.engies_chaos.procedures.GearGiverRecipeBookProcedure;
import engiegames.engies_chaos.procedures.GearGiverOperatorProcedure;
import engiegames.engies_chaos.procedures.GearGiverIdeaGiverProcedure;
import engiegames.engies_chaos.procedures.GearGiverGoBackToConfigProcedure;
import engiegames.engies_chaos.procedures.GearGiverDeveloperProcedure;
import engiegames.engies_chaos.procedures.GearGiverContentCreatorProcedure;
import engiegames.engies_chaos.procedures.GearGiverBetaTesterProcedure;
import engiegames.engies_chaos.procedures.ConfigButton10Procedure;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record GearGiverButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<GearGiverButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, "gear_giver_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, GearGiverButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, GearGiverButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new GearGiverButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<GearGiverButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final GearGiverButtonMessage message, final IPayloadContext context) {
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

			ConfigButton10Procedure.execute(entity);
		}
		if (buttonID == 1) {

			GearGiverGoBackToConfigProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			GearGiverStarterProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			GearGiverStarterBundleProcedure.execute(entity);
		}
		if (buttonID == 4) {

			GearGiverRecipeBookProcedure.execute(entity);
		}
		if (buttonID == 5) {

			GearGiverOperatorProcedure.execute(entity);
		}
		if (buttonID == 6) {

			GearGiverDeveloperProcedure.execute(entity);
		}
		if (buttonID == 7) {

			GearGiverIdeaGiverProcedure.execute(entity);
		}
		if (buttonID == 8) {

			GearGiverBetaTesterProcedure.execute(entity);
		}
		if (buttonID == 9) {

			GearGiverTesterProcedure.execute(entity);
		}
		if (buttonID == 10) {

			GearGiverContentCreatorProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(GearGiverButtonMessage.TYPE, GearGiverButtonMessage.STREAM_CODEC, GearGiverButtonMessage::handleData);
	}
}