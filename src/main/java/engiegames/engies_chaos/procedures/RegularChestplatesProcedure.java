package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class RegularChestplatesProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == EngiesChaosModItems.ANGRY_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 1));
		} else if (itemstack.getItem() == EngiesChaosModItems.ENRAGED_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 2));
		} else if (itemstack.getItem() == EngiesChaosModItems.OUTRAGED_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 3));
		} else if (itemstack.getItem() == EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 4));
		} else if (itemstack.getItem() == EngiesChaosModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 5));
		} else if (itemstack.getItem() == EngiesChaosModItems.HOSTILE_ENGIES_CHESTPLATE.get() || itemstack.getItem() == EngiesChaosModItems.CODE_REDEEMERS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 6));
		} else if (itemstack.getItem() == EngiesChaosModItems.DOOMS_DAYS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 7));
		} else if (itemstack.getItem() == EngiesChaosModItems.SUPER_DOOMS_DAYS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 8));
		} else if (itemstack.getItem() == EngiesChaosModItems.THE_ENDS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 9));
		} else if (itemstack.getItem() == EngiesChaosModItems.ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 10));
		} else if (itemstack.getItem() == EngiesChaosModItems.MINDSCAPE_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 11));
		} else if (itemstack.getItem() == EngiesChaosModItems.ENGIEGAMESS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 12));
		}
	}
}