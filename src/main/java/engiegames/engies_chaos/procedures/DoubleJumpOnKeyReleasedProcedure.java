package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;

@Mod.EventBusSubscriber
public class DoubleJumpOnKeyReleasedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("engies_chaoc:weapons/antimatter")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()) {
			if ((getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE)
					&& !((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.CAVE_AIR)
					&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).doublejumpcount < 1) {
				{
					double _setval = 1;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumpcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumping = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE)
					&& !((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.CAVE_AIR)
					&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).doublejumpcount > 1) {
				{
					double _setval = 1;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumpcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumping = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("engies_chaos:weapons/darkmatter")))) {
			if ((getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE)
					&& !((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.CAVE_AIR)
					&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).doublejumpcount < 2) {
				{
					double _setval = 2;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumpcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumping = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE)
					&& !((world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == Blocks.CAVE_AIR)
					&& (entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).doublejumpcount > 2) {
				{
					double _setval = 2;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumpcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.doublejumping = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level.isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}