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

import engiegames.engies_chaos.procedures.MonstrosityEngieStyle2DisplayProcedure;
import engiegames.engies_chaos.procedures.MonstrosityEngieStyle1DisplayProcedure;
import engiegames.engies_chaos.procedures.MonstrosityEngieHalloweenedDisplayProcedure;
import engiegames.engies_chaos.procedures.MonstrosityEngieColdSeasonedDisplayProcedure;
import engiegames.engies_chaos.entity.MonstrosityEngieEntity;
import engiegames.engies_chaos.client.model.Modelmonstrositynewhalloween;
import engiegames.engies_chaos.client.model.Modelmonstrositynew;
import engiegames.engies_chaos.client.model.Modelhostile;
import engiegames.engies_chaos.client.model.Modelcoldseason;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MonstrosityEngieRenderer extends MobRenderer<MonstrosityEngieEntity, Modelmonstrositynew<MonstrosityEngieEntity>> {
	public MonstrosityEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmonstrositynew<MonstrosityEngieEntity>(context.bakeLayer(Modelmonstrositynew.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<MonstrosityEngieEntity, Modelmonstrositynew<MonstrosityEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/monstrositynew_style1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MonstrosityEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (MonstrosityEngieStyle1DisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelhostile(Minecraft.getInstance().getEntityModels().bakeLayer(Modelhostile.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<MonstrosityEngieEntity, Modelmonstrositynew<MonstrosityEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/monstrositynew_style2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MonstrosityEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (MonstrosityEngieStyle2DisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelhostile(Minecraft.getInstance().getEntityModels().bakeLayer(Modelhostile.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<MonstrosityEngieEntity, Modelmonstrositynew<MonstrosityEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/monstrositynewcoldseason.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MonstrosityEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (MonstrosityEngieColdSeasonedDisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelcoldseason(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcoldseason.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<MonstrosityEngieEntity, Modelmonstrositynew<MonstrosityEngieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/monstrositynewhalloween.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MonstrosityEngieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (MonstrosityEngieHalloweenedDisplayProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelmonstrositynewhalloween(Minecraft.getInstance().getEntityModels().bakeLayer(Modelmonstrositynewhalloween.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(MonstrosityEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nothingness.png");
	}
}