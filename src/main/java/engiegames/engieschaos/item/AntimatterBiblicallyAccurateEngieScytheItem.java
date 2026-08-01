package engiegames.engieschaos.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import engiegames.engieschaos.procedures.BiblicallyAccurateBanObtainProProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;

public class AntimatterBiblicallyAccurateEngieScytheItem extends SwordItem {
	public AntimatterBiblicallyAccurateEngieScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 47400;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 11846f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.75f, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_WEAPONS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BiblicallyAccurateBanObtainProProcedure.execute(world, entity, itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}