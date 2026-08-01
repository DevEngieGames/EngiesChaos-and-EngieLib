package engiegames.engieschaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import engiegames.engieschaos.init.EngiesChaosModMenus;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class AngryEngieBundleNameChangeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ANGRY_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity2 && _entity2.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "ChangeBundleName", "") : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.ANGRY_ENGIE_BUNDLE.get()) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.setHoverName(Component.literal(((entity instanceof Player _entity7 && _entity7.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu7) ? _menu7.getMenuState(0, "ChangeBundleName", "") : "")));
		} else {
			new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_BUNDLE.get())
					.setHoverName(Component.literal(((entity instanceof Player _entity10 && _entity10.containerMenu instanceof EngiesChaosModMenus.MenuAccessor _menu10) ? _menu10.getMenuState(0, "ChangeBundleName", "") : "")));
		}
	}
}