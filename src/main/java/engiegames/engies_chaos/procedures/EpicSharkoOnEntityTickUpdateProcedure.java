package engiegames.engies_chaos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.entity.EpicSharkoEntity;

public class EpicSharkoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) != 0) {
				entity.getPersistentData().putDouble("SharkoStateTimerForChance", (entity.getPersistentData().getDouble("SharkoStateTimerForChance") + 0.05));
				if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
					if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 4) {
						if (entity instanceof EpicSharkoEntity _datEntSetI)
							_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 3);
					}
					if (entity.getPersistentData().getDouble("SharkoStateTimerForChance") >= 60) {
						entity.getPersistentData().putDouble("SharkoStateTimerForChance", 0);
						if (!entity.isInWater() && !entity.isInLava()) {
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 1) {
								if (Math.random() <= 0.5) {
									if (entity instanceof EpicSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 2);
									if (Math.random() <= 0.49) {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
									}
								}
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 2) {
								if (Math.random() <= 0.5) {
									if (Math.random() <= 0.49) {
										if (entity instanceof EpicSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 3);
									} else {
										if (Math.random() >= 0.75) {
											if (entity instanceof EpicSharkoEntity _datEntSetI)
												_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 1);
										}
									}
								}
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 3) {
								if (Math.random() >= 0.75) {
									if (entity instanceof EpicSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 2);
									if (Math.random() <= 0.49) {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
									}
								}
							}
						}
					}
				} else {
					if (world instanceof Level _lvl23 && _lvl23.isDay() && entity.getPersistentData().getDouble("SharkoStateTimerForChance") >= 60) {
						entity.getPersistentData().putDouble("SharkoStateTimerForChance", 0);
						if (!entity.isInWater() && !entity.isInLava()) {
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 1) {
								if (Math.random() <= 0.5) {
									if (entity instanceof EpicSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 2);
									if (Math.random() <= 0.49) {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
									}
								}
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 2) {
								if (Math.random() <= 0.5) {
									if (Math.random() <= 0.49) {
										if (entity instanceof EpicSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 3);
									} else {
										if (Math.random() >= 0.75) {
											if (entity instanceof EpicSharkoEntity _datEntSetI)
												_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 1);
										}
									}
								}
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 3) {
								if (Math.random() <= 0.0625) {
									if (entity instanceof EpicSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 4);
									if (Math.random() <= 0.49) {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
									} else {
										if (entity instanceof EpicSharkoEntity _datEntSetL)
											_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
									}
								} else {
									if (Math.random() >= 0.75) {
										if (entity instanceof EpicSharkoEntity _datEntSetI)
											_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 2);
										if (Math.random() <= 0.49) {
											if (entity instanceof EpicSharkoEntity _datEntSetL)
												_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
										} else {
											if (entity instanceof EpicSharkoEntity _datEntSetL)
												_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
										}
									}
								}
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 4) {
								if (Math.random() <= 0.5) {
									if (entity instanceof EpicSharkoEntity _datEntSetI)
										_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 3);
								}
							}
						}
					} else if (!(world instanceof Level _lvl44 && _lvl44.isDay()) && entity.getPersistentData().getDouble("SharkoStateTimerForChance") >= 30) {
						entity.getPersistentData().putDouble("SharkoStateTimerForChance", 0);
						if (!entity.isInWater() && !entity.isInLava()) {
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 1) {
								if (entity instanceof EpicSharkoEntity _datEntSetI)
									_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 2);
								if (Math.random() <= 0.49) {
									if (entity instanceof EpicSharkoEntity _datEntSetL)
										_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
								} else {
									if (entity instanceof EpicSharkoEntity _datEntSetL)
										_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
								}
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 2) {
								if (entity instanceof EpicSharkoEntity _datEntSetI)
									_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 3);
							}
							if ((entity instanceof EpicSharkoEntity _datEntI ? _datEntI.getEntityData().get(EpicSharkoEntity.DATA_SharkoState) : 0) == 3) {
								if (entity instanceof EpicSharkoEntity _datEntSetI)
									_datEntSetI.getEntityData().set(EpicSharkoEntity.DATA_SharkoState, 4);
								if (Math.random() <= 0.49) {
									if (entity instanceof EpicSharkoEntity _datEntSetL)
										_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, false);
								} else {
									if (entity instanceof EpicSharkoEntity _datEntSetL)
										_datEntSetL.getEntityData().set(EpicSharkoEntity.DATA_AlternateState, true);
								}
							}
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).difficultytoggle == true) {
				if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty > 0) {
					if (entity instanceof LivingEntity _livingEntity59 && _livingEntity59.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
						_livingEntity59.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((20 * 2.5 * EngiesChaosModVariables.MapVariables.get(world).MobDifficulty));
				}
			}
		}
	}
}