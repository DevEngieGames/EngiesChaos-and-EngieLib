package engiegames.engieschaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engieschaos.init.EngiesChaosModMenus;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class ETCEngieBundleNameChangeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.DEVELOPER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.DEVELOPER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity7 && _entity7.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu7) ? _menu7.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.CONTRIBUTOR_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity12 && _entity12.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.CONTRIBUTOR_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity17 && _entity17.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu17) ? _menu17.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.TESTER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity22 && _entity22.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu22) ? _menu22.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.TESTER_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity27 && _entity27.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu27) ? _menu27.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity32 && _entity32.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu32) ? _menu32.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity37 && _entity37.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu37) ? _menu37.getMenuState(0, "ChangeBundleName", "") : "")));
		} else {
			new ItemStack(EngiesChaosModItems.DEVELOPER_ENGIE_BUNDLE.get())
					.setHoverName(Component.literal(((entity instanceof Player _entity40 && _entity40.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu40) ? _menu40.getMenuState(0, "ChangeBundleName", "") : "")));
			new ItemStack(EngiesChaosModItems.CONTRIBUTOR_ENGIE_BUNDLE.get())
					.setHoverName(Component.literal(((entity instanceof Player _entity42 && _entity42.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu42) ? _menu42.getMenuState(0, "ChangeBundleName", "") : "")));
			new ItemStack(EngiesChaosModItems.TESTER_ENGIE_BUNDLE.get())
					.setHoverName(Component.literal(((entity instanceof Player _entity44 && _entity44.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu44) ? _menu44.getMenuState(0, "ChangeBundleName", "") : "")));
			new ItemStack(EngiesChaosModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get())
					.setHoverName(Component.literal(((entity instanceof Player _entity46 && _entity46.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu46) ? _menu46.getMenuState(0, "ChangeBundleName", "") : "")));
		}
	}
}