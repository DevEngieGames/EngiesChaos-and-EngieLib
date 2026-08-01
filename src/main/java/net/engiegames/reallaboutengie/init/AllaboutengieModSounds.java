/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.engiegames.reallaboutengie.AllaboutengieMod;

public class AllaboutengieModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AllaboutengieMod.MODID);
	public static final RegistryObject<SoundEvent> BYEBYETHERE = REGISTRY.register("byebyethere", () -> new SoundEvent(new ResourceLocation("allaboutengie", "byebyethere")));
	public static final RegistryObject<SoundEvent> DOOMSDAY_EERIE = REGISTRY.register("doomsday_eerie", () -> new SoundEvent(new ResourceLocation("allaboutengie", "doomsday_eerie")));
	public static final RegistryObject<SoundEvent> DOOMSDAY_START = REGISTRY.register("doomsday_start", () -> new SoundEvent(new ResourceLocation("allaboutengie", "doomsday_start")));
	public static final RegistryObject<SoundEvent> HOTLINEMIAMI2_RUN = REGISTRY.register("hotlinemiami2-run", () -> new SoundEvent(new ResourceLocation("allaboutengie", "hotlinemiami2-run")));
	public static final RegistryObject<SoundEvent> THEEND_EERIE = REGISTRY.register("theend_eerie", () -> new SoundEvent(new ResourceLocation("allaboutengie", "theend_eerie")));
	public static final RegistryObject<SoundEvent> CUSTOMLIGHTNING = REGISTRY.register("customlightning", () -> new SoundEvent(new ResourceLocation("allaboutengie", "customlightning")));
	public static final RegistryObject<SoundEvent> CUSTOMLIGHTNING2 = REGISTRY.register("customlightning2", () -> new SoundEvent(new ResourceLocation("allaboutengie", "customlightning2")));
	public static final RegistryObject<SoundEvent> RIFTOPENS = REGISTRY.register("riftopens", () -> new SoundEvent(new ResourceLocation("allaboutengie", "riftopens")));
	public static final RegistryObject<SoundEvent> CHURCHBELLS = REGISTRY.register("churchbells", () -> new SoundEvent(new ResourceLocation("allaboutengie", "churchbells")));
	public static final RegistryObject<SoundEvent> CHURCHBELLS2 = REGISTRY.register("churchbells2", () -> new SoundEvent(new ResourceLocation("allaboutengie", "churchbells2")));
	public static final RegistryObject<SoundEvent> PLAYERSTUNMOBS = REGISTRY.register("playerstunmobs", () -> new SoundEvent(new ResourceLocation("allaboutengie", "playerstunmobs")));
	public static final RegistryObject<SoundEvent> PLAYERSTUNABILOFFCOOLDOWN = REGISTRY.register("playerstunabiloffcooldown", () -> new SoundEvent(new ResourceLocation("allaboutengie", "playerstunabiloffcooldown")));
	public static final RegistryObject<SoundEvent> MISSILE_EXPLOSION = REGISTRY.register("missile_explosion", () -> new SoundEvent(new ResourceLocation("allaboutengie", "missile_explosion")));
	public static final RegistryObject<SoundEvent> BACKSTABSOUND = REGISTRY.register("backstabsound", () -> new SoundEvent(new ResourceLocation("allaboutengie", "backstabsound")));
}