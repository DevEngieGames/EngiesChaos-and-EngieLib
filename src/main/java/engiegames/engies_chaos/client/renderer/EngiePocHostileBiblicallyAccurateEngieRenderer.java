package engiegames.engies_chaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.procedures.MobModelScalingProcedure;
import engiegames.engies_chaos.entity.EngiePocHostileBiblicallyAccurateEngieEntity;
import engiegames.engies_chaos.client.model.Modelengiepochostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngiePocHostileBiblicallyAccurateEngieRenderer extends MobRenderer<EngiePocHostileBiblicallyAccurateEngieEntity, LivingEntityRenderState, Modelengiepochostile> {
	private EngiePocHostileBiblicallyAccurateEngieEntity entity = null;

	public EngiePocHostileBiblicallyAccurateEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiepochostile(context.bakeLayer(Modelengiepochostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EngiePocHostileBiblicallyAccurateEngieEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("engies_chaos:textures/entities/engiepochostilebiblicallyaccurateengie.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}
}