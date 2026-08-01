package engiegames.engieschaos.client.renderer;

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

import engiegames.engieschaos.procedures.AprilFoolsSharkoTamedLayDisplayConditionProcedure;
import engiegames.engieschaos.procedures.AprilFoolsSharkoTamedDisplayConditionProcedure;
import engiegames.engieschaos.procedures.AprilFoolsSharkoDisplayConditionProcedure;
import engiegames.engieschaos.entity.AprilFoolsEngieSharkoEntity;
import engiegames.engieschaos.client.model.Modelboyooldlay;
import engiegames.engieschaos.client.model.Modelboyoold;
import engiegames.engieschaos.client.model.Modelboyo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AprilFoolsEngieSharkoRenderer extends MobRenderer<AprilFoolsEngieSharkoEntity, Modelboyo<AprilFoolsEngieSharkoEntity>> {
	public AprilFoolsEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<AprilFoolsEngieSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AprilFoolsEngieSharkoEntity, Modelboyo<AprilFoolsEngieSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/boyoe.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AprilFoolsEngieSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AprilFoolsSharkoDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyoold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyoold.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AprilFoolsEngieSharkoEntity, Modelboyo<AprilFoolsEngieSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/boyoet.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AprilFoolsEngieSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AprilFoolsSharkoTamedDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyoold(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyoold.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AprilFoolsEngieSharkoEntity, Modelboyo<AprilFoolsEngieSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/boyoet.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AprilFoolsEngieSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AprilFoolsSharkoTamedLayDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyooldlay(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyooldlay.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(AprilFoolsEngieSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(AprilFoolsEngieSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nothingsharko.png");
	}
}