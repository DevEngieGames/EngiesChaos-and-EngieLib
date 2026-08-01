package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.ClippedbyengieEntity;
import engiegames.engieschaos.client.model.Modelclippedbyengie;

import com.mojang.blaze3d.vertex.PoseStack;

public class ClippedbyengieRenderer extends MobRenderer<ClippedbyengieEntity, Modelclippedbyengie<ClippedbyengieEntity>> {
	public ClippedbyengieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelclippedbyengie<ClippedbyengieEntity>(context.bakeLayer(Modelclippedbyengie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ClippedbyengieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(ClippedbyengieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/clippedbyengieentity.png");
	}
}