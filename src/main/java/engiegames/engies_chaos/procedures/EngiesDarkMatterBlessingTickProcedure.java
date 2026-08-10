package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import engiegames.engies_chaos.init.EngiesChaosModEnchantments;
import engiegames.engies_chaos.init.EngiesChaosModAttributes;

@Mod.EventBusSubscriber
public class EngiesDarkMatterBlessingTickProcedure {
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
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
				? _livingEntity0.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
				: 0) < 100) {
			if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()))
				_livingEntity7.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
						.setBaseValue((2 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_DARK_MATTER_BLESSING.get())
								+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING)
								+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)));
		} else {
			if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()))
				_livingEntity8.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).setBaseValue(100);
		}
	}
}