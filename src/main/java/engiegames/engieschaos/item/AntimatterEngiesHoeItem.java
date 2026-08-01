package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class AntimatterEngiesHoeItem extends HoeItem {
	public AntimatterEngiesHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 20000;
			}

			public float getSpeed() {
				return 92f;
			}

			public float getAttackDamageBonus() {
				return 974f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()));
			}
		}, 0, 5.4f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}