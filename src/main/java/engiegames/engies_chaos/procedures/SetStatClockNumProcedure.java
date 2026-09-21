package engiegames.engies_chaos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class SetStatClockNumProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_HALLOW_SCYTHE
				.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.ENGIE_GAMES_HALLOW_BAN_HAMMER.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_GAMES_ANCHOR
						.get()) {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(0).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("regularhallowskillcount",
					new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity instanceof Player _entity6 && _entity6.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu6) ? _menu6.getMenuState(0, "statclocknum", "") : ""));
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(0).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_HALLOW_SCYTHE.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_HALLOW_BAN_HAMMER.get()) {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(0).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("darkregularhallowskillcount",
					new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity instanceof Player _entity13 && _entity13.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu13) ? _menu13.getMenuState(0, "statclocknum", "") : ""));
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(1).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_HALLOW_BAN_HAMMER.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.ENGIE_GAMES_GOLDEN_ANCHOR.get()) {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(1).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("goldhallowskillcount",
					new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity instanceof Player _entity22 && _entity22.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu22) ? _menu22.getMenuState(0, "statclocknum", "") : ""));
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu25 ? _menu25.getSlots().get(1).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_GOLDEN_HALLOW_SCYTHE.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_GOLDEN_HALLOW_BAN_HAMMER.get()) {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(1).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("darkgoldhallowskillcount",
					new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity instanceof Player _entity29 && _entity29.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu29) ? _menu29.getMenuState(0, "statclocknum", "") : ""));
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(2).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_HALLOW_BAN_HAMMER.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(2).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.ENGIE_GAMES_ENGIE_ANCHOR.get()) {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu39 ? _menu39.getSlots().get(2).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("collectorshallowskillcount",
					new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity instanceof Player _entity38 && _entity38.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu38) ? _menu38.getMenuState(0, "statclocknum", "") : ""));
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu41 ? _menu41.getSlots().get(2).getItem() : ItemStack.EMPTY)
				.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_ENGIE_HALLOW_SCYTHE.get()
				|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu43 ? _menu43.getSlots().get(2).getItem() : ItemStack.EMPTY)
						.getItem() == EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_ENGIE_HALLOW_BAN_HAMMER.get()) {
			(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(2).getItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("darkcollectorshallowskillcount",
					new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity instanceof Player _entity45 && _entity45.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu45) ? _menu45.getMenuState(0, "statclocknum", "") : ""));
		}
	}
}