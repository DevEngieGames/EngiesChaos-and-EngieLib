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

import engiegames.engieschaos.procedures.GlitchSharkoTDisplayConditionProcedure;
import engiegames.engieschaos.procedures.GlitchSharkoTDisplayCondition7Procedure;
import engiegames.engieschaos.procedures.GlitchSharkoTDisplayCondition6Procedure;
import engiegames.engieschaos.procedures.GlitchSharkoTDisplayCondition5Procedure;
import engiegames.engieschaos.procedures.GlitchSharkoTDisplayCondition4Procedure;
import engiegames.engieschaos.procedures.GlitchSharkoTDisplayCondition3Procedure;
import engiegames.engieschaos.procedures.GlitchSharkoTDisplayCondition2Procedure;
import engiegames.engieschaos.procedures.GlitchSharkoDisplayConditionProcedure;
import engiegames.engieschaos.entity.GlitchSharkoEntity;
import engiegames.engieschaos.client.model.Modelboyoxengie;
import engiegames.engieschaos.client.model.Modelboyotamedxengie;
import engiegames.engieschaos.client.model.Modelboyosleepxengie;
import engiegames.engieschaos.client.model.Modelboyosleepaltxengie;
import engiegames.engieschaos.client.model.Modelboyositxengie;
import engiegames.engieschaos.client.model.Modelboyolayxengie;
import engiegames.engieschaos.client.model.Modelboyolayonsidexengie;
import engiegames.engieschaos.client.model.Modelboyolayaltxengie;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GlitchSharkoRenderer extends MobRenderer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>> {
	public GlitchSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoxengie<GlitchSharkoEntity>(context.bakeLayer(Modelboyoxengie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyoxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyoxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyotamedxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyotamedxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyositxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyositxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyolayxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyolayxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyolayonsidexengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyolayonsidexengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayCondition5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyosleepxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyosleepxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayCondition6Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyolayaltxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyolayaltxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<GlitchSharkoEntity, Modelboyoxengie<GlitchSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/glitchedsharko.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlitchSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GlitchSharkoTDisplayCondition7Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelboyosleepaltxengie(Minecraft.getInstance().getEntityModels().bakeLayer(Modelboyosleepaltxengie.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(GlitchSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.25f, 1.25f, 1.25f);
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(GlitchSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nothingsharko.png");
	}
}