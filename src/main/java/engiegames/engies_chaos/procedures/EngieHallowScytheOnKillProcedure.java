package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import engiegames.engies_chaos.init.EngiesChaosModItems;

@EventBusSubscriber
public class EngieHallowScytheOnKillProcedure {
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
			if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_HALLOW_SCYTHE.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ANCHOR.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_ANCHOR
							.get()
					|| ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_ANCHOR
							.get()) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > Math.round((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				} else {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + Math.round((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d));
				}
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > Math
						.round(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d)) {
					if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _entity)
						_entity.setHealth((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				} else {
					if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _entity)
						_entity.setHealth(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
								+ Math.round(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d));
				}
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_HALLOW_SCYTHE.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ANCHOR.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_ANCHOR.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_ANCHOR.get()) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > Math.round((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				} else {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.setHealth((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + Math.round((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d));
				}
			}
		}
	}
}