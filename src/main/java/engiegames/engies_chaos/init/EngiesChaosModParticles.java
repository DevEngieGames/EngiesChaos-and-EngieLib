/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import engiegames.engies_chaos.client.particle.EngiesBlessingAttackParticle;
import engiegames.engies_chaos.client.particle.BanHammerHitParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EngiesChaosModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(EngiesChaosModParticleTypes.BAN_HAMMER_HIT.get(), BanHammerHitParticle::provider);
		event.registerSpriteSet(EngiesChaosModParticleTypes.ENGIES_BLESSING_ATTACK.get(), EngiesBlessingAttackParticle::provider);
	}
}