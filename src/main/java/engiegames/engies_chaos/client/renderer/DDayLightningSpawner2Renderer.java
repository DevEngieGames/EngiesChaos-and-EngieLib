package engiegames.engies_chaos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import engiegames.engies_chaos.entity.DDayLightningSpawner2Entity;
import engiegames.engies_chaos.client.model.Modelmissilebombs;

public class DDayLightningSpawner2Renderer extends MobRenderer<DDayLightningSpawner2Entity, Modelmissilebombs<DDayLightningSpawner2Entity>> {
	public DDayLightningSpawner2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs<DDayLightningSpawner2Entity>(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDayLightningSpawner2Entity entity) {
		return new ResourceLocation("engies_chaos:textures/entities/lightningspawner.png");
	}
}