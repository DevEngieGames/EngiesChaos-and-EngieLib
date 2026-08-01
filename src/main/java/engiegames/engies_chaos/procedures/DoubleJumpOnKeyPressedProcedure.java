package engiegames.engies_chaos.procedures;

import net.minecraft.world.phys.Vec3;
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

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class DoubleJumpOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("engies_chaos:weapons/darkmatter")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("engies_chaos:weapons/antimatter")))
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.COSMIC_ENGIE_GAMES_SWORD.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_ANCHOR.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_ANCHOR.get()) {
			if ((getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE) && ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.VOID_AIR
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.SHORT_GRASS
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.FERN
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.TALL_GRASS
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.SEAGRASS
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.TALL_SEAGRASS
					|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 0.5, entity.getZ()))).getBlock() == Blocks.SNOW) && entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).doublejumpcount > 0) {
				{
					EngiesChaosModVariables.PlayerVariables _vars = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.doublejumpcount = entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).doublejumpcount - 1;
					_vars.syncPlayerVariables(entity);
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.5, (entity.getDeltaMovement().z())));
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}