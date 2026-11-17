package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class BiblicallyDeathSharkoSwordItem extends SwordItem {
	public BiblicallyDeathSharkoSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5015;
			}

			public float getSpeed() {
				return 60f;
			}

			public float getAttackDamageBonus() {
				return 4716f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 75;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.BIBLICALLY_DEATH_SHARKO_CLOTH.get()));
			}
		}, 3, -3.9f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}