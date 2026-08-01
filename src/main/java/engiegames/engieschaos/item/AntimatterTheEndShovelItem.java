package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class AntimatterTheEndShovelItem extends ShovelItem {
	public AntimatterTheEndShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 19000;
			}

			public float getSpeed() {
				return 88f;
			}

			public float getAttackDamageBonus() {
				return 923f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()));
			}
		}, 1, 5f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}