/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import engiegames.engies_chaos.EngiesChaosMod;

public class EngiesChaosModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, EngiesChaosMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BAN_HAMMER_HIT = REGISTRY.register("ban_hammer_hit", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ENGIES_BLESSING_ATTACK = REGISTRY.register("engies_blessing_attack", () -> new SimpleParticleType(false));
}