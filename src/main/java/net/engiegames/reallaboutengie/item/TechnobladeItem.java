package net.engiegames.reallaboutengie.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.engiegames.reallaboutengie.init.AllaboutengieModItems;
import net.engiegames.reallaboutengie.init.AllaboutengieModBlocks;
import net.engiegames.reallaboutengie.client.model.Modeltechnoarmor;

import java.util.function.Consumer;
import java.util.Map;
import java.util.List;
import java.util.Collections;

public abstract class TechnobladeItem extends ArmorItem {
	public TechnobladeItem(EquipmentSlot slot, Item.Properties properties) {
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
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ANGRY_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_ENRAGED_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_OUTRAGED_ENGIE_ESSENCE.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_MONSTROSITY_ENGIE_ESSENCE.get()), new ItemStack(AllaboutengieModItems.ENRAGED_COIN.get()),
						new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()), new ItemStack(AllaboutengieModItems.THE_END_COIN.get()),
						new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_THE_END_COIN.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_COIN.get()),
						new ItemStack(AllaboutengieModItems.ANTIMATTER_DOOMSDAY_COIN.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_SUPER_DOOMSDAY_COIN.get()), new ItemStack(AllaboutengieModItems.COSMIC_ENGIE_COIN.get()),
						new ItemStack(AllaboutengieModItems.ENGIE_GAMES_COIN.get()), new ItemStack(AllaboutengieModItems.ANTIMATTER_ENGIE_GAMES_COIN.get()), new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get()),
						new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get()),
						new ItemStack(AllaboutengieModBlocks.CYBER_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.BLOOD_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.CYBERBLOOD_BLOCK.get()),
						new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.MONSTROSITY_ENGIE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENGIE_BLOCK.get()),
						new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ANGRY_ENGIE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.ANTIMATTER_ENRAGED_ENGIE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.ANTIMATTER_OUTRAGED_ENGIE_BLOCK.get()),
						new ItemStack(AllaboutengieModBlocks.ANTIMATTER_BIBLICALLY_ACCURATE_BLOCK.get()), new ItemStack(AllaboutengieModBlocks.ANTIMATTER_MONSTROSITY_ENGIE_BLOCK.get()), new ItemStack(Items.GOLD_INGOT),
						new ItemStack(Blocks.GOLD_BLOCK));
			}

			@Override
			public String getName() {
				return "technoblade";
			}

			@Override
			public float getToughness() {
				return 250f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TechnobladeItem {
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
							Map.of("head", new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
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
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.allaboutengie.technoblade_helmet.description_0"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/entities/technobladearmor.png";
		}
	}

	public static class Chestplate extends TechnobladeItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(null).fireResistant());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).Body, "left_arm",
							new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).LeftArm, "right_arm",
							new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).RightArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.allaboutengie.technoblade_chestplate.description_0"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/entities/technobladearmor.png";
		}
	}

	public static class Leggings extends TechnobladeItem {
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
							Map.of("left_leg", new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).LeftLeg, "right_leg",
									new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).RightLeg, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
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
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.allaboutengie.technoblade_leggings.description_0"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/entities/technobladearmor.png";
		}
	}

	public static class Boots extends TechnobladeItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(null));
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).LeftBoot, "right_leg",
									new Modeltechnoarmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltechnoarmor.LAYER_LOCATION)).RightBoot, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
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
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.allaboutengie.technoblade_boots.description_0"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/entities/technobladearmor.png";
		}
	}
}