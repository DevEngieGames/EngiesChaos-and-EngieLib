package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@EventBusSubscriber
public class EntityDiesFromSourceEntityUsingHallowScytheProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("allaboutengie:sharkos")))) {
			if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.is(ItemTags.create(ResourceLocation.parse("allaboutengie:statclocked")))) {
				{
					final String _tagName = "engiegameshallowscythestatclockcount";
					final double _tagValue = (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("engiegameshallowscythestatclockcount") + 0.5);
					CustomData.update(DataComponents.CUSTOM_DATA, ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "countuntilbasedrop";
					final double _tagValue = (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("countuntilbasedrop") + 0.5);
					CustomData.update(DataComponents.CUSTOM_DATA, ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY),
							tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.CountUntilBaseDrop = (sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getData(EngiesChaosModVariables.PLAYER_VARIABLES).CountUntilBaseDrop + 1;
					_vars.syncPlayerVariables((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
				}
			}
		} else if (sourceentity instanceof Player) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("allaboutengie:statclocked")))) {
				{
					final String _tagName = "engiegameshallowscythestatclockcount";
					final double _tagValue = ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag()
							.getDouble("engiegameshallowscythestatclockcount") + 0.5);
					CustomData.update(DataComponents.CUSTOM_DATA, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					final String _tagName = "countuntilbasedrop";
					final double _tagValue = ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("countuntilbasedrop") + 0.5);
					CustomData.update(DataComponents.CUSTOM_DATA, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					EngiesChaosModVariables.PlayerVariables _vars = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES);
					_vars.CountUntilBaseDrop = sourceentity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).CountUntilBaseDrop + 1;
					_vars.syncPlayerVariables(sourceentity);
				}
			}
		}
	}
}