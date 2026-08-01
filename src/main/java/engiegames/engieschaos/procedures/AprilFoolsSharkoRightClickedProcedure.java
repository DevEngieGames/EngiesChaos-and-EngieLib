package engiegames.engieschaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import engiegames.engieschaos.entity.AprilFoolsTigerSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsRareSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsRareEngieSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsMythicSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsLegendarySharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsExoticSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsEngieSharkoEntity;
import engiegames.engieschaos.entity.AprilFoolsAlbinoSharkoEntity;

public class AprilFoolsSharkoRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == sourceentity) {
			if (sourceentity.isShiftKeyDown()) {
				if (Math.random() <= 0.25) {
					if (Math.random() <= 0.05 && Math.random() > 0.04) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are slowly healing...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 2, false, true));
					} else if (Math.random() <= 0.04 && Math.random() > 0.03) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are much more resiliant...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 3, false, true));
					} else if (Math.random() <= 0.03 && Math.random() > 0.02) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are much more stronger...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 3, false, true));
					} else if (Math.random() <= 0.02 && Math.random() > 0.01) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are a little bit faster now...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, true));
					} else if (Math.random() <= 0.01 && Math.random() > 0.001) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are gotten a little more health...")), true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 5, false, true));
					} else if (Math.random() <= 0.001) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("As you pet " + entity.getDisplayName().getString() + ", you realise that " + "they" + " are a little too strong...")), true);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 5, 1, 1, 1, 1);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 2, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 3, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, true));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 5, false, true));
					} else {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + " gives you a big smile as you pet " + "them" + ".")), true);
					}
				} else if (Math.random() <= 0.005) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Star begged and I responded with this change."), true);
				} else {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("Anything to make " + entity.getDisplayName().getString() + " happy.")), true);
				}
			} else {
				if (entity instanceof AprilFoolsSharkoEntity) {
					if ((entity instanceof AprilFoolsSharkoEntity _datEntL37 && _datEntL37.getEntityData().get(AprilFoolsSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsSharkoEntity _datEntL39 && _datEntL39.getEntityData().get(AprilFoolsSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsAlbinoSharkoEntity) {
					if ((entity instanceof AprilFoolsAlbinoSharkoEntity _datEntL42 && _datEntL42.getEntityData().get(AprilFoolsAlbinoSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsAlbinoSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsAlbinoSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsAlbinoSharkoEntity _datEntL44 && _datEntL44.getEntityData().get(AprilFoolsAlbinoSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsAlbinoSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsAlbinoSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsRareSharkoEntity) {
					if ((entity instanceof AprilFoolsRareSharkoEntity _datEntL47 && _datEntL47.getEntityData().get(AprilFoolsRareSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsRareSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsRareSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsRareSharkoEntity _datEntL49 && _datEntL49.getEntityData().get(AprilFoolsRareSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsRareSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsRareSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsLegendarySharkoEntity) {
					if ((entity instanceof AprilFoolsLegendarySharkoEntity _datEntL52 && _datEntL52.getEntityData().get(AprilFoolsLegendarySharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsLegendarySharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsLegendarySharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsLegendarySharkoEntity _datEntL54 && _datEntL54.getEntityData().get(AprilFoolsLegendarySharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsLegendarySharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsLegendarySharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsMythicSharkoEntity) {
					if ((entity instanceof AprilFoolsMythicSharkoEntity _datEntL57 && _datEntL57.getEntityData().get(AprilFoolsMythicSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsMythicSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsMythicSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsMythicSharkoEntity _datEntL59 && _datEntL59.getEntityData().get(AprilFoolsMythicSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsMythicSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsMythicSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsExoticSharkoEntity) {
					if ((entity instanceof AprilFoolsExoticSharkoEntity _datEntL62 && _datEntL62.getEntityData().get(AprilFoolsExoticSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsExoticSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsExoticSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsExoticSharkoEntity _datEntL64 && _datEntL64.getEntityData().get(AprilFoolsExoticSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsExoticSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsExoticSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsEngieSharkoEntity) {
					if ((entity instanceof AprilFoolsEngieSharkoEntity _datEntL67 && _datEntL67.getEntityData().get(AprilFoolsEngieSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsEngieSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsEngieSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsEngieSharkoEntity _datEntL69 && _datEntL69.getEntityData().get(AprilFoolsEngieSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsEngieSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsEngieSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsRareEngieSharkoEntity) {
					if ((entity instanceof AprilFoolsRareEngieSharkoEntity _datEntL72 && _datEntL72.getEntityData().get(AprilFoolsRareEngieSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsRareEngieSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsRareEngieSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsRareEngieSharkoEntity _datEntL74 && _datEntL74.getEntityData().get(AprilFoolsRareEngieSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsRareEngieSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsRareEngieSharkoEntity.DATA_laying, false);
					}
				} else if (entity instanceof AprilFoolsTigerSharkoEntity) {
					if ((entity instanceof AprilFoolsTigerSharkoEntity _datEntL77 && _datEntL77.getEntityData().get(AprilFoolsTigerSharkoEntity.DATA_laying)) == false) {
						if (entity instanceof AprilFoolsTigerSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsTigerSharkoEntity.DATA_laying, true);
					} else if ((entity instanceof AprilFoolsTigerSharkoEntity _datEntL79 && _datEntL79.getEntityData().get(AprilFoolsTigerSharkoEntity.DATA_laying)) == true) {
						if (entity instanceof AprilFoolsTigerSharkoEntity _datEntSetL)
							_datEntSetL.getEntityData().set(AprilFoolsTigerSharkoEntity.DATA_laying, false);
					}
				}
			}
		}
	}
}