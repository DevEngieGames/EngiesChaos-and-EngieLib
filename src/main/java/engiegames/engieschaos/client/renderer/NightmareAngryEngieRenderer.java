package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.NightmareAngryEngieEntity;
import engiegames.engieschaos.client.model.Modelnightmarehostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareAngryEngieRenderer extends MobRenderer<NightmareAngryEngieEntity, Modelnightmarehostile<NightmareAngryEngieEntity>> {
	public NightmareAngryEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnightmarehostile<NightmareAngryEngieEntity>(context.bakeLayer(Modelnightmarehostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(NightmareAngryEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareAngryEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nightmareangry_new.png");
	}
}