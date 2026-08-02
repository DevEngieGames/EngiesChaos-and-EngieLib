package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.entity.EngiEntity;
import engiegames.engies_chaos.client.model.ModelEngie;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EngiRenderer extends HumanoidMobRenderer<EngiEntity, HumanoidModel<EngiEntity>> {
	public EngiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<EngiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/engienew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelEngie(Minecraft.getInstance().getEntityModels().bakeLayer(ModelEngie.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/00ab310b3eec96bf.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/6c22ae11914e859c.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/0ebfdd674f8c4f95.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/ac3935ff9e9599e8.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/b6599d1b1cefd4ac.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/21db06ae607a5b6a.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
		this.addLayer(new RenderLayer<EngiEntity, HumanoidModel<EngiEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/78c5d915f6017698e3d78166f211f09508db5a56.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EngiEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(EngiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngiEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nothingness.png");
	}
}