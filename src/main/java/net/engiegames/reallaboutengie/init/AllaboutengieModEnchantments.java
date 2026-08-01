/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.engiegames.reallaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.engiegames.reallaboutengie.enchantment.EngiesBlessingEnchantment;
import net.engiegames.reallaboutengie.enchantment.EngiesAntimatterBlessingEnchantment;
import net.engiegames.reallaboutengie.AllaboutengieMod;

public class AllaboutengieModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AllaboutengieMod.MODID);
	public static final RegistryObject<Enchantment> ENGIES_BLESSING = REGISTRY.register("engies_blessing", () -> new EngiesBlessingEnchantment());
	public static final RegistryObject<Enchantment> ENGIES_ANTIMATTER_BLESSING = REGISTRY.register("engies_antimatter_blessing", () -> new EngiesAntimatterBlessingEnchantment());
}