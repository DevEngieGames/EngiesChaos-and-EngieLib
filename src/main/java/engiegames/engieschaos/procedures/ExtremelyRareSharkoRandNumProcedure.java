package engiegames.engieschaos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import engiegames.engieschaos.network.EngiesChaosModVariables;
import engiegames.engieschaos.EngiesChaosMod;

@Mod.EventBusSubscriber
public class ExtremelyRareSharkoRandNumProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD && !world.isClientSide()) {
			EngiesChaosModVariables.MapVariables.get(world).timerforextremelyraresharko = EngiesChaosModVariables.MapVariables.get(world).timerforextremelyraresharko + 0.05;
			EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			if (EngiesChaosModVariables.MapVariables.get(world).timerforextremelyraresharko >= 30) {
				EngiesChaosModVariables.MapVariables.get(world).timerforextremelyraresharko = 0;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).wormholesharkorandnum = Math.round(Mth.nextDouble(RandomSource.create(), 0, 691));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).glitchsharkorandnum = Math.round(Mth.nextDouble(RandomSource.create(), 0, 1251));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosModVariables.MapVariables.get(world).xengiesharkorandnum = Math.round(Mth.nextDouble(RandomSource.create(), 0, 2501));
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
				EngiesChaosMod.queueServerWork(1, () -> {
					EngiesChaosMod.LOGGER.info("Wormhole Sharko Random Number: " + EngiesChaosModVariables.MapVariables.get(world).wormholesharkorandnum);
					EngiesChaosMod.LOGGER.info("Glitch Sharko Random Number: " + EngiesChaosModVariables.MapVariables.get(world).glitchsharkorandnum);
					EngiesChaosMod.LOGGER.info("(xEngie/Shiny) Sharko Random Number: " + EngiesChaosModVariables.MapVariables.get(world).xengiesharkorandnum);
				});
			}
			if (EngiesChaosModVariables.MapVariables.get(world).wormholesharkorandnum >= 690) {
				EngiesChaosModVariables.MapVariables.get(world).wormholesharkoabletospawn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).wormholesharkorandnum <= 1) {
				EngiesChaosModVariables.MapVariables.get(world).wormholesharkoabletospawn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).wormholesharkoabletospawn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).glitchsharkorandnum >= 1250) {
				EngiesChaosModVariables.MapVariables.get(world).glitchsharkoabletospawn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).glitchsharkorandnum <= 1) {
				EngiesChaosModVariables.MapVariables.get(world).glitchsharkoabletospawn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).glitchsharkoabletospawn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
			if (EngiesChaosModVariables.MapVariables.get(world).xengiesharkorandnum >= 2500) {
				EngiesChaosModVariables.MapVariables.get(world).xengiesharkoabletospawn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else if (EngiesChaosModVariables.MapVariables.get(world).xengiesharkorandnum <= 1) {
				EngiesChaosModVariables.MapVariables.get(world).xengiesharkoabletospawn = true;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			} else {
				EngiesChaosModVariables.MapVariables.get(world).xengiesharkoabletospawn = false;
				EngiesChaosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}