package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import engiegames.engies_chaos.procedures.AngryEngieStyle2DisplayProcedure;
import engiegames.engies_chaos.procedures.AngryEngieStyle1DisplayProcedure;
import engiegames.engies_chaos.procedures.AngryEngieHolloweenedDisplayProcedure;
import engiegames.engies_chaos.procedures.AngryEngieColdSeasonedDisplayProcedure;
import engiegames.engies_chaos.entity.AngryEngieEntity;
import engiegames.engies_chaos.client.model.Modelhostile;
import engiegames.engies_chaos.client.model.Modelhalloweenangry;
import engiegames.engies_chaos.client.model.Modelcoldseason;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngryEngieRenderer extends MobRenderer<AngryEngieEntity, Modelhostile<AngryEngieEntity>> {
	public AngryEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<AngryEngieEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AngryEngieEntity, Modelhostile<AngryEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew_style1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryEngieStyle1DisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelhostile(Minecraft.getInstance().getEntityModels().bakeLayer(Modelhostile.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryEngieEntity, Modelhostile<AngryEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew_style2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryEngieStyle2DisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelhostile(Minecraft.getInstance().getEntityModels().bakeLayer(Modelhostile.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryEngieEntity, Modelhostile<AngryEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynewcoldseason.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryEngieColdSeasonedDisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelcoldseason(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcoldseason.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryEngieEntity, Modelhostile<AngryEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynewhalloween.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryEngieHolloweenedDisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelhalloweenangry(Minecraft.getInstance().getEntityModels().bakeLayer(Modelhalloweenangry.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(AngryEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nothingness.png");
	}
}