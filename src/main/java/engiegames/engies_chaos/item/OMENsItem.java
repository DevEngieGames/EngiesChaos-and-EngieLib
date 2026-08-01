package engiegames.engies_chaos.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.client.model.Modelxengiearmor;

public abstract class OMENsItem extends ArmorItem {
	public OMENsItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1024;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1024, 1024, 1024, 1024}[slot.getIndex()];
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
				return Ingredient.of(new ItemStack(EngiesChaosModItems.ENGIE_GEM.get()), new ItemStack(EngiesChaosModItems.ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.MONSTROSITY_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.ENRAGED_COIN.get()),
						new ItemStack(EngiesChaosModItems.DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.SUPER_DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.THE_END_COIN.get()),
						new ItemStack(EngiesChaosModItems.ENGIE_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_THE_END_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_COIN.get()),
						new ItemStack(EngiesChaosModItems.ANTIMATTER_DOOMSDAY_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()), new ItemStack(EngiesChaosModItems.COSMIC_ENGIE_COIN.get()),
						new ItemStack(EngiesChaosModItems.ENGIE_GAMES_COIN.get()), new ItemStack(EngiesChaosModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()), new ItemStack(EngiesChaosModItems.ENGIE_GAMES_TESSERACT.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GEM.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ANGRY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_OUTRAGED_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_MONSTROSITY_ENGIE_ESSENCE.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_DOOMS_DAY_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_SUPER_DOOMS_DAY_COIN.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_THE_END_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_COIN.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_COIN.get()),
						new ItemStack(EngiesChaosModItems.DARK_MATTER_ENGIE_GAMES_TESSERACT.get()), new ItemStack(EngiesChaosModItems.DARK_MATTER_COSMIC_ENGIE_COIN.get()));
			}

			@Override
			public String getName() {
				return "ome_ns";
			}

			@Override
			public float getToughness() {
				return 200f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends OMENsItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(null).fireResistant());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("head", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/entities/omensarmor.png";
		}
	}

	public static class Chestplate extends OMENsItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(null).fireResistant());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).Body, "left_arm",
							new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).LeftArm, "right_arm",
							new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).RightArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/entities/omensarmor.png";
		}
	}

	public static class Leggings extends OMENsItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(null).fireResistant());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).LeftLeg, "right_leg",
									new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).RightLeg, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
									"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/entities/omensarmor.png";
		}
	}

	public static class Boots extends OMENsItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(null).fireResistant());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).LeftBoot, "right_leg",
									new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).RightBoot, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
									"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "engies_chaos:textures/entities/omensarmor.png";
		}
	}
}