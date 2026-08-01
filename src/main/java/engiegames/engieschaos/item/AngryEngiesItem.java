package engiegames.engieschaos.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public abstract class AngryEngiesItem extends ArmorItem {
	public AngryEngiesItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 100;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{100, 100, 100, 100}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "angry_engies";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AngryEngiesItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/angryengi__layer_1.png";
		}
	}

	public static class Chestplate extends AngryEngiesItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/angryengi__layer_1.png";
		}
	}

	public static class Leggings extends AngryEngiesItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/angryengi__layer_2.png";
		}
	}

	public static class Boots extends AngryEngiesItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/angryengi__layer_1.png";
		}
	}
}