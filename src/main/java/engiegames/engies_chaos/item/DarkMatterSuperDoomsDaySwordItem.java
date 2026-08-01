package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class DarkMatterSuperDoomsDaySwordItem extends SwordItem {
	public DarkMatterSuperDoomsDaySwordItem() {
		super(new Tier() {
			public int getUses() {
				return 47000;
			}

			public float getSpeed() {
				return 132f;
			}

			public float getAttackDamageBonus() {
				return 1896f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_COIN.get()));
			}
		}, 3, 14.2f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}