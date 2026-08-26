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

import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayConditionProcedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayCondition7Procedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayCondition6Procedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayCondition5Procedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayCondition4Procedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayCondition3Procedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoTDisplayCondition2Procedure;
import engiegames.engies_chaos.procedures.AngryDeathSharkoDisplayConditionProcedure;
import engiegames.engies_chaos.entity.AngryDeathSharkoEntity;
import engiegames.engies_chaos.client.model.Modelboyo;
import engiegames.engies_chaos.client.model.Modelbigboyotamed;
import engiegames.engies_chaos.client.model.Modelbigboyosleepalt;
import engiegames.engies_chaos.client.model.Modelbigboyosleep;
import engiegames.engies_chaos.client.model.Modelbigboyosit;
import engiegames.engies_chaos.client.model.Modelbigboyolayonside;
import engiegames.engies_chaos.client.model.Modelbigboyolayalt;
import engiegames.engies_chaos.client.model.Modelbigboyolay;
import engiegames.engies_chaos.client.model.Modelbigboyo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngryDeathSharkoRenderer extends MobRenderer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>> {
	public AngryDeathSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo<AngryDeathSharkoEntity>(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyo(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyo.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyotamed(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyotamed.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyosit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyosit.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyolay(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyolay.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyolayonside(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyolayonside.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynewtired.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayCondition5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyosleep(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyosleep.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynew.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayCondition6Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyolayalt(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyolayalt.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AngryDeathSharkoEntity, Modelboyo<AngryDeathSharkoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/angrynewtired.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngryDeathSharkoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AngryDeathSharkoTDisplayCondition7Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbigboyosleepalt(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbigboyosleepalt.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(AngryDeathSharkoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(AngryDeathSharkoEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nothingsharko.png");
	}
}