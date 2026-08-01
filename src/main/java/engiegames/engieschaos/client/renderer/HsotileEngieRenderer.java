package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.HsotileEngieEntity;
import engiegames.engieschaos.client.model.Modelhostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class HsotileEngieRenderer extends MobRenderer<HsotileEngieEntity, Modelhostile<HsotileEngieEntity>> {
	public HsotileEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhostile<HsotileEngieEntity>(context.bakeLayer(Modelhostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(HsotileEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(HsotileEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engie_new.png");
	}
}