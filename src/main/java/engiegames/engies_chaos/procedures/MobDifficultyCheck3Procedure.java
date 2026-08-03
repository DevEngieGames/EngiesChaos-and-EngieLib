package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import engiegames.engies_chaos.network.EngiesChaosModVariables;

@Mod.EventBusSubscriber
public class MobDifficultyCheck3Procedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getEntity().level, event.getAdvancement());
	}

	public static void execute(LevelAccessor world, Advancement advancement) {
		execute(null, world, advancement);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement) {
		if (advancement == null)
			return;
		if (world instanceof Level _lvl0 && _lvl0.getServer() != null && _lvl0.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:cosmic_sword_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 30) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedcosmicswordcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl1 && _lvl1.getServer() != null && _lvl1.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:roughian_scythe_obtained")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 31) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedhallowscythecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_roughian_scythe_obtained")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 32) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe = EngiesChaosModVariables.MapVariables.get(world).playerobtainedcollectorshallowscythe + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}