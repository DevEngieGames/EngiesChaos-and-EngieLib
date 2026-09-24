package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class NonModdedEntitySpawnsProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/custommobs"))) && entity instanceof Monster) {
			EngiesChaosMod.queueServerWork(5, () -> {
				if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity3.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity2.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2.5
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
						if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity7.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity6.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity8.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
									* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					}
				}
			});
		}
	}
}