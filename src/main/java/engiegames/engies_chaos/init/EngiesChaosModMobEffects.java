/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import engiegames.engies_chaos.procedures.StunnedEffectExpiresProcedure;
import engiegames.engies_chaos.potion.StunnedMobEffect;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class EngiesChaosModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, EngiesChaosMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> STUNNED = REGISTRY.register("stunned", () -> new StunnedMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(STUNNED)) {
			StunnedEffectExpiresProcedure.execute(entity);
		}
	}
}