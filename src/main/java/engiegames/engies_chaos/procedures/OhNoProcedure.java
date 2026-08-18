package engiegames.engies_chaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import java.util.Calendar;

import engiegames.engies_chaos.network.EngiesChaosModVariables;
import engiegames.engies_chaos.init.EngiesChaosModGameRules;
import engiegames.engies_chaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class OhNoProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.DOOMSDAY_TOGGLE) == true) {
			if (EngiesChaosModVariables.MapVariables.get(world).OHNO == false) {
				if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 7) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)) == 1) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 12.5 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)) == 2) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 18.75 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)) == 3) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 25 + 1 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					}
				} else if (Calendar.getInstance().get(Calendar.MONTH) >= 4 && Calendar.getInstance().get(Calendar.MONTH) <= 5 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 25) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)) == 1) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 18.75 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 2)) == 2) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 25 + 1 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					}
				} else if (world.getLevelData().getGameRules().getBoolean(EngiesChaosModGameRules.ENGIE_POC) == true) {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)) == 1) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 12.5 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)) == 2) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 18.75 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 3)) == 3) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 25 + 1 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					}
				} else {
					if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) == 1) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 0 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) == 2) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 6.25 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) == 3) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 12.5 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) == 4) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 18.75 + 0.3125 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					} else if (Math.round(Mth.nextDouble(RandomSource.create(), 1, 5)) == 5) {
						EngiesChaosModVariables.MapVariables.get(world).DayCooldownToggle = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).riskcooldown = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).OHNO = true;
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosModVariables.MapVariables.get(world).doomsdaychance = 25 + 1 * Math.floor(Mth.nextDouble(RandomSource.create(), 0, 19));
						EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						EngiesChaosMod.queueServerWork(20, () -> {
							EngiesChaosModVariables.MapVariables.get(world).OHBOY = false;
							EngiesChaosModVariables.MapVariables.get(world).syncData(world);
						});
					}
				}
			}
		}
	}
}