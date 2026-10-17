package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import engiegames.engies_chaos.init.EngiesChaosModGameRules;

@Mod.EventBusSubscriber
public class ApocalypseCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity2.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0175);
			} else {
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.025);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_UNIVERSAL_ANGER).set(true, world.getServer());
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.RANDOM) == false) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			}
			if ((entity.level.dimension()) == Level.END) {
				if (!(entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
						&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!(world instanceof Level _lvl16 && _lvl16.isDay())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity20.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.035);
			} else {
				if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity21.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
			}
			if ((entity.level.dimension()) == Level.END) {
				if (!(entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
						&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!(world instanceof Level _lvl30 && _lvl30.isDay())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.RANDOM) == false) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity37.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0525);
			} else {
				if (entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity38.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.075);
			}
			if ((entity.level.dimension()) == Level.END) {
				if (!(entity instanceof ServerPlayer _plr42 && _plr42.level instanceof ServerLevel
						&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!(world instanceof Level _lvl47 && _lvl47.isDay())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.RANDOM) == false) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity54 && _livingEntity54.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity54.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.07);
			} else {
				if (entity instanceof LivingEntity _livingEntity55 && _livingEntity55.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity55.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.RANDOM) == false) {
				world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			}
		} else {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.CUSTOM_SPRINT) == true) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity64 && _livingEntity64.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity64.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1125);
					} else {
						if (entity instanceof LivingEntity _livingEntity65 && _livingEntity65.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity65.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.075);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d
						&& (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity70 && _livingEntity70.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity70.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.075);
					} else {
						if (entity instanceof LivingEntity _livingEntity71 && _livingEntity71.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity71.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d
						&& (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity76 && _livingEntity76.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity76.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.075);
					} else {
						if (entity instanceof LivingEntity _livingEntity77 && _livingEntity77.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity77.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d
						&& (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity82 && _livingEntity82.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity82.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0375);
					} else {
						if (entity instanceof LivingEntity _livingEntity83 && _livingEntity83.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity83.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.025);
					}
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity84 && _livingEntity84.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity84.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			}
		}
	}
}