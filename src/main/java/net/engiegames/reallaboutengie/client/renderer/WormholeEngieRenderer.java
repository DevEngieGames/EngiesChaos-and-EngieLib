package net.engiegames.reallaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.engiegames.reallaboutengie.entity.WormholeEngieEntity;
import net.engiegames.reallaboutengie.client.model.Modelwormholeengie;

import com.mojang.blaze3d.vertex.PoseStack;

public class WormholeEngieRenderer extends MobRenderer<WormholeEngieEntity, Modelwormholeengie<WormholeEngieEntity>> {
	public WormholeEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwormholeengie<WormholeEngieEntity>(context.bakeLayer(Modelwormholeengie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(WormholeEngieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.93f, 0.93f, 0.93f);
	}

	@Override
	public ResourceLocation getTextureLocation(WormholeEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/wormholeengiegames.png");
	}
}