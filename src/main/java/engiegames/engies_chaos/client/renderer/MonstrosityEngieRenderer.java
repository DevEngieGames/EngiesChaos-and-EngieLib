package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.MonstrosityEngieEntity;
import engiegames.engies_chaos.client.model.Modelmonstrositynew;

import com.mojang.blaze3d.vertex.PoseStack;

public class MonstrosityEngieRenderer extends MobRenderer<MonstrosityEngieEntity, Modelmonstrositynew<MonstrosityEngieEntity>> {
	public MonstrosityEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmonstrositynew<MonstrosityEngieEntity>(context.bakeLayer(Modelmonstrositynew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MonstrosityEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/monstrositynew_style1.png");
	}
}