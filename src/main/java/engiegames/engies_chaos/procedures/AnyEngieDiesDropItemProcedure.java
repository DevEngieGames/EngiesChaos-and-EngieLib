package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEnchantments;

@Mod.EventBusSubscriber
public class AnyEngieDiesDropItemProcedure {
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
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT) == true) {
			if ((sourceentity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:sharkos")))) {
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.is(ItemTags.create(new ResourceLocation("allaboutengie:techno/pickaxes"))) && EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount == 0) {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
							((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
									((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
						if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player)
								_player.giveExperienceLevels(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
							for (int index0 = 0; index0 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index0++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						} else {
							for (int index1 = 0; index1 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index1++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
							((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
									((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index2 = 0; index2 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index2++) {
							if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
								if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player)
									_player.giveExperienceLevels(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
											.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
								for (int index3 = 0; index3 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index3++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							} else {
								for (int index4 = 0; index4 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index4++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							}
						}
					} else if (!(EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
							((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
									((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index5 = 0; index5 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index5++) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
								AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
							}
						}
					}
				} else {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
							((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
									((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
						if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player)
								_player.giveExperienceLevels(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
							for (int index6 = 0; index6 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index6++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						} else {
							for (int index7 = 0; index7 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index7++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
							((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
									((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index8 = 0; index8 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.MOB_LOOTING); index8++) {
							if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
								if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player)
									_player.giveExperienceLevels(((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
											.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
								for (int index9 = 0; index9 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index9++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							} else {
								for (int index10 = 0; index10 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index10++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							}
						}
					} else if (!(EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(),
							((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
									((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index11 = 0; index11 < ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.MOB_LOOTING); index11++) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
								AnyEngieDiesDropItemAltProcedure.execute(world, x, y, z, entity, sourceentity);
							}
						}
					}
				}
			} else if (sourceentity instanceof Player) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("allaboutengie:techno/pickaxes")))
						&& EngiesChaosModVariables.MapVariables.get(world).playerkilledmobswithoutpickaxeonlycount == 0) {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if (sourceentity instanceof Player _player)
								_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
							for (int index12 = 0; index12 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index12++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						} else {
							for (int index13 = 0; index13 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index13++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index14 = 0; index14 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index14++) {
							if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
								if (sourceentity instanceof Player _player)
									_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
								for (int index15 = 0; index15 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index15++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							} else {
								for (int index16 = 0; index16 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index16++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							}
						}
					} else if (!(EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index17 = 0; index17 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE); index17++) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
								AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
							}
						}
					}
				} else {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& !(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
							if (sourceentity instanceof Player _player)
								_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
							for (int index18 = 0; index18 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index18++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						} else {
							for (int index19 = 0; index19 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index19++) {
								if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
									AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
								}
							}
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index20 = 0; index20 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index20++) {
							if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) > 15) {
								if (sourceentity instanceof Player _player)
									_player.giveExperienceLevels((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()) - 15);
								for (int index21 = 0; index21 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index21++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							} else {
								for (int index22 = 0; index22 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get()); index22++) {
									if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
										AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
									}
								}
							}
						}
					} else if (!(EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
							&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						for (int index23 = 0; index23 < (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.MOB_LOOTING); index23++) {
							if (Math.round(Mth.nextDouble(RandomSource.create(), 0, 100)) <= 25) {
								AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
							}
						}
					}
				}
			} else if (sourceentity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("allaboutengie:mobs/biblically")))) {
				for (int index24 = 0; index24 < (int) Mth.nextDouble(RandomSource.create(), 1, 5); index24++) {
					AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
				}
			} else {
				AnyEngieDiesDropItemAlt2Procedure.execute(world, x, y, z, entity, sourceentity);
			}
		}
	}
}