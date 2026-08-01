package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.InsanityOutragedEngieEntity;
import engiegames.engieschaos.client.model.Modelinsanityhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class InsanityOutragedEngieRenderer extends MobRenderer<InsanityOutragedEngieEntity, Modelinsanityhostile<InsanityOutragedEngieEntity>> {
	public InsanityOutragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinsanityhostile<InsanityOutragedEngieEntity>(context.bakeLayer(Modelinsanityhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(InsanityOutragedEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(InsanityOutragedEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/insanityoutraged.png");
	}
}