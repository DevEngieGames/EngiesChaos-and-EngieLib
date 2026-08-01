package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class DarkMatterBiblicallyAccurateEngieHoeItem extends HoeItem {
	public DarkMatterBiblicallyAccurateEngieHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 44000;
			}

			public float getSpeed() {
				return 120f;
			}

			public float getAttackDamageBonus() {
				return 1724f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
			}
		}, 0, 13f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}