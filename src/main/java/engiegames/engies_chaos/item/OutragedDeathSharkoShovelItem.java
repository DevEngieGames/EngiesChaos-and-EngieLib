package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class OutragedDeathSharkoShovelItem extends ShovelItem {
	public OutragedDeathSharkoShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 4720;
			}

			public float getSpeed() {
				return 56f;
			}

			public float getAttackDamageBonus() {
				return 4423f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.OUTRAGED_DEATH_SHARKO_CLOTH.get()));
			}
		}, 1, -3.9f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}