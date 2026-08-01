/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.engiegames.reallaboutengie.AllaboutengieMod;

public class AllaboutengieModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<SimpleParticleType> BAN_HAMMER_HIT = REGISTRY.register("ban_hammer_hit", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENGIES_BLESSING_ATTACK = REGISTRY.register("engies_blessing_attack", () -> new SimpleParticleType(false));
}