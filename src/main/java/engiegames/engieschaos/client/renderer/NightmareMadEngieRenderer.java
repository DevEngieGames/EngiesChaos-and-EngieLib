package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.NightmareMadEngieEntity;
import engiegames.engieschaos.client.model.Modelnightmarehostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareMadEngieRenderer extends MobRenderer<NightmareMadEngieEntity, Modelnightmarehostile<NightmareMadEngieEntity>> {
	public NightmareMadEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnightmarehostile<NightmareMadEngieEntity>(context.bakeLayer(Modelnightmarehostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(NightmareMadEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareMadEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nightmaremad_new.png");
	}
}