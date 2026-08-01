package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class AntimatterEngiesSwordItem extends SwordItem {
	public AntimatterEngiesSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 20000;
			}

			public float getSpeed() {
				return 92f;
			}

			public float getAttackDamageBonus() {
				return 996f;
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
		}, 3, 5.4f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}