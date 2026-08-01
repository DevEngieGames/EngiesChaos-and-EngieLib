package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class MindscapeEngiesAxeItem extends AxeItem {
	public MindscapeEngiesAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 48f;
			}

			public float getAttackDamageBonus() {
				return 498f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()), new ItemStack(EngiesChaosModItems.ENRAGED_COIN.get()), new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()),
						new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
			}
		}, 1, 1.4f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}