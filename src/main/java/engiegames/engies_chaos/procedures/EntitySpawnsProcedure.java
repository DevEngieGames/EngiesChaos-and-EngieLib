package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

@EventBusSubscriber
public class EntitySpawnsProcedure {
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
		if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
			EngiesChaosMod.queueServerWork(5, () -> {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("engies_chaos:mobs/hostile")))) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
						if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity2.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity1.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
						if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity6.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity5.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 690));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 690);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
						if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity10.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity9.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 250000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 250000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000) {
						if (entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity14.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity13.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 500000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 500000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
						if (entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity18.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity17.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 0 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity22.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity21.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("engies_chaos:mobs/nightmarehostile")))) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
						if (entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity27.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity26.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
						if (entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity31.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity30.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 690));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
						if (entity instanceof LivingEntity _livingEntity35 && _livingEntity35.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity35.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity34.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 250000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 250000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000) {
						if (entity instanceof LivingEntity _livingEntity39 && _livingEntity39.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity39.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity38.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 500000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 500000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
						if (entity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity43.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity42.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 0 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity47 && _livingEntity47.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity47.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity46 && _livingEntity46.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity46.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					} else {
						if (entity instanceof LivingEntity _livingEntity51 && _livingEntity51.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity51.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity50.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2);
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("engies_chaos:mobs/insanityhostile")))) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
						if (entity instanceof LivingEntity _livingEntity56 && _livingEntity56.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity56.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity55 && _livingEntity55.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity55.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
						if (entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity60.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity59 && _livingEntity59.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity59.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 690));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
						if (entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity64.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity63 && _livingEntity63.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity63.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 250000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 250000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000) {
						if (entity instanceof LivingEntity _livingEntity68 && _livingEntity68.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity68.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity67 && _livingEntity67.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity67.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 500000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 500000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
						if (entity instanceof LivingEntity _livingEntity72 && _livingEntity72.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity72.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity71 && _livingEntity71.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity71.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 0 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity76 && _livingEntity76.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity76.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity75 && _livingEntity75.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity75.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 3 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					} else {
						if (entity instanceof LivingEntity _livingEntity80 && _livingEntity80.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity80.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity79 && _livingEntity79.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity79.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 3);
					}
				} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("engies_chaos:mobs/engiepochostile")))) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525) {
						if (entity instanceof LivingEntity _livingEntity85 && _livingEntity85.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity85.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity84 && _livingEntity84.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity84.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 690) {
						if (entity instanceof LivingEntity _livingEntity89 && _livingEntity89.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity89.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity88 && _livingEntity88.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity88.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 690));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 250000) {
						if (entity instanceof LivingEntity _livingEntity93 && _livingEntity93.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity93.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity92 && _livingEntity92.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity92.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 250000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 250000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 500000) {
						if (entity instanceof LivingEntity _livingEntity97 && _livingEntity97.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity97.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity96 && _livingEntity96.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity96.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 500000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 500000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty == 525000) {
						if (entity instanceof LivingEntity _livingEntity101 && _livingEntity101.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity101.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity100 && _livingEntity100.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity100.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 525000));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 525000);
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 0 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity105 && _livingEntity105.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity105.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity104 && _livingEntity104.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity104.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					} else {
						if (entity instanceof LivingEntity _livingEntity109 && _livingEntity109.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity109.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
									((entity instanceof LivingEntity _livingEntity108 && _livingEntity108.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity108.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 5);
					}
				}
			});
		}
	}
}