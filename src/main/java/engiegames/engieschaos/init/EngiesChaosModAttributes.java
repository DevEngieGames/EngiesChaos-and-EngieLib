/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package engiegames.engieschaos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EngiesChaosModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, EngiesChaosMod.MODID);
	public static final RegistryObject<Attribute> ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER = REGISTRY.register("engies_antimatter_blessing_chance_for_player",
			() -> new RangedAttribute("attribute.engies_chaos.engies_antimatter_blessing_chance_for_player", 0.5, 0.05, 0.55).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get());
	}

	@Mod.EventBusSubscriber
	public static class PlayerAttributesSync {
		@SubscribeEvent
		public static void playerClone(PlayerEvent.Clone event) {
			Player oldPlayer = event.getOriginal();
			Player newPlayer = event.getEntity();
			newPlayer.getAttribute(ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).setBaseValue(oldPlayer.getAttribute(ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue());
		}
	}
}