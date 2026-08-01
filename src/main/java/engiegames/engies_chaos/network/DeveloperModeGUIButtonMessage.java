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

import engiegames.engies_chaos.procedures.ToggleSpecialHealthButtonProcedure;
import engiegames.engies_chaos.procedures.StunNearbyMobsWithDurationProcedure;
import engiegames.engies_chaos.procedures.SetStatClockNumProcedure;
import engiegames.engies_chaos.procedures.SetHealthToMaxProcedure;
import engiegames.engies_chaos.procedures.SetDifficultyDevModeProcedure;
import engiegames.engies_chaos.procedures.RemovePlayerImmunityProcedure;
import engiegames.engies_chaos.procedures.RaiseStunRadiusDevGUIProcedure;
import engiegames.engies_chaos.procedures.LowerStunRadiusDevGUIProcedure;
import engiegames.engies_chaos.procedures.GivePlayerImmunityProcedure;
import engiegames.engies_chaos.procedures.DuplicateItemProcedure;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record DeveloperModeGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<DeveloperModeGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(EngiesChaosMod.MODID, "developer_mode_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, DeveloperModeGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, DeveloperModeGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new DeveloperModeGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<DeveloperModeGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final DeveloperModeGUIButtonMessage message, final IPayloadContext context) {
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
		EngiesChaosMod.addNetworkMessage(DeveloperModeGUIButtonMessage.TYPE, DeveloperModeGUIButtonMessage.STREAM_CODEC, DeveloperModeGUIButtonMessage::handleData);
	}
}