package net.engiegames.reallaboutengie.item;

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

import net.engiegames.reallaboutengie.procedures.EEChestplateProcedure;
import net.engiegames.reallaboutengie.procedures.EEBootsProcedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

public abstract class AntimatterOutragedEngiesItem extends ArmorItem {
	public AntimatterOutragedEngiesItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 700;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{700, 700, 700, 700}[slot.getIndex()];
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
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "antimatter_outraged_engies";
			}

			@Override
			public float getToughness() {
				return 35f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1.4f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AntimatterOutragedEngiesItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimatteroutragedengie_layer_1.png";
		}
	}

	public static class Chestplate extends AntimatterOutragedEngiesItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimatteroutragedengie_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EEChestplateProcedure.execute(entity);
		}
	}

	public static class Leggings extends AntimatterOutragedEngiesItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimatteroutragedengie_layer_2.png";
		}
	}

	public static class Boots extends AntimatterOutragedEngiesItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimatteroutragedengie_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EEBootsProcedure.execute(entity);
		}
	}
}