package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.init.EngiesChaosModEnchantments;
import engiegames.engies_chaos.entity.XEngieGamesEntity;

@Mod.EventBusSubscriber
public class CoinDroppingProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index0 = 0; index0 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							* ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) + 1
									+ (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1); index0++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					for (int index1 = 0; index1 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							* ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) + 1); index1++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					for (int index2 = 0; index2 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							* ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1); index2++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				} else if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					for (int index3 = 0; index3 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index3++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				}
			}
		} else if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:sharkos")))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
					((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
								((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index4 = 0; index4 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							* (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING) + 1
									+ ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)
									+ 1); index4++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
								((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					for (int index5 = 0; index5 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							* (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING)
									+ 1); index5++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
								((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					for (int index6 = 0; index6 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
							* (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE)
									+ 1); index6++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				} else if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
								((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					for (int index7 = 0; index7 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index7++) {
						CoinDropping1Procedure.execute(world, entity);
					}
				}
			}
		} else if (sourceentity instanceof XEngieGamesEntity) {
			for (int index8 = 0; index8 < 25 * 8; index8++) {
				CoinDropping1Procedure.execute(world, entity);
			}
		} else {
			CoinDropping1Procedure.execute(world, entity);
		}
	}
}