package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.procedures.HostileEngieToolObtainProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class HostileEngieShovelItem extends ShovelItem {
	public HostileEngieShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 3750;
			}

			public float getSpeed() {
				return 31.5f;
			}

			public float getAttackDamageBonus() {
				return 173f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()));
			}
		}, 1, -0.8f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HostileEngieToolObtainProcedure.execute(entity, itemstack);
	}
}