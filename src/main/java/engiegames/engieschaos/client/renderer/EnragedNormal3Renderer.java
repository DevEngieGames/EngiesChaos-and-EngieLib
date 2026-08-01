package engiegames.engieschaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engieschaos.entity.EnragedNormal3Entity;
import engiegames.engieschaos.client.model.Modelenragedzombie;

public class EnragedNormal3Renderer extends MobRenderer<EnragedNormal3Entity, Modelenragedzombie<EnragedNormal3Entity>> {
	public EnragedNormal3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie<EnragedNormal3Entity>(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal3Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/enragednormal3.png");
	}
}