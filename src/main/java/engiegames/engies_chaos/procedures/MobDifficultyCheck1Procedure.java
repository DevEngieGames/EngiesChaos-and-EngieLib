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
public class MobDifficultyCheck1Procedure {
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
		if (world instanceof Level _lvl0 && _lvl0.getServer() != null && _lvl0.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:big_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 1) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedbigcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl1 && _lvl1.getServer() != null && _lvl1.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:large_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 2) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedlargecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:huge_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 3) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedhugecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl3 && _lvl3.getServer() != null && _lvl3.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:enormous_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 4) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedenormouscount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl4 && _lvl4.getServer() != null && _lvl4.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:gigantic_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 5) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedgiganticcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl5 && _lvl5.getServer() != null && _lvl5.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:massive_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 6) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmassivecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl6 && _lvl6.getServer() != null && _lvl6.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:biblically_accurate_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 7) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedbiblicallycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl7 && _lvl7.getServer() != null && _lvl7.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:monstrosity_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 8) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmonstrositycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl8 && _lvl8.getServer() != null && _lvl8.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:doomsday_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 9) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtaineddoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl9 && _lvl9.getServer() != null && _lvl9.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:super_doomsday_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 10) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedsuperdoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl10 && _lvl10.getServer() != null && _lvl10.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:the_end_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 11) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedtheendcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl11 && _lvl11.getServer() != null && _lvl11.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engies_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 12) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl12 && _lvl12.getServer() != null && _lvl12.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:mindscape_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 13) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedmindscapecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl13 && _lvl13.getServer() != null && _lvl13.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:engie_games_sword_obtained")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 14) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}