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
public class MobDifficultyCheck2Procedure {
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
		if (world instanceof Level _lvl0 && _lvl0.getServer() != null && _lvl0.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_mini_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 15) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterminicount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl1 && _lvl1.getServer() != null && _lvl1.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 16) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterregularcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl2 && _lvl2.getServer() != null && _lvl2.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 17) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbigcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl3 && _lvl3.getServer() != null && _lvl3.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_large_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 18) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterlargecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl4 && _lvl4.getServer() != null && _lvl4.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_huge_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 19) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterhugecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl5 && _lvl5.getServer() != null && _lvl5.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_enormous_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 20) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterenormouscount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl6 && _lvl6.getServer() != null && _lvl6.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_gigantic_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 21) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattergiganticcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl7 && _lvl7.getServer() != null && _lvl7.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_massive_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 22) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermassivecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl8 && _lvl8.getServer() != null && _lvl8.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_biblically_accurate_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 23) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterbiblicallycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl9 && _lvl9.getServer() != null && _lvl9.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_monstrosity_ban_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 24) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattermonstrositycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl10 && _lvl10.getServer() != null && _lvl10.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_doomsday_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 25) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterdoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl11 && _lvl11.getServer() != null && _lvl11.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_super_doomsday_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 26) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattersuperdoomsdaycount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl12 && _lvl12.getServer() != null && _lvl12.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_the_end_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 27) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimattertheendcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl13 && _lvl13.getServer() != null && _lvl13.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engies_ban_scythe_obtain")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 28) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount = EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiecount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world instanceof Level _lvl14 && _lvl14.getServer() != null && _lvl14.getServer().getAdvancements().getAdvancement(new ResourceLocation("engies_chaos:antimatter_engie_games_sword_obtained")).equals(advancement)) {
			if (EngiesChaosModVariables.MapVariables.get(world).MobDifficulty < 29) {
				EngiesChaosModVariables.MapVariables.get(world).playerobtainedantimatterengiegamessword = EngiesChaosModVariables.MapVariables.get(world).playerobtainedengiegamesswordcount + 1;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}