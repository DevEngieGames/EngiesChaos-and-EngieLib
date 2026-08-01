package engiegames.engies_chaos.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import engiegames.engies_chaos.procedures.BAEChestplateProcedure;
import engiegames.engies_chaos.init.EngiesChaosModTabs;
import engiegames.engies_chaos.init.EngiesChaosModItems;

public abstract class AntimatterBiblicallyAccurateEngiesItem extends ArmorItem {
	public AntimatterBiblicallyAccurateEngiesItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 725;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{725, 725, 725, 725}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 22;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "antimatter_biblically_accurate_engies";
			}

			@Override
			public float getToughness() {
				return 40f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AntimatterBiblicallyAccurateEngiesItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/antimatterbiblicallyaccurateengie_layer_1.png";
		}
	}

	public static class Chestplate extends AntimatterBiblicallyAccurateEngiesItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/antimatterbiblicallyaccurateengie_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			BAEChestplateProcedure.execute(entity);
		}
	}

	public static class Leggings extends AntimatterBiblicallyAccurateEngiesItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/antimatterbiblicallyaccurateengie_layer_2.png";
		}
	}

	public static class Boots extends AntimatterBiblicallyAccurateEngiesItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/antimatterbiblicallyaccurateengie_layer_1.png";
		}
	}
}