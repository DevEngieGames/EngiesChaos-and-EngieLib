package engiegames.engieschaos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.procedures.MonstrosityToolObtainProcedure;
import engiegames.engieschaos.init.EngiesChaosModItems;

public class CodeRedeemersHoeItem extends HoeItem {
	public CodeRedeemersHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 60f;
			}

			public float getAttackDamageBonus() {
				return 249f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
			}
		}, 0, 2f, new Item.Properties().tab(null));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MonstrosityToolObtainProcedure.execute(entity, itemstack);
	}
}