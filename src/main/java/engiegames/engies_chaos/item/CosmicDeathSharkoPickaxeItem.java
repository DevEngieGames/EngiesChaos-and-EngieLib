package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class CosmicDeathSharkoPickaxeItem extends PickaxeItem {
	public CosmicDeathSharkoPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5310;
			}

			public float getSpeed() {
				return 68f;
			}

			public float getAttackDamageBonus() {
				return 5013f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 85;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.COSMIC_DEATH_SHARKO_CLOTH.get()));
			}
		}, 1, -3.9f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}