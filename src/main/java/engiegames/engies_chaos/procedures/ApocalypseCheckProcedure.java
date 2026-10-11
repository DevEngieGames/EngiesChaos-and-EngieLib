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
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_ONE) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity2.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.1 - 0.0300000011920929));
			} else {
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_TWO) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity8.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.075 - 0.0300000011920929));
			} else {
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity9.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.075);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			if ((entity.level.dimension()) == Level.END) {
				if (!(entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
						&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!(world instanceof Level _lvl20 && _lvl20.isDay())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.APOCALYPSE_THREE) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity24.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.05 - 0.0300000011920929));
			} else {
				if (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity25.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			if ((entity.level.dimension()) == Level.END) {
				if (!(entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
						&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!(world instanceof Level _lvl36 && _lvl36.isDay())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity40.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.025 - 0.0300000011920929));
			} else {
				if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity41.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.025);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_NATURAL_REGENERATION).set(false, world.getServer());
			world.getLevelData().getGameRules().getRule(GameRules.RULE_UNIVERSAL_ANGER).set(true, world.getServer());
			if ((entity.level.dimension()) == Level.END) {
				if (!(entity instanceof ServerPlayer _plr48 && _plr48.level instanceof ServerLevel
						&& _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!(world instanceof Level _lvl53 && _lvl53.isDay())) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0, false, false));
				}
			}
		} else {
			if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.CUSTOM_SPRINT) == true) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity60 && _livingEntity60.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity60.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.075 + 0.0800000011921 - 0.0300000011920929));
					} else {
						if (entity instanceof LivingEntity _livingEntity61 && _livingEntity61.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity61.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.075);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d
						&& (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity66 && _livingEntity66.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity66.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.05 + 0.0800000011921 - 0.0300000011920929));
					} else {
						if (entity instanceof LivingEntity _livingEntity67 && _livingEntity67.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity67.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d
						&& (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity72 && _livingEntity72.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity72.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.05 + 0.0800000011921 - 0.0300000011920929));
					} else {
						if (entity instanceof LivingEntity _livingEntity73 && _livingEntity73.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity73.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4d
						&& (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 10) {
					if (entity.isSprinting()) {
						if (entity instanceof LivingEntity _livingEntity78 && _livingEntity78.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity78.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((0.025 + 0.0800000011921 - 0.0300000011920929));
					} else {
						if (entity instanceof LivingEntity _livingEntity79 && _livingEntity79.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity79.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.025);
					}
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity80 && _livingEntity80.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity80.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			}
		}
	}
}