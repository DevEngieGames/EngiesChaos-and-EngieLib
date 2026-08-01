package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class DarkMatterMonstrosityEngieSwordItem extends SwordItem {
	public DarkMatterMonstrosityEngieSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 45000;
			}

			public float getSpeed() {
				return 124f;
			}

			public float getAttackDamageBonus() {
				return 1796f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
			}
		}, 3, 13.4f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}