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

import engiegames.engies_chaos.procedures.TheEndButtonClickedProcedure;
import engiegames.engies_chaos.procedures.SuperDoomsdayButtonClickedProcedure;
import engiegames.engies_chaos.procedures.RoughianButtonClickedProcedure;
import engiegames.engies_chaos.procedures.MindscapeButtonClickedProcedure;
import engiegames.engies_chaos.procedures.EngieGamesButtonClickedProcedure;
import engiegames.engies_chaos.procedures.EngieButtonClickedProcedure;
import engiegames.engies_chaos.procedures.DoomsdayButtonClickedProcedure;
import engiegames.engies_chaos.procedures.CosmicButtonClickedProcedure;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XEngieGamesTradeUIPickerButtonMessage {
	private final int buttonID, x, y, z;

	public XEngieGamesTradeUIPickerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public XEngieGamesTradeUIPickerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(XEngieGamesTradeUIPickerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(XEngieGamesTradeUIPickerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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

			DoomsdayButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SuperDoomsdayButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			TheEndButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			EngieButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			MindscapeButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			EngieGamesButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			CosmicButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			RoughianButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(XEngieGamesTradeUIPickerButtonMessage.class, XEngieGamesTradeUIPickerButtonMessage::buffer, XEngieGamesTradeUIPickerButtonMessage::new, XEngieGamesTradeUIPickerButtonMessage::handler);
	}
}