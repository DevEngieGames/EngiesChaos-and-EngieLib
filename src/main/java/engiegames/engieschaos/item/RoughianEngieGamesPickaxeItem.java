package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class RoughianEngieGamesPickaxeItem extends PickaxeItem {
	public RoughianEngieGamesPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 125f;
			}

			public float getAttackDamageBonus() {
				return 1498f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()));
			}
		}, 1, 11f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}