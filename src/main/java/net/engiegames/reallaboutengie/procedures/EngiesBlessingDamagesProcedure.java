package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModEnchantments;
import net.engiegames.reallaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EngiesBlessingDamagesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			entity.getPersistentData().putBoolean("entityattackedbyblessing", false);
			AllaboutengieModVariables.MapVariables.get(world).getdamage = amount * (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get());
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			AllaboutengieMod.queueServerWork(1, () -> {
				if (entity.getPersistentData().getBoolean("entityattackedbyblessing") == false) {
					entity.getPersistentData().putBoolean("entityattackedbyblessing", true);
					if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/engiesblessingable")))) {
						entity.hurt(damagesource, (float) AllaboutengieModVariables.MapVariables.get(world).getdamage);
						EngiesBlessingParticleSpawnProcedure.execute(world, entity);
					}
				}
			});
		}
	}
}