package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.NightmareOutragedEngieEntity;
import engiegames.engieschaos.client.model.Modelnightmarehostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareOutragedEngieRenderer extends MobRenderer<NightmareOutragedEngieEntity, Modelnightmarehostile<NightmareOutragedEngieEntity>> {
	public NightmareOutragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnightmarehostile<NightmareOutragedEngieEntity>(context.bakeLayer(Modelnightmarehostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(NightmareOutragedEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareOutragedEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/nightmareoutraged_new.png");
	}
}