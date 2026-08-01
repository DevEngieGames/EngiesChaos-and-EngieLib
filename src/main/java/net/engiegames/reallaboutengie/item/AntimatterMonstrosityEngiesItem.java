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

import net.engiegames.reallaboutengie.procedures.MEChestplateProcedure;
import net.engiegames.reallaboutengie.procedures.MEBootsProcedure;
import net.engiegames.reallaboutengie.init.AllaboutengieModTabs;
import net.engiegames.reallaboutengie.init.AllaboutengieModItems;

public abstract class AntimatterMonstrosityEngiesItem extends ArmorItem {
	public AntimatterMonstrosityEngiesItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 750;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{750, 750, 750, 750}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 22;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "antimatter_monstrosity_engies";
			}

			@Override
			public float getToughness() {
				return 45f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1.6f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AntimatterMonstrosityEngiesItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_1.png";
		}
	}

	public static class Chestplate extends AntimatterMonstrosityEngiesItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MEChestplateProcedure.execute(entity);
		}
	}

	public static class Leggings extends AntimatterMonstrosityEngiesItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_2.png";
		}
	}

	public static class Boots extends AntimatterMonstrosityEngiesItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/antimattermonstrosityengie_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MEBootsProcedure.execute(entity);
		}
	}
}