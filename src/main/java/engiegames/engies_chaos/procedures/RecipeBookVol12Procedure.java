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
import engiegames.engies_chaos.init.EngiesChaosModBlocks;

public class RecipeBookVol12Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 35) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") == 0) {
				{
					final String _tagName = "RecipeBookTimer";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") > 0) {
				{
					final String _tagName = "RecipeBookTimer";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") < 7) {
				{
					final String _tagName = "RecipeBookGroupID";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID") == 7) {
				{
					final String _tagName = "RecipeBookGroupID";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 36) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") == 0) {
				{
					final String _tagName = "RecipeBookTimer2";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") > 0) {
				{
					final String _tagName = "RecipeBookTimer2";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer2";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") < 7) {
				{
					final String _tagName = "RecipeBookGroupID2";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer2") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID2") == 7) {
				{
					final String _tagName = "RecipeBookGroupID2";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 37) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") == 0) {
				{
					final String _tagName = "RecipeBookTimer3";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") > 0) {
				{
					final String _tagName = "RecipeBookTimer3";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer3";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") < 7) {
				{
					final String _tagName = "RecipeBookGroupID3";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer3") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID3") == 7) {
				{
					final String _tagName = "RecipeBookGroupID3";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 38) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") == 0) {
				{
					final String _tagName = "RecipeBookTimer4";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") > 0) {
				{
					final String _tagName = "RecipeBookTimer4";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimer4";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") == 0 && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") < 7) {
				{
					final String _tagName = "RecipeBookGroupID4";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimer4") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupID4") == 7) {
				{
					final String _tagName = "RecipeBookGroupID4";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 39) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.BLUE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 40) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 41) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 42) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 43) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 44) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 45) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 46) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.NETHERITE_BLOCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		}
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 47) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.EGG).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WATER_BUCKET).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DOUGH.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 48) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.MILK_BUCKET).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHEESE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 49) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DOUGH_WITH_SAUCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHEESE.get()).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOOKED_PIZZA.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 50) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC") == 0) {
				{
					final String _tagName = "RecipeBookTimerETC";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC") > 0) {
				{
					final String _tagName = "RecipeBookTimerETC";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerETC";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_OAK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_SPRUCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_BIRCH.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_JUNGLE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_ACACIA.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_DARK_OAK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_CRIMSON.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 8) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_WARPED.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") < 8) {
				{
					final String _tagName = "RecipeBookGroupIDETC";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC") == 8) {
				{
					final String _tagName = "RecipeBookGroupIDETC";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 58) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC2") == 0) {
				{
					final String _tagName = "RecipeBookTimerETC2";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC2") > 0) {
				{
					final String _tagName = "RecipeBookTimerETC2";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC2") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerETC2";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 0) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MAD_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 1) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 2) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 3) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 4) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 5) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MONSTROSITY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 6) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 7) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.CYBER_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 9) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BLOOD_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.CYBERBLOOD_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTANIUM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC2") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") < 10) {
				{
					final String _tagName = "RecipeBookGroupIDETC2";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC2") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				{
					final String _tagName = "RecipeBookGroupIDETC2";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 59) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_BUNDLE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 60) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_BUNDLE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 61) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_BUNDLE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 62) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_BUNDLE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 63) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_BUNDLE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 64) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STRING).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_BUNDLE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 65) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CRUCIFIX.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 66) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC4") == 0) {
				{
					final String _tagName = "RecipeBookTimerETC4";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC4") > 0) {
				{
					final String _tagName = "RecipeBookTimerETC4";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC4") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerETC4";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MAD_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_MAD_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_ANGRY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_ENRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_OUTRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_BIBLICALLY_ACCURATE_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MONSTROSITY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_MONSTROSITY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC4") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") < 6) {
				{
					final String _tagName = "RecipeBookGroupIDETC4";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerETC4") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") >= 6) {
				{
					final String _tagName = "RecipeBookGroupIDETC4";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		}
	}
}