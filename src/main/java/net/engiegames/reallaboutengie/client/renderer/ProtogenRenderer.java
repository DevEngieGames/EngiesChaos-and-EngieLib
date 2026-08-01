package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.ProtogenEntity;
import net.engiegames.reallaboutengie.client.model.Modelprotogen;

import com.mojang.blaze3d.vertex.PoseStack;

public class ProtogenRenderer extends MobRenderer<ProtogenEntity, Modelprotogen<ProtogenEntity>> {
	public ProtogenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprotogen<ProtogenEntity>(context.bakeLayer(Modelprotogen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ProtogenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProtogenEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/protogen.png");
	}
}