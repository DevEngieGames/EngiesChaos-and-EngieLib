package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModItems;

public class CodeRedeemersScytheItem extends SwordItem {
	public CodeRedeemersScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 19200;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 3996f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
			}
		}, 3, -3f, new Item.Properties().tab(null));
	}
}