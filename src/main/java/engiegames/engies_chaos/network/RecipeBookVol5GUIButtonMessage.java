package engiegames.engies_chaos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;

import engiegames.engies_chaos.procedures.RecipeBookUpOnePageProcedure;
import engiegames.engies_chaos.procedures.RecipeBookUpMaxPagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookUpFivePagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookDownOnePageProcedure;
import engiegames.engies_chaos.procedures.RecipeBookDownFivePagesProcedure;
import engiegames.engies_chaos.procedures.RecipeBookDownAllPagesProcedure;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RecipeBookVol5GUIButtonMessage {
	private final int buttonID, x, y, z;

	public RecipeBookVol5GUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RecipeBookVol5GUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RecipeBookVol5GUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RecipeBookVol5GUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> handleButtonAction(context.getSender(), message.buttonID, message.x, message.y, message.z));
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RecipeBookUpOnePageProcedure.execute(entity);
		}
		if (buttonID == 1) {

			RecipeBookDownOnePageProcedure.execute(entity);
		}
		if (buttonID == 2) {

			RecipeBookUpFivePagesProcedure.execute(entity);
		}
		if (buttonID == 3) {

			RecipeBookDownFivePagesProcedure.execute(entity);
		}
		if (buttonID == 4) {

			RecipeBookUpMaxPagesProcedure.execute(entity);
		}
		if (buttonID == 5) {

			RecipeBookDownAllPagesProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(RecipeBookVol5GUIButtonMessage.class, RecipeBookVol5GUIButtonMessage::buffer, RecipeBookVol5GUIButtonMessage::new, RecipeBookVol5GUIButtonMessage::handler);
	}
}