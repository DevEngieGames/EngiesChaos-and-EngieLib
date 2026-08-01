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

import engiegames.engies_chaos.procedures.ReturnRiftBallSizeProcedure;
import engiegames.engies_chaos.entity.RiftBallEntity;
import engiegames.engies_chaos.client.model.Modelavalanche_ball;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RiftBallRenderer extends MobRenderer<RiftBallEntity, Modelavalanche_ball<RiftBallEntity>> {
	public RiftBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelavalanche_ball<RiftBallEntity>(context.bakeLayer(Modelavalanche_ball.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<RiftBallEntity, Modelavalanche_ball<RiftBallEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("engies_chaos:textures/entities/riftball.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, RiftBallEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelavalanche_ball(Minecraft.getInstance().getEntityModels().bakeLayer(Modelavalanche_ball.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(RiftBallEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) ReturnRiftBallSizeProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(RiftBallEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/riftball.png");
	}
}