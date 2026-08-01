package engiegames.engieschaos.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class CustomRecipeBookToolsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 53) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 54) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 55) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 56) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 57) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 58) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 59) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 60) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 61) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 62) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 63) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 64) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 65) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 66) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 67) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 68) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 69) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 70) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 71) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 72) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 73) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 74) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 75) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 76) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 77) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 78) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SWORD.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 79) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_PICKAXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 80) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_AXE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 81) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_SHOVEL.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 82) {
			if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == false) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_HOE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).recipebookantimattercraftstoggle == true) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_HOE.get()).copy();
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
}