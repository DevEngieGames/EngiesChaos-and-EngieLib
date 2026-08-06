package engiegames.engies_chaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engies_chaos.procedures.EngieSwordsTickProcedure;
import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public class AntimatterEngieGamesSwordItem extends SwordItem {
	public AntimatterEngieGamesSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 128000;
			}

			public float getSpeed() {
				return 96f;
			}

			public float getAttackDamageBonus() {
				return 34996f;
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
		}, 3, -3f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EngieSwordsTickProcedure.execute(world, entity, itemstack);
	}
}