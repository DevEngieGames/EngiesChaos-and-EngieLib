package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.EngiesChaosMod;

public class EntitySpawnsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EngiesChaosMod.queueServerWork(5, () -> {
			if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true) {
					if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity2.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity1.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2.5
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity6.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity5.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity7.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
										* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity11.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity10.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity12.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity15.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity14.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 2 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity16.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity19.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity18.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity20.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity24.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity23.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity25.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity28.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity27.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 3 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity29.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity32.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity31.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity33.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
						if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty <= 0) {
							if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity37.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity36.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity38.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
							if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity41.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity40.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* 5 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity42.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5
												* 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
							if (entity instanceof LivingEntity _livingEntity45 && _livingEntity45.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity45.getAttribute(Attributes.MAX_HEALTH)
										.setBaseValue(((entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity44.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity46 && _livingEntity46.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity46.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
												* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						}
					}
				} else if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true) {
					if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 1 && EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 525) {
						if (entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity49.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity48.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2.5
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					} else if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty >= 525) {
						if (entity instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
							_livingEntity53.getAttribute(Attributes.MAX_HEALTH)
									.setBaseValue(((entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity52.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
											* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livingEntity54 && _livingEntity54.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity54.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
									* EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
					}
				}
			} else if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == false) {
				if (EngiesChaosModVariables.MapVariables.get(world).mobbasehpmulttoggle == true) {
					if (ModList.get().isLoaded("attributefix") == true) {
						if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/nightmarehostile")))) {
							if (entity instanceof LivingEntity _livingEntity59 && _livingEntity59.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity59.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity58 && _livingEntity58.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity58.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity60.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 2));
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/insanityhostile")))) {
							if (entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity64.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity63 && _livingEntity63.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity63.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity65 && _livingEntity65.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity65.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 3));
						} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/engiepochostile")))) {
							if (entity instanceof LivingEntity _livingEntity69 && _livingEntity69.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
								_livingEntity69.getAttribute(Attributes.MAX_HEALTH).setBaseValue(
										((entity instanceof LivingEntity _livingEntity68 && _livingEntity68.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity68.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth(
										(float) ((entity instanceof LivingEntity _livingEntity70 && _livingEntity70.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity70.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) * 5));
						}
					}
				}
			}
		});
	}
}