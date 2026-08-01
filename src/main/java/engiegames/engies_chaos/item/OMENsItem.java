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
import engiegames.engies_chaos.client.model.Modelxengiearmor;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class OMENsItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(1024, Map.of(ArmorType.BOOTS, 1024, ArmorType.LEGGINGS, 1024, ArmorType.CHESTPLATE, 1024, ArmorType.HELMET, 1024, ArmorType.BODY, 1024), 22,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 200f, 5f, TagKey.create(Registries.ITEM, ResourceLocation.parse("engies_chaos:ome_ns_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("engies_chaos:ome_ns")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("head",
								new ModelPart(Collections.emptyList(),
										Map.of("head", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/omensarmor.png");
			}
		}, EngiesChaosModItems.OME_NS_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("body", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).Body, "left_arm",
								new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).LeftArm, "right_arm",
								new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).RightArm, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/omensarmor.png");
			}
		}, EngiesChaosModItems.OME_NS_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).LeftLeg, "right_leg",
								new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/omensarmor.png");
			}
		}, EngiesChaosModItems.OME_NS_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).LeftBoot, "right_leg",
								new Modelxengiearmor(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxengiearmor.LAYER_LOCATION)).RightBoot, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("engies_chaos:textures/entities/omensarmor.png");
			}
		}, EngiesChaosModItems.OME_NS_BOOTS.get());
	}

	private OMENsItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends OMENsItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties.fireResistant());
		}
	}

	public static class Chestplate extends OMENsItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties.fireResistant());
		}
	}

	public static class Leggings extends OMENsItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties.fireResistant());
		}
	}

	public static class Boots extends OMENsItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties.fireResistant());
		}
	}
}