package engiegames.engieschaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class DarkMatterCosmicEngieGamesShovelItem extends ShovelItem {
	public DarkMatterCosmicEngieGamesShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 51000;
			}

			public float getSpeed() {
				return 148f;
			}

			public float getAttackDamageBonus() {
				return 2073f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
			}
		}, 1, 15.8f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}