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

import engiegames.engieschaos.procedures.ToggleSpecialHealthButtonProcedure;
import engiegames.engieschaos.procedures.StunNearbyMobsWithDurationProcedure;
import engiegames.engieschaos.procedures.SetStatClockNumProcedure;
import engiegames.engieschaos.procedures.SetHealthToMaxProcedure;
import engiegames.engieschaos.procedures.SetDifficultyDevModeProcedure;
import engiegames.engieschaos.procedures.RemovePlayerImmunityProcedure;
import engiegames.engieschaos.procedures.RaiseStunRadiusDevGUIProcedure;
import engiegames.engieschaos.procedures.LowerStunRadiusDevGUIProcedure;
import engiegames.engieschaos.procedures.GivePlayerImmunityProcedure;
import engiegames.engieschaos.procedures.DuplicateItemProcedure;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeveloperModeGUIButtonMessage {
	private final int buttonID, x, y, z;

	public DeveloperModeGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DeveloperModeGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DeveloperModeGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DeveloperModeGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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

			RaiseStunRadiusDevGUIProcedure.execute(world);
		}
		if (buttonID == 1) {

			LowerStunRadiusDevGUIProcedure.execute(world);
		}
		if (buttonID == 2) {

			SetHealthToMaxProcedure.execute(entity);
		}
		if (buttonID == 3) {

			SetDifficultyDevModeProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			DuplicateItemProcedure.execute(entity);
		}
		if (buttonID == 5) {

			GivePlayerImmunityProcedure.execute(entity);
		}
		if (buttonID == 6) {

			RemovePlayerImmunityProcedure.execute(entity);
		}
		if (buttonID == 8) {

			StunNearbyMobsWithDurationProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			ToggleSpecialHealthButtonProcedure.execute(world);
		}
		if (buttonID == 10) {

			SetStatClockNumProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(DeveloperModeGUIButtonMessage.class, DeveloperModeGUIButtonMessage::buffer, DeveloperModeGUIButtonMessage::new, DeveloperModeGUIButtonMessage::handler);
	}
}