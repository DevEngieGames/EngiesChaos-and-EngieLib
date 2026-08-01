package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.procedures.BigBanObtainProProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;

public class DarkMatterBigScytheItem extends SwordItem {
	public DarkMatterBigScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 74056;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 10296f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1.25f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_WEAPONS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BigBanObtainProProcedure.execute(world, entity, itemstack);
	}
}