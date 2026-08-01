/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engies_chaos.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;
import net.minecraft.core.registries.BuiltInRegistries;

import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EngiesChaosModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, EngiesChaosMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER = REGISTRY.register("engies_antimatter_blessing_chance_for_player",
			() -> new RangedAttribute("attribute.engies_chaos.engies_antimatter_blessing_chance_for_player", 0.5, 0.05, 0.55).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER);
	}
}