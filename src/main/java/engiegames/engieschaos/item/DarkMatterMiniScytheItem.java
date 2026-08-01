package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.procedures.MiniBanObtainProProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;

public class DarkMatterMiniScytheItem extends SwordItem {
	public DarkMatterMiniScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 73288;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 9546f;
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
		}, 3, -0.75f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_WEAPONS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MiniBanObtainProProcedure.execute(world, entity, itemstack);
	}
}