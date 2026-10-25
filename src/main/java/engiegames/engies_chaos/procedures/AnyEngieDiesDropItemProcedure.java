package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.init.EngiesChaosModEnchantments;

@Mod.EventBusSubscriber
public class AnyEngieDiesDropItemProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT) == true) {
			if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/sharkos")))) {
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (sourceentity instanceof Player _player)
						_player.giveExperienceLevels(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) * 5);
					for (int index0 = 0; index0 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index0++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get(),
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (sourceentity instanceof Player _player)
						_player.giveExperienceLevels(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) * 5);
					for (int index1 = 0; index1 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()); index1++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index2 = 0; index2 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(Enchantments.MOB_LOOTING); index2++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
						((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index3 = 0; index3 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index3++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
			} else if (sourceentity instanceof Player) {
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (sourceentity instanceof Player _player)
						_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) * 5);
					for (int index4 = 0; index4 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index4++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (sourceentity instanceof Player _player)
						_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) * 5);
					for (int index5 = 0; index5 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()); index5++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index6 = 0; index6 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index6++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					for (int index7 = 0; index7 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index7++) {
						if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
							AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
						}
					}
				}
			} else if (sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/biblically")))) {
				for (int index8 = 0; index8 < (int) Mth.nextDouble(RandomSource.create(), 1, 5); index8++) {
					AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
				}
			} else {
				AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
			}
		}
	}
}