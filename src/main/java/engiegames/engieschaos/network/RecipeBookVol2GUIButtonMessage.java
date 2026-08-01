package engiegames.engieschaos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;

import engiegames.engieschaos.procedures.RecipeBookVol2UpOnePageProcedure;
import engiegames.engieschaos.procedures.RecipeBookVol2UpMaxPagesProcedure;
import engiegames.engieschaos.procedures.RecipeBookVol2UpFivePagesProcedure;
import engiegames.engieschaos.procedures.RecipeBookVol2DownOnePageProcedure;
import engiegames.engieschaos.procedures.RecipeBookVol2DownFivePagesProcedure;
import engiegames.engieschaos.procedures.RecipeBookVol2DownAllPagesProcedure;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RecipeBookVol2GUIButtonMessage {
	private final int buttonID, x, y, z;

	public RecipeBookVol2GUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RecipeBookVol2GUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RecipeBookVol2GUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RecipeBookVol2GUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		EngiesChaosMod.addNetworkMessage(RecipeBookVol2GUIButtonMessage.class, RecipeBookVol2GUIButtonMessage::buffer, RecipeBookVol2GUIButtonMessage::new, RecipeBookVol2GUIButtonMessage::handler);
	}
}