package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EngieSharkoSwordItem extends SwordItem {
	public EngieSharkoSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2950;
			}

			public float getSpeed() {
				return 32f;
			}

			public float getAttackDamageBonus() {
				return 2651f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 40;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_SHARKO_CLOTH.get()));
			}
		}, 3, -3.7f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}