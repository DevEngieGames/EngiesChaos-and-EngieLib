package engiegames.engies_chaos.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import java.util.Map;
import java.util.Collections;

import engiegames.engies_chaos.init.EngiesChaosModItems;
import engiegames.engies_chaos.client.model.Modelrougharmor;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class DarkMatterRoughianEngieGamessItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(1000, Map.of(ArmorType.BOOTS, 1000, ArmorType.LEGGINGS, 1000, ArmorType.CHESTPLATE, 1000, ArmorType.HELMET, 1000, ArmorType.BODY, 1000), 22,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 190f, 5f, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:dark_matter_roughian_engie_gamess_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("engies_chaos:dark_matter_roughian_engie_gamess")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("head",
								new ModelPart(Collections.emptyList(),
										Map.of("head", new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/darkmatterrougharmorlayer1.png");
			}
		}, EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("body", new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).Body, "left_arm",
								new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).LeftArm, "right_arm",
								new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).RightArm, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/darkmatterrougharmorlayer1.png");
			}
		}, EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).LeftLeg, "right_leg",
								new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/rougharmorlayer2.png");
			}
		}, EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).LeftLeg, "right_leg",
								new Modelrougharmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelrougharmor.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/darkmatterrougharmorlayer1.png");
			}
		}, EngiesChaosModItems.DARK_MATTER_ROUGHIAN_ENGIE_GAMESS_BOOTS.get());
	}

	private DarkMatterRoughianEngieGamessItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends DarkMatterRoughianEngieGamessItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties.fireResistant());
		}
	}

	public static class Chestplate extends DarkMatterRoughianEngieGamessItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties.fireResistant());
		}
	}

	public static class Leggings extends DarkMatterRoughianEngieGamessItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties.fireResistant());
		}
	}

	public static class Boots extends DarkMatterRoughianEngieGamessItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties.fireResistant());
		}
	}
}