package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.procedures.EnragedEngieToolObtainProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class AntimatterEnragedEngiePickaxeItem extends PickaxeItem {
	public AntimatterEnragedEngiePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 13000;
			}

			public float getSpeed() {
				return 64f;
			}

			public float getAttackDamageBonus() {
				return 623f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()));
			}
		}, 1, 2.6f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnragedEngieToolObtainProcedure.execute(entity, itemstack);
	}
}