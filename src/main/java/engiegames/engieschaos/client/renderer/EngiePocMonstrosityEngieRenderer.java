package engiegames.engieschaos.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.procedures.MobModelScalingProcedure;
import engiegames.engieschaos.entity.EngiePocMonstrosityEngieEntity;
import engiegames.engieschaos.client.model.Modelengiepochostile;

import com.mojang.blaze3d.vertex.PoseStack;

public class EngiePocMonstrosityEngieRenderer extends MobRenderer<EngiePocMonstrosityEngieEntity, Modelengiepochostile<EngiePocMonstrosityEngieEntity>> {
	public EngiePocMonstrosityEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiepochostile<EngiePocMonstrosityEngieEntity>(context.bakeLayer(Modelengiepochostile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EngiePocMonstrosityEngieEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MobModelScalingProcedure.execute();
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(EngiePocMonstrosityEngieEntity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/engiepocmonstrosityengie.png");
	}
}