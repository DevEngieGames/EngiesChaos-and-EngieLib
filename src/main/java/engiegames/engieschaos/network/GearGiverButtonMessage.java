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

import engiegames.engieschaos.procedures.GearGiverTesterProcedure;
import engiegames.engieschaos.procedures.GearGiverStarterProcedure;
import engiegames.engieschaos.procedures.GearGiverStarterBundleProcedure;
import engiegames.engieschaos.procedures.GearGiverRecipeBookProcedure;
import engiegames.engieschaos.procedures.GearGiverOperatorProcedure;
import engiegames.engieschaos.procedures.GearGiverIdeaGiverProcedure;
import engiegames.engieschaos.procedures.GearGiverGoBackToConfigProcedure;
import engiegames.engieschaos.procedures.GearGiverDeveloperProcedure;
import engiegames.engieschaos.procedures.GearGiverContentCreatorProcedure;
import engiegames.engieschaos.procedures.GearGiverBetaTesterProcedure;
import engiegames.engieschaos.procedures.ConfigButton10Procedure;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GearGiverButtonMessage {
	private final int buttonID, x, y, z;

	public GearGiverButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GearGiverButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GearGiverButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GearGiverButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		EngiesChaosMod.addNetworkMessage(GearGiverButtonMessage.class, GearGiverButtonMessage::buffer, GearGiverButtonMessage::new, GearGiverButtonMessage::handler);
	}
}