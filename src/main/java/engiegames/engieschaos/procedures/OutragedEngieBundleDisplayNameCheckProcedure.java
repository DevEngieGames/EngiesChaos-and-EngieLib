package engiegames.engieschaos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.init.EngiesChaosModItems;

public class OutragedEngieBundleDisplayNameCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.OUTRAGED_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == EngiesChaosModItems.OUTRAGED_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString();
		}
		return new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_BUNDLE.get()).getDisplayName().getString();
	}
}