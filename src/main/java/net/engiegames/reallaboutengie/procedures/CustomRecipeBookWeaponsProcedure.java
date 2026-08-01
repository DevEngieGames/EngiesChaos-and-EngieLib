package net.engiegames.reallaboutengie.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.engiegames.reallaboutengie.network.AllaboutengieModVariables;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;
import net.engiegames.reallaboutengie.init.AllaboutengieModBlocks;

public class CustomRecipeBookWeaponsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 1) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MINI_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 0) {
					{
						ItemStack _isc = itemstack;
						final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIES_BAN_HAMMER.get()).copy();
						final int _sltid = 4;
						_setstack.setCount(1);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
								itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 1) {
					{
						ItemStack _isc = itemstack;
						final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIES_BAN_HAMMER.get()).copy();
						final int _sltid = 4;
						_setstack.setCount(1);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
								itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 2) {
					{
						ItemStack _isc = itemstack;
						final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIEGAMES_SWORD.get()).copy();
						final int _sltid = 4;
						_setstack.setCount(1);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
								itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerAntimatterSwapMiniMidWep") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupAntimatterSwapMidWep") < 8) {
					itemstack.getOrCreateTag().putDouble("RecipeBookGroupAntimatterSwapMidWep", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupAntimatterSwapMidWep") + 1));
				} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerAntimatterSwapMiniMidWep") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupAntimatterSwapMidWep") == 8) {
					itemstack.getOrCreateTag().putDouble("RecipeBookGroupAntimatterSwapMidWep", 0);
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 2) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINI_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MINI_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 0) {
					{
						ItemStack _isc = itemstack;
						final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_SCYTHE.get()).copy();
						final int _sltid = 4;
						_setstack.setCount(1);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
								itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 1) {
					{
						ItemStack _isc = itemstack;
						final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINDSCAPE_ENGIE_SCYTHE.get()).copy();
						final int _sltid = 4;
						_setstack.setCount(1);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
								itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 2) {
					{
						ItemStack _isc = itemstack;
						final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIEGAMES_SWORD.get()).copy();
						final int _sltid = 4;
						_setstack.setCount(1);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
								itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerAntimatterSwapMiniMidWep") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupAntimatterSwapMidWep") < 8) {
					itemstack.getOrCreateTag().putDouble("RecipeBookGroupAntimatterSwapMidWep", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupAntimatterSwapMidWep") + 1));
				} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerAntimatterSwapMiniMidWep") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupAntimatterSwapMidWep") == 8) {
					itemstack.getOrCreateTag().putDouble("RecipeBookGroupAntimatterSwapMidWep", 0);
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 3) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MINI_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 4) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINI_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MINI_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 5) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIG_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 6) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIG_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIG_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 7) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIG_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_LARGE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 8) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIG_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.LARGE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIG_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Items.STICK).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_LARGE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 9) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_LARGE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_HUGE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 10) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.LARGE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.HUGE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_LARGE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_HUGE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 11) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_HUGE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENORMOUS_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 12) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.HUGE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENORMOUS_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_HUGE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENORMOUS_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 13) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENORMOUS_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_GIGANTIC_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 14) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENORMOUS_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.GIGANTIC_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_ENORMOUS_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_GIGANTIC_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 15) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_GIGANTIC_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MASSIVE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 16) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.GIGANTIC_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MASSIVE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_GIGANTIC_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MASSIVE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 17) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MASSIVE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 18) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MASSIVE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MASSIVE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 19) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_BAN_HAMMER.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 20) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 0;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 1;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 2;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					final int _sltid = 3;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
					final int _sltid = 4;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 5;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 6;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
					final int _sltid = 7;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					final int _sltid = 8;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_SCYTHE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 21) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_INGOT.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STICK).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBER_KATANA.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 22) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STICK).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_KATANA.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 23) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STICK).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STICK).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.BLOOD_BATTLE_AXE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).pageNumber == 24) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 0;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 3;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STICK).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_INGOT.get()).copy();
				final int _sltid = 5;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 6;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STICK).copy();
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(AllaboutengieModItems.CYBERBLOOD_BATTLE_AXE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
	}
}