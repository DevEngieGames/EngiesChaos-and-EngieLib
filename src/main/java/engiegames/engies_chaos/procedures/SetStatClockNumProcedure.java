package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.component.DataComponents;

import engiegames.engies_chaos.init.EngiesChaosModMenus;

public class SetStatClockNumProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY)
				.is(ItemTags.create(ResourceLocation.parse("allaboutengie:roughtools")))) {
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "statclocknum", "") : "");
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu3 ? _menu3.getSlots().get(0).getItem() : ItemStack.EMPTY),
						tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(1).getItem() : ItemStack.EMPTY)
				.is(ItemTags.create(ResourceLocation.parse("allaboutengie:goldtools")))) {
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity7 && _entity7.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu7) ? _menu7.getMenuState(0, "statclocknum", "") : "");
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(1).getItem() : ItemStack.EMPTY),
						tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.is(ItemTags.create(ResourceLocation.parse("allaboutengie:engietools")))) {
			{
				final String _tagName = "engiegameshallowscythestatclockcount";
				final double _tagValue = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity12 && _entity12.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(0, "statclocknum", "") : "");
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu13 ? _menu13.getSlots().get(2).getItem() : ItemStack.EMPTY),
						tag -> tag.putDouble(_tagName, _tagValue));
			}
		}
	}
}