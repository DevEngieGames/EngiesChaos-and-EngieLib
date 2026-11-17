package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class AlienSharkoHoeItem extends HoeItem {
	public AlienSharkoHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3835;
			}

			public float getSpeed() {
				return 44f;
			}

			public float getAttackDamageBonus() {
				return 3539f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 55;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ALIEN_SHARKO_CLOTH.get()));
			}
		}, 0, -3.9f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}