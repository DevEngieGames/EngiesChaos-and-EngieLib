package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class AntimatterChestplatesProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_MAD_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 13));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 14));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 15));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 16));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 17));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 18));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_HOSTILE_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 19));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_DOOMSDAYS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 20));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAYS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 21));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_THE_ENDS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 22));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_ENGIES_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 23));
		} else if (itemstack.getItem() == EngiesChaosModItems.ANTIMATTER_ENGIEGAMESS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 24));
		} else if (itemstack.getItem() == EngiesChaosModItems.COSMIC_ENGIE_GAMESS_CHESTPLATE.get() || itemstack.getItem() == EngiesChaosModItems.ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 25));
		}
	}
}