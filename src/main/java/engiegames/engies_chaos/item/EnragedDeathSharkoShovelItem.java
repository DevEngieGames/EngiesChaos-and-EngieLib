package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class EnragedDeathSharkoShovelItem extends ShovelItem {
	public EnragedDeathSharkoShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 4425;
			}

			public float getSpeed() {
				return 52f;
			}

			public float getAttackDamageBonus() {
				return 4128f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 65;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENRAGED_DEATH_SHARKO_CLOTH.get()));
			}
		}, 1, -3.9f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}