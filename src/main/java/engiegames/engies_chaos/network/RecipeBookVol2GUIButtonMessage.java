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

import engiegames.engies_chaos.procedures.RecipeBookVol2UpOnePageProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol2UpMaxPagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol2UpFivePagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol2DownOnePageProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol2DownFivePagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol2DownAllPagesProcedure;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record RecipeBookVol2GUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<RecipeBookVol2GUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, "recipe_book_vol_2_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, RecipeBookVol2GUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, RecipeBookVol2GUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new RecipeBookVol2GUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<RecipeBookVol2GUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final RecipeBookVol2GUIButtonMessage message, final IPayloadContext context) {
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

			RecipeBookVol2UpOnePageProcedure.execute(entity);
		}
		if (buttonID == 1) {

			RecipeBookVol2DownOnePageProcedure.execute(entity);
		}
		if (buttonID == 2) {

			RecipeBookVol2UpFivePagesProcedure.execute(entity);
		}
		if (buttonID == 3) {

			RecipeBookVol2DownFivePagesProcedure.execute(entity);
		}
		if (buttonID == 4) {

			RecipeBookVol2UpMaxPagesProcedure.execute(entity);
		}
		if (buttonID == 5) {

			RecipeBookVol2DownAllPagesProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(RecipeBookVol2GUIButtonMessage.TYPE, RecipeBookVol2GUIButtonMessage.STREAM_CODEC, RecipeBookVol2GUIButtonMessage::handleData);
	}
}