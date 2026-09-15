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

import engiegames.engies_chaos.procedures.DoomsTradeItemTakenFromRegSlot2Procedure;
import engiegames.engies_chaos.procedures.DoomsTradeItemTakenFromRegSlot1Procedure;
import engiegames.engies_chaos.procedures.DoomsTradeItemTakenFromDarkSlot2Procedure;
import engiegames.engies_chaos.procedures.DoomsTradeItemTakenFromDarkSlot1Procedure;
import engiegames.engies_chaos.procedures.DoomsTradeItemTakenFromAntiSlot2Procedure;
import engiegames.engies_chaos.procedures.DoomsTradeItemTakenFromAntiSlot1Procedure;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DoomsdayTradeSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public DoomsdayTradeSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public DoomsdayTradeSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(DoomsdayTradeSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(DoomsdayTradeSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> handleSlotAction(context.getSender(), message.slotID, message.changeType, message.meta, message.x, message.y, message.z));
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 2 && changeType == 1) {
			int amount = meta;

			DoomsTradeItemTakenFromRegSlot1Procedure.execute(entity);
		}
		if (slot == 3 && changeType == 1) {
			int amount = meta;

			DoomsTradeItemTakenFromRegSlot2Procedure.execute(entity);
		}
		if (slot == 6 && changeType == 1) {
			int amount = meta;

			DoomsTradeItemTakenFromAntiSlot1Procedure.execute(entity);
		}
		if (slot == 7 && changeType == 1) {
			int amount = meta;

			DoomsTradeItemTakenFromAntiSlot2Procedure.execute(entity);
		}
		if (slot == 10 && changeType == 1) {
			int amount = meta;

			DoomsTradeItemTakenFromDarkSlot1Procedure.execute(entity);
		}
		if (slot == 11 && changeType == 1) {
			int amount = meta;

			DoomsTradeItemTakenFromDarkSlot2Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EngiesChaosMod.addNetworkMessage(DoomsdayTradeSlotMessage.class, DoomsdayTradeSlotMessage::buffer, DoomsdayTradeSlotMessage::new, DoomsdayTradeSlotMessage::handler);
	}
}