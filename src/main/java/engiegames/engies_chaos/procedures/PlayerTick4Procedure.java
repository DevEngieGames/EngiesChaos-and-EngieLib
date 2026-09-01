package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModEnchantments;

@Mod.EventBusSubscriber
public class PlayerTick4Procedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("engies_chaos:crucifixes")))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
							{
								double _setval = 20 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixMainHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
							{
								double _setval = 26.7 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixMainHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
							{
								double _setval = 30 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixMainHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					} else {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
							{
								double _setval = 20 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixMainHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
							{
								double _setval = 26.7 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixMainHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
							{
								double _setval = 30 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixMainHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
						{
							double _setval = 20 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
						{
							double _setval = 26.7 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
						{
							double _setval = 30 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
						{
							double _setval = 20;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
						{
							double _setval = 26.7;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
						{
							double _setval = 30;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else {
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						{
							double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
									+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
						{
							double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							double _setval = 0;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixMainHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("engies_chaos:crucifixes")))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
							{
								double _setval = 20 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixOffHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
							{
								double _setval = 26.7 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixOffHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
							{
								double _setval = 30 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
										+ (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixOffHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					} else {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
							{
								double _setval = 20 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixOffHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
							{
								double _setval = 26.7 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixOffHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
							{
								double _setval = 30 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
								entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrucifixOffHandDurabilityPercentage = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
						{
							double _setval = 20 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
						{
							double _setval = 26.7 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
						{
							double _setval = 30 + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
						{
							double _setval = 20;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
						{
							double _setval = 26.7;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
						{
							double _setval = 30;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else {
				if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
						{
							double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get())
									+ (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_TRUE_BLESSING.get()) / 2d;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if (EnchantmentHelper.getItemEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
						{
							double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getEnchantmentLevel(EngiesChaosModEnchantments.ENGIES_BLESSING.get());
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							double _setval = 0;
							entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CrucifixOffHandDurabilityPercentage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}