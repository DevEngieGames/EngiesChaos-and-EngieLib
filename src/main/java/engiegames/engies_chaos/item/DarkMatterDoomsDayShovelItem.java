package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class DarkMatterDoomsDayShovelItem extends ShovelItem {
	public DarkMatterDoomsDayShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 46000;
			}

			public float getSpeed() {
				return 128f;
			}

			public float getAttackDamageBonus() {
				return 1823f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.DARK_MATTER_DOOMS_DAY_COIN.get()));
			}
		}, 1, 13.8f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}