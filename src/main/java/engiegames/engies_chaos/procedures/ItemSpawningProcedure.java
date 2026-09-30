package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModAttributes;
import engiegames.engies_chaos.entity.PureInsanityEntity;
import engiegames.engies_chaos.entity.InsanityEntity;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class ItemSpawningProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (Mth.nextInt(RandomSource.create(), 1, 525) == 1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENGIE_PLUSH.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (Mth.nextInt(RandomSource.create(), 1, 1250) == 1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DEV_ENGIE_PLUSH.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/mad_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
								&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
								&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
								&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr27 && _plr27.level instanceof ServerLevel
								&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr32 && _plr32.level instanceof ServerLevel
								&& _plr32.getAdvancements().getOrStartProgress(_plr32.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr37 && _plr37.level instanceof ServerLevel
								&& _plr37.getAdvancements().getOrStartProgress(_plr37.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr42 && _plr42.level instanceof ServerLevel
								&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr47 && _plr47.level instanceof ServerLevel
								&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr52 && _plr52.level instanceof ServerLevel
								&& _plr52.getAdvancements().getOrStartProgress(_plr52.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr57 && _plr57.level instanceof ServerLevel
								&& _plr57.getAdvancements().getOrStartProgress(_plr57.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MAD_ENGIE_PLUS.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MadEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr62 && _plr62.level instanceof ServerLevel
								&& _plr62.getAdvancements().getOrStartProgress(_plr62.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr67 && _plr67.level instanceof ServerLevel
								&& _plr67.getAdvancements().getOrStartProgress(_plr67.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr72 && _plr72.level instanceof ServerLevel
								&& _plr72.getAdvancements().getOrStartProgress(_plr72.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr77 && _plr77.level instanceof ServerLevel
								&& _plr77.getAdvancements().getOrStartProgress(_plr77.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MAD_ENGIE_PLUS.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr82 && _plr82.level instanceof ServerLevel
								&& _plr82.getAdvancements().getOrStartProgress(_plr82.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_mad_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_MAD_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/angry_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr89 && _plr89.level instanceof ServerLevel
								&& _plr89.getAdvancements().getOrStartProgress(_plr89.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr94 && _plr94.level instanceof ServerLevel
								&& _plr94.getAdvancements().getOrStartProgress(_plr94.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr99 && _plr99.level instanceof ServerLevel
								&& _plr99.getAdvancements().getOrStartProgress(_plr99.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr104 && _plr104.level instanceof ServerLevel
								&& _plr104.getAdvancements().getOrStartProgress(_plr104.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr109 && _plr109.level instanceof ServerLevel
								&& _plr109.getAdvancements().getOrStartProgress(_plr109.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr114 && _plr114.level instanceof ServerLevel
								&& _plr114.getAdvancements().getOrStartProgress(_plr114.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr119 && _plr119.level instanceof ServerLevel
								&& _plr119.getAdvancements().getOrStartProgress(_plr119.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr124 && _plr124.level instanceof ServerLevel
								&& _plr124.getAdvancements().getOrStartProgress(_plr124.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr129 && _plr129.level instanceof ServerLevel
								&& _plr129.getAdvancements().getOrStartProgress(_plr129.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr134 && _plr134.level instanceof ServerLevel
								&& _plr134.getAdvancements().getOrStartProgress(_plr134.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).AngryEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr139 && _plr139.level instanceof ServerLevel
								&& _plr139.getAdvancements().getOrStartProgress(_plr139.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr144 && _plr144.level instanceof ServerLevel
								&& _plr144.getAdvancements().getOrStartProgress(_plr144.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr149 && _plr149.level instanceof ServerLevel
								&& _plr149.getAdvancements().getOrStartProgress(_plr149.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr154 && _plr154.level instanceof ServerLevel
								&& _plr154.getAdvancements().getOrStartProgress(_plr154.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr159 && _plr159.level instanceof ServerLevel
								&& _plr159.getAdvancements().getOrStartProgress(_plr159.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_angry_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_ANGRY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/enraged_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr166 && _plr166.level instanceof ServerLevel
								&& _plr166.getAdvancements().getOrStartProgress(_plr166.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr171 && _plr171.level instanceof ServerLevel
								&& _plr171.getAdvancements().getOrStartProgress(_plr171.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr176 && _plr176.level instanceof ServerLevel
								&& _plr176.getAdvancements().getOrStartProgress(_plr176.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr181 && _plr181.level instanceof ServerLevel
								&& _plr181.getAdvancements().getOrStartProgress(_plr181.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr186 && _plr186.level instanceof ServerLevel
								&& _plr186.getAdvancements().getOrStartProgress(_plr186.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr191 && _plr191.level instanceof ServerLevel
								&& _plr191.getAdvancements().getOrStartProgress(_plr191.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr196 && _plr196.level instanceof ServerLevel
								&& _plr196.getAdvancements().getOrStartProgress(_plr196.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr201 && _plr201.level instanceof ServerLevel
								&& _plr201.getAdvancements().getOrStartProgress(_plr201.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr206 && _plr206.level instanceof ServerLevel
								&& _plr206.getAdvancements().getOrStartProgress(_plr206.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr211 && _plr211.level instanceof ServerLevel
								&& _plr211.getAdvancements().getOrStartProgress(_plr211.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).EnragedEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr216 && _plr216.level instanceof ServerLevel
								&& _plr216.getAdvancements().getOrStartProgress(_plr216.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr221 && _plr221.level instanceof ServerLevel
								&& _plr221.getAdvancements().getOrStartProgress(_plr221.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr226 && _plr226.level instanceof ServerLevel
								&& _plr226.getAdvancements().getOrStartProgress(_plr226.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr231 && _plr231.level instanceof ServerLevel
								&& _plr231.getAdvancements().getOrStartProgress(_plr231.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr236 && _plr236.level instanceof ServerLevel
								&& _plr236.getAdvancements().getOrStartProgress(_plr236.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_enraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_ENRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/outraged_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr243 && _plr243.level instanceof ServerLevel
								&& _plr243.getAdvancements().getOrStartProgress(_plr243.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr248 && _plr248.level instanceof ServerLevel
								&& _plr248.getAdvancements().getOrStartProgress(_plr248.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr253 && _plr253.level instanceof ServerLevel
								&& _plr253.getAdvancements().getOrStartProgress(_plr253.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr258 && _plr258.level instanceof ServerLevel
								&& _plr258.getAdvancements().getOrStartProgress(_plr258.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr263 && _plr263.level instanceof ServerLevel
								&& _plr263.getAdvancements().getOrStartProgress(_plr263.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr268 && _plr268.level instanceof ServerLevel
								&& _plr268.getAdvancements().getOrStartProgress(_plr268.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr273 && _plr273.level instanceof ServerLevel
								&& _plr273.getAdvancements().getOrStartProgress(_plr273.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr278 && _plr278.level instanceof ServerLevel
								&& _plr278.getAdvancements().getOrStartProgress(_plr278.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr283 && _plr283.level instanceof ServerLevel
								&& _plr283.getAdvancements().getOrStartProgress(_plr283.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr288 && _plr288.level instanceof ServerLevel
								&& _plr288.getAdvancements().getOrStartProgress(_plr288.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).OutragedEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr293 && _plr293.level instanceof ServerLevel
								&& _plr293.getAdvancements().getOrStartProgress(_plr293.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr298 && _plr298.level instanceof ServerLevel
								&& _plr298.getAdvancements().getOrStartProgress(_plr298.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr303 && _plr303.level instanceof ServerLevel
								&& _plr303.getAdvancements().getOrStartProgress(_plr303.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr308 && _plr308.level instanceof ServerLevel
								&& _plr308.getAdvancements().getOrStartProgress(_plr308.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr313 && _plr313.level instanceof ServerLevel
								&& _plr313.getAdvancements().getOrStartProgress(_plr313.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_outraged_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_OUTRAGED_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/biblicallyhostile")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr320 && _plr320.level instanceof ServerLevel
								&& _plr320.getAdvancements().getOrStartProgress(_plr320.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr325 && _plr325.level instanceof ServerLevel
								&& _plr325.getAdvancements().getOrStartProgress(_plr325.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr330 && _plr330.level instanceof ServerLevel
								&& _plr330.getAdvancements().getOrStartProgress(_plr330.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr335 && _plr335.level instanceof ServerLevel
								&& _plr335.getAdvancements().getOrStartProgress(_plr335.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr340 && _plr340.level instanceof ServerLevel
								&& _plr340.getAdvancements().getOrStartProgress(_plr340.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr345 && _plr345.level instanceof ServerLevel
								&& _plr345.getAdvancements().getOrStartProgress(_plr345.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr350 && _plr350.level instanceof ServerLevel
								&& _plr350.getAdvancements().getOrStartProgress(_plr350.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr355 && _plr355.level instanceof ServerLevel
								&& _plr355.getAdvancements().getOrStartProgress(_plr355.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr360 && _plr360.level instanceof ServerLevel
								&& _plr360.getAdvancements().getOrStartProgress(_plr360.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr365 && _plr365.level instanceof ServerLevel
								&& _plr365.getAdvancements().getOrStartProgress(_plr365.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileBiblicallyKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr370 && _plr370.level instanceof ServerLevel
								&& _plr370.getAdvancements().getOrStartProgress(_plr370.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr375 && _plr375.level instanceof ServerLevel
								&& _plr375.getAdvancements().getOrStartProgress(_plr375.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr380 && _plr380.level instanceof ServerLevel
								&& _plr380.getAdvancements().getOrStartProgress(_plr380.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr385 && _plr385.level instanceof ServerLevel
								&& _plr385.getAdvancements().getOrStartProgress(_plr385.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr390 && _plr390.level instanceof ServerLevel
								&& _plr390.getAdvancements().getOrStartProgress(_plr390.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_biblically_accurate_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_BIBLICALLY_ACCURATE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/monstrosity_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr397 && _plr397.level instanceof ServerLevel
								&& _plr397.getAdvancements().getOrStartProgress(_plr397.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr402 && _plr402.level instanceof ServerLevel
								&& _plr402.getAdvancements().getOrStartProgress(_plr402.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr407 && _plr407.level instanceof ServerLevel
								&& _plr407.getAdvancements().getOrStartProgress(_plr407.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr412 && _plr412.level instanceof ServerLevel
								&& _plr412.getAdvancements().getOrStartProgress(_plr412.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr417 && _plr417.level instanceof ServerLevel
								&& _plr417.getAdvancements().getOrStartProgress(_plr417.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr422 && _plr422.level instanceof ServerLevel
								&& _plr422.getAdvancements().getOrStartProgress(_plr422.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr427 && _plr427.level instanceof ServerLevel
								&& _plr427.getAdvancements().getOrStartProgress(_plr427.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr432 && _plr432.level instanceof ServerLevel
								&& _plr432.getAdvancements().getOrStartProgress(_plr432.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr437 && _plr437.level instanceof ServerLevel
								&& _plr437.getAdvancements().getOrStartProgress(_plr437.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr442 && _plr442.level instanceof ServerLevel
								&& _plr442.getAdvancements().getOrStartProgress(_plr442.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).MonstrosityEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr447 && _plr447.level instanceof ServerLevel
								&& _plr447.getAdvancements().getOrStartProgress(_plr447.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr452 && _plr452.level instanceof ServerLevel
								&& _plr452.getAdvancements().getOrStartProgress(_plr452.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr457 && _plr457.level instanceof ServerLevel
								&& _plr457.getAdvancements().getOrStartProgress(_plr457.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLD_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr462 && _plr462.level instanceof ServerLevel
								&& _plr462.getAdvancements().getOrStartProgress(_plr462.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr467 && _plr467.level instanceof ServerLevel
								&& _plr467.getAdvancements().getOrStartProgress(_plr467.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_monstrosity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_MONSTROSITY_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("engies_chaos:mobs/hostile_engie")))) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr474 && _plr474.level instanceof ServerLevel
								&& _plr474.getAdvancements().getOrStartProgress(_plr474.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr479 && _plr479.level instanceof ServerLevel
								&& _plr479.getAdvancements().getOrStartProgress(_plr479.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr484 && _plr484.level instanceof ServerLevel
								&& _plr484.getAdvancements().getOrStartProgress(_plr484.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr489 && _plr489.level instanceof ServerLevel
								&& _plr489.getAdvancements().getOrStartProgress(_plr489.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr494 && _plr494.level instanceof ServerLevel
								&& _plr494.getAdvancements().getOrStartProgress(_plr494.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr499 && _plr499.level instanceof ServerLevel
								&& _plr499.getAdvancements().getOrStartProgress(_plr499.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr504 && _plr504.level instanceof ServerLevel
								&& _plr504.getAdvancements().getOrStartProgress(_plr504.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr509 && _plr509.level instanceof ServerLevel
								&& _plr509.getAdvancements().getOrStartProgress(_plr509.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr514 && _plr514.level instanceof ServerLevel
								&& _plr514.getAdvancements().getOrStartProgress(_plr514.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr519 && _plr519.level instanceof ServerLevel
								&& _plr519.getAdvancements().getOrStartProgress(_plr519.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).HostileEngieKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr524 && _plr524.level instanceof ServerLevel
								&& _plr524.getAdvancements().getOrStartProgress(_plr524.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr529 && _plr529.level instanceof ServerLevel
								&& _plr529.getAdvancements().getOrStartProgress(_plr529.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr534 && _plr534.level instanceof ServerLevel
								&& _plr534.getAdvancements().getOrStartProgress(_plr534.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr539 && _plr539.level instanceof ServerLevel
								&& _plr539.getAdvancements().getOrStartProgress(_plr539.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr544 && _plr544.level instanceof ServerLevel
								&& _plr544.getAdvancements().getOrStartProgress(_plr544.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_hostile_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_HOSTILE_ENGIE_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof InsanityEntity) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr551 && _plr551.level instanceof ServerLevel
								&& _plr551.getAdvancements().getOrStartProgress(_plr551.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr556 && _plr556.level instanceof ServerLevel
								&& _plr556.getAdvancements().getOrStartProgress(_plr556.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr561 && _plr561.level instanceof ServerLevel
								&& _plr561.getAdvancements().getOrStartProgress(_plr561.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr566 && _plr566.level instanceof ServerLevel
								&& _plr566.getAdvancements().getOrStartProgress(_plr566.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr571 && _plr571.level instanceof ServerLevel
								&& _plr571.getAdvancements().getOrStartProgress(_plr571.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr576 && _plr576.level instanceof ServerLevel
								&& _plr576.getAdvancements().getOrStartProgress(_plr576.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr581 && _plr581.level instanceof ServerLevel
								&& _plr581.getAdvancements().getOrStartProgress(_plr581.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr586 && _plr586.level instanceof ServerLevel
								&& _plr586.getAdvancements().getOrStartProgress(_plr586.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr591 && _plr591.level instanceof ServerLevel
								&& _plr591.getAdvancements().getOrStartProgress(_plr591.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr596 && _plr596.level instanceof ServerLevel
								&& _plr596.getAdvancements().getOrStartProgress(_plr596.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr601 && _plr601.level instanceof ServerLevel
								&& _plr601.getAdvancements().getOrStartProgress(_plr601.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr606 && _plr606.level instanceof ServerLevel
								&& _plr606.getAdvancements().getOrStartProgress(_plr606.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr611 && _plr611.level instanceof ServerLevel
								&& _plr611.getAdvancements().getOrStartProgress(_plr611.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr616 && _plr616.level instanceof ServerLevel
								&& _plr616.getAdvancements().getOrStartProgress(_plr616.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr621 && _plr621.level instanceof ServerLevel
								&& _plr621.getAdvancements().getOrStartProgress(_plr621.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			} else if (entity instanceof PureInsanityEntity) {
				EngiesChaosMod.queueServerWork(1, () -> {
					if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 50
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 100) {
						if (!(sourceentity instanceof ServerPlayer _plr628 && _plr628.level instanceof ServerLevel
								&& _plr628.getAdvancements().getOrStartProgress(_plr628.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 100
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 150) {
						if (!(sourceentity instanceof ServerPlayer _plr633 && _plr633.level instanceof ServerLevel
								&& _plr633.getAdvancements().getOrStartProgress(_plr633.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr638 && _plr638.level instanceof ServerLevel
								&& _plr638.getAdvancements().getOrStartProgress(_plr638.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 150
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 200) {
						if (!(sourceentity instanceof ServerPlayer _plr643 && _plr643.level instanceof ServerLevel
								&& _plr643.getAdvancements().getOrStartProgress(_plr643.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr648 && _plr648.level instanceof ServerLevel
								&& _plr648.getAdvancements().getOrStartProgress(_plr648.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr653 && _plr653.level instanceof ServerLevel
								&& _plr653.getAdvancements().getOrStartProgress(_plr653.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 200
							&& (sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount < 250) {
						if (!(sourceentity instanceof ServerPlayer _plr658 && _plr658.level instanceof ServerLevel
								&& _plr658.getAdvancements().getOrStartProgress(_plr658.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr663 && _plr663.level instanceof ServerLevel
								&& _plr663.getAdvancements().getOrStartProgress(_plr663.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr668 && _plr668.level instanceof ServerLevel
								&& _plr668.getAdvancements().getOrStartProgress(_plr668.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr673 && _plr673.level instanceof ServerLevel
								&& _plr673.getAdvancements().getOrStartProgress(_plr673.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((sourceentity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).InsanityKillCount >= 250) {
						if (!(sourceentity instanceof ServerPlayer _plr678 && _plr678.level instanceof ServerLevel
								&& _plr678.getAdvancements().getOrStartProgress(_plr678.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr683 && _plr683.level instanceof ServerLevel
								&& _plr683.getAdvancements().getOrStartProgress(_plr683.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:iron_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.IRON_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr688 && _plr688.level instanceof ServerLevel
								&& _plr688.getAdvancements().getOrStartProgress(_plr688.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gold_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.GOLDEN_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr693 && _plr693.level instanceof ServerLevel
								&& _plr693.getAdvancements().getOrStartProgress(_plr693.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:diamond_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DIAMOND_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr698 && _plr698.level instanceof ServerLevel
								&& _plr698.getAdvancements().getOrStartProgress(_plr698.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:netherite_insanity_engie_plush_obtained"))).isDone())) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.NETHERITE_INSANITY_PLUSH.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			}
			if (EngiesChaosModVariables.MapVariables.get(world).antimatterdropcheck == true) {
				if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
						100)) <= (sourceentity instanceof LivingEntity _livingEntity705 && _livingEntity705.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get())
								? _livingEntity705.getAttribute(EngiesChaosModAttributes.ENGIES_ANTIMATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
								: 0)) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.ANTIMATTER_FRAGMENT.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (entity instanceof ServerPlayer _plr715 && _plr715.level instanceof ServerLevel
					&& _plr715.getAdvancements().getOrStartProgress(_plr715.server.getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:all_fully_done"))).isDone()) {
				if (Math.round(Mth.nextDouble(RandomSource.create(), 0,
						100)) <= (sourceentity instanceof LivingEntity _livingEntity717 && _livingEntity717.getAttributes().hasAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get())
								? _livingEntity717.getAttribute(EngiesChaosModAttributes.ENGIES_DARK_MATTER_BLESSING_CHANCE_FOR_PLAYER.get()).getBaseValue()
								: 0)) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 5) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARKMATTER.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.DARKMATTER_FRAGMENT.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (EngiesChaosModVariables.MapVariables.get(world).unlockedtruechaos == false) {
				if (Mth.nextInt(RandomSource.create(), 0, 2500) <= 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(EngiesChaosModItems.TRUE_CHAOS_MATTER_FRAGMENT.get()));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
					TrueChaosMatterFragmentSpawnProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
				}
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 100) == 1) {
			if (Mth.nextInt(RandomSource.create(), 1, 9) == 1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ITEMS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 2) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.MOBS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 3) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.EXTRAS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.SHARKOS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.DIMENSIONS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 6) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENRAGED_ZOMBIES_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 7) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ALL_ABOUT_ENGIE_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 8) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENGIES_CHAOS_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 9) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(EngiesChaosModItems.ENGIE_PLAQUE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}