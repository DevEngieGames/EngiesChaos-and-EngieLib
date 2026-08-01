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

public class RecipeBookVol5Portion1Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 1) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINI_BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 2) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
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
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINI_SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 3) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINI_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 4) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MINI_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 5) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIG_BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 6) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIG_SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 7) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MAD_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIG_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.LARGE_BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 8) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MAD_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIG_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.LARGE_SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 9) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.LARGE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.HUGE_BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 10) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.LARGE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.HUGE_SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 11) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.HUGE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENORMOUS_BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 12) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.HUGE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENORMOUS_SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 13) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENORMOUS_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.GIGANTIC_BAN_HAMMER.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 14) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENORMOUS_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.GIGANTIC_SCYTHE.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 15) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.GIGANTIC_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MASSIVE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 16) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.GIGANTIC_SCYTHE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MASSIVE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 17) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MASSIVE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 18) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MASSIVE_SCYTHE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 19) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(1, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(2, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(3, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_BAN_HAMMER.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 20) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_SCYTHE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 21) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(5, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_KATANA.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 22) {
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_KATANA.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 23) {
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
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_BATTLE_AXE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 24) {
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
				ItemStack _setstack = new ItemStack(Items.STICK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
			}
			if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
				ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_BATTLE_AXE.get()).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
			}
		}
		if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 25) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 26) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 27) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 28) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 29) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 30) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 31) {
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIES_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIES_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIES_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.HOSTILE_ENGIES_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 32) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 33) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_BOOTS.get()).copy();
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
		} else if (entity.getData(EngiesChaosModVariables.PLAYER_VARIABLES).pageNumber == 34) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_HELMET.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 1) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_CHESTPLATE.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 2) {
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(7, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(8, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_LEGGINGS.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(9, _setstack);
				}
			} else if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("RecipeBookGroupIDArmor") == 3) {
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_modHandlerItemSetSlot.setStackInSlot(4, _setstack);
				}
				if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_BOOTS.get()).copy();
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
	}
}