/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engieschaos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import engiegames.engieschaos.client.particle.EngiesBlessingAttackParticle;
import engiegames.engieschaos.client.particle.BanHammerHitParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EngiesChaosModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(EngiesChaosModParticleTypes.BAN_HAMMER_HIT.get(), BanHammerHitParticle::provider);
		event.register(EngiesChaosModParticleTypes.ENGIES_BLESSING_ATTACK.get(), EngiesBlessingAttackParticle::provider);
	}
}