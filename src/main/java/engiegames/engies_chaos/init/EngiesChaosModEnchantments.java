/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import engiegames.engies_chaos.enchantment.EngiesTrueBlessingEnchantment;
import engiegames.engies_chaos.enchantment.EngiesBlessingEnchantment;
import engiegames.engies_chaos.enchantment.EngiesAntimatterBlessingEnchantment;
import engiegames.engies_chaos.EngiesChaosMod;

public class EngiesChaosModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EngiesChaosMod.MODID);
	public static final RegistryObject<Enchantment> ENGIES_BLESSING = REGISTRY.register("engies_blessing", () -> new EngiesBlessingEnchantment());
	public static final RegistryObject<Enchantment> ENGIES_ANTIMATTER_BLESSING = REGISTRY.register("engies_antimatter_blessing", () -> new EngiesAntimatterBlessingEnchantment());
	public static final RegistryObject<Enchantment> ENGIES_TRUE_BLESSING = REGISTRY.register("engies_true_blessing", () -> new EngiesTrueBlessingEnchantment());
}