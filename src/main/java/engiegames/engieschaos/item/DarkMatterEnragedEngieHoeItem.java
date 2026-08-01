package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class DarkMatterEnragedEngieHoeItem extends HoeItem {
	public DarkMatterEnragedEngieHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 42000;
			}

			public float getSpeed() {
				return 112f;
			}

			public float getAttackDamageBonus() {
				return 1624f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()));
			}
		}, 0, 12.2f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}