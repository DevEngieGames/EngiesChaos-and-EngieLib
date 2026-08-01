package engiegames.engies_chaos.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class TrueXEngiePickaxeItem extends PickaxeItem {
	public TrueXEngiePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 128000;
			}

			public float getSpeed() {
				return 250f;
			}

			public float getAttackDamageBonus() {
				return 2498f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_COIN.get()),
						new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()),
						new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()),
						new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()),
						new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_THE_END_COIN.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
			}
		}, 1, 21f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}
}