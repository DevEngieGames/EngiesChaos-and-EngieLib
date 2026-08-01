package engiegames.engies_chaos.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class CustomRecipeBookToolsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 35) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MAD_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 36) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 37) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 38) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 39) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 40) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 41) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") > 0) {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerTools";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == false) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).recipebookantimattercraftstoggle == true) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 0) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_HOSTILE_ENGIE_SWORD.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 1) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_HOSTILE_ENGIE_PICKAXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 2) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_HOSTILE_ENGIE_AXE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 3) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_HOSTILE_ENGIE_SHOVEL.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 4) {
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Items.STICK).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
					}
					if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
						ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_HOSTILE_ENGIE_HOE.get()).copy();
						_setstack.setCount(1);
						_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
					}
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerTools") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDTools") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDTools";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		}
	}
}