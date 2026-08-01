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

import engiegames.engies_chaos.procedures.RecipeBookVol1UpOnePageProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol1UpMaxPagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol1UpFivePagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol1DownOnePageProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol1DownFivePagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookVol1DownAllPagesProcedure;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record RecipeBookVol1GUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<RecipeBookVol1GUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, "recipe_book_vol_1_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, RecipeBookVol1GUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, RecipeBookVol1GUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new RecipeBookVol1GUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<RecipeBookVol1GUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final RecipeBookVol1GUIButtonMessage message, final IPayloadContext context) {
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

			RecipeBookVol1UpOnePageProcedure.execute(entity);
		}
		if (buttonID == 1) {

			RecipeBookVol1DownOnePageProcedure.execute(entity);
		}
		if (buttonID == 2) {

			RecipeBookVol1UpFivePagesProcedure.execute(entity);
		}
		if (buttonID == 3) {

			RecipeBookVol1DownFivePagesProcedure.execute(entity);
		}
		if (buttonID == 4) {

			RecipeBookVol1UpMaxPagesProcedure.execute(entity);
		}
		if (buttonID == 5) {

			RecipeBookVol1DownAllPagesProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(RecipeBookVol1GUIButtonMessage.TYPE, RecipeBookVol1GUIButtonMessage.STREAM_CODEC, RecipeBookVol1GUIButtonMessage::handleData);
	}
}