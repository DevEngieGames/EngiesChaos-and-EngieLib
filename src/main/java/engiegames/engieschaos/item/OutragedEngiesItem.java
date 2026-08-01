package engiegames.engieschaos.item;

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

import engiegames.engieschaos.procedures.EEChestplateProcedure;
import engiegames.engieschaos.init.EngiesChaosModTabs;
import engiegames.engieschaos.init.EngiesChaosModItems;

public abstract class OutragedEngiesItem extends ArmorItem {
	public OutragedEngiesItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{200, 200, 200, 200}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 14;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "outraged_engies";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends OutragedEngiesItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/outraged__layer_1.png";
		}
	}

	public static class Chestplate extends OutragedEngiesItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/outraged__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EEChestplateProcedure.execute(entity);
		}
	}

	public static class Leggings extends OutragedEngiesItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/outraged__layer_2.png";
		}
	}

	public static class Boots extends OutragedEngiesItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EngiesChaosModTabs.TAB_ENGIES_CHAOS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/models/armor/outraged__layer_1.png";
		}
	}
}