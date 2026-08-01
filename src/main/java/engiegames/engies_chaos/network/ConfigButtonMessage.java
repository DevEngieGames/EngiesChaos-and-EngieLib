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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigButtonMessage {
	private final int buttonID, x, y, z;

	public ConfigButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ConfigButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ConfigButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ConfigButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		EngiesChaosMod.addNetworkMessage(ConfigButtonMessage.class, ConfigButtonMessage::buffer, ConfigButtonMessage::new, ConfigButtonMessage::handler);
	}
}