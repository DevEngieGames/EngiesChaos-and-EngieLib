package engiegames.engies_chaos.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.init.EngiesChaosModBlocks;

public class RecipeBookVol5Portion12Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 35) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer", (itemstack.getOrCreateTag().getDouble("RecipeBookTimer") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 4;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 0) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 1) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 2) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_HELMET.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") < 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID") == 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID", 0);
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 36) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer2") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer2", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer2") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer2", (itemstack.getOrCreateTag().getDouble("RecipeBookTimer2") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer2", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				final int _sltid = 1;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 0) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 1) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 2) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_CHESTPLATE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer2") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") < 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID2", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer2") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID2") == 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID2", 0);
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 37) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer3") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer3", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer3") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer3", (itemstack.getOrCreateTag().getDouble("RecipeBookTimer3") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer3", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final int _sltid = 7;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 0) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 1) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 2) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_LEGGINGS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer3") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") < 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID3", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer3") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID3") == 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID3", 0);
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 38) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer4") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer4", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer4") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer4", (itemstack.getOrCreateTag().getDouble("RecipeBookTimer4") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimer4", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 0) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 1) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 2) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARK_BOOTS.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer4") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") < 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID4", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimer4") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupID4") == 7) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupID4", 0);
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 39) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(Items.BLUE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 40) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 41) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ALBINO_SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 42) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.RARE_SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 43) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EPIC_SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 44) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.LEGENDARY_SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 45) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MYTHIC_SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK).copy();
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
				final ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
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
				final ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 46) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.EXOTIC_SHARKO_CLOTH.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.NETHERITE_BLOCK).copy();
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
				final ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 47) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.EGG).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WATER_BUCKET).copy();
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
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.DOUGH.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 48) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.MILK_BUCKET).copy();
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
				final ItemStack _setstack = new ItemStack(Items.SUGAR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHEESE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 49) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.DOUGH_WITH_SAUCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CHEESE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNCOOKED_PIZZA.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 50) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC", (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
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
				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
				final int _sltid = 5;
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST.get()).copy();
					final int _sltid = 9;
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
					final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_OAK.get()).copy();
					final int _sltid = 9;
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
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_SPRUCE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_BIRCH.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_JUNGLE.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_ACACIA.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_DARK_OAK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.CRIMSON_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_CRIMSON.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 8) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_PLANKS).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.METAL_CHEST_WARPED.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") < 8) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC") == 8) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC", 0);
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 51) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC2", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC2", (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC2", 60);
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 0) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MAD_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 1) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 2) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 3) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 4) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 5) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MONSTROSITY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 6) {
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 7) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBER_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.CYBER_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 9) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BLOOD_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CYBERBLOOD_INGOT.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.CYBERBLOOD_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTAINIUM_CHUNKLET.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModItems.UNOBTANIUM.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") < 10) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC2", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC2") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC2") == 10) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC2", 0);
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 52) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MAD_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 53) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 54) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 55) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 56) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 57) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.STRING).copy();
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
				final ItemStack _setstack = new ItemStack(Items.RED_DYE).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_BUNDLE.get()).copy();
				final int _sltid = 9;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 58) {
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModItems.CRUCIFIX.get()).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
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
				final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANY_TYPE_OF_WOOD_HELP.get()).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
		} else if ((entity.getCapability(EngiesChaosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EngiesChaosModVariables.PlayerVariables())).pageNumber == 59) {
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC4") == 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC4", 60);
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC4") > 0) {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC4", (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC4") - 1));
			} else {
				itemstack.getOrCreateTag().putDouble("RecipeBookTimerETC4", 60);
			}
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
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
				final ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
				final int _sltid = 8;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
						itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
					}
				});
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 0) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MAD_ENGIE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_MAD_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 1) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ANGRY_ENGIE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_ANGRY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 2) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENRAGED_ENGIE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_ENRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 3) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.OUTRAGED_ENGIE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_OUTRAGED_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 4) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_BIBLICALLY_ACCURATE_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 5) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.MONSTROSITY_ENGIE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_MONSTROSITY_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") == 6) {
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.ENGIE_BLOCK.get()).copy();
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
					final ItemStack _setstack = new ItemStack(EngiesChaosModBlocks.BUDDING_ENGIE_BLOCK.get()).copy();
					final int _sltid = 9;
					_setstack.setCount(1);
					_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
							itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC4") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") < 6) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC4", (itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") + 1));
			} else if (itemstack.getOrCreateTag().getDouble("RecipeBookTimerETC4") == 0 && itemstack.getOrCreateTag().getDouble("RecipeBookGroupIDETC4") >= 6) {
				itemstack.getOrCreateTag().putDouble("RecipeBookGroupIDETC4", 0);
			}
		}
	}
}