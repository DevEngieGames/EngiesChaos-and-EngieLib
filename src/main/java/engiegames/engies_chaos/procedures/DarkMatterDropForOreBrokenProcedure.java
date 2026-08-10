package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModEnchantments;
import engiegames.engies_chaos.init.EngiesChaosModAttributes;

@Mod.EventBusSubscriber
public class DarkMatterDropForOreBrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_DARK_MATTER_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				&& (getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE)) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:ores"))) || (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("c:ores")))) {
				if (Math.round(
						Mth.nextDouble(RandomSource.create(), 1, 100)) <= (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
								? _livingEntity9.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
								: 0)) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 100)) <= 5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.ANTIMATTER.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(EngiesChaosModItems.ANTIMATTER_FRAGMENT.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
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