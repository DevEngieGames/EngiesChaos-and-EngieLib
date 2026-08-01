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

public class RecipeBookVol5Portion3Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 91) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MINI_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 92) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MINI_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 93) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MINI_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 94) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MINI_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 95) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIG_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 96) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIG_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 97) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_MAD_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIG_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_LARGE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 98) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_MAD_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIG_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_LARGE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 99) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_LARGE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HUGE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 100) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_LARGE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HUGE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 101) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HUGE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENORMOUS_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 102) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HUGE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENORMOUS_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 103) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENORMOUS_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_GIGANTIC_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 104) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENORMOUS_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_GIGANTIC_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
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
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 105) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_GIGANTIC_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MASSIVE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 106) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_GIGANTIC_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MASSIVE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 107) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MASSIVE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURAT_ENGIE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 108) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MASSIVE_SCYTHE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 109) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURAT_ENGIE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 110) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		}
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 111) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 112) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 113) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 114) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 115) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 116) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 117) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") > 0) {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else {
				{
					final String _tagName = "RecipeBookTimerArmor";
					final double _tagValue = 60;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 0) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HOSTILE_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HOSTILE_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HOSTILE_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_HOSTILE_ENGIES_BOOTS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			}
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") < 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") + 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookTimerArmor") == 0
					&& itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 4) {
				{
					final String _tagName = "RecipeBookGroupIDArmor";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			}
		}
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 118) {
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_OAK.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_SPRUCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_BIRCH.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_JUNGLE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_ACACIA.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_DARK_OAK.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_CRIMSON.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_METAL_CHEST_WARPED.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 119) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_MAD_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_MONSTROSITY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC2") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(6, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENGIE_BLOCK.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 120) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_MAD_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_MAD_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_ANGRY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 2) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_ENRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_OUTRAGED_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 4) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 5) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_MONSTROSITY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_MONSTROSITY_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDETC4") == 6) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.DARK_MATTER_ENGIE_BLOCK.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_DARK_MATTER_ENGIE_BLOCK.get()).copy();
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