package engiegames.engies_chaos.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class EngiesBlessingEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("engies_chaos_engies_blessing",
			item -> Ingredient.of(ItemTags.create(new ResourceLocation("allaboutengie:enchantable/engiesblessing"))).test(new ItemStack(item)));

	public EngiesBlessingEnchantment() {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public int getMaxLevel() {
		return 25;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 25;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return super.checkCompatibility(enchantment) && !List.of(Enchantments.BINDING_CURSE, Enchantments.SILK_TOUCH, Enchantments.INFINITY_ARROWS, Enchantments.FISHING_LUCK, Enchantments.FISHING_SPEED, Enchantments.LOYALTY, Enchantments.IMPALING,
				Enchantments.RIPTIDE, Enchantments.CHANNELING, Enchantments.MULTISHOT, Enchantments.QUICK_CHARGE, Enchantments.PIERCING).contains(enchantment);
	}
}