/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.engiegames.reallaboutengie.client.particle.EngiesBlessingAttackParticle;
import net.engiegames.reallaboutengie.client.particle.BanHammerHitParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllaboutengieModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(AllaboutengieModParticleTypes.BAN_HAMMER_HIT.get(), BanHammerHitParticle::provider);
		event.register(AllaboutengieModParticleTypes.ENGIES_BLESSING_ATTACK.get(), EngiesBlessingAttackParticle::provider);
	}
}