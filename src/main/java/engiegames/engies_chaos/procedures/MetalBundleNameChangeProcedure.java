package engiegames.engies_chaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engies_chaos.init.EngiesChaosModMenus;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class MetalBundleNameChangeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_BUNDLE.get()) {
			if (!((((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "ChangeBundleName", "") : "").replace(" ", "")).equals("")
					|| (((entity instanceof Player _entity3 && _entity3.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu3) ? _menu3.getMenuState(0, "ChangeBundleName", "") : "").replace(" ", "")).equals("\u00A0"))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.setHoverName(Component.literal(((entity instanceof Player _entity4 && _entity4.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu4) ? _menu4.getMenuState(0, "ChangeBundleName", "") : "")));
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ENGIE_BUNDLE.get()) {
			if (!((((entity instanceof Player _entity9 && _entity9.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu9) ? _menu9.getMenuState(0, "ChangeBundleName", "") : "").replace(" ", "")).equals("")
					|| (((entity instanceof Player _entity10 && _entity10.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "ChangeBundleName", "") : "").replace(" ", "")).equals("\u00A0"))) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.setHoverName(Component.literal(((entity instanceof Player _entity11 && _entity11.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu11) ? _menu11.getMenuState(0, "ChangeBundleName", "") : "")));
			}
		} else {
			new ItemStack(EngiesChaosModItems.ENGIE_BUNDLE.get()).setHoverName(Component.literal("Engie Bundle"));
		}
	}
}