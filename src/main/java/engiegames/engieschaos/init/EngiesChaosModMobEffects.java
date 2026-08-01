/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engieschaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import engiegames.engieschaos.potion.StunnedMobEffect;
import engiegames.engieschaos.EngiesChaosMod;

public class EngiesChaosModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EngiesChaosMod.MODID);
	public static final RegistryObject<MobEffect> STUNNED = REGISTRY.register("stunned", () -> new StunnedMobEffect());
}